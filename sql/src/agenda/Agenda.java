package agenda;

import java.sql.Connection;

public class Agenda implements DaoDesign {
	private Connection conn;
	
	

	public Agenda() {
		super();
		this.conn = DbConnection.returnConnection();
	}

	@Override
	public String insert(Contacto contacto) {
		// TODO Auto-generated method stub
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
