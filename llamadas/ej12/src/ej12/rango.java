package ej12;

import java.util.Scanner;

public class rango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Numero :");
		numero=teclado.nextInt();
		
		if ((numero>=10)&&(numero<=100)) {
			System.out.println("Rango");
		} else {
			System.out.println("No rango");
		}
		
	}

}
