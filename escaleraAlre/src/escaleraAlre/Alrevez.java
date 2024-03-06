package escaleraAlre;

import java.util.Scanner;

public class Alrevez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa un número");
		numero=teclado.nextInt();
		
		for (int j=1;j<=numero; j++) {
			for ( int i=(numero-j);i>=1; i--) {
				System.out.print(" ");
			}
			
			for (int m=1;m<=j;m++) {
				System.out.print(m);
			}
			System.out.println();
		}
	System.out.println();
	
	}
		
}



