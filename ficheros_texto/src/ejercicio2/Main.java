package ejercicio2;

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
		Scanner teclado=new Scanner(System.in);
		PrintWriter escribir = null;
		BufferedReader leer = null;
		BufferedReader lecturaFicheroNotas = null;
		String linea;
		double media, suma=0;
		int cantidadNotas=0;
		
		try {
			lecturaFicheroNotas = new BufferedReader(new FileReader("notas.txt"));
			linea=lecturaFicheroNotas.readLine();
			while(linea!=null) {
				cantidadNotas++;
				suma+=Integer.parseInt(linea);
				linea=lecturaFicheroNotas.readLine();
			}
			if (cantidadNotas==0) {
				System.out.println("No hay datos");
			} else {
				media=suma/cantidadNotas;
				//Filtrar y escribir en el fichero
				escribir = new PrintWriter(new FileWriter("mayores.txt"));
				System.out.println("X");
				leer = new BufferedReader(new FileReader("notas.txt"));
				linea=leer.readLine();
				while(linea!=null) {
					if(Double.parseDouble(linea)>media) {
						escribir.println(linea);
					}
					linea=leer.readLine();
				}
				
				//Mostrar dato
			}
			
		}
		
		catch (FileNotFoundException e) {
			//para depurar
			e.printStackTrace();
		}
		catch (IOException e) {
			//para depurar
			e.printStackTrace();
		} 
		
		finally {
			
			if(escribir!=null) {
				escribir.close();
			}
			
			if(leer!=null) {
				try {
					leer.close();
				} catch (IOException e) {
					//para depurar
					e.printStackTrace();
				} 	
			}
			
			if(lecturaFicheroNotas!=null) {
				try {
					lecturaFicheroNotas.close();
				} catch (IOException e) {
					//para depurar
					e.printStackTrace();
				} 	
			}
			
		}
	}

}
