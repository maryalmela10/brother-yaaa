package factorial;

import java.util.Scanner;

public class FactorialNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,resultado,numeroTeclado;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa un número");
		numeroTeclado=teclado.nextInt();
		resultado=1;
		
		while(numeroTeclado<2) {
			System.out.println("Ingresa un número válido");
			numeroTeclado=teclado.nextInt();
		}
		
		for (i=1; i<=numeroTeclado; i++) {
			resultado*=i;
		}
		
		System.out.println(resultado);
		
	}

	
	
	
}
