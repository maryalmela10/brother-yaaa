package pokimon;

public class PokiMochila {

	private int espacios;
	private Pokimon pokimon1;
	private Pokimon pokimon2;
	private Pokimon pokimon3;

	public PokiMochila() {
		this.espacios =  3;
	}

	public void changePokimon(int opcion, Pokimon newPokimon) {
		switch (opcion) {
		case 1:
			this.pokimon1 = newPokimon;
			break;
		case 2: 
			this.pokimon2 = newPokimon;
			break;
		case 3:
			this.pokimon3 = newPokimon;
		break;		
		}
	}
	
	public void recogerPokimon(Pokimon newPokimon) {
			switch (this.espacios) {
			case 3:
				this.pokimon1 = newPokimon;
				this.espacios--;
				break;
			case 2: 
				this.pokimon2 = newPokimon;
				this.espacios--;
				break;
			case 1:
				this.pokimon3 = newPokimon;
				this.espacios--;
			break;
			default: 
			break;
			}
		}

	
	public boolean mochilaLlena() {
		boolean llena = false;
		if (this.espacios == 0) {
			llena = true;
		}
		return llena;
	}

	public boolean mochilaVacia() {
		boolean vacia = false;
		if (this.espacios == 3) {
			vacia = true;
		}
		return vacia;
	}

	public int getEspacios() {
		return espacios;
	}

	public void setEspacios(int espacios) {
		this.espacios = espacios;
	}

	public Pokimon getPokimon1() {
		return pokimon1;
	}

	public void setPokimon1(Pokimon pokimon1) {
		this.pokimon1 = pokimon1;
	}

	public Pokimon getPokimon2() {
		return pokimon2;
	}

	public void setPokimon2(Pokimon pokimon2) {
		this.pokimon2 = pokimon2;
	}

	public Pokimon getPokimon3() {
		return pokimon3;
	}

	public void setPokimon3(Pokimon pokimon3) {
		this.pokimon3 = pokimon3;
	}

	@Override
	public String toString() {
		return "PokiMochila [espacios=" + espacios + ", pokimon1=" + pokimon1 + ", pokimon2=" + pokimon2 + ", pokimon3="
				+ pokimon3 + "]";
	}
	
	
}
