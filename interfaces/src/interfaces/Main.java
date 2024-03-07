package interfaces;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Cola cola = new Cola(20);
		cola.introducirDatos(1);
		cola.introducirDatos(2);
		cola.introducirDatos(3);
		cola.introducirDatos(4);
		cola.introducirDatos(5);
		cola.mostrarDatos();
		System.out.println(cola.obtenerDatos());
		cola.mostrarDatos();
	}

}
