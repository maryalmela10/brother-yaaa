package ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader leer = null;
		BufferedReader leer2 = null;
		Scanner teclado=new Scanner(System.in);
		int numero, elemento0=0, elemento1=0, elemento2=0;
		String linea0 = null, linea1 = null, linea2 = null;
		PrintWriter escribir=null;
		
		try {
			System.out.println("Escribe un número");
			numero = Integer.parseInt(teclado.nextLine());
			leer = new BufferedReader(new FileReader("notas.txt"));
			leer2 = new BufferedReader(new FileReader("notas.txt"));
			linea1 = leer.readLine();
			while (linea1 != null) {
					if(Integer.parseInt(linea1)==numero) {
						elemento1=Integer.parseInt(linea1);
						linea2=leer.readLine();
						if(linea0==null && linea2!=null) {
							elemento2=Integer.parseInt(linea2);
							System.out.println("Valor siguente: "+elemento2);
						} else if (linea0!=null && linea2==null) {
							elemento0=Integer.parseInt(linea0);
							System.out.println("Valor anterior: "+elemento0);
						} else {
							elemento2=Integer.parseInt(linea2);
							elemento0=Integer.parseInt(linea0);
							System.out.println("Valor anterior: "+elemento0);
							System.out.println("Valor siguente: "+elemento2);
						}
						break;
					} else {
						linea1 = leer.readLine();
						linea0=leer2.readLine();
					}
	            }
			
			if (elemento0==0 && elemento1==0 && elemento2==0) {
				System.out.println("Numero no encontrado");
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
			
			if(leer2!=null) {
				try {
					leer.close();
				} catch (IOException e) {
					//para depurar
					e.printStackTrace();
				} 	
			}
		}
		
	}

}
