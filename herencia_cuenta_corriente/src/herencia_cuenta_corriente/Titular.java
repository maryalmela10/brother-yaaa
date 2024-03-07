package herencia_cuenta_corriente;

public class Titular {
	private String nombre;
	private String apellidos;
	private String edad;
	
	public Titular(String nombre, String apellidos, String edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Titular [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", getNombre()="
				+ getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
