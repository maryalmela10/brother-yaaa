package agenda_interfaz;

public class Contacto_Persona extends Contacto{
	private String nombre;
	private String apellido;

	public Contacto_Persona(int id, String telefono, String correo, String nombre, String apellido) {
	super(id, telefono, correo);
	this.nombre = nombre;
	this.apellido = apellido;
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
		return "Contacto_Persona" + super.toString() + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}
