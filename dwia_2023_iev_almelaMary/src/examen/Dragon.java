package examen;

public class Dragon {

	private  String color;
	private  String nombre;
	private  int fuerza;
	
	public Dragon(String color, String nombre, int fuerza) {
		validarColor(color);
		this.nombre = nombre;
		this.fuerza = fuerza;
	}
	
	
	@Override
	public String toString() {
		return "Dragon [color=" + color + ", nombre=" + nombre + ", fuerza=" + fuerza + "]";
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		validarColor(color);
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	private void validarColor(String color) {
		if(!(color.equalsIgnoreCase("verde") 
		   || color.equalsIgnoreCase("rojo")
		   || color.equalsIgnoreCase("negro"))) {
			this.color="verde";
		} else {
			this.color=color;
		}
	}
	
}
