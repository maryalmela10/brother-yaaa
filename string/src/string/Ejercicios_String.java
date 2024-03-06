package string;

import java.util.Scanner;


public class Ejercicios_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longitud,contador=0;
		Scanner teclado=new Scanner(System.in);
		String texto,texto2, alReves, primerCaracter;
		
		System.out.println("Escribe un texto");
		texto=teclado.nextLine();
		
		// La cadena de caracteres en mayúsculas.
		System.out.println(texto.toUpperCase());
		//La cadena de caracteres en minúsculas
		System.out.println(texto.toLowerCase());
		//Los dos primeros caracteres de la cadena(solo en caso de que la longitud de esta
		//sea de dos o más caracteres)
		longitud=texto.length();
		if (texto.length()<2) {
			System.out.println("Escribe un texto");
			texto=teclado.nextLine();
		} 
		
		System.out.println(texto.substring(0,2));
		
		//Los dos últimos caracteres de la cadena (solo en caso de que la longitud de esta 
		//sea de dos o más caracteres).
		System.out.println(texto.substring(longitud-2));
		
		//El número de ocurrencias en la cadena del último carácter
		if (!texto.isEmpty()) {
	      char ultimoCaracter = texto.charAt(longitud - 1);
	        for (int i = 0; i < longitud; i++) {
	            if (texto.charAt(i) == ultimoCaracter) {
	            	contador++;
	            }
	        }
		} else {
			System.out.println("La cadena está vacia");
		}
	        System.out.println("Número de ocurrencias del último carácter: " + contador);
	        
	      //La cadena con todas las ocurrencias del primer carácter en mayúsculas.  
	        primerCaracter=texto.substring(0,1);
	        for (int i = 0; i < longitud; i++) {
	        	if (texto.substring(i, i+1).equals(primerCaracter)) {
	        		System.out.print(primerCaracter.toUpperCase());
	        	}else {
	        		System.out.print(texto.substring(i, i+1));
	        	}	
	        }
	        	
	        System.out.println();
	        
	        // Agregar tres asteriscos por delante y por detrás
	        System.out.println("***"+texto+"***");
	        
	        // Mostrar la cadena invertida
	       //Primera opcion: 
	        for(int j=longitud-1;j>=0;j--) {
	        	System.out.print(texto.charAt(j));
	        }
	        System.out.println();
	        
	        //segunda opcion
	        String cadenaInvertida = new StringBuilder(texto).reverse().toString();
	        System.out.println("Cadena invertida: " + cadenaInvertida);
	        
	        /*tercera opcion
	        alReves=" ";
	        for(int i=longitud-1;i>=0;i--) {
	        	alReves+=(texto.charAt(i));
	        }
	        
	        System.out.println(alReves);
	        */
		
	      //si tengo una cadena de texto con digitos como los guardo en una variable
	    	System.out.println("ingresa un número");
	        texto2=teclado.nextLine();
	    	int trans=Integer.parseInt(texto2);
	    	System.out.println(trans-5);
	        }
	}

