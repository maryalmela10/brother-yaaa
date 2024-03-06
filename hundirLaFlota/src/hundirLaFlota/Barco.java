package hundirLaFlota;

public class Barco {

	private int longitud;
	private boolean orientacion;//true horizontal, false vertical
	//tipo enumerado de java y ejemplo(tipo de dato)
	
	public Barco(int longitud, boolean orientacion) {
		this.longitud = longitud;
		this.orientacion = orientacion;
	}
	

	
	
	
	@Override
	public String toString() {
		return "Barco [longitud=" + longitud + ", orientacion=" + orientacion + "]";
	}

	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public boolean isOrientacion() {
		return orientacion;
	}
	public void setOrientacion(boolean orientacion) {
		this.orientacion = orientacion;
	}
	
	
	
}
