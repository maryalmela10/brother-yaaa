package ejercicio5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter escribir=null;
		Scanner teclado=new Scanner(System.in);
		String linea=null, Pgrande=null;
		int opcion=0;
		
		
		try {
			escribir = new PrintWriter(new FileWriter("guardaPalabras.txt"));
			for(int i=0; i<5;i++) {
				System.out.println("Ingresa una palabra");
				linea=teclado.nextLine();
				if(i==0) {
					Pgrande=linea;
				} else {
					if(linea.length()>Pgrande.length()){
						Pgrande=linea;
					}else if(linea.length()==Pgrande.length()) {
						System.out.println("Elige la palabra "+ "1."+linea+" 2."+Pgrande);
						opcion=Integer.parseInt(teclado.nextLine());
						if(opcion==1) {
							Pgrande=linea;
						}
					}
				}
				escribir.println(linea);
			}
			System.out.println("Palabra más larga "+Pgrande);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if(escribir!=null) {
				escribir.close(); 	
			}
		}
	}

}
