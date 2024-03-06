package clases;

public class Alumno {

	private Asignatura A1;
	private Asignatura A2;
	private Asignatura A3;
	
	public Alumno(Asignatura asig1, Asignatura asig2, Asignatura asig3) {
		A1 = asig1;
		A2 = asig2;
		A3 = asig3;
	}

	public Alumno(int asig1, int asig2, int asig3) {
		A1 = new Asignatura(asig1);
		A2 = new Asignatura(asig2);
		A3 = new Asignatura(asig3);
	}

	public Asignatura getA1() {
		return A1;
	}

	public Asignatura getA2() {
		return A2;
	}

	public Asignatura getA3() {
		return A3;
	}

	@Override
	public String toString() {
		return "Alumno [A1=" + A1 + ", A2=" + A2 + ", A3=" + A3 + "]";
	}

	


	
	

	
	
	
	
}
