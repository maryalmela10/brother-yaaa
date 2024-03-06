package cuenta;

public class Cuenta {

	int id;
	double cantidad;
	
	public Cuenta(int id, double cantidad) {
		this.id = id;
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", cantidad=" + cantidad + "]";
	}

	public void ingresar(double cantidad) {
		if (cantidad>0) {
			this.cantidad+=cantidad;
		}
	}
	
	public void retirar(double cantidad) {
		if (cantidad>0) {
			this.cantidad-=cantidad;
		}
	}
	

	
	

	
	
	
}
