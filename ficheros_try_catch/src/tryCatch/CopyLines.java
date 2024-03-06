package tryCatch;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.io.IOException;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        ArrayList<String> listaDeLineas=new ArrayList<String>();
        PriorityQueue<String> cola = new PriorityQueue<String>();

        
        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                //listaDeLineas.add(l);
            	cola.add(l);
            }
            //Collections.sort(listaDeLineas);
            while (!cola.isEmpty()) {
                System.out.println(cola.poll());
            }
            
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}