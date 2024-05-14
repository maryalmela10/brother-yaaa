package dw1a_2023_3eva_almelaMary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

		// Propiedades
		private static Connection conn = null;
		
		// Constructor
		private DbConnection() {
			String url = "jdbc:mysql://localhost:3307/examen";
			String usuario = "root";
			String password = "2001";
			
			try {
				conn = DriverManager.getConnection(url, usuario, password);
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static Connection returnConnection() {
			if (conn == null) {
				new DbConnection();
			}
			return conn; 
		}
	}
	

