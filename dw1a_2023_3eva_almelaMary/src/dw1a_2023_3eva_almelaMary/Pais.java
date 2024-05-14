package dw1a_2023_3eva_almelaMary;

public class Pais {

	private String nombre;
	private double poblacion;
	private double extension;
	private double pib;
	
	public Pais(String nombre, double poblacion, double extension, double pib) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.extension = extension;
		this.pib = pib;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(double poblacion) {
		this.poblacion = poblacion;
	}
	public double getExtension() {
		return extension;
	}
	public void setExtension(double extension) {
		this.extension = extension;
	}
	public double getPib() {
		return pib;
	}
	public void setPib(double pib) {
		this.pib = pib;
	}
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", poblacion=" + poblacion + ", extension=" + extension + ", pib=" + pib
				+ "]";
	}
	
}
