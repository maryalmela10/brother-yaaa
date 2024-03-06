package pokemonLand;

public class Pokemon {

	private char tipo;
	private int ataque;
	private int defensa;
	private int puntosVida;
	
	public Pokemon(char tipo, int ataque, int defensa, int puntosVida) {
		this.tipo = tipo;
		this.ataque = ataque;
		this.defensa = defensa;
		this.puntosVida = puntosVida;
	}

	public char getTipo() {
		return tipo;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	@Override
	public String toString() {
		return "Pokemon [tipo=" + tipo + ", ataque=" + ataque + ", defensa=" + defensa + ", puntosVida=" + puntosVida
				+ "]";
	}
	
	public void comerBaya() {
		this.puntosVida+=5;
	}
	
	public void descansar() {
		//TO DO limitar número de veces de descansar
		int contadorDescansar=0;
		if (contadorDescansar<5) {
			this.defensa+=4;
			contadorDescansar+=1;
		}
		}
		
			
	public int lucha(Pokemon pokemonCombatir){
        //this es el pokemon que empieza el combate y pokemonCombatir el recibe el primer golpe
        //ganador elije quien ha ganado la batalla
        //turno decide a que pokemon le toca atacar
        int ganador=0, turno=0, dañoTotal=0;
        while((this.puntosVida>0)&&(pokemonCombatir.puntosVida>0)){//rompe el bucle cuando uno llega a 0 de vida
            if (turno==1){
                dañoTotal=(this.ataque-pokemonCombatir.defensa);
                pokemonCombatir.puntosVida-=dañoTotal;
                System.out.println("Tu pokemon ha hecho "+dañoTotal+" de daño, dejandolo a "+pokemonCombatir.puntosVida+" PVs");
                turno=2;
            }else{
                dañoTotal=(pokemonCombatir.ataque-this.defensa);
                this.puntosVida-=dañoTotal;
                System.out.println("Tu pokemon ha sufrido "+dañoTotal+" de daño, quedandose a "+this.puntosVida+" PVs");
                turno=1; 
            }
        }
        //elige quien gana a traves de si el primero es el que ha llegado a 0 de vida
        if (this.puntosVida>0){
            ganador=1;
        }else{
            ganador=2;
        }
		
		return ganador;
	}
	
}
