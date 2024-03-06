package agenda_interfaz;

public interface Agenda {
	
	public boolean altaContacto(Contacto contacto);
	public boolean bajaContacto(Contacto contacto);
	public boolean modificarTelefono(int id, String nuevoNumero);
	public void listarDatos();
	public void empresasDeSector();
	public void listarOrdenEmail();
	
}
