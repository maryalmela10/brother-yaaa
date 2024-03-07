package parte1;

public class Ejercicio_uno {
	
	public static int uno (int[] array, int entero) {
		int contador=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==entero) {
				contador++;
			}
		}
		return contador;
	}
	
	/*
	ORDENAR ARRAY METODO BURBUJA
	public static int[] burbuja(int[] vector) {
		int aux;
		for (int i = 0; i ‹ vector.length; i++) {
		for (int j = 0; j < vector. length - i - 1; j++) {
		//El valor máximo lo más a la derecha posible
			if (vector[j] > vector[j + 1]) {
				aux = vector[]];
				vectorIJ] = vectorIj + 1];
				vector[j + 1] = aux;
					}
				}
			}
		return vector;
	}
	 */
	public static String dos (String[] array) {
		int maslarga=0;
		for(int i=0;i<array.length;i++) {
			if(array[i].length()>array[maslarga].length()) {
				maslarga=i;
			}
		}
		return array[maslarga];
	}
	
	public static void tres (String[] array, char letra) {
		for(int i=0;i<array.length;i++) {
			if(array[i].charAt(0)==letra) {
				System.out.println(array[i]);
			}
		}
	}
	
	public static int[] cuatro(int[] array1, int[] array2) {
		int[] arrayResultado;
		if(array1.length<array2.length) {
			 arrayResultado= new int[array2.length];
			 for(int i=0;i<array2.length;i++) {
				 if(i<array1.length) {
					 if(array1[i]<array2[i]) {
						 arrayResultado[i]=array2[i];
					 } else {
						 arrayResultado[i]=array1[i];
					 }
				 } else {
					 arrayResultado[i]=array2[i];
				 }
				 
			 }
		} else if (array1.length>array2.length) {
			arrayResultado= new int[array1.length];
			 for(int i=0;i<array1.length;i++) {
				 if(i<array2.length) {
					 if(array1[i]<array2[i]) {
						 arrayResultado[i]=array2[i];
					 } else {
						 arrayResultado[i]=array1[i];
					 }
				 } else {
					 arrayResultado[i]=array1[i];
				 }
				 
			 }
			
		} else {
			arrayResultado= new int[array2.length];
			 for(int i=0;i<array2.length;i++) {
					 if(array1[i]<array2[i]) {
						 arrayResultado[i]=array2[i];
					 } else {
						 arrayResultado[i]=array1[i];
					 }
				 }  
			 }
		return arrayResultado;
	}
	
}
