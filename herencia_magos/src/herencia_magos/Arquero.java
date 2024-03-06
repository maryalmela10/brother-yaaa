package herencia_magos;

public class Arquero extends Personaje {
	private int numFlechas;
	
	public Arquero(int id, int puntosSalud, int ataque, int defensa, int numFlechas) {
		super(id, puntosSalud, ataque, defensa);
		this.numFlechas = numFlechas;
	}
	
	public void incrementarFlechas(int cantidad) {
		this.setNumFlechas(this.getNumFlechas()+cantidad);
	}
	
	public boolean atacar(Personaje personaje) {
		int dañoCausado;
		dañoCausado=this.getAtaque()+this.getNumFlechas()-personaje.getDefensa();
		if(dañoCausado>0) {
			personaje.setPuntosSalud(personaje.getPuntosSalud()-dañoCausado);
		}
		return true;
	}
	
	public boolean promocionar() {
		this.setAtaque(this.getAtaque()+2);
		this.setDefensa(this.getDefensa()+1);
		this.numFlechas+=3;
		return true;
	}
	
	public void descansar() {
		int probabilidad=(int)Math.floor(Math.random()*80+1);
		if(probabilidad<=80) {
			this.setPuntosSalud(this.getPuntosSalud()+5);
		}
	}

	public int getNumFlechas() {
		return numFlechas;
	}

	public void setNumFlechas(int numFlechas) {
		this.numFlechas = numFlechas;
	}

	@Override
	public String toString() {
		return super.toString() + "Arquero [numFlechas=" + numFlechas + "]";
	}

	@Override
	public boolean atacar(PersonajeIn personaje) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
