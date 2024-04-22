package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EjemploConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion=null;
		Statement st=null;
		String sql, apellido, nuevoApellido, nombre;
		Scanner teclado;
		
		try {
			teclado=new Scanner(System.in);
			System.out.println("Nombre: ");
			nombre=teclado.nextLine();
			System.out.println("Apellido: ");
			apellido=teclado.nextLine();
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root", "2001");
			System.out.println(conexion);
			st=conexion.createStatement();
			//sql="update actor set last_name='"+nuevoApellido+"'"+ "where last_name="+"'"+apellido+"'";
			sql="insert into actor(first_name, last_name) values('"+nombre+"','"+apellido+"');";
			System.out.println(sql);
			int filas=st.executeUpdate(sql);
			System.out.println("Filas modificadas: "+filas);
			/*sql="create table prueba(clave int primary key, campo int)";
			st.executeUpdate(sql);
			sql="drop table prueba";
			st.executeUpdate(sql);*/
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
