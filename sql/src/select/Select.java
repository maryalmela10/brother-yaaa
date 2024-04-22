package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Select {
	public static void main(String[] args) {
		String apellido=null;
		Scanner teclado;
		int contador=0;
		try(Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root", "2001");){
		teclado=new Scanner(System.in);
		System.out.println("Inserta un apellido");
		apellido=teclado.nextLine();
		String query = "select last_name from actor where last_name='"+apellido+"'";
		    try (Statement st = conexion.createStatement()) {
		      ResultSet rs = st.executeQuery(query);
		      while (rs.next()) {
		    	//  String first_name = rs.getString("last_name");
		       // String first_name = rs.getString("first_name");
		        //String last_name = rs.getString("last_name");
		        //System.out.println(first_name + ", " + last_name);
		    	  contador++;
		      }
		      System.out.println("Hay "+contador+" personas con ese apellido");
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		  } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
}}
