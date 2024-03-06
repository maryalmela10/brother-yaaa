package vuelos;

import java.util.Scanner;

public class vuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double PRECIO_KM=8.5;
		final double CUPON=0.3;
		double kilometros,precio,descuento;  	
		int estancia;

		Scanner teclado=new Scanner(System.in);		
		System.out.println("Ingrese la cantidad de kilometros que va a recorrer: ");
		kilometros=teclado.nextInt();
		System.out.println("Ingrese la cantidad de días de estancia: ");
		estancia=teclado.nextInt();
		precio=kilometros*PRECIO_KM;
		
		if ((estancia>7) && (kilometros>1000)){
			descuento=precio*CUPON;
			precio=precio-descuento;
			System.out.println("El precio total del viaje es: "+precio);
		} else {
			System.out.println("El precio total del viaje es: "+precio);
		}

	}

}
