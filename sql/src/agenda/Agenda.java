package agenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Agenda implements DaoDesign {
	private Connection conn;

	public Agenda() {
		super();
		this.conn = DbConnection.returnConnection();
	}

	@Override
	public boolean insert(Contacto contacto) {
		String query;
		query="insert into contacto values(?,?,?,?,?);";
		try (PreparedStatement ps = this.conn.prepareStatement(query)) {
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
		String query;
		
		if(contacto.getFirstName()!=null) {
			query="UPDATE contacto SET nombre=? WHERE id="+contacto.getId()+";";
			try (PreparedStatement ps = this.conn.prepareStatement(query)) {
				ps.setString(1, contacto.getFirstName());
				ps.executeUpdate();
			 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
		} 
		
		if (contacto.getLastName()!=null) {
			query="UPDATE contacto SET apellido=? WHERE id="+contacto.getId()+";";
			try (PreparedStatement ps = this.conn.prepareStatement(query)) {
				ps.setString(1, contacto.getLastName());
				ps.executeUpdate();
			 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				} 
		}  
		
		if (contacto.getMail()!=null) {
			query="UPDATE contacto SET email=? WHERE id="+contacto.getId()+";";
			try (PreparedStatement ps = this.conn.prepareStatement(query)) {
				ps.setString(1, contacto.getMail());
				ps.executeUpdate();
			 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
		} 
		
		if (contacto.getNumber()!=0) {
			query="UPDATE contacto SET telefono=? WHERE id="+contacto.getId()+";";
			try (PreparedStatement ps = this.conn.prepareStatement(query)) {
				ps.setInt(1, contacto.getNumber());
				ps.executeUpdate();
			 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
		}
		return true;
	}

	@Override
	public boolean detele(Contacto contacto) {
		String query;
		query="delete from contacto where id=?;";
		try (PreparedStatement ps = this.conn.prepareStatement(query)) {
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
		String query;
		int records=0;
		query = "select count(*) from contacto";
	    try (PreparedStatement ps = this.conn.prepareStatement(query)) {
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
