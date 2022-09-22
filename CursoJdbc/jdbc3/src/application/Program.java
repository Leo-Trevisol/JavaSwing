package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
	
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
//			st = conn.prepareStatement("Insert into seller (Name, Email, BirthDate, BaseSalary, DepartmentId) values (?,?,?,?,?)", 
//					Statement.RETURN_GENERATED_KEYS);
//			
//			st.setString(1, "Leo Papi");
//			st.setString(2, "leopapi@gmail.com");
//			st.setDate(3, new java.sql.Date(sdf.parse("10/02/2003").getTime()));
//			st.setDouble(4, 1964.0);
//			st.setInt(5, 4);
			
			st = conn.prepareStatement("Insert into department (Name) values ('D1'), ('D2')", Statement.RETURN_GENERATED_KEYS);
			
			int qtdRows = st.executeUpdate();
			
			if(qtdRows > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("ID: " + id);
				}
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeConnection();
			DB.closeStatement(st);
			
		}
		
	}
	
	

}
