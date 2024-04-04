package uno;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numExpe;
		String nombre, apellido;
		ArrayList<Alumnos> alumnos= new ArrayList<Alumnos>();
		/*Pedir los datos de 10 alumnos por teclado. Los datos son: número de expediente,
		nombre y apellidos. Almacenar los datos en un array de objetos. Después de haberlos
		almacenado en el array, ordenar los alumnos por número de expediente y
		almacenarlos en otro array. A continuación, almacenar los objetos del array ordenado
		en un fichero llamado alumnos.*/
		for(int i=0;i<10;i++) {
		System.out.println("Ingresa num de expediente");
		numExpe=Integer.parseInt(teclado.nextLine());
		System.out.println("Ingresa nombre alumno");
		nombre=teclado.nextLine();
		System.out.println("Ingresa apellido alumno");
		apellido=teclado.nextLine();
		alumnos.add(new Alumnos(numExpe,nombre,apellido));
		}
		
		Collections.sort(alumnos, new OrdenarPorExpe());
		
		try (RandomAccessFile file = new RandomAccessFile("ficheroAlumnos.dat", "rw")){
			
			for(Alumnos alumno: alumnos) {
				numExpe=alumno.getNumExpe();
				nombre=alumno.getNombre();
				apellido=alumno.getApellido();
			}	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
