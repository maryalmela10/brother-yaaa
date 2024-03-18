package tikitok;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		String usuarioABuscar, nombreUsuario=null;
		DataInputStream leer=null;
		
	
		System.out.println("Nombre de usuario a buscar");
		usuarioABuscar=teclado.nextLine();
		try {
		leer=new DataInputStream(new
                BufferedInputStream(new FileInputStream("videos.dat")));
		//voy leyendo los datos
		//while(true) {
			//lecturas
		if(nombreUsuario.equalsIgnoreCase(usuarioABuscar)) {
			//syso de todos los datos del video
		}
		//}
		
		}
		catch (IOException e) { }
		finally {
			if(leer!=null) {
				try {
					leer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		//parte 2. Menos me gusta
		int menosMeGusta;
		//declarar variables para datos de video que tienne menos me gusta
		
		
		try {
			leer=new DataInputStream(new
	                BufferedInputStream(new FileInputStream("videos.dat")));
			//leer datos
			//inicializarMenosMeGusta al primer valor inicializar a -1 si no hay dato y espacios en blanco
			//datosde video que menos me gusrtan tienen se declarara a los datos del primer video
			//inicializar a -1 si no hay dato y espacios en blanco
			//while(true) {
			//leer datos
			//if(meGusta<menosMeGusta) {
			//	menosMegusta=meGusta;
			//guardar datos del video que menos me gusta con las variables declaradas
			//}
			//
		//}
			
			
		}catch (IOException e) { }
		//catch que muestra los datos del de menos me gusta con un if que si es -1 no hay dato
		finally {
			if(leer!=null) {
				try {
					leer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
}
