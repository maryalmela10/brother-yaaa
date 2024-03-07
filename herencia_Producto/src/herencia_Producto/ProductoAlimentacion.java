package herencia_Producto;

public class ProductoAlimentacion extends Producto{
	private Fecha fechaCaducidad;

	public ProductoAlimentacion(String nombre, String codigo, int precio, int existencias, Fecha fechaCaducidad) {
		super(nombre, codigo, precio, existencias);
		this.fechaCaducidad = fechaCaducidad;
	}

	public Fecha getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Fecha fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "ProductoAlimentacion" + super.toString() +"fechaCaducidad=" + fechaCaducidad + "]";
	}
	
	public boolean vencido(Fecha fechaComparar) {
		if(fechaComparar.igualQue(this.getFechaCaducidad())||fechaComparar.mayorQue(this.getFechaCaducidad())) {
			return true;
		} else {
			return false;
		}
	}
	
}
