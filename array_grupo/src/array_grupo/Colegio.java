package array_grupo;

public class Colegio {
	
	private Grupo[] grupo = new Grupo[30];
	
	public Colegio(Grupo[] grupos) {
		if (grupo.length > 30) {
			System.out.println("Máximo 30 alumnos");
		} else {
			for (int i = 0; i < grupo.length; i++) {
				this.grupo[i] = grupos[i];
			}
		}
	}

	public Colegio() {
	}

	public void añadirGrupo(Grupo grupo) {
		boolean esNulo = false;
		int contador = 0;
		while (esNulo == false && contador < this.grupo.length) {
			if (this.grupo[contador] == null) {
				this.grupo[contador] = grupo;
				esNulo = true;
			} else {
				contador++;
				}
		}
		if (contador > this.grupo.length-1) {
			System.out.println("Colegio lleno, no permite más grupos");
		}
	}

	public void borrarGrupo(Grupo grupo) {
		for (int i = 0; i < this.grupo.length; i++) {
			if(this.grupo[i]!=null) {
				if (grupo.getId() == this.grupo[i].getId()) {
					this.grupo[i] = null;
				}
			}	
		}
	}

	public void ponerNotasColegio() {
		for (int i = 0; i < this.grupo.length; i++) {
			if (this.grupo[i] != null) {
				this.grupo[i].ponerNotasGrupo();
			}
		}
	}

	public double mediaColegio() {
		double media = 0;
		int contadorNotNull = 0;
		for (int i = 0; i < this.grupo.length; i++) {
			if (this.grupo[i] != null) {
				media += this.grupo[i].mediaGrupo();
				contadorNotNull++;
			}
		}
		media = media / contadorNotNull;
		return media;
	}

	public Alumno notaMasAlta(Asignatura asignatura) {
		double grupoComparar = 0;
		double grupoMayor = 0;
		int indiceMayor = 0;

		while (this.grupo[indiceMayor] == null && indiceMayor < this.grupo.length) {
			if (indiceMayor == this.grupo.length - 1) {
				System.out.println("La cadena de colegio está vacia");
				return this.grupo[0].getAlumnos()[0];
			}
			indiceMayor++;
		}

		if (indiceMayor == this.grupo.length - 1) {
			return this.grupo[indiceMayor].notaMasAlta(asignatura);
		} 

		for (int i = indiceMayor + 1; i < this.grupo.length; i++) {
			if (this.grupo[i] != null) {
				switch (asignatura.getIdentificador()) {
				case 1:
					grupoComparar = this.grupo[i].notaMasAlta(asignatura).getA1().getCalificacion();
					grupoMayor = this.grupo[indiceMayor].notaMasAlta(asignatura).getA1().getCalificacion();
					break;
				case 2:
					grupoComparar = this.grupo[i].notaMasAlta(asignatura).getA2().getCalificacion();
					grupoMayor = this.grupo[indiceMayor].notaMasAlta(asignatura).getA2().getCalificacion();
					break;
				case 3:
					grupoComparar = this.grupo[i].notaMasAlta(asignatura).getA3().getCalificacion();
					grupoMayor = this.grupo[indiceMayor].notaMasAlta(asignatura).getA3().getCalificacion();
					break;
				}

				if (grupoComparar > grupoMayor) {
					indiceMayor = i;
				}
			}
		}

		if (asignatura.getIdentificador() == 1) {
			System.out.println("Nota mas alta:" + this.grupo[indiceMayor].notaMasAlta(asignatura).getA1().getCalificacion());
		} else {
			if (asignatura.getIdentificador() == 2) {
				System.out.println("Nota mas alta:" + this.grupo[indiceMayor].notaMasAlta(asignatura).getA2().getCalificacion());
			} else {
				System.out.println("Nota mas alta:" + this.grupo[indiceMayor].notaMasAlta(asignatura).getA3().getCalificacion());
			}
		}
		return this.grupo[indiceMayor].notaMasAlta(asignatura);
	}
	
	public Alumno notaMasBaja(Asignatura asignatura) {
		double grupoComparar = 0;
		double grupoMenor = 0;
		int indiceMenor = 0;

		while (this.grupo[indiceMenor] == null && indiceMenor < this.grupo.length) {
			if (indiceMenor == this.grupo.length - 1) {
				System.out.println("La cadena de colegio está vacia");
				return this.grupo[0].getAlumnos()[0];
			}
			indiceMenor++;
		}

		if (indiceMenor == this.grupo.length - 1) {
			return this.grupo[indiceMenor].notaMasBaja(asignatura);
		}

		for (int i = indiceMenor + 1; i < this.grupo.length; i++) {
			if (this.grupo[i] != null) {
				switch (asignatura.getIdentificador()) {
				case 1:
					grupoComparar = this.grupo[i].notaMasBaja(asignatura).getA1().getCalificacion();
					grupoMenor = this.grupo[indiceMenor].notaMasBaja(asignatura).getA1().getCalificacion();
					break;
				case 2:
					grupoComparar = this.grupo[i].notaMasBaja(asignatura).getA2().getCalificacion();
					grupoMenor = this.grupo[indiceMenor].notaMasBaja(asignatura).getA2().getCalificacion();
					break;
				case 3:
					grupoComparar = this.grupo[i].notaMasBaja(asignatura).getA3().getCalificacion();
					grupoMenor = this.grupo[indiceMenor].notaMasBaja(asignatura).getA3().getCalificacion();
					break;
				}

				if (grupoComparar < grupoMenor) {
					indiceMenor = i;
				}
			}
		}

		if (asignatura.getIdentificador() == 1) {
			System.out.println("Nota mas baja en el colegio:" + this.grupo[indiceMenor].notaMasAlta(asignatura).getA1().getCalificacion());
		} else {
			if (asignatura.getIdentificador() == 2) {
				System.out.println("Nota mas baja en el colegio:" + this.grupo[indiceMenor].notaMasAlta(asignatura).getA2().getCalificacion());
			} else {
				System.out.println("Nota mas baja en el colegio:" + this.grupo[indiceMenor].notaMasAlta(asignatura).getA3().getCalificacion());
			}
		}
		return this.grupo[indiceMenor].notaMasBaja(asignatura);
	}

	public Alumno mediaMasAlta() {
		int indiceMayor = 0;
		while (this.grupo[indiceMayor] == null && indiceMayor < this.grupo.length) {
			if (indiceMayor == this.grupo.length - 1) {
				System.out.println("La cadena está vacia");
				return this.grupo[0].getAlumnos()[0];
			}
			indiceMayor++;
		}

		if (indiceMayor == this.grupo.length - 1) {
			return this.grupo[indiceMayor].mediaMasAlta();
		}

		for (int i = indiceMayor + 1; i < this.grupo.length; i++) {
			if (this.grupo[i] != null) {
				if (Profesor.media(this.grupo[indiceMayor].mediaMasAlta()) < Profesor.media(this.grupo[i].mediaMasAlta())) {
					indiceMayor = i;
				}
			}
		}
		System.out.println("Media más alta: " + Profesor.media(this.grupo[indiceMayor].mediaMasAlta()));
		return this.grupo[indiceMayor].mediaMasAlta();
	}
	
}
