package array_grupo;

public class Alumno {
	private int id;
	private Asignatura A1;
	private Asignatura A2;
	private Asignatura A3;
	static int codigo=0;
	
	private static int generadorId() {
		codigo=codigo+1;
		return codigo;
	}
	
	public Alumno(int id, Asignatura a1, Asignatura a2, Asignatura a3) {
		this.id = id;
		A1 = a1;
		A2 = a2;
		A3 = a3;
	}

	public Alumno(int id, int asig1, int asig2, int asig3) {
		this.id=id;
		A1 = new Asignatura(asig1);
		A2 = new Asignatura(asig2);
		A3 = new Asignatura(asig3);
	}

	public Alumno(Asignatura asig1, Asignatura asig2, Asignatura asig3) {
		this.id=generadorId();
		A1 = asig1;
		A2 = asig2;
		A3 = asig3;
	}

	public Alumno(int asig1, int asig2, int asig3) {
		this.id=generadorId();
		A1 = new Asignatura(asig1);
		A2 = new Asignatura(asig2);
		A3 = new Asignatura(asig3);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Alumno [id=" + id + ", A1=" + A1 + ", A2=" + A2 + ", A3=" + A3 + "]";
	}


	
}
