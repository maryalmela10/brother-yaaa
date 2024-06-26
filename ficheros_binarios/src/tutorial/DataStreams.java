package tutorial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreams {

	static final String dataFile = "invoicedata";

    static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
    static final int[] units = { 12, 8, 13, 29, 50 };
    static final String[] descs = { "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain" };
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//escribir
		DataOutputStream out = null;
        //.dat o .bin .mary
        try {
        	System.out.println("Escribe un número ");
        	
            out = new DataOutputStream(new
                    BufferedOutputStream(new FileOutputStream(dataFile)));

            for (int i = 0; i < prices.length; i ++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
        } finally {
            out.close();
        }
        //escribir sin sobreescribir
        try (DataOutputStream outy = new DataOutputStream(new
                BufferedOutputStream(new FileOutputStream(dataFile, true)));) {
            for (int i = 0; i < prices.length; i ++) {
                outy.writeDouble(9999.999);
                outy.writeInt(999);
                outy.writeUTF("probando");
            }
        } 
        //leer
        DataInputStream in = null;
        double total = 0.0;
        try {
            in = new DataInputStream(new
                    BufferedInputStream(new FileInputStream(dataFile)));

            double price;
            int unit;
            String desc;

            try {
                while (true) {
                    price = in.readDouble();
                    unit = in.readInt();
                    desc = in.readUTF();
                    System.out.println("Tu producto cuesta "+price+"€, hay "+unit+" unidades");
                    total += unit * price;
                }
            } catch (EOFException e) { }
           System.out.println("Total "+total);
        }
        finally {
            in.close();
        }
		
        
	}

}
