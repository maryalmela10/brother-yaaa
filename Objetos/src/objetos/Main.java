package objetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		//crear dos bicis y mostrar luego un menu que sea:
		//1.Cambiar marcha
		//pedir que bici y cual marcha
		//cuaal marcha, 
		//2.Acelerar
		//Cuanto va a celerar
		//3.Frenar
		//4.Mostrar datos
		//Pedir bici y mostrar datos actuales
		//5.Salir
		
		//validar datos en el menu
		//marcha entre 1 y 7
		//acelarar positivo
		//frenar positivo	
		
		/*
		Bicycle bici1,bici2;
		int gear, speed, cadence, cantidad;
		Scanner teclado=new Scanner(System.in);

		System.out.println("Bici1:");
		System.out.println("Cadence");
		cadence=teclado.nextInt();
		System.out.println("Speed");
		speed=teclado.nextInt();
		System.out.println("gear");
		gear=teclado.nextInt();
		bici1=new Bicycle (cadence,speed, gear);
		System.out.println("bici1 creada");
		
		System.out.println("Bici2:");
		System.out.println("Cadence");
		cadence=teclado.nextInt();
		System.out.println("Speed");
		speed=teclado.nextInt();
		System.out.println("gear");
		gear=teclado.nextInt();
		bici2=new Bicycle (cadence,speed, gear);
		System.out.println("bici2 creada");
		
		System.out.println("Bici1:");
		System.out.println("Acelerar cuanto: ");
		cantidad=teclado.nextInt();
		bici1.speedUp(cantidad);
		
		System.out.println("Bici2:");
		System.out.println("Acelerar cuanto: ");
		cantidad=teclado.nextInt();
		bici2.speedUp(cantidad);
		
		if (bici1.getSpeed()>bici2.getSpeed()) {
			System.out.println("Bici1 mayor");
		} else {
			if (bici2.getSpeed()>bici1.getSpeed()) {
				System.out.println("Bici2 mayor");
			} else {
				System.out.println("La velocidad es igual");
			}
		}*/
		
		Bicycle bike01, bike02, bike03;

	    bike01 = new Bicycle(20, 10, 1);
	    bike02 = new MountainBike(20, 10, 5, "Dual");
	    bike03 = new RoadBike(40, 20, 8, 23);

	    bike01.printDescription();
	    bike02.printDescription();
	    bike03.printDescription();
	}
}
