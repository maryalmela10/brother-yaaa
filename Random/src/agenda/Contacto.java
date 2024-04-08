package agenda;

public class Contacto {
	private int id;
	private int telefono;
	private String correo;
	
	public Contacto(int id, int telefono, String correo) {
		this.id = id;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", telefono=" + telefono + ", correo=" + correo + "]";
	}
	
	
	
	
	
}
