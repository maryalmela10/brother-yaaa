package arraylist_piloto;

public class Carrera {

	private int numeroDeCarrera;
	private int puntos;
	
	public int getNumeroDeCarrera() {
		return numeroDeCarrera;
	}
	public void setNumeroDeCarrera(int numeroDeCarrera) {
		this.numeroDeCarrera = numeroDeCarrera;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public Carrera(int numeroDeCarrera, int puntos) {
		this.numeroDeCarrera = numeroDeCarrera;
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "Carrera [numeroDeCarrera=" + numeroDeCarrera + ", puntos=" + puntos + "]";
	}
	
}
