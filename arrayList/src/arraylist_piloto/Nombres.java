package arraylist_piloto;

public class Nombres {
	private String nombre;
	private String apellido;
	int posicion;
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
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public Nombres(String nombre, String apellido, int posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.posicion = posicion;
	}
	
	
}
