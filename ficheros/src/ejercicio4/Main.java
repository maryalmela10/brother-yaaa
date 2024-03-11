package ejercicio4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader leer = null;
		String linea = null;
		int suma=0, contador=0, numero=0, media=0;
		PrintWriter escribir=null;
		
		
		try {
			leer = new BufferedReader(new FileReader("notas.txt"));
			escribir = new PrintWriter(new FileWriter("medias.txt"));
			linea = leer.readLine();
			while(linea!=null) {
				for(int i=0; i<3; i++) {
					if(linea!=null) {
						numero=Integer.parseInt(linea);
						suma+=numero;
						contador++;
					}
					linea = leer.readLine();
				}
				media=suma/contador;
				escribir.println(media);
				suma=0;
				contador=0;
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if(leer!=null) {
				try {
					leer.close();
				} catch (IOException e) {
					//para depurar
					e.printStackTrace();
				} 	
			}
			
			if(escribir!=null) {
				escribir.close(); 	
			}
	
		}
		
	}
	
}
