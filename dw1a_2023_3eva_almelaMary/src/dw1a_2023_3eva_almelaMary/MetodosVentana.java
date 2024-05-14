package dw1a_2023_3eva_almelaMary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class MetodosVentana {
	private Connection conn;

	public MetodosVentana() {
		super();
		this.conn = DbConnection.returnConnection();
	}
	
	public void comenzar() {
		ArrayList<Pais> paises;
		paises=Utilidades.leer();
		String query;
		for(Pais p: paises) {
			query="insert into paises values(?,?);";
			try (PreparedStatement ps = this.conn.prepareStatement(query)) {
			ps.setString(1, p.getNombre());
			ps.setDouble(2, p.getPoblacion());
		    ps.executeUpdate();//executeUpdate
		    } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public Pais buscarPais(String nombre) {
		String query;
		Pais pais = null;
		query = "select * from paises where nombre='"+nombre+"';";
		try (PreparedStatement ps = this.conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
			ResultSet rs = ps.executeQuery(query);
			if(rs.next()) {
				String nombreBase = rs.getString("nombre");
		    	Double poblacion = rs.getDouble("poblacion");
		    	pais= new Pais(nombreBase, poblacion,0,0);
			} else {
				return pais;
			}  	
		 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return pais;
	}
	
	public boolean insertar(Pais pais) {
		String query;
		query="insert into paises values(?,?);";
		try (PreparedStatement ps = this.conn.prepareStatement(query)) {
			ps.setString(1, pais.getNombre());
			ps.setDouble(2, pais.getPoblacion());
			ps.executeUpdate();//executeUpdate
			return true;
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	
	
}
