package Bascket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear jugadores
		Jugador jugador1= new Jugador();
		Jugador jugador2= new Jugador(1.79, 42, 24);
		System.out.println("Creaste jugador 1: "+jugador1);
		System.out.println("Creaste jugador 2: "+jugador2);
		//Ambos entranan tiros de dos y tres por 10 días
		jugador1.entrenarDos(10);
		System.out.println("Jugador 1 entrena 10 días tiro doble y su porcentaje ahora es "+jugador1.getPorcentajeDeDos());
		jugador1.entrenarTres(10);
		System.out.println("Jugador 1 entrena 10 días tiro triple y su porcentaje ahora es "+jugador1.getPorcentajeDeTres());
		jugador2.entrenarDos(10);
		System.out.println("Jugador 2 entrena 10 días tiro doble y su porcentaje ahora es "+jugador2.getPorcentajeDeDos());
		jugador2.entrenarTres(10);
		System.out.println("Jugador 2 entrena 10 días tiro triple y su porcentaje ahora es "+jugador2.getPorcentajeDeTres());
		
		//Ambos entrenan tiros de dos hasta que el porcentaje sea minimo 65, y de tres 45
		
		while (jugador1.getPorcentajeDeDos()<65) {
			jugador1.entrenarDos();
		}
		System.out.println("Jugador 1. Después de entrenar ahora tu porcentaje de tiro doble es: "+jugador1.getPorcentajeDeDos());
		
		while (jugador2.getPorcentajeDeDos()<65) {
			jugador2.entrenarDos();
		}
		System.out.println("Jugador 2. Después de entrenar ahora tu porcentaje de tiro doble es: "+jugador2.getPorcentajeDeDos());
		
		while (jugador1.getPorcentajeDeTres()<45) {
			jugador1.entrenarTres();
		}
		System.out.println("Jugador 1. Después de entrenar ahora tu porcentaje de tiro triple es: "+jugador1.getPorcentajeDeTres());
		
		while (jugador2.getPorcentajeDeTres()<45) {
			jugador2.entrenarTres();
		}
		System.out.println("Jugador 2. Después de entrenar ahora tu porcentaje de tiro triple es: "+jugador2.getPorcentajeDeTres());
		
		//Tiran
		int jugadorUnocanastaHechasDos=0;
		while (jugadorUnocanastaHechasDos<10) {
			if (jugador1.lanzarDeDos()) {
				jugadorUnocanastaHechasDos++;
			}
		}
		
		int jugadorUnocanastaHechasTres=0;
		while (jugadorUnocanastaHechasTres<10) {
			if (jugador1.lanzarDeTres()) {
				jugadorUnocanastaHechasTres++;
			}
		}
		
		int jugadorDoscanastaHechasDos=0;
		while (jugadorDoscanastaHechasDos<10) {
			if (jugador2.lanzarDeDos()) {
				jugadorDoscanastaHechasDos++;
			}
		}
		
		int jugadorDoscanastaHechasTres=0;
		while (jugadorDoscanastaHechasTres<10) {
			if (jugador2.lanzarDeTres()) {
				jugadorDoscanastaHechasTres++;
			}
		}
	System.out.println("Encestaron los tiros deseados, felicidades!");
	}
		
	
	
	
		
		
		
}


