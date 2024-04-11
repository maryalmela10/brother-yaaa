package tikitok;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		String usuarioABuscar, nombreUsuario=null;
		DataInputStream leer=null;
		DataOutputStream escribir=null;
		ArrayList<Video> videos = new ArrayList<Video>();
		ArrayList<String> videosString = new ArrayList<String>();
		String nombreVideo;
		double longitud;
		int comentarios, likes;
		
		
		//crear videos
		for(int i=0; i<3; i++) {
			System.out.println("Nombre de video");
			nombreVideo=teclado.nextLine();
			System.out.println("longitud");
			longitud=Double.parseDouble(teclado.nextLine()); 
			System.out.println("Nombre de usuario");
			nombreUsuario=teclado.nextLine();
			videos.add(new Video(nombreVideo, longitud, nombreUsuario));
		}
		
		for(int i=0; i<videos.size();i++) {
			videosString.add(videos.get(i).toString());
		}
		
		try {
			escribir=new DataOutputStream(new
			        BufferedOutputStream(new FileOutputStream("tiktok.dat")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		for(int i=0; i<videosString.size();i++) {
			String [] fields = videosString.get(i).split(",");
			nombreVideo=fields[0];
			comentarios=Integer.parseInt(fields[1]);
			likes=Integer.parseInt(fields[2]);
			longitud=Double.parseDouble(fields[3]);
			nombreUsuario=fields[4];
			
			try {
				escribir.writeUTF(nombreVideo);
				escribir.writeInt(comentarios);
				escribir.writeInt(likes);
				escribir.writeDouble(longitud);
				escribir.writeUTF(nombreUsuario);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} }
		finally {
			if (escribir!=null) {
				try {
					escribir.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		try {
			leer=new DataInputStream(new
			        BufferedInputStream(new FileInputStream("tiktok.dat")));
			
			while(true) {
				System.out.println(leer.readUTF());
				System.out.println(leer.readInt());
				System.out.println(leer.readInt());
				System.out.println(leer.readDouble());
				System.out.println(leer.readUTF());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Fin de datos");
		}
		
		/*
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
		
		
		*/
	}
}
