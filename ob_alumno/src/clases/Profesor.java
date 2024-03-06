package clases;

public class Profesor {

	
	public static void ponerNotas (Alumno c1) {
		c1.getA1().setCalificacion((Math.random()*10));
		c1.getA2().setCalificacion((Math.random()*10));
		c1.getA3().setCalificacion((Math.random()*10));
	}
	
	public static double media (Alumno c1) {
		double media;
		media = (c1.getA1().getCalificacion()+c1.getA2().getCalificacion()+c1.getA3().getCalificacion())/3;
		return media;
	}

	@Override
	public String toString() {
		return "Profesor []";
	}

	
	
	
}
