package ej_0203;

import java.util.Scanner;

public class Imprimir {

	static public void imprimir(int n){

		if(n>0) {
		imprimir(n-1);
		 System.out.print(n);
		} else {
			System.out.println();
		}
	}
	
	static public void imprimirAlrevez(int n){
		if(n>0) {
		 System.out.print(n);
		 imprimirAlrevez(n-1);
		} else {
			System.out.println();
		}
	}
	
}
