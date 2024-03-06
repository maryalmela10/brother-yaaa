package nacho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		String text;
		System.out.println("Elige el número de Cesar");
		Cesar opcionCesar= new Cesar(Integer.parseInt(teclado.nextLine()));
		System.out.println("Ingresa el texto");
		text=teclado.nextLine();
		System.out.println(opcionCesar.code2(text));	
	}

}
