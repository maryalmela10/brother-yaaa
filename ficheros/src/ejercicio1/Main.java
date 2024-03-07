package ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		PrintWriter ficheroNotas = null;
		PrintWriter escribir = null;
		BufferedReader leer = null;
		BufferedReader lecturaFicheroNotas = null;
		String valorTeclado, linea;
		double media, suma=0;
		int cantidadNotas=0;
		
		try {
		ficheroNotas = new PrintWriter(new FileWriter("notas.txt"));
		System.out.println("Escribe un número ");
		valorTeclado=teclado.nextLine();
		while(Integer.parseInt(valorTeclado)>0) {
			ficheroNotas.println(valorTeclado);
			System.out.println("Escribe un número ");
			valorTeclado=teclado.nextLine();
		}
		}
		
		catch (IOException e) {
			//para depurar
			e.printStackTrace();
		} 
		
		try {
			lecturaFicheroNotas = new BufferedReader(new FileReader("notas.txt"));
			linea=lecturaFicheroNotas.readLine();
			while(linea!=null) {
				cantidadNotas++;
				suma+=Integer.parseInt(linea);
			}
			if (cantidadNotas==0) {
				System.out.println("No hay datos");
			} else {
				media=suma/cantidadNotas;
				//Filtrar y escribir en el fichero
				escribir = new PrintWriter(new FileWriter("mayores.txt"));
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
			if(ficheroNotas!=null) {
				ficheroNotas.close();
			}
			
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
