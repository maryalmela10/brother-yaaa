package prueba;

public class ArrayDemo {

	public static int mayor(int[] valores) {
		int mayor = valores[0];
		for (int i = 1; i < valores.length; i++) {
			if (mayor < valores[i]) {
				mayor = valores[i];
			}
		}
		return mayor;
	}

	public static int positivos(int[] valores) {
		int contadorPositivos = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > 1) {
				contadorPositivos++;
			}
		}
		return contadorPositivos;
	}

	public static void rotarDerechaCircular(int[] array) {
		int auxiliar;
		auxiliar = array[array.length - 1];
		for (int i = array.length - 1; i >= 1; i++) {
			array[i] = array[i - 1];
		}
		array[0] = auxiliar;
	}

	public static boolean esPrimo(int numero) {
		boolean esPrimo = true;
		int divisor = 2, resto;

		if (numero < 2) {
			esPrimo = false;
		}

		while ((esPrimo) && (divisor < numero)) {
			resto = numero % divisor;
			if (resto == 0) {
				esPrimo = false;
			}
			divisor++;
		}
		return esPrimo;
	}

	public static int Nprimos(int[] array) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (ArrayDemo.esPrimo(array[i])) {
				contador++;
			}
		}
		return contador;
	}
	
	private static boolean estaOrdenado(int[] numeros) {
		boolean estaOrdenado=true;
		
		for(int i=0;i<numeros.length;i++) {
			if (numeros[i]<=numeros[i-1]) {
				estaOrdenado=false;
				return estaOrdenado;
			}
		}
		return estaOrdenado;
	}

	private static int[] sumaVectores(int[] vector1, int[] vector2) {
		int[] suma=null;
		
		if((vector1==null||vector2==null)
			||(vector1.length!=vector2.length)) {
		return suma;	
		}
		
		suma=new int[vector1.length];
		
		for(int i=0;i<suma.length;i++) {
			suma[i]=vector1[i]+vector2[i];
		}
		
		return suma;
	}
	
	
}
