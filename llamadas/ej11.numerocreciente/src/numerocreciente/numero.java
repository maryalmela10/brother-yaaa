package numerocreciente;

import java.util.Scanner;

public class numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1,numero2,numero3;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("numero 1:");
		numero1=teclado.nextInt();
		System.out.println("numero 2:");
		numero2=teclado.nextInt();
		System.out.println("numero 3:");
		numero3=teclado.nextInt();
		
		if ((numero1<numero2)&&(numero2<numero3))
		{
			System.out.println("creciente");
		} else {
			System.out.println("No creciente");
		}
		
	}

}
