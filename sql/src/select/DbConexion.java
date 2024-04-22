package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConexion {

	// Propiedades
	private static Connection conn = null;
	
	// Constructor
	private DbConexion() {
		String url = "jdbc:mysql://localhost:3307/sakila";
		String usuario = "root";
		String password = "2001";
		
		try {
			conn = DriverManager.getConnection(url, usuario, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection devolverConexion() {
		if (conn == null) {
			new DbConexion();
		}
		return conn;
	}
}
