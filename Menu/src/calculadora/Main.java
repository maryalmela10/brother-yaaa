package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora calculadora1;
		int numeroTeclado, numero1, numero2;
		boolean seguir=true;
		
		calculadora1= new Calculadora();
		
		System.out.println("Elige una opción");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Divir");
		System.out.println("5.Salir");
		
		Scanner teclado=new Scanner(System.in);
		numeroTeclado=teclado.nextInt();
		
		while (seguir) {
			if (numeroTeclado<1 && numeroTeclado>5) {
			System.out.println("Ingresa una opcion valida");
			numeroTeclado=teclado.nextInt();
			} else {
				if (numeroTeclado==5) {
					seguir=false;
				} else {
					System.out.println("Ingresa el primer digito");
					numero1=teclado.nextInt();
					System.out.println("Ingresa el segundo digito");
					numero2=teclado.nextInt();
					
					switch (numeroTeclado) {
					case 1: calculadora1.setSuma(numero1);
					System.out.println("El resultado es: "+ calculadora1.sumar(numero2)); 
					break;
					case 2: calculadora1.setResta(numero1);
					System.out.println("El resultado es: "+ calculadora1.restar(numero2)); 
					break;
					case 3: calculadora1.setMultiplicacion(numero1);
					System.out.println("El resultado es: "+ calculadora1.multiplicar(numero2)); 
					break;
					case 4: calculadora1.setDivision(numero1);
					System.out.println("El resultado es: "+ calculadora1.dividir(numero2)); 
					break;
					
					//Pedir otra vez
					}
				}
			}
		}
	}
}

