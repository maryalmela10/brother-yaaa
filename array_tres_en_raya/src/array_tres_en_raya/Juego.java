package array_tres_en_raya;

import java.util.Scanner;

public class Juego {

	private Tablero tablero;
	private boolean turno;
	private Scanner teclado;
	private int modoJuego; //0 humano, 1 maquina
	
	public Juego(int modoJuego) {
		this.tablero=new Tablero();
		this.turno=true;
		this.teclado=new Scanner(System.in);
		this.modoJuego=modoJuego;
	}
	
	public void Jugar() {
		this.tablero.mostrarTablero();
		boolean hayGanador=false;
		//para humano, controlar maquina con modoJuego
		while(!this.tablero.estaLleno()
				&& !hayGanador) {
			
		}
		
		
		
		
	}
	
}
