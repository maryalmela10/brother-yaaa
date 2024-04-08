package agenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AgendaDao implements ContactoDao{
	private File fichero;
	private final int tamano_correo = 50;
	private final int tamano_registros=108;

	public AgendaDao() {
		this.fichero = new File ("agenda.dat");
	}

	@Override
	public Contacto buscarContacto(int id) {
		try(RandomAccessFile file = new RandomAccessFile(this.fichero, "r")){
			boolean fin = true;
			int indice = 0;
			int ind =0;
			file.seek(ind);
			int telefono = 0;
			char caracter;
			String correo="";
			while(!fin) {
				indice=file.readInt();
				if(indice==id) {
					telefono=file.readInt();
					caracter=file.readChar();
					while(caracter!='#') {
						correo+=caracter;
						caracter=file.readChar();
					}
				} 
				file.seek(ind+104);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void guardarContacto(Contacto contacto) {
		String correoFinal=contacto.getCorreo();
		try(RandomAccessFile file = new RandomAccessFile(this.fichero, "rw")) {
			file.writeInt(contacto.getId());
			file.writeInt(contacto.getTelefono());
			for(int i=0;i<tamano_correo;i++) {
				correoFinal+="#";
			}
			file.writeChars(correoFinal);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void borrarContacto(Contacto contacto) {
		
		
	}

	@Override
	public void modificarContacto() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
