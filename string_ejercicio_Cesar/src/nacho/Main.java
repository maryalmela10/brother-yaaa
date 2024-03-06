package nacho;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		String text;
	/*	char[] anArray;
		anArray=new char[5];
		
	     for (int i=0;i<anArray.length;i++) {
	        	System.out.println("Introduce un valor");
	        	anArray[i]=teclado.next().charAt(0);
	        }
	     
	     char[] newArray=Cesar.arrayCode(anArray, 3);
	     System.out.println(Arrays.toString(newArray));;
	   */  
	    
		System.out.println("Elige el número de Cesar");
		Cesar opcionCesar= new Cesar(Integer.parseInt(teclado.nextLine()));
		System.out.println("Ingresa el texto");
		text=teclado.nextLine();
		System.out.println(opcionCesar.code2(text));	
		
	}

}
