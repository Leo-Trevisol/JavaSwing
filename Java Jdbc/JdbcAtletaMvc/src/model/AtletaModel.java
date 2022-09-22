package model;

import java.util.List;

import dao.AtletaDAO;
import transporte.AtletaTO;
import transporte.DataTable;



public class AtletaModel {
	
	AtletaDAO atletadao = new AtletaDAO();
	
	public void insere(AtletaTO atleta) {
		
		atletadao.insere(atleta);
		
	}
	
public void atualiza(AtletaTO atleta) {
		
		atletadao.atualiza(atleta);
		
	}

public void deleta(int codigo) {
	
	atletadao.excluir(codigo);
	
}

public DataTable consulta (String consultaSql) {
	
	DataTable dados = atletadao.consultaTableModel(consultaSql);
	
	
	
	return dados;
	
}

public AtletaTO consultarMatricula (int codigo) {
	
	AtletaTO atleta = null;
	
	List<AtletaTO> lstAtletas = atletadao.consulta("Select * from atletas where codigo = " + codigo);

	if(lstAtletas.size() > 0) {
		
		atleta = lstAtletas.get(0);
		
	}
	
	return atleta;
	
}

}
