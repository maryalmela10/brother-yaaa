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
			if (!f.exists()) {
				fos = new FileOutputStream(f);
				oss = new ObjectOutputStream(fos);
			} else {
				fos = new FileOutputStream(f);
				oss = new ObjectOutputStream(fos);
			}

			for (int i = 0; i < 5; i++) {
				Contacto p = new Contacto(5, "Mariconi", "bueno", 56564, "holis");
				oss.writeObject(p);
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
