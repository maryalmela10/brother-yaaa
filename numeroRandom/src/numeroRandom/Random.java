package numeroRandom;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroTeclado, numeroMenor=1, numeroMayor=8, numeroAdivinar, intentos=2, contadorIntentos=1;

		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Adivina el número entre 1 y 5");
		numeroTeclado=teclado.nextInt();
		numeroAdivinar = (int) (Math.floor(Math.random()*(numeroMayor-numeroMenor+1)+numeroMenor));
		
		if (numeroTeclado==numeroAdivinar) {
			System.out.println("Adivinaste, el número es: "+numeroAdivinar);
		} else {
			while ((numeroTeclado!=numeroAdivinar) && (contadorIntentos<intentos)) {
				if (numeroTeclado<numeroMenor || numeroTeclado>numeroMayor) {
					System.out.println("Ingresa un número valido ");
					} else {
						if (numeroTeclado>numeroAdivinar) {
							System.out.println("El número es menor");
						} else {
							System.out.println("El número es mayor");
						}
						numeroTeclado=teclado.nextInt();
						contadorIntentos+=1;
					}
				}
			if (numeroTeclado==numeroAdivinar) {
				System.out.println("Adivniste, el número es: "+numeroAdivinar);
			} else {
				System.out.println("Acabaste los intentos");
			}
			
		}
		
	}
		
}

