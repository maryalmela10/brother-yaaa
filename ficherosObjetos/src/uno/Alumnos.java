package uno;

public class Alumnos {
	private int numExpe;
	private String nombre;
	private String apellido;
	
	public Alumnos(int numExpe, String nombre, String apellido) {
		super();
		this.numExpe = numExpe;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public int getNumExpe() {
		return numExpe;
	}
	public void setNumExpe(int numExpe) {
		this.numExpe = numExpe;
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
		return "Alumnos [numExpe=" + numExpe + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
}
