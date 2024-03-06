package trianguloDeNumeros;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa un número");
		numero=teclado.nextInt();
		
		
		for (int i=1; i<=numero; i++) {
			//bucle para cada línea y escribir 12.....x
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
			
	}
}
	

