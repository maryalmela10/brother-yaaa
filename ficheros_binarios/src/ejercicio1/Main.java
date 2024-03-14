package ejercicio1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		DataOutputStream out = null;
		
        //.dat o .bin .mary
        try {
        	int numero;
            out = new DataOutputStream(new
                    BufferedOutputStream(new FileOutputStream("probando1.mar")));

            for (int i = 0; i < 5; i ++) {
            	System.out.println("Escribe un número ");
            	numero=teclado.nextInt();
                out.writeInt(numero);
            }
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            out.close();
        }

        DataInputStream in = null;
        
        try {
            in = new DataInputStream(new
                    BufferedInputStream(new FileInputStream("probando1.mar")));
            int num;
            
            try {
                while (true) {
                    num = in.readInt();
                    System.out.println(num);
                }
            } catch (EOFException e) { }
            System.out.println("Se acabo");
        }
        finally {
            in.close();
        }
		
	}

}
