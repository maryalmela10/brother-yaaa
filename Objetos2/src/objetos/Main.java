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
		
		
		Bicycle bici1,bici2;
		int gear, speed, cadence, cantidad, opcion, biciEscogida, bici;
		boolean escoger=true;
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
		
		System.out.println("Menú");
		System.out.println("1.Cambiar marcha");
		System.out.println("2.Acelerar");
		System.out.println("3.Frenar");
		System.out.println("4.Mostrar datos");
		System.out.println("5.Salir");
		opcion=teclado.nextInt();
		
		System.out.println("Escoge tu bici");
		System.out.println("1.Bici 1");
		System.out.println("2.Bici 2");
		biciEscogida=teclado.nextInt();
		
		while (escoger==true) {
						//menu
						if  (opcion<1 || opcion>5) {
							 System.out.println("Escoge una opción valida");
							 opcion=teclado.nextInt();
						} else {						
								switch (opcion) {
								case 1: 
								System.out.println("Cantidad");
								cantidad=teclado.nextInt();
								
								System.out.println("Escoge tu bici");
								System.out.println("1.Bici 1");
								System.out.println("2.Bici 2");
								biciEscogida=teclado.nextInt();
						
								//bici
								System.out.println();
								while (!(biciEscogida==1 || biciEscogida==2)) { 
									System.out.println("Elige una opción valida");
									biciEscogida=teclado.nextInt();
								} 
								else {
									//bici 1
									if (biciEscogida==1) {
										bici=bici1.speedUp();
										}	else {
											bici=bici2.getSpeed();
											
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
						        	escoger=false;
									System.out.println("chao");
								}
							}
						}
						
						(opcion>=1 && opcion<=5) {						
							switch (opcion) {
							case 1: System.out.println("Escoge la marcha que quieres");
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
					        	escoger=false;
								System.out.println("chao");
							}
						} //else {
							//escoger=false;
							//System.out.println("chao");
								
							//}
						}
						
					}
				} 
				//bici 2
				else {
					
				}
				
			}
			
		//opciones
		if (opcion<1 || opcion>5) {
			System.out.println("Escoge una opción valida");
			opcion=teclado.nextInt();
		}	else {
			if  (opcion>=1 && opcion<=5) {
				System.out.println("Escoge tu bici");
				
				switch (opcion) {
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
		        	escoger=false;
					System.out.println("chao");
				}
			} //else {
				//escoger=false;
				//System.out.println("chao");
					
				//}
			}
			
		}
		//opciones
	}

}
