package array2dimenciones;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numeros;
		Scanner teclado=new Scanner(System.in);
		
		numeros=new int[3][4];
		
		for(int i=0;i<numeros.length;i++) {
			for(int j=0;j<numeros.length;j++) {
				System.out.println("valor:");
				numeros[i][j]=teclado.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<numeros.length;i++) {
			for(int j=0;j<numeros.length;j++) {
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
