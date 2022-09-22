package database;


// import jdbc
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class ConexaoBD {
		private static Connection instancia = null;
		
		private ConexaoBD() throws ClassNotFoundException, SQLException{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Carregado");
			
			String usuario = "root";
			String senha = "leo123";
			String url ="jdbc:mysql://127.0.0.1:3307 /atletas";
			
			instancia = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conex�o OK");	
		}
		
		public static Connection getConexao()
									throws ClassNotFoundException, SQLException{
			
			if (instancia == null) {
				new ConexaoBD();
			}
			System.out.println("Conex�o Retornada");
			return instancia;	
		}
		

	}


