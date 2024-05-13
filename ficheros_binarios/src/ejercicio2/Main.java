package ejercicio2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		DataInputStream in = null;
		DataInputStream in2 = null;
		DataInputStream in3 = null;
        int num,cantidadnum=0, suma=0,media=0;
        try {
            in = new DataInputStream(new
                    BufferedInputStream(new FileInputStream("probando1.mar")));
            
            try {
                while (true) {
                    num = in.readInt();
                    cantidadnum++;
                    suma+=num;
                }
               // media=suma/cantidadnum;
            } catch (EOFException e) { } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        finally {
            try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        //hola
        DataOutputStream out = null;
        try {
        	
        	media=suma/cantidadnum;
        	out = new DataOutputStream(new
                    BufferedOutputStream(new FileOutputStream("numeroMayor.mar")));
        	
            in2 = new DataInputStream(new
                    BufferedInputStream(new FileInputStream("probando1.mar")));
            
            try {
            	if(cantidadnum==0) {
            		System.out.println("No hay numeros");
            	} else {
            		while (true) {
                        num = in2.readInt();
                        if(num>media) {
                        	out.writeInt(num);
                        }
                    }
            	}
            	
            } catch (EOFException e) { } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("Suma: "+suma);
            System.out.println("Media: "+media);
        } catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        finally {
            try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
      
        try {
        	in3 = new DataInputStream(new
                    BufferedInputStream(new FileInputStream("numeroMayor.mar")));
        	 
        	
        	
        	
        	while (true) {
        		
                num = in3.readInt();
                System.out.println(num);
           
        }
        	} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EOFException e) {
				System.out.println("HOLAA");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        finally {
            try {
				in3.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}
}
