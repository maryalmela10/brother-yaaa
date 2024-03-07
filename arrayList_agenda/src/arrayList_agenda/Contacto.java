package arrayList_agenda;

public class Contacto {
	private int id;
	private int telefono;
	private String correo;
	private String tipo;
	// Persona
	private String nombre = null;
	private String apellido = null;
	// Empresa
	private int direccion_postal = 0;
	private String sector = null;

	public Contacto(String tipo, int id, int telefono, String correo, String nombre, String apellido) {
		if (tipo.equalsIgnoreCase("Persona")) {
			this.id = id;
			this.telefono = telefono;
			this.correo = correo;
			this.tipo = tipo;
			this.nombre = nombre;
			this.apellido = apellido;
		} else {
			System.out.println("Elige el constructor del tipo que necesitas");
		}
	}

	public Contacto(String tipo, int id, int telefono, String correo, int direccion_postal, String sector) {
		if (tipo.equalsIgnoreCase("Empresa")) {
			this.id = id;
			this.telefono = telefono;
			this.correo = correo;
			this.tipo = tipo;
			this.direccion_postal = direccion_postal;
			this.sector = sector;
		} else {
			System.out.println("Elige el constructor del tipo que necesitas");
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDireccion_postal() {
		return direccion_postal;
	}

	public void setDireccion_postal(int direccion_postal) {
		this.direccion_postal = direccion_postal;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", telefono=" + telefono + ", correo=" + correo + ", tipo=" + tipo + ", nombre="
				+ nombre + ", apellido=" + apellido + ", direccion_postal=" + direccion_postal + ", sector=" + sector
				+ "]";
	}
	
}
