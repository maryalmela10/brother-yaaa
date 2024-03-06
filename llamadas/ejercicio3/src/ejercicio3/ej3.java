package ejercicio3;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double catetoA,catetoB,hipotenusa;

		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa el cateto A");
		catetoA=teclado.nextDouble();
		System.out.println("Ingresa el cateto B");
		catetoB=teclado.nextDouble();
		hipotenusa=Math.sqrt((Math.pow(catetoA, 2))+(Math.pow(catetoB, 2)));
		System.out.println("Hipotenusa: "+hipotenusa);
	}

}
