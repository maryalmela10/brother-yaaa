package herencia_magos;

public class Paladin extends Personaje {
	private boolean bendecido;
	
	public Paladin(int id, int puntosSalud, int ataque, int defensa, boolean bendecido) {
		super(id, puntosSalud, ataque, defensa);
		this.bendecido = bendecido;
	}

	public void activarBendecido() {
		if(bendecido) {
			this.setBendecido(false);
		} else {
			this.setBendecido(true);
		}
	}
	
	public boolean atacar(Personaje personaje) {
		int dañoCausado;
		if(this.bendecido) {
			dañoCausado=this.getAtaque()*2-personaje.getDefensa();
		}else {
			dañoCausado=this.getAtaque()-personaje.getDefensa();
			
		}
		
		if(dañoCausado>0) {
			this.setPuntosSalud(this.getPuntosSalud()-dañoCausado);
		}
		return true;
	}
	
	public boolean promocionar() {
		if(this.bendecido) {
			this.setAtaque(this.getAtaque()+10);
			this.setDefensa(this.getDefensa()+10);
		} else {
			this.setAtaque(this.getAtaque()+2);
			this.setDefensa(this.getDefensa()+2);
		}
		return true;
	}
	
	public void descansar() {
		if(this.bendecido) {
			this.setPuntosSalud(this.getPuntosSalud()+5);
		} else {
			this.setPuntosSalud(this.getPuntosSalud()+1);
		}
	}

	public boolean isBendecido() {
		return bendecido;
	}

	public void setBendecido(boolean bendecido) {
		this.bendecido = bendecido;
	}

	@Override
	public String toString() {
		return super.toString() + "Paladin [bendecido=" + bendecido + "]";
	}

	@Override
	public boolean atacar(PersonajeIn personaje) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
