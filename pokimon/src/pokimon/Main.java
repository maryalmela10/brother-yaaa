package pokimon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntrenadorPokimon entrenador = new EntrenadorPokimon();
		int opcion;
		boolean playing = true;
		boolean found = false;
		Pokimon newPokimon = null;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Hola, bienvenido al juego");
		System.out.println("Eres un entrenador Pokimon, utiliza el menú de acciones y diviertete!");
		System.out.println("1.Moverse");
		System.out.println("2.Recoger Pokimon");
		System.out.println("3.Cambiar Pokimon");
		System.out.println("4.Ignorar");
		System.out.println("5.Luchar");
		System.out.println("6.Salir");
		opcion = teclado.nextInt();

		while (playing) {
			switch (opcion) {
			case 1:
				System.out.println("Hacia donde quieres moverte");
				System.out.println("1.Izquierda");
				System.out.println("2.Derecha");
				System.out.println("3.Arriba");
				System.out.println("4.Abajo");
				opcion = teclado.nextInt();
				// Moverse regresa true si consiguio un pokimon y false si no
				found = entrenador.move(opcion);
				if (found) {
					newPokimon = new Pokimon();
					System.out.println("Pokimon encontrado" + newPokimon);
				} else {
					System.out.println("No has conseguido nada");
				}
				break;
			case 2:
				if (entrenador.getPokimochila().mochilaLlena()) {
					System.out.println("La mochila está llena, no puedes recoger el pokimon");
				}
				if (found) {
					entrenador.getPokimochila().recogerPokimon(newPokimon);

					switch (entrenador.getPokimochila().getEspacios()) {
					case 3:
						System.out.println(
								"Tienes un nuevo Pokimon en tu mochila" + entrenador.getPokimochila().po());
						break;
					case 2:
						System.out.println(
								"Tienes un nuevo Pokimon en tu mochila" + entrenador.getPokimochila().getPokimon2());
						break;
					case 1:
						System.out.println(
								"Tienes un nuevo Pokimon en tu mochila" + entrenador.getPokimochila().getPokimon3());
						break;
					}
				}else {
					System.out.println("No hay pokimon que recoger");
				}
				break;
			case 3:
				if (found) {
					System.out.println("Lo quieres cambiar por:");
					System.out.println("1.pokimon 1:" + entrenador.getPokimochila().getPokimon1());
					System.out.println("2.pokimon 2:" + entrenador.getPokimochila().getPokimon2());
					System.out.println("3.pokimon 3:" + entrenador.getPokimochila().getPokimon3());
					opcion = teclado.nextInt();
					entrenador.getPokimochila().changePokimon(opcion, newPokimon);
				}else {
					System.out.println("No hay un nuevo pokimon para cambiar");
				}
				break;
			case 4:
				break;
			case 5:
				if (entrenador.getPokimochila().mochilaVacia()) {
					System.out.println("No tienes un Pokimon para luchar");
				} 
				
				if (found) {
					System.out.println("Escoge tu Pokimon");
					switch (entrenador.getPokimochila().getEspacios()) {
					case 2:
						System.out.println("1." + entrenador.getPokimochila().getPokimon1());
						break;
					case 1:
						System.out.println("1." + entrenador.getPokimochila().getPokimon1());
						System.out.println("2." + entrenador.getPokimochila().getPokimon2());
						break;
					case 0:
						System.out.println("1." + entrenador.getPokimochila().getPokimon1());
						System.out.println("2." + entrenador.getPokimochila().getPokimon2());
						System.out.println("3." + entrenador.getPokimochila().getPokimon3());
						break;
					}
					opcion = teclado.nextInt();
					boolean ganar;
					if (opcion == 1) {
						ganar = entrenador.getPokimochila().getPokimon1().ataca(newPokimon);
					} else if (opcion == 2) {
						ganar = entrenador.getPokimochila().getPokimon2().ataca(newPokimon);
					} else {
						ganar = entrenador.getPokimochila().getPokimon3().ataca(newPokimon);
					}
					entrenador.ganarPerderDinero(ganar);

					if (ganar) {
						System.out.println("Ganaste");
						System.out.println("Ahora tienes" + entrenador.getDinero() + "Monedas");
					} else {
						System.out.println("Perdiste!");
						System.out.println("Ahora tienes" + entrenador.getDinero() + "Monedas");
					}

					if (entrenador.getDinero() == 0) {
						System.out.println("Te quedaste sin dinero");
					}
				} else {
					System.out.println("No hay pokimon para luchar");
				}
				break;
				default: 
					playing=false;
			}

			System.out.println("1.Moverse");
			System.out.println("2.Recoger Pokimon");
			System.out.println("3.Cambiar Pokimon");
			System.out.println("4.Ignorar");
			System.out.println("5.Luchar");
			System.out.println("6.Salir");
			opcion = teclado.nextInt();

		}
	}
}

/*
 * int opciones = teclado.nextInt(); while (opciones >= 1 && opciones <= 2) {
 * 
 * System.out.println("1.Mover en horizontal");
 * System.out.println("2.Mover en vertical"); System.out.println("3.Salir");
 * switch (opciones) { case 1: entrenador.moverseX();
 * 
 * if (entrenador.moverseX()) { System.out.println("1.Recoger el pokemon");
 * System.out.println("2.Luchar"); int opcion = teclado.nextInt(); if (opcion ==
 * 1) { entrenador.getPokimochila().recogerPokimon(charizard); } else if (opcion
 * == 2 && entrenador.getPokimochila().mochilaVacia() != true) {
 * entrenador.getPokimochila().getPokimon1().ataca(charizard); } }
 * 
 * break; case 2: entrenador.moverseY(); break; case 3:
 * 
 * break; default: System.out.println("Introduce una opcion valida"); opciones =
 * teclado.nextInt(); break;
 * 
 * } }
 */
