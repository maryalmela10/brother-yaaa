package calculadora;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int eleccion, numero1, numero2, resultado;

		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero");
		numero1=teclado.nextInt();
		System.out.println("Ingresa el segundo numero");
		numero2=teclado.nextInt();
		
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		eleccion=teclado.nextInt();

		switch (eleccion) {
		case 1:  resultado=numero1+numero2;
				System.out.println("La suma es: "+resultado);
        break;
		case 2:   resultado=numero1-numero2;
		System.out.println("La resta es: "+resultado);
        break;
		case 3:   resultado=numero1*numero2;
		System.out.println("La multiplicación es: "+resultado);
        break;
		case 4:   
		if (numero2==0)
		{ 
			System.out.println("División no valida");
		} else {
			resultado=numero1/numero2;
			System.out.println("La división es: "+resultado);
		}
        break;
        
        default: 
        	System.out.println("Opción no válida");
		}
	
		
		
	}

}
