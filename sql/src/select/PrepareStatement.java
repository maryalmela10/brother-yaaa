package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrepareStatement {
	public static void main(String[] args) {
		String nombre="MARY";
		Scanner teclado;
		try(Connection conexion=DbConexion.devolverConexion();){
		String query = "select first_name, last_name from actor"+ " where first_name=?";
		    try (PreparedStatement ps = conexion.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
		    	ps.setString(1, nombre);
		    	ResultSet rs=ps.executeQuery();//execuUpdate con todo lo demás
		    	while(rs.next()) {
		    		
		    		 System.out.println(rs.getRow()+rs.getString("first_name")+" , "+rs.getString("last_name"));
		    	}
		      
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		  } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
}}
