package ejercicio3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] valores;
		
		try {
			valores = UtilidadesFichero.calcularMedia("probando1.mar");
			//Mostrarlo por pantalla
			System.out.println("Suma: " + valores[0]);
			System.out.println("Media: " + valores[1]);
			UtilidadesFichero.filtrarPorMedia(valores[1], "probando1.mar", "mayoresMedia.dat");
			valores=UtilidadesFichero.buscarAnteriorSiguiente(99, "probando1.mar");
			if(valores[0]==-1 && valores[1]==-1) {
				System.out.println("No esta");
			} else {
				if(valores[0]==-1) {
					System.out.println("No hay anterior");
				} else {
					System.out.println("Anterior: "+valores[0]);
				}
					if(valores[1]==-1) {
						System.out.println("No hay siguiente");
					} else {
						System.out.println("Siguiente: "+valores[1]);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Problema de lectura de fichero");
			e.printStackTrace();
		}
		
	}

}
