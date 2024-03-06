package examen;

public class Mago {
	// atributos del mago
	private String nombre;
	private int poder;
	private boolean estado;

	@Override
	public String toString() {
		return "Mago [nombre=" + nombre + ", poder=" + poder + ", estado=" + estado + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Mago(String nombre, int poder, boolean estado) {
		this.nombre = nombre.toLowerCase();
		this.poder = poder;
		this.estado = estado;
	}

	// metodo para que el mago promocione
	public void promocionaMago() {
		if (this.estado && this.poder < 10) {
			char j = 'j';
			char h = 'h';
			int contadorHyJ = 0;

			for (int i = 0; i < this.nombre.length(); i++) {
				if (this.nombre.charAt(i) == j || this.nombre.charAt(i) == h) {
					contadorHyJ++;
				}
			}

			if (contadorHyJ > this.poder) {
				this.poder = this.poder * 2;
			}
		}
	}

	// metodo para que el mago combata
	public String combateDragon(Dragon dragon) {
		// boolean victoria =true;
		String victoria = new String("Victoria");
		String derrota = new String("Derrota");
		int contadorVocalesDistintas = 0;

		if (!this.estado) {
			return derrota;
		}
		
		if (dragon.getColor().equalsIgnoreCase("verde")) {
			return victoria;
		} else {
			if (this.nombre.indexOf('a') != -1) {
				contadorVocalesDistintas++;
			}

			if (this.nombre.indexOf('e') != -1) {
				contadorVocalesDistintas++;

				if (this.nombre.indexOf('i') != -1) {
					contadorVocalesDistintas++;
				}

				if (this.nombre.indexOf('o') != -1) {
					contadorVocalesDistintas++;

					if (this.nombre.indexOf('u') != -1) {
						contadorVocalesDistintas++;
					}

				}
			}
		}

		if (contadorVocalesDistintas >= 3) {
			return victoria;
		} else {
			return derrota;
		}
	}
}
