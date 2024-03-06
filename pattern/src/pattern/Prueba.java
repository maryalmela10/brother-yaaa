package pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		/*// ejercicio 1
		System.out.println("Introduce un texto");
		String texto = teclado.nextLine();
		boolean b = Pattern.matches("\\p{Lower}", texto);
		System.out.println(b);
		// ejercicio 2
		System.out.println("Introduce un texto");
		texto = teclado.nextLine();
		b = Pattern.matches("\\p{Lower}||\\p{Upper}", texto);
		System.out.println(b);
		// ejercicio 3
		System.out.println("Introduce un texto");
		String texto = teclado.nextLine();
		boolean b = Pattern.matches("[xyz]\\d", texto);
		System.out.println(b);
		// ejercicio 4
		System.out.println("Introduce un texto");
		String texto = teclado.nextLine();
		boolean b = Pattern.matches("\\p{Upper}+\\d", texto);
		System.out.println(b);
		// ejercicio 5
		System.out.println("Introduce un texto");
		String texto = teclado.nextLine();
		boolean b = Pattern.matches("\\d{8}+\\p{Upper}", texto);
		System.out.println(b);
		 ejercicio 6
		System.out.println("Introduce un texto");
		String texto = teclado.nextLine();
		boolean b = Pattern.matches("(\\+\\d\\d)?\\d{9,12}", texto);
		System.out.println(b);
		ejercicio 7
	    System.out.println("Introduce un texto");
		String texto = teclado.nextLine();
		boolean b = Pattern.matches("\\d{4}\\/\\d{2}\\/\\d{2}", texto);
		System.out.println(b);
		//ejercicio 8
	    System.out.println("Introduce un texto");
		String texto = teclado.nextLine();
		boolean b = Pattern.matches(".+@.+\\..+", texto);
		System.out.println(b);*/
		//ejercicio 9
		System.out.println("Introduce un texto");
		String texto = teclado.nextLine();
		boolean b = Pattern.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}", texto);
		System.out.println(b);
	}

}
