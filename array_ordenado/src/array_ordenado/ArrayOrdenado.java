package array_ordenado;

import java.util.Arrays;

public class ArrayOrdenado {

	public static void ordenarArray(int[] array) {

		for(int i=0;i<array.length;i++) {
			int numeroMenor=array[i];
			for(int k=i+1;k<array.length;k++) {
				if(numeroMenor>array[k]) {
					array[i]=array[k];
					array[k]=numeroMenor;
					numeroMenor=array[i];
				}
			}
			
		}
	}
	
	public static boolean busquedaBinaria(int[] array, int numeroEncontrar) {
		int min=0,max=array.length,mitad=(int) Math.floor(max/2);
		int numCoparar=array[mitad];
			if (numeroEncontrar==numCoparar||numeroEncontrar==array[0]) {
				return true;
			}else if(max==2&&numeroEncontrar!=array[0]) {
					return false;
				}
			 else if(numCoparar>numeroEncontrar){
					max=mitad;
					int[] arraynuevo= Arrays.copyOfRange(array, min, max);
					return ArrayOrdenado.busquedaBinaria(arraynuevo, numeroEncontrar);
				} else {
					min=mitad+1;
					int[] arraynuevo= Arrays.copyOfRange(array, min, max);
					return ArrayOrdenado.busquedaBinaria(arraynuevo, numeroEncontrar);
				}
		}
	}


