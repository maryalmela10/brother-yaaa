package herencia_Producto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nombre,codigo;
		int precio,existencias,dia,mes,año;
		Fecha fecha;
		System.out.println("Crear producto de alimentación");
		System.out.println("Ingresa el nombre del producto");
		nombre=teclado.nextLine();
		System.out.println("Ingresa el código del producto");
		codigo=teclado.nextLine();
		System.out.println("Ingresa el precio del producto");
		precio=Integer.parseInt(teclado.nextLine());
		System.out.println("Ingresa la cantidad que existen del producto");
		existencias=Integer.parseInt(teclado.nextLine());
		System.out.println("Ingresa la fecha de caducidad");
		System.out.println("Dia");
		dia=Integer.parseInt(teclado.nextLine());
		System.out.println("Mes");
		mes=Integer.parseInt(teclado.nextLine());
		System.out.println("Año");
		año=Integer.parseInt(teclado.nextLine());
		fecha=new Fecha(dia,mes,año);
		ProductoAlimentacion productoA=new ProductoAlimentacion(nombre,codigo,precio,existencias,fecha);
		System.out.println(productoA.vencido(new Fecha(30,01,2024)));
	}

}
