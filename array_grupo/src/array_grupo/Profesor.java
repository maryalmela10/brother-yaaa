package array_grupo;

public class Profesor {

	
	public static void ponerNotas (Alumno c1) {
		if (c1 != null) {
		c1.getA1().setCalificacion((int)(Math.random()*10+1));
		c1.getA2().setCalificacion((int)(Math.random()*10+1));
		c1.getA3().setCalificacion((int)(Math.random()*10+1));
		}
	}
	
	public static double media (Alumno c1) {
		if (c1 != null) {
		double media;
		media = (c1.getA1().getCalificacion()+c1.getA2().getCalificacion()+c1.getA3().getCalificacion())/3;
		return media;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Profesor []";
	}

	
	
	
}
