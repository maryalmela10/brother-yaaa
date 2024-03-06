package pokimon;

public class Pokimon {

	int probCritico1;
	int probCritico2;
	private int ataque;
	private int vida;
	private int velocidad;
	private int critico;

	public Pokimon() {
		this.ataque = (int) Math.round((Math.random() * (26 - 10) + 10));
		this.vida = (int) Math.round((Math.random() * (101 - 80) + 80));
		this.velocidad = (int) Math.round((Math.random() * (81 - 40)) + 40);
		this.critico = (int) Math.round((Math.random() * (40 - (this.ataque+1)) + (this.ataque+1)));
	}

	public boolean ataca(Pokimon pokemon2) {
		boolean gana = false;
		while (this.vida > 0 && pokemon2.vida > 0) {
			probCritico1 = (int) (Math.random() * 10 + 1);
			probCritico2 = (int) (Math.random() * 10 + 1);
			if (pokemon2.velocidad < this.velocidad) {
				System.out.println("Pokimon 1 comienza la batalla");
				if (probCritico1 == 10) {
					pokemon2.vida = pokemon2.vida - this.critico;
					System.out.println("Pokimon 1 ataca");
					System.out.println("Critico!");
					System.out.println("Vida de Pokimon 2: " + pokemon2.vida);
				} else {
					pokemon2.vida = pokemon2.vida - this.ataque;
					System.out.println("Pokimon 1 ataca");
					System.out.println("Vida de Pokimon 2: " + pokemon2.vida);
				}
				if (pokemon2.vida > 0) {
					if (probCritico2 == 10) {
						this.vida = this.vida - pokemon2.critico;
						System.out.println("Pokimon 2 ataca");
						System.out.println("Critico!");
						System.out.println("Vida de Pokimon 1: " + this.vida);
					} else {
						this.vida = this.vida - pokemon2.ataque;
						System.out.println("Pokimon 2 ataca");
						System.out.println("Vida de Pokimon 1: " + this.vida);
					}
				}
			} else {
				if (pokemon2.velocidad > this.velocidad) {
					if (probCritico2 == 10) {
						this.vida = this.vida - pokemon2.critico;
						System.out.println("Pokimon 2 ataca");
						System.out.println("Critico!");
						System.out.println("Vida de Pokimon 1: " + this.vida);
					} else {
						this.vida = this.vida - pokemon2.ataque;
						System.out.println("Pokimon 2 ataca");
						System.out.println("Vida de Pokimon 1: " + this.vida);
					}
					if (this.vida > 0) {
						if (probCritico1 == 10) {
							pokemon2.vida = pokemon2.vida - this.critico;
							System.out.println("Pokimon 1 ataca");
							System.out.println("Critico!");
							System.out.println("Vida de Pokimon 2: " + pokemon2.vida);
						} else {
							pokemon2.vida = pokemon2.vida - this.ataque;
							System.out.println("Pokimon 1 ataca");
							System.out.println("Vida de Pokimon 2: " + pokemon2.vida);
						}
					}
				} else {
					System.out.println("Pokimon 1 comienza la batalla");
					if (probCritico1 == 10) {
						pokemon2.vida = pokemon2.vida - this.critico;
						System.out.println("Pokimon 1 ataca");
						System.out.println("Critico!");
						System.out.println("Vida de Pokimon 2: " + pokemon2.vida);

					} else {
						pokemon2.vida = pokemon2.vida - this.ataque;
						System.out.println("Pokimon 1 ataca");
						System.out.println("Vida de Pokimon 2: " + pokemon2.vida);
					}
					if (pokemon2.vida > 0) {
						if (probCritico2 == 10) {
							this.vida = this.vida - pokemon2.critico;
							System.out.println("Pokimon 2 ataca");
							System.out.println("Critico!");
							System.out.println("Vida de Pokimon 1: " + this.vida);
						} else {
							this.vida = this.vida - pokemon2.ataque;
							System.out.println("Pokimon 2 ataca");
							System.out.println("Vida de Pokimon 1: " + this.vida);
						}
					}

				}
			}
		}

		if (this.vida <= 0) {
			System.out.println("Gana Pokimon 2");
			gana = false;

		} else {
			System.out.println("Gana Pokimon 1 ");
			gana = true;
		}
		return gana;
	}

	
	@Override
	public String toString() {
		return "Pokimon [ataque=" + ataque + ", vida=" + vida + ", velocidad=" + velocidad + ", critico=" + critico
				+ "]";
	}

	public int getProbCritico1() {
		return probCritico1;
	}

	public void setProbCritico1(int probCritico1) {
		this.probCritico1 = probCritico1;
	}

	public int getProbCritico2() {
		return probCritico2;
	}

	public void setProbCritico2(int probCritico2) {
		this.probCritico2 = probCritico2;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getCritico() {
		return critico;
	}

	public void setCritico(int critico) {
		this.critico = critico;
	}

}
