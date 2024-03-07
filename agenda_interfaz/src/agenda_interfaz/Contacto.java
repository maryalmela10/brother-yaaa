package agenda_interfaz;

public abstract class Contacto implements Comparable<Contacto>{
	private int id;
	private String telefono;
	private String correo;
	
	public Contacto(int id, String telefono, String correo) {
		super();
		this.id = id;
		this.telefono = telefono;
		this.correo = correo;
	}

	@Override
	public int compareTo(Contacto o) {
		return this.correo.compareTo(o.correo);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
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
		return "[id=" + id + ", telefono=" + telefono + ", correo=" + correo;
	}
	
}
