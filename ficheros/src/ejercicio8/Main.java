package ejercicio8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader leer=null;
		PrintWriter escribir=null;
		String linea, lineaModificada;
		int posicion;
		
		try {
			leer=new BufferedReader(new FileReader("Test.java"));
			escribir=new PrintWriter(new FileWriter("copia.java"));
			linea=leer.readLine();
			while(linea!=null) {
				//procesar linea
				posicion=linea.indexOf(" double ");
				if(posicion==-1) {
					escribir.println(linea);
				} else {
					lineaModificada=linea.substring(0, posicion)+" float "+linea.substring(posicion+" double ".length());
					escribir.println(lineaModificada);
				}
				linea=leer.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(escribir!=null) {
				escribir.close();
			}
			
			if(leer!=null) {
				leer.close();
			}
			
		}
		
	}

}
