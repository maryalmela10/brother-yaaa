package dw1a_2023_3eva_almelaMary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pais> paises;
		Utilidades.metodo1();
		paises=Utilidades.metodo2();
		for(Pais p: paises) {
			System.out.println(p);
		}
		Utilidades.metodo3(paises);
	}

}
