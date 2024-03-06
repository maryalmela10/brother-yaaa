package array2dimencionesPdf;

public class ArrayDemo {

	public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
		int[][] suma=null;
		if(matriz1.length==matriz2.length&&matriz1[0].length==matriz2[0].length) {
			suma = new int[matriz1.length][matriz1[0].length];
			if (matriz1 != null&&matriz2!= null) {
				for (int i = 0; i < matriz1.length; i++) {
					if(matriz1[i]!=null&&matriz2[i]!=null) {
							for (int j = 0; j < matriz1[0].length; j++) {
								suma[i][j]=matriz1[i][j]+matriz2[i][j];
							}	
					}
					}
				}
			}	
		return suma;
	}
	
}
