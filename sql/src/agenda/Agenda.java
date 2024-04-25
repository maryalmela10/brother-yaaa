package agenda;

import java.sql.Connection;

public class Agenda implements DaoDesign {
	private Connection conn;
	String query;

	public Agenda() {
		super();
		this.conn = DbConnection.returnConnection();
		this.query=null;
	}

	@Override
	public String insert(Contacto contacto) {
		
		return null;
	}

	@Override
	public String update(Contacto contacto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String detele(Contacto contacto) {
		// TODO Auto-generated method stub
		return null;
	}

}
