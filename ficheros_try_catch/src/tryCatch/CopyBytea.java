package tryCatch;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytea {

	public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c,contador=0,contadorPorLineas=1,cc=0;
            char ch;
            

            while ((c = in.read()) != -1) {
                out.write(c);
                ch=(char)c;                
                if(ch=='a') { 
                	contador++;
                }
             
                if(ch=='a') {
                	cc++;
                } else if(c==10){
                	System.out.println("La línea "+contadorPorLineas+ " tiene "+cc+" a");
                	contadorPorLineas++;
                	cc=0;
                }
                ;
            }
            System.out.println("La línea "+contadorPorLineas+ " tiene "+cc+" a");
            System.out.println("totales" + contador);
        }
        catch (IOException e) {
        	
        	System.err.println ("Error en copia");
        	e.printStackTrace();
        }
        finally {
        	
            if (in != null) {
            	
                try {
					in.close();
				}
                catch (IOException e) {
					e.printStackTrace();
				}
            }
            if (out != null) {
            	
                try {
					out.close();
				}
                catch (IOException e) {
					e.printStackTrace();
				}
            }
        }
    }
}
