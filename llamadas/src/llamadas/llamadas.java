package llamadas;

import java.util.Scanner;

public class llamadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int PRECIO_MINUTO=5;
		final int PRECIO_MINIMO=10;
		int duracionMinutos, precioFinal;

		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Duracion llamada:");
		duracionMinutos=teclado.nextInt();
		
		if(duracionMinutos>0 && duracionMinutos<=3)
		{
			precioFinal=PRECIO_MINIMO;
			System.out.println("Precio: "+precioFinal);
		} else {
			if (duracionMinutos>3) {
				precioFinal=(PRECIO_MINIMO)+((duracionMinutos-3)*5);
				System.out.println("Precio: "+precioFinal);
			} else {
				System.out.println("Llamada no valida");
			}

		}
		
		
		
	}

}
