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
		String valorTeclado;

		//ejercicio 1
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
		
		
		finally {
			if(ficheroNotas!=null) {
				ficheroNotas.close();
			}
			
		}
		
	} 

}
