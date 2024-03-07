package array_grupo;

public class Grupo {
	private int id;
	private Alumno[] alumnos = new Alumno[30];
	static int codigo=0;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private static int generadorId() {
		codigo=codigo+1;
		return codigo;
	}

	public Grupo(Alumno[] alumnos, int id) {
		this.id=id;
		if (alumnos.length > 30) {
			System.out.println("Máximo 30 alumnos");
		} else {
			for (int i = 0; i < alumnos.length; i++) {
				this.alumnos[i] = alumnos[i];
			}
		}
	}
	
	public Grupo(Alumno[] alumnos) {
		this.id=generadorId();
		if (alumnos.length > 30) {
			System.out.println("Máximo 30 alumnos");
		} else {
			for (int i = 0; i < alumnos.length; i++) {
				this.alumnos[i] = alumnos[i];
			}
		}
	}

	public Grupo() {
		this.id=generadorId();
	}
	
	public Grupo(int id) {
		this.id=id;
	}
	//cambiar que devuelva boleano
	public boolean añadirAlumno(Alumno alumno) {
		boolean esAñadido = false;
		
		for (int i = 0; i < this.alumnos.length; i++) {
			if (this.alumnos[i] == null) {
				this.alumnos[i] = alumno;
				return true;
			}
		}
		return esAñadido;
	}

	public boolean borrarAlumno(Alumno alumno) {
		boolean esBorrado=false;
		for (int i = 0; i < this.alumnos.length; i++) {
			if(this.alumnos[i]!=null) {
				if (alumno.getId() == this.alumnos[i].getId()) {
					this.alumnos[i] = null;
					return true;
				}
			}
		}
		return esBorrado;
	}

	public void ponerNotasGrupo() {
		for (int i = 0; i < this.alumnos.length; i++) {
			if (this.alumnos[i] != null) {
				Profesor.ponerNotas(this.alumnos[i]);
			}
		}
	}

	public double mediaGrupo() {
		double media = 0;
		int contadorNotNull = 0;
		for (int i = 0; i < this.alumnos.length; i++) {
			if (this.alumnos[i] != null) {
				media += Profesor.media(this.alumnos[i]);
				contadorNotNull++;
			}
		}
		media = media / contadorNotNull;
		return media;
	}

	public Alumno notaMasAlta(Asignatura asignatura) {
		Alumno notaMasAlta=null;
		double calificacionComparar = 0;
		double calificacionMayor = 0;
		int indiceMayor = 0;

		while (this.alumnos[indiceMayor] == null && indiceMayor < this.alumnos.length) {
			if (indiceMayor == this.alumnos.length - 1) {
				System.out.println("La cadena está vacia");
				return notaMasAlta;
			}
			indiceMayor++;
		}
		
		/*for(int i=0;i<this.alumnos.length;i++) {
			if(this.alumnos[i]!=null) {
				notaMasAlta=this.alumnos[i];
				break;
			}
		}*/
		
				
		if (indiceMayor == this.alumnos.length - 1) {
			if (asignatura.getIdentificador() == 1) {
				System.out.println("Nota mas alta:" + this.alumnos[indiceMayor].getA1().getCalificacion());
			} else {
				if (asignatura.getIdentificador() == 2) {
					System.out.println("Nota mas alta:" + this.alumnos[indiceMayor].getA2().getCalificacion());
				} else {
					System.out.println("Nota mas alta:" + this.alumnos[indiceMayor].getA3().getCalificacion());
				}
			}
			return this.alumnos[indiceMayor];
		}

		for (int i = indiceMayor + 1; i < this.alumnos.length; i++) {
			if (this.alumnos[i] != null) {
				switch (asignatura.getIdentificador()) {
				case 1:
					calificacionComparar = this.alumnos[i].getA1().getCalificacion();
					calificacionMayor = this.alumnos[indiceMayor].getA1().getCalificacion();
					break;
				case 2:
					calificacionComparar = this.alumnos[i].getA2().getCalificacion();
					calificacionMayor = this.alumnos[indiceMayor].getA2().getCalificacion();
					break;
				case 3:
					calificacionComparar = this.alumnos[i].getA3().getCalificacion();
					calificacionMayor = this.alumnos[indiceMayor].getA3().getCalificacion();
					break;
				}

				if (calificacionComparar > calificacionMayor) {
					indiceMayor = i;
				}
			}
		}

		if (asignatura.getIdentificador() == 1) {
			System.out.println("Nota mas alta:" + this.alumnos[indiceMayor].getA1().getCalificacion());
		} else {
			if (asignatura.getIdentificador() == 2) {
				System.out.println("Nota mas alta:" + this.alumnos[indiceMayor].getA2().getCalificacion());
			} else {
				System.out.println("Nota mas alta:" + this.alumnos[indiceMayor].getA3().getCalificacion());
			}
		}
		return this.alumnos[indiceMayor];
	}
	
