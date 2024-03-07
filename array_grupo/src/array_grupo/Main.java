package array_grupo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Alumno[] grupoAlumno = new Alumno[25];
		for (int i = 0; i < grupoAlumno.length; i++) {
			grupoAlumno[i] = new Alumno(1, 2, 3);
		}
		
		Alumno alumnoNuevo = new Alumno(32, 2, 3);
		Alumno alumnoNuevo1 = new Alumno(33, 2, 3);
		Alumno alumnoNuevo2 = new Alumno(34, 2, 3);
		Alumno alumnoNuevo3 = new Alumno(35, 2, 3);
		Alumno alumnoNuevo4 = new Alumno(36, 2, 3);
		Alumno alumnoNuevo5 = new Alumno(88, 2, 3);
		Alumno arrayviejo = new Alumno(1,1, 2, 3);
		Alumno arrayviejo1 = new Alumno(2,1, 2, 3);
		Alumno arrayviejo2 = new Alumno(3,1, 2, 3);
		Alumno arrayviejo3 = new Alumno(4,1, 2, 3);
		Alumno arrayviejo4 = new Alumno(5,1, 2, 3);
		Asignatura asignatura1 = new Asignatura(1);
		Asignatura asignatura2 = new Asignatura(2);
		Asignatura asignatura3 = new Asignatura(3);
		Grupo grupo = new Grupo(grupoAlumno);
		for (int i = 0; i < grupo.getAlumnos().length; i++) {
			System.out.println(grupo.getAlumnos()[i]);
		}

		grupo.añadirAlumno(alumnoNuevo);
		grupo.añadirAlumno(alumnoNuevo1);
		grupo.añadirAlumno(alumnoNuevo2);
		grupo.añadirAlumno(alumnoNuevo3);
		grupo.añadirAlumno(alumnoNuevo4);


		System.out.println("+++++++++++++++++++++++");

		for (int i = 0; i < grupo.getAlumnos().length; i++) {
			System.out.println(grupo.getAlumnos()[i]);
		}

		System.out.println("+++++++++++++++++++++++");

		for (int i = 0; i < grupo.getAlumnos().length; i++) {
			System.out.println(grupo.getAlumnos()[i]);
		}

		grupo.ponerNotasGrupo();

		for (int i = 0; i < grupo.getAlumnos().length; i++) {
			if (grupo.getAlumnos()[i] != null) {
				System.out.println(grupo.getAlumnos()[i].getId());
				System.out.println(grupo.getAlumnos()[i].getA1());
				System.out.println(grupo.getAlumnos()[i].getA2());
				System.out.println(grupo.getAlumnos()[i].getA3());
			}
		}
		
		
		 System.out.println("media del grupo: "+grupo.mediaGrupo());
		 System.out.println("Alumno con mayor nota en asignatura A "+grupo.notaMasAlta(asignatura1));
		 System.out.println("Alumno con la media más alta"+grupo.mediaMasAlta());

	}

}
