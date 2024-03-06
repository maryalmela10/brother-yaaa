package herencia_magos;

public class Mago extends Personaje {
	String escuela;

	public Mago(int id, int puntosSalud, int ataque, int defensa, String escuela) {
		super(id, puntosSalud, ataque, defensa);
		if (validarEscuela(escuela)) {
			this.escuela = escuela;
		} else {
			System.out.println("Escuela invalida, debe ser Fire, Water o Wind ");
		}
	}

	private boolean validarEscuela(String escuelaComprobar) {
		String[] arrayEscuelas = { "Fire", "Water", "Winds" };
		for (String elementos : arrayEscuelas) {
			if (elementos.equalsIgnoreCase(escuelaComprobar)) {
				return true;
			}
		}
		return false;
	}

	public boolean atacar(Personaje personaje) {
		int dañoCausado;
		int probabilidad = (int) Math.floor(Math.random() * 50 + 1);
		if (probabilidad <= 50) {
			dañoCausado = this.getAtaque() * 3 - personaje.getDefensa();
			if(dañoCausado>0) {
				personaje.setPuntosSalud(this.getPuntosSalud() - dañoCausado);
			}
		}
		return true;
	}

	public boolean promocionar() {
		int probabilidad = (int) Math.floor(Math.random() * 40 + 1);
		if (probabilidad <= 40) {
			this.setDefensa(this.getDefensa() + 1);
		}
		probabilidad = (int) Math.floor(Math.random() * 20 + 1);
		if (probabilidad <= 20) {
			this.setAtaque(this.getAtaque() + 1);
		}
		
		return true;
	}

	public void descansar() {
		if (this.escuela.equalsIgnoreCase("Fire") || this.escuela.equalsIgnoreCase("Water")) {
			this.setPuntosSalud(this.getPuntosSalud() + 5);
		} else {
			this.setPuntosSalud(this.getPuntosSalud() + 10);
		}
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	@Override
	public String toString() {
		return super.toString() + "Mago [escuela=" + escuela + "]";
	}

	@Override
	public boolean atacar(PersonajeIn personaje) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
