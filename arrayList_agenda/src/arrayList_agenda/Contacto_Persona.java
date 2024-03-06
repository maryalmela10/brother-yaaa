package arrayList_agenda;

public class Contacto_Persona {
	private int id;
	private String telefono;
	private String correo;
	private String nombre;
	private String apellido;
//	private int generador=0;
	
	public Contacto_Persona(int id, String telefono, String correo, String nombre, String apellido) {
		this.id = id;
		this.telefono = telefono;
		this.correo = correo;
		this.nombre = nombre;
		this.apellido = apellido;
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

	@Override
	public String toString() {
		return "Contacto_Persona [id=" + id + ", telefono=" + telefono + ", correo=" + correo + ", nombre=" + nombre
				+ ", apellido=" + apellido + "]";
	}
	
/*	public Contacto_Persona(String telefono, String correo, String nombre, String apellido, int generador) {
		this.id=this.generadorDeIndices();
		this.telefono = telefono;
		this.correo = correo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.generador = generador;
	}



	private int generadorDeIndices() {
		int new_generador=generador+1;
		generador=new_generador;
		return new_generador;
	}*/
	
	
	
	
	
	
	
}
