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
		final int TAMANO_REGISTRO=204;
		final int TAMANO_TEXTO=50;
		int numExpe;
		String nombre, apellido;
		ArrayList<Alumnos> alumnos= new ArrayList<Alumnos>();
		/*Pedir los datos de 10 alumnos por teclado. Los datos son: número de expediente,
		nombre y apellidos. Almacenar los datos en un array de objetos. Después de haberlos
		almacenado en el array, ordenar los alumnos por número de expediente y
		almacenarlos en otro array. A continuación, almacenar los objetos del array ordenado
		en un fichero llamado alumnos.*/
		for(int i=0;i<3;i++) {
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
				file.writeInt(numExpe);
				escribirTexto(file, nombre,TAMANO_TEXTO);
				escribirTexto(file, apellido,TAMANO_TEXTO);
			}	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (RandomAccessFile file = new RandomAccessFile("ficheroAlumnos.dat", "r")){
			
			String nombresito="";
			String apellidito="";
			System.out.println(file.readInt());
			for(int i=0;i<TAMANO_TEXTO;i++) {
				nombresito+=file.readChar();
			}
			
			System.out.println("Nombre: "+nombresito);
			for(int i=0;i<TAMANO_TEXTO;i++) {
				apellidito+=file.readChar();
			}
			System.out.println("Apellido: "+apellidito);
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void escribirTexto(RandomAccessFile file, String nombre, int TAMANO_TEXTO) {
		String textoEscribir=nombre;
		
		for(int i=nombre.length();i<TAMANO_TEXTO;i++) {
			textoEscribir+="#";
		}
		
		try {
			file.writeChars(textoEscribir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
