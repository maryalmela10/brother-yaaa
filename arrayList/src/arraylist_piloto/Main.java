package arraylist_piloto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion,nLicencia,cantidadCarreras,puntosCarrera;
		String nacionalidad,nombre,apellidos;
		Lista_pilotos lista_pilotos=new Lista_pilotos();
		
		System.out.println("1.Alta");
		System.out.println("2.Poner puntos en todas las carreras");
		System.out.println("3.Añadir puntos de la última carrera");
		System.out.println("4.Listar todos los datos de los pilotos que tienen como puntuación más baja un 5 en una carrera");
		System.out.println("5.Mostrar número de licencia del piloto con la puntuación total más alta");
		System.out.println("6.Mostrar los datos ordenados por orden alfabético de apellidos y nombre");
		System.out.println("7.Salir");
		opcion=Integer.parseInt(teclado.nextLine());
		
		while(opcion!=7) {
			String opcion2;
			switch(opcion) {
			case 1:
				System.out.println("Número de licencia:");
				nLicencia=Integer.parseInt(teclado.nextLine());
				System.out.println("Nombre");
				nombre=teclado.nextLine();
				System.out.println("Apellidos");
				apellidos=teclado.nextLine();
				System.out.println("Nacionalidad");
				nacionalidad=teclado.nextLine();
				System.out.println(lista_pilotos.altaPiloto(nLicencia, nombre, apellidos, nacionalidad));
				break;
			case 2:
				System.out.println("Ingresa el id del piloto");
				nLicencia=Integer.parseInt(teclado.nextLine());
				System.out.println("Ingresa la cantidad de carreras");
				cantidadCarreras=Integer.parseInt(teclado.nextLine());
				ArrayList<Integer>puntos=new ArrayList<Integer>();
				for(int i=0;i<cantidadCarreras;i++) {
					int puntosAgregar=Integer.parseInt(teclado.nextLine());
					puntos.add(puntosAgregar);
				}
				lista_pilotos.ponerPuntosNacho(nLicencia, puntos);
				/*System.out.println((lista_pilotos.puntosTodasCarreras(nLicencia, cantidadCarreras)));*/
				break;
			case 3:
				System.out.println("Ingresa el id del piloto");
				nLicencia=Integer.parseInt(teclado.nextLine());
				System.out.println("Ingresa los puntos de la carrera");
				puntosCarrera=Integer.parseInt(teclado.nextLine());
				lista_pilotos.ponerPuntosUltimaCarreraNacho(puntosCarrera, nLicencia);
				break;
			case 4:
				lista_pilotos.listarPilotosFIltradoPor5();
				break;
			case 5:
				lista_pilotos.puntuacionAlta();
				break;
			case 6:
				break;
			default:System.out.println("Opcion incorrecta");
			}
			
			System.out.println("1.Alta");
			System.out.println("2.Poner puntos en todas las carreras");
			System.out.println("3.Añadir puntos de la última carrera");
			System.out.println("4.Listar todos los datos de los pilotos que tienen como puntuación más baja un 5 en una carrera");
			System.out.println("5.Mostrar número de licencia del piloto con la puntuación total más alta");
			System.out.println("6.Mostrar los datos ordenados por orden alfabético de apellidos y nombre");
			System.out.println("7.Salir");
			opcion=Integer.parseInt(teclado.nextLine());
			
		}
	}

}
