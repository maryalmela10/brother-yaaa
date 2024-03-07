package array2dimencionesPdf;

import java.util.Scanner;

public class Cine {
	private char[][] butacas = new char[14][20];
	Scanner teclado = new Scanner(System.in);

	public Cine() {
		for (int i = 0; i < this.butacas.length; i++) {
			for (int j = 0; j < this.butacas[i].length; j++) {
				this.butacas[i][j] = 'L';
			}
		}
	}

	public void mostrarButacas() {
		int contadorI = 0;
		for(int k=0;k<this.butacas[0].length;k++) {
			if(k==0) {
				System.out.print("\t");
			}
			System.out.print(k+"\t");
		}
		System.out.println();
		
		for (int i = 0; i < this.butacas.length; i++) {
				System.out.print(contadorI + "\t");
				contadorI++;
				
				for (int j = 0; j < this.butacas[i].length; j++) {
					System.out.print(this.butacas[i][j] + "\t");
				}
				System.out.println();
			}
		}

	 

	public boolean comprarEntradas(int numeroEntradas) {
		boolean comprado=false;
		if (numeroEntradas <= 5) {
			for (int i = 0; i < numeroEntradas; i++) {
				comprado = false;
				System.out.println("Ingresa la fila de tu entrada");
				int posicion1 = teclado.nextInt();
				System.out.println("Ingresa la columna de tu entrada");
				int posicion2 = teclado.nextInt();
				if (this.butacas[posicion1][posicion2] == 'L') {
					comprado = true;
					this.butacas[posicion1][posicion2] = 'O';
				} else {
					System.out.println("No se pudo hacer esta compra");
					return comprado;
				}

			}
		}
		return comprado;
	}

}
