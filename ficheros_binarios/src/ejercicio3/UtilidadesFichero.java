package ejercicio3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UtilidadesFichero {

	public static int[] calcularMedia(String nombre) throws IOException{
		int media = 0, suma = 0, cantidadNotas = 0, nota;
		int[] resultado = new int[2];
		
		//Leer datos y calcular media
		try (DataInputStream leer = new DataInputStream(new BufferedInputStream(
				new FileInputStream(nombre)));){
			
			while (true) {
				nota = leer.readInt();
				suma += nota;
				cantidadNotas++;
			}
			
		} catch (EOFException e) {
			if (cantidadNotas > 0)
				media = suma / cantidadNotas;
			resultado[0] = suma;
			resultado[1] = media;
		}
		
		return resultado;
		
	}

	public static void filtrarPorMedia(int media, String origen, String destino) throws IOException{
		
		int nota;
		//Leer datos y filtrar
		try (DataInputStream leer = new DataInputStream(new BufferedInputStream(
				new FileInputStream(origen)));
			DataOutputStream escribir = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream(destino)));) {
					
			while(true) {
				nota = leer.readInt();
				if (nota > media)
				escribir.writeInt(nota);
				
				
			}
		}
			catch (EOFException e) {
				System.out.println("Fin datos");
			}
			
		}
	
	public static int[] buscarAnteriorSiguiente(int numero, String nombre) throws IOException {
		int anterior=-1,siguiente=-1,nota;
		int[] resultado=new int[2];
		
		resultado[0]=-1;
		resultado[1]=-1;
		
		try(DataInputStream leer = new DataInputStream(new BufferedInputStream(
				new FileInputStream(nombre)));){
			while(true) {
				nota=leer.readInt();
				if(nota==numero) {
					resultado[0]=anterior;
					resultado[1]=leer.readInt();
				}
				anterior=nota;
			}
			
		}
		catch (EOFException e) {
			System.out.println("Fin datos");
		}
		return resultado;
	}
	
	
	}
