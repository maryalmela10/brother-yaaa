package agenda;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//para leer fichero de agenda
		
		//escrbir objetos
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
		//for (int i = 0; i <5; i++)
		//{
		    // ojo, se hace un new por cada Persona. El new dentro del bucle.
		    //Persona p = new Persona(i);
		  //  oos.writeObject(p);
		//}
		//oos.close();  // Se cierra al terminar.
		
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("agendaBinario.mar"));){
			Object aux;
			// bucle infinito
			while (true)
			{
				// Se lee el primer objeto
				aux = ois.readObject();
			    if (aux instanceof Contacto) {
			    	Contacto contacto = (Contacto) aux;
			    	System.out.println(contacto);  // Se escribe en pantalla el objeto
			    } else {
			    	System.out.println("No es contacto");
			    }
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			//sale siempre por esta excepción
			System.out.println("Final del fcihero");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
