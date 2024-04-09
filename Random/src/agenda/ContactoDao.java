package agenda;

public interface ContactoDao {

		Contacto buscarContacto(int id);
	    void guardarContacto(Contacto contacto);
	    void borrarContacto(Contacto contacto);
	    void modificarContacto(Contacto contacto);
	
}
