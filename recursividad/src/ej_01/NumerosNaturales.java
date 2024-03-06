package ej_01;

import java.util.Scanner;

public class NumerosNaturales {
	Scanner teclado = new Scanner(System.in);
	
	static public int sumaNumerosNaturales(int n){
		Scanner teclado = new Scanner(System.in);
		if(!(n>0)) {
			boolean valido=false;
			while(!valido) {
				System.out.println("Ingresa un número mayor de 0");
				n=teclado.nextInt();
				if(n>0) {
					valido=true;
				} 
			}
		}
		
		int suma;
		if(n==1) {
			suma=1;
		} else {
			suma=n+sumaNumerosNaturales(n-1);
		}
		return suma;
	}
}
