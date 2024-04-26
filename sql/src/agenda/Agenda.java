package agenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Agenda implements DaoDesign {
	private Connection conn;
	private String query;

	public Agenda() {
		super();
		this.conn = DbConnection.returnConnection();
		this.query= null;
	}

	@Override
	public boolean insert(Contacto contacto) {
		this.query="insert into contacto values(?,?,?,?,?);";
		try (PreparedStatement ps = this.conn.prepareStatement(this.query)) {
		ps.setInt(1, contacto.getId());
		ps.setString(2, contacto.getFirstName());
		ps.setString(3, contacto.getLastName());
		ps.setInt(4, contacto.getNumber());
		ps.setString(5, contacto.getMail());
	    ps.executeUpdate();//executeUpdate
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Contacto contacto) {
		return true;
	}

	@Override
	public boolean detele(Contacto contacto) {
		this.query="delete from contacto where id=?;";
		try (PreparedStatement ps = this.conn.prepareStatement(this.query)) {
		ps.setInt(1, contacto.getId());
	    ps.executeUpdate();//executeUpdate
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public int records() {
		int records=0;
		this.query = "select count(*) from contacto";
	    try (PreparedStatement ps = this.conn.prepareStatement(this.query)) {
	      ResultSet rs = ps.executeQuery(query);
	      while (rs.next()) {
	    	//  String first_name = rs.getString("last_name");
	       // String first_name = rs.getString("first_name");
	        //String last_name = rs.getString("last_name");
	        //System.out.println(first_name + ", " + last_name);
	    	  records=rs.getInt("count(*)");
	      }
	      } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return records;
	}
	
	public void closeConnection() {
	 try {
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
