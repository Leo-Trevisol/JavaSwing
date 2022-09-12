package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import database.ConexaoBD;

import transporte.AtletaTO;
import transporte.DataTable;

public class AtletaDAO {
	
	Vector linhas;
	
	public AtletaDAO(){}
	
	public void insere(AtletaTO atletato) {
		Connection conexao = null;
		
		try {
			conexao = ConexaoBD.getConexao();
			
			String sql = "insert into atletas( nome, peso, altura)"
					+ " values (?,?,? )";
			
			PreparedStatement cmdsql = conexao.prepareStatement(sql);
			
			cmdsql.setString(1, atletato.getNome());
			cmdsql.setInt(2, atletato.getPeso());
			cmdsql.setDouble(3, atletato.getAltura());
			
			cmdsql.executeUpdate();
			
			
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
	

	public List<AtletaTO> consulta(String consultaSql){
		List<AtletaTO> lista = new ArrayList<AtletaTO>();
		AtletaTO atleta = null;
		
		ResultSet resultado = null;
		Connection conexao = null;
		Statement cmdSql = null;
				
		try {
			conexao = ConexaoBD.getConexao();
			cmdSql = conexao.createStatement();
			resultado = cmdSql.executeQuery(consultaSql);
			
			while (resultado.next()) {
				atleta = new AtletaTO();
				atleta.setCodigo(resultado.getInt("codigo"));
				atleta.setNome(resultado.getString("nome"));
				atleta.setPeso(resultado.getInt("peso"));
				atleta.setAltura(resultado.getDouble("altura") );
				
				lista.add(atleta);
			}			
						
		} catch (Exception e) { e.printStackTrace(); }
		
		return lista;
	}
	
	public void atualiza(AtletaTO atleta) {	
		Connection conexao = null;	
		try {
			conexao = ConexaoBD.getConexao();
			
			String sql = "update atletas set nome=?, peso=?, altura=?"
					+ " where codigo=?";
			
			PreparedStatement cmdsql = conexao.prepareStatement(sql);
			
			cmdsql.setString(1, atleta.getNome());
			cmdsql.setInt(2, atleta.getPeso());
			cmdsql.setDouble(3, atleta.getAltura() );
			 cmdsql.setInt(4, atleta.getCodigo());			
			cmdsql.executeUpdate();		
			//conexao.close();
				
			
		} catch(Exception e){
			e.printStackTrace();
		}	
		
	}
	
	public void excluir(int codigo) {	
		Connection conexao = null;	
		try {
			conexao = ConexaoBD.getConexao();
			
			String sql = "delete from atletas"
					+ " where codigo=?";
			
			PreparedStatement cmdsql = conexao.prepareStatement(sql);
	
			cmdsql.setInt(1, codigo);			
			cmdsql.executeUpdate();		
			//conexao.close();
				
			
		} catch(Exception e){
			e.printStackTrace();
		}	
		
	}

	public DataTable consultaTableModel(String consulta) {
		
		DataTable dataTable = new DataTable();
		
		
		
		ResultSet resultado = null;
		Connection conexao = null;
		Statement cmdsql = null;
		
		Vector dados = new Vector();
		
		
		Vector titulos = new Vector();
		
		titulos.add("Codigo");
		titulos.add("Nome");
		titulos.add("Peso (Kg)");
		titulos.add("Altura (Metros)");
		
		
		try {
			conexao = ConexaoBD.getConexao();
			cmdsql = conexao.createStatement();
			resultado = cmdsql.executeQuery(consulta);
			
			resultado.next();
			
			ResultSetMetaData rsmd = resultado.getMetaData();
			
			if(consulta != null) {
				
			
			
			do {
				linhas = new Vector();
				for(int i = 1; i <= rsmd.getColumnCount(); i++) {
					
					switch(rsmd.getColumnType(i)) {
					
					case Types.INTEGER :
						
						linhas.add(new Long(resultado.getLong(i)));
						break;
						
					case Types.CHAR:
						linhas.add(resultado.getString(i));
						break;
						
					case Types.DOUBLE : 
						linhas.add(new Double(resultado.getDouble(i)));
						break;
						
					case Types.VARCHAR :
						linhas.add(resultado.getString(i));
						break;
						
					
					}
					
				}
				setLinhas(linhas);
				dados.add(linhas);
			}while(resultado.next());
			
			}else {
				System.out.println("porco");
			}
			
			dataTable.setTitulos(titulos);
			dataTable.setDados(dados);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return dataTable;
	}

	public Vector getLinhas() {
		return linhas;
	}

	public void setLinhas(Vector linhas) {
		this.linhas = linhas;
	} 
	
	
}
