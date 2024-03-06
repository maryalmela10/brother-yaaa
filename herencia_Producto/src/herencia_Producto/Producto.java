package herencia_Producto;

public class Producto {
	private String nombre;
	private String codigo;
	private int precio;
	private int existencias;
	
	public Producto(String nombre, String codigo, int precio, int existencias) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.existencias = existencias;
	}
	
	public void modificarPrecio(int precioNuevo) {
		this.setPrecio(precioNuevo);
	}
	
	public void modificarExistenicias(int existenciasNuevas) {
		this.setExistencias(existenciasNuevas);
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", existencias="
				+ existencias+", ";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	
}
