package ejercicio6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader leer=null;
		PrintWriter escribir=null;
		String linea, regex,regex2, etiquetaImagen, nombreEtiqueta;
		
		try {
			leer=new BufferedReader(new FileReader("index.html"));
			escribir=new PrintWriter(new FileWriter("imagenes.txt"));
			linea=leer.readLine();
			while(linea!=null) {
				
				regex="img\\s+src\\s*=\\s*\\\".*\\\"";
				regex2="\\\".+\\.png\\\"";
				Pattern pattern = Pattern.compile(regex);
			    Matcher matcher = pattern.matcher(linea);
			    while (matcher.find()) {
			        int start=matcher.start();
			        int end=matcher.end();
			        etiquetaImagen=linea.substring(start, end);
			        Pattern pattern2 = Pattern.compile(regex2);
			        Matcher matcher2 = pattern2.matcher(etiquetaImagen);
				    while (matcher2.find()) {
				    	int start2=matcher2.start();
				    	int end2=matcher2.end();
				        nombreEtiqueta=etiquetaImagen.substring(start2+1, end2-1);
				        escribir.println(nombreEtiqueta);
				    }
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
