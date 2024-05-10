package agenda;

public interface DaoDesign {

	public boolean insert(Contacto contacto);
	public boolean update(Contacto contacto);
	public boolean detele(Contacto contacto);
	public Contacto findContact(int cursor);
	public Contacto lastRecord();
	public Contacto previus();
	public Contacto next();
	public Contacto select();
}
