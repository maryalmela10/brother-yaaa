package array_grupo;

public class Asignatura {
 
	private int identificador; 
	private int calificacion;
	
	public Asignatura(int identificador) {
		this.identificador = identificador;
	}

	public int getIdentificador() {
		return identificador;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Asignatura [identificador=" + identificador + ", calificacion=" + calificacion + "]";
	}
	
	
}
