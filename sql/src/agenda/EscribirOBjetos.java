package agenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirOBjetos {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oss = null;
		File f = new File("agendaBinario.mar");

		try {
			//si no existe crea el lector de objetos normal
			if (!f.exists()) {
				fos = new FileOutputStream(f);
				oss = new ObjectOutputStream(fos);
			} else {
				//si ya existe utiliza el lector creado por nosotros
				//de esta forma no vuelve a escribir la cabecera y no dará el error
				fos = new FileOutputStream(f, true); //el true es para que escriba después de lo que ya está escrito NO SOBREESCRIBE
				oss = new MiObjectOutputStream(fos);
			}

			for (int i = 0; i < 5; i++) {
				Contacto p = new Contacto(5, "Mariconi", "bueno", 56564, "holis");
				oss.writeObject(p); //aquí escribe el objeto
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(oss!=null) {
				try {
					oss.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
