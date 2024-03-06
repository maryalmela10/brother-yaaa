package array2dimenciones;

public class Array {

	public static int[] sumarFilas(int[][] array) {
		int[] suma = new int[array.length];
		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				if (array != null) {
					for (int j = 0; j < array.length; j++) {
						suma[i]= array[i][j];
					}
				}
			}
		}
		return suma;
	}
	
	public static int[] mediaPorFila(int[][]numeros) {
		int[] media=new int[numeros.length];
		int[] suma=new int[numeros.length];
		
		suma=sumarFilas(numeros);
		
		for(int i=0;i<numeros.length;i++) {
			media[i]=suma[i]/numeros[i].length;
		}
		return media;
	}
	
	public static int[][] matrizTraspuesta(int[][] matriz) {
		int[][] matrizTraspuesta;
		//comprobar que es una matriz
		matrizTraspuesta=new int[matriz[0].length][matriz.length];
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;i<matriz[i].length;i++) {
				matrizTraspuesta[j][i]=matriz[i][j];
			}
		}
		return matrizTraspuesta;
	}
	
	public static int[] mayorPorFila(int[][] array) {
		int[] mayor = new int[array.length];
		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				if (array != null) {
					mayor[i]=array[i][0];
					for (int j = 1; j < array.length; j++) {
						if(array[i][j]>mayor[i]) {
							mayor[i]=array[i][j];
						}
					}
				}
			}
		}
		return mayor;
	}

	public static int numeroRepetido(int[][] array, int valor) {
		int contadorDeValor=0;

		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				if (array != null) {
					for (int j = 1; j < array.length; j++) {
						if(array[i][j]==valor) {
							contadorDeValor++;
						}
					}
				}
			}
		}
		return contadorDeValor;
	}
	
}
