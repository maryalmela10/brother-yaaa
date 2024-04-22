package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectDos {
	public static void main(String[] args) {
		String apellido=null;
		Scanner teclado;
		try(Connection conexion=DbConexion.devolverConexion();){
		String query = "select first_name, last_name from actor";
		    try (Statement st = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next()) {
		      System.out.println(rs.getString("first_name")+" , "+rs.getString("last_name"));
		      }
		      
		      System.out.println();
		      System.out.println("*************************************");
		      System.out.println();
		      //inverso
		      while(rs.previous()) {
		    	  System.out.println(rs.getString("first_name")+" , "+rs.getString("last_name"));
		      }
		      
		      
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		  } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
}}

