package prueba;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		// declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
        
        for (int i=0;i<anArray.length;i++) {
        	System.out.println("Introduce un valor");
        	anArray[i]=teclado.nextInt();
        }
        /*  
        int suma=0;
        for(int i=0;i<anArray.length;i++) {
        	suma+=anArray[i];
        }
        
        System.out.println("suma: "+suma);*/
        
        System.out.println("Mayor "+ArrayDemo.mayor(anArray));
        
        System.out.println("Numeros positivos "+ArrayDemo.positivos(anArray));
        
        System.out.println("Numeros primos: "+ArrayDemo.Nprimos(anArray));
        
        for (int valor: anArray) {
        	System.out.println("Valor: "+valor);
        }
        
       /* for (int i=0;i<anArray.length;i++) {
        	System.out.println("Valor: "+anArray[i]);
        }*/

    }

}
