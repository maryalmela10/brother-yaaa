package uno;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Nacho {

	public static void main(String[] args) {      
		   File fichero = null;
		   RandomAccessFile file = null;
		   boolean fin = false;
		   int numExpe;
		   String nombre, apellido, terminar;
		   
		   try {
			   Scanner teclado=new Scanner(System.in);
			   fichero = new File("alumnos.dat");
			   file = new RandomAccessFile(fichero, "rw");
		   
		   
		   while (!fin) {
			   System.out.println("Ingresa num de expediente");
				numExpe=Integer.parseInt(teclado.nextLine());
				System.out.println("Ingresa nombre alumno");
				nombre=teclado.nextLine();
				System.out.println("Ingresa apellido alumno");
				apellido=teclado.nextLine();
				file.writeInt(numExpe);
				file.writeUTF(nombre);
				file.writeUTF(apellido);
				
				System.out.println("Escribe si o no para terminar o continuar");
				terminar=teclado.nextLine();
				if(terminar.equals("no")){
					fin=true;
				}	
		   }
		   }
		   catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   	
		   finally {
			   try {
				   if(file!=null) {
					   file.close();
				   }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
		   
		   }
}
