package herencia_magos;

public abstract class Personaje implements PersonajeIn {
	
	private int id;
	private int puntosSalud;
	private int ataque;
	private int defensa;
	
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	public int getPuntosSalud() {
		return puntosSalud;
	}
	public void setPuntosSalud(int puntosSalud) {
		this.puntosSalud = puntosSalud;
	}
	public Personaje(int id, int puntosSalud, int ataque, int defensa) {
		this.id = id;
		this.puntosSalud = puntosSalud;
		this.ataque = ataque;
		this.defensa = defensa;
	}
	
	public abstract boolean promocionar();
	public abstract void descansar();
	public abstract boolean atacar(Personaje personaje);
	
	@Override
	public String toString() {
		return "Personaje [id=" + id + ", puntosSalud=" + puntosSalud + ", ataque=" + ataque + ", defensa=" + defensa
				+ "]";
	}
	public int getId() {
		return id;
	}
	
	
}
