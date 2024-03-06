package clase4;

import java.util.Scanner;

public class ejClase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad;

		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Edad: ");
		edad=teclado.nextInt();
		
		if (edad>=18) {
			System.out.println("Mayor de edad");
		} else {
			System.out.println("Menor de edad");
		}
	}

}
