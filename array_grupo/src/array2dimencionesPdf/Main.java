package array2dimencionesPdf;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int[][] matriz1 = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, };

		int[][] matriz2 = { { 10, 15, 7, 7 }, { 5, 14, 81, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, };

		int[][] matrizSuma = ArrayDemo.sumarMatrices(matriz1, matriz2);

		for (int i = 0; i < matrizSuma.length; i++) {
			for (int j = 0; j < matrizSuma[i].length; j++) {
				System.out.print(matrizSuma[i][j]+" ");
			}
			System.out.println();
		}*/
		
		Cine cine=new Cine();
		cine.mostrarButacas();
		System.out.println(cine.comprarEntradas(2));
		cine.mostrarButacas();
		System.out.println(cine.comprarEntradas(2));
		cine.mostrarButacas();
	}
}
