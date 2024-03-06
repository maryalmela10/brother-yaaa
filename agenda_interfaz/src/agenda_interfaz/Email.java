package agenda_interfaz;

public class Email {

	String correo;
	int posicion;
	int array;
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public int getArray() {
		return array;
	}
	public void setArray(int array) {
		this.array = array;
	}
	
	public Email(String correo, int posicion, int array) {
		this.correo = correo;
		this.posicion = posicion;
		this.array = array;
	}
	@Override
	public String toString() {
		return "Email [correo=" + correo + ", posicion=" + posicion + ", array=" + array + "]";
	}
	
}
