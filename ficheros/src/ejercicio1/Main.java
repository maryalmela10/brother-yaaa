package ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		PrintWriter ficheroNotas = null;
		BufferedReader lecturaFicheroNotas = null;
		String valorTeclado;
		double media, suma=0;

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
			
		}
		
		catch (FileNotFoundException e) {
			//para depurar
			e.printStackTrace();
		}
		
		finally {
			ficheroNotas.close();
		}
		
	} 

}
