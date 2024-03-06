package pokimon;

public class EntrenadorPokimon {

	private double probabilidadDePokemon;
	private int dinero;
	int x;
	int y;
	private PokiMochila pokimochila;

	public EntrenadorPokimon() {
		this.probabilidadDePokemon = 50;
		this.dinero = 25;
		this.x = (int) (Math.random() * 100);
		this.y = (int) (Math.random() * 100);
		this.pokimochila = new PokiMochila();
	}	

	public boolean move(int opcion) {
		boolean found=false;
		double probabilidad = Math.random();
		int moveCounter=0;
		switch (opcion) {
		case 1: this.x--;
		break;
		case 2: this.x++;
		break;
		case 3: this.y++;
		break;
		case 4: this.y--;
		}
		
		if (this.x >= 0 || x <= 100)  {
			if (probabilidad*100 < this.probabilidadDePokemon) {
			System.out.println("Encontraste un pokimon!");
			moveCounter++;
			found=true;
			}
		}
		
		if (this.x < 0) {
			this.setX(0);
		}
		if (this.x > 100) {
			this.setX(100);
		}
		
		if (this.y < 0) {
			this.setY(0);
		}
		if (this.y > 100) {
			this.setY(100);
		}
		
		return found;
	}
	
		public void ganarPerderDinero (boolean gano) {
			if (gano) {
			this.dinero+=20;
			} else {
				this.dinero-=20;
			}
			
			if (this.dinero<0) {
				this.setDinero(0);
			}
		}
	
	
	public double getProbabilidadDePokemon() {
		return probabilidadDePokemon;
	}

	public void setProbabilidadDePokemon(double probabilidadDePokemon) {
		this.probabilidadDePokemon = probabilidadDePokemon;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public PokiMochila getPokimochila() {
		return pokimochila;
	}

	public void setPokimochila(PokiMochila pokimochila) {
		this.pokimochila = pokimochila;
	}

	/*public boolean moverseY() {
		boolean encuentra = false;
		System.out.println("3.Arriba");
		System.out.println("4.Abajo");
		Scanner teclado = new Scanner(System.in);
		int decision = teclado.nextInt();
		if (decision == 1) {
			this.y++;
		} else if (decision == 2) {
			this.y--;
		}
		if (this.y > 0 || y < 100) {
			double probabilidad = Math.random();
			if (probabilidad < this.probabilidadDePokemon) {
				System.out.println("Encontraste un pokimon!");
				encuentra = true;
			}
		}

		if (this.y <= 0) {
			this.y = 0;
		}
		if (this.y >= 100) {
			this.y = 100;
		}
		return encuentra;

	}*/


}
