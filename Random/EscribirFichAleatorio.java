import java.io.RandomAccessFile;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EscribirFichAleatorio {
  public static void main(String[] args) {      
   File fichero = null;
   RandomAccessFile file = null;
   boolean fin = false;
   int numExpe;
   String nombre, apellido, terminar;
   
   try {
	   Scanner teclado=new Scanner(System.in);
	   fichero = new file("alumnos.dat");
	   file = new RandomAccessFile(fichero, "rw");
   }
   
   while (!fin) {
	   System.out.println("Ingresa num de expediente");
		numExpe=Integer.parseInt(teclado.nextLine());
		System.out.println("Ingresa nombre alumno");
		nombre=teclado.nextLine();
		System.out.println("Ingresa apellido alumno");
		apellido=teclado.nextLine();
		
		System.out.println();
   }*/
   
   catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   	
   finally {
	   file.close();
   }
   
   }
}
