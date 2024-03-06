package ej2;

import java.util.Scanner;

public class Ejercicio2xd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float altura,radio,superficie,volumen;
		double raiz;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Altura");
		altura=teclado.nextFloat();
		System.out.println("Radio");
		radio=teclado.nextFloat();
		
		volumen=(float)(Math.PI*Math.pow(radio, 2)*altura);
		superficie=(float)(2*Math.PI*altura+(2*Math.PI*radio*radio));
		raiz=Math.sqrt(4.5);
		
		System.out.println("Volumen: "+volumen);
		System.out.println("Superficie: "+superficie);
		
		
	}

}
