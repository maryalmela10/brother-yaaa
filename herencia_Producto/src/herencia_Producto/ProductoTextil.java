package herencia_Producto;

public class ProductoTextil extends Producto {
	private String tipoDeTextil;

	public ProductoTextil(String nombre, String codigo, int precio, int existencias, String tipoDeTextil) {
		super(nombre, codigo, precio, existencias);
		this.tipoDeTextil = tipoDeTextil;
	}
	
	
	
}
