package ej_04;

import java.util.Scanner;

public class ContadorDigitos {

	/*static public int contarDigitos(int n){
		int res;
		if(n>0) {
			res = 1 + contarDigitos(n/10);
		} else {
			res= 0;
		}
		return res;
	}*/
	
	static int potencia(int n, int nP){
	   int resultado;
		if (nP>0) {
	    	resultado=n*ContadorDigitos.potencia(n, nP-1);
	    } else {
	    	resultado=1;
	    }
	    
		return resultado;
	}
	
	static void imprimirNumero(int n) {
		if (n<)
	}
	
}