	public Alumno notaMasBaja(Asignatura asignatura) {
		double calificacionComparar = 0;
		double calificacionMenor = 0;
		int indiceMenor = 0;

		while (this.alumnos[indiceMenor] == null && indiceMenor < this.alumnos.length) {
			if (indiceMenor == this.alumnos.length - 1) {
				System.out.println("La cadena está vacia");
				return this.alumnos[0];
			}
			indiceMenor++;
		}

		if (indiceMenor == this.alumnos.length - 1) {
			if (asignatura.getIdentificador() == 1) {
				System.out.println("Nota mas baja:" + this.alumnos[indiceMenor].getA1().getCalificacion());
			} else {
				if (asignatura.getIdentificador() == 2) {
					System.out.println("Nota mas baja:" + this.alumnos[indiceMenor].getA2().getCalificacion());
				} else {
					System.out.println("Nota mas baja:" + this.alumnos[indiceMenor].getA3().getCalificacion());
				}
			}
			return this.alumnos[indiceMenor];
		}

		for (int i = indiceMenor + 1; i < this.alumnos.length; i++) {
			if (this.alumnos[i] != null) {
				switch (asignatura.getIdentificador()) {
				case 1:
					calificacionComparar = this.alumnos[i].getA1().getCalificacion();
					calificacionMenor = this.alumnos[indiceMenor].getA1().getCalificacion();
					break;
				case 2:
					calificacionComparar = this.alumnos[i].getA2().getCalificacion();
					calificacionMenor = this.alumnos[indiceMenor].getA2().getCalificacion();
					break;
				case 3:
					calificacionComparar = this.alumnos[i].getA3().getCalificacion();
					calificacionMenor = this.alumnos[indiceMenor].getA3().getCalificacion();
					break;
				}

				if (calificacionComparar < calificacionMenor) {
					indiceMenor = i;
				}
			}
		}

		if (asignatura.getIdentificador() == 1) {
			System.out.println("Nota mas baja:" + this.alumnos[indiceMenor].getA1().getCalificacion());
		} else {
			if (asignatura.getIdentificador() == 2) {
				System.out.println("Nota mas baja:" + this.alumnos[indiceMenor].getA2().getCalificacion());
			} else {
				System.out.println("Nota mas baja:" + this.alumnos[indiceMenor].getA3().getCalificacion());
			}
		}
		return this.alumnos[indiceMenor];
	}

	public Alumno mediaMasAlta() {
		int indiceMayor = 0;
		while (this.alumnos[indiceMayor] == null && indiceMayor < this.alumnos.length) {
			if (indiceMayor == this.alumnos.length - 1) {
				System.out.println("La cadena está vacia");
				return this.alumnos[0];
			}
			indiceMayor++;
		}

		if (indiceMayor == this.alumnos.length - 1) {
			return this.alumnos[indiceMayor];
		}

		for (int i = indiceMayor + 1; i < this.alumnos.length; i++) {
			if (this.alumnos[i] != null) {
				if (Profesor.media(this.alumnos[indiceMayor]) < Profesor.media(this.alumnos[i])) {
					indiceMayor = i;
				}
			}
		}
		System.out.println("Media más alta: " + Profesor.media(this.alumnos[indiceMayor]));
		return this.alumnos[indiceMayor];
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	/*
	 * // metodos calificar a todos los alumnos del grupo obtener la medua de notas
	 * del grupo obtener el alumno con una nota mas alta en alguna asignatura alumno
	 * id obtener el alumno con la media mas alta
	 *
	 * un constructor que genere un grupo sin alumnos un metodo para añadir un
	 * alumno al grupo otro metodo para borrar un alumno del grupo un máximo de
	 * alumnos por grupo ejemplo max 30
	 *
	 * Clase escuela maximo 30 grupos metodos escuela: calificar todos los alumnos
	 * de la escueela media d enotas de la escuela el alumno con la nota mas alta en
	 * toda la escuela media mas alta de la escuela alumno con la nota mas baja en
	 * alguna asignatura para toda la escuela clase provincia maximo 30 escuelas y
	 * haga todo lo anterior
	 *
	 */
}
