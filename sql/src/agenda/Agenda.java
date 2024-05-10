package agenda;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import select.DbConexion;

public class Agenda implements DaoDesign {
	private Connection conn;
	private int cursor;

	public Agenda() {
		super();
		this.conn = DbConnection.returnConnection();
		this.cursor=0;
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
	
	public Contacto select() {
		String query;
		Contacto contacto = null;
		query = "select * from contacto";
	    try (PreparedStatement ps = this.conn.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
	      ResultSet rs = ps.executeQuery(query);
	      rs.next();
	      	int id = rs.getInt("id");
	    	String first_name = rs.getString("nombre");
	        String last_name = rs.getString("apellido");
	        int number = rs.getInt("telefono");
	        String mail = rs.getString("email");
	        int record=rs.getRow();
	        this.cursor=record;
	        contacto = new Contacto(id,first_name,last_name,number,mail,record);
	      } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contacto;
	}
	
	public Contacto next() {
		String query;
		boolean next;
		Contacto contacto = null;
		query = "select * from contacto";
	    try (PreparedStatement ps = this.conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
	    	ResultSet rs = ps.executeQuery(query);
	      	rs.absolute(this.cursor);
	      	next=rs.next();
	      	if (next) {
	      		int id = rs.getInt("id");
		    	String first_name = rs.getString("nombre");
		        String last_name = rs.getString("apellido");
		        int number = rs.getInt("telefono");
		        String mail = rs.getString("email");
		        int record=rs.getRow();
		        this.cursor=record;
		        contacto = new Contacto(id,first_name,last_name,number,mail,record);
	      	}
	      } catch (SQLException e) {
			e.printStackTrace();
		}
		return contacto;
	}
	
	public Contacto previus() {
		String query;
		boolean previus;
		Contacto contacto = null;
		query = "select * from contacto";
	    try (PreparedStatement ps = this.conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
	    	ResultSet rs = ps.executeQuery(query);
	      	rs.absolute(this.cursor);
	      	previus=rs.previous();
	      	if (previus) {
	      		int id = rs.getInt("id");
		    	String first_name = rs.getString("nombre");
		        String last_name = rs.getString("apellido");
		        int number = rs.getInt("telefono");
		        String mail = rs.getString("email");
		        int record=rs.getRow();
		        this.cursor=record;
		        contacto = new Contacto(id,first_name,last_name,number,mail,record);
	      	}
	      } catch (SQLException e) {
			e.printStackTrace();
		}
		return contacto;
	}
	
	public Contacto lastRecord() {
		String query;
		boolean previus;
		Contacto contacto = null;
		query = "select * from contacto";
	    try (PreparedStatement ps = this.conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
	    		ResultSet rs = ps.executeQuery(query);
	      		rs.absolute(this.records());
	      		int id = rs.getInt("id");
		    	String first_name = rs.getString("nombre");
		        String last_name = rs.getString("apellido");
		        int number = rs.getInt("telefono");
		        String mail = rs.getString("email");
		        int record=rs.getRow();
		        this.cursor=record;
		        contacto = new Contacto(id,first_name,last_name,number,mail,record);
	      	
	      } catch (SQLException e) {
			e.printStackTrace();
		}
		return contacto;
	}
	
	public Contacto findContact(int cursor) {
		String query;
		boolean thereIsRecord;
		Contacto contacto = null;
		query = "select * from contacto;";
		try (PreparedStatement ps = this.conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
			ResultSet rs = ps.executeQuery(query);
			thereIsRecord=rs.absolute(cursor);
			if(cursor>0 && thereIsRecord) {
				int id = rs.getInt("id");
		    	String first_name = rs.getString("nombre");
		        String last_name = rs.getString("apellido");
		        int number = rs.getInt("telefono");
		        String mail = rs.getString("email");
		        int record=rs.getRow();
		        this.cursor=record;
		        contacto = new Contacto(id,first_name,last_name,number,mail,record);
			} else {
				return contacto;
			}
		 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return contacto;
	}
	
	public void binaryFile() {
		try(ObjectOutputStream object = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("agendaBinario.mar")));){
			String query;
			query = "select * from contacto;";
		     try (PreparedStatement ps = this.conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
				   ResultSet rs=ps.executeQuery();//execuUpdate con todo lo demás
				    	while(rs.next()) {
				    		Contacto newContacto=new Contacto(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellido"),rs.getInt("telefono"),rs.getString("email"));
				    		object.writeObject(newContacto);
				    	}
				      
				    } catch (SQLException e) {
				      e.printStackTrace();
				    }
				  } catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
