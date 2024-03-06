package ejercicio_Cesar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String text;
		System.out.println("Ingresa una palabra");
		text=new String(teclado.nextLine());
		System.out.println(Cesar.reverse(text));
	}

}
