package clases;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asignatura castellano, fisica, quimica;
		castellano = new Asignatura(1);
		fisica = new Asignatura(2);
		quimica = new Asignatura(3);		
		Alumno juan;
		juan= new Alumno(1,2,3);
		Profesor.ponerNotas(juan);
		System.out.println("La nota de castellano es: " + juan.getA1().getCalificacion());
		System.out.println("La nota de fisica es: " + juan.getA2().getCalificacion());
		System.out.println("La nota de quimica es: " + juan.getA3().getCalificacion());
		System.out.println("La media es: "+ Profesor.media(juan));
	}

}
