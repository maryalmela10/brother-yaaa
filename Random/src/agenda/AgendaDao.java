package agenda;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class AgendaDao implements ContactoDao{
	private File fichero;
	private final int TAMANO_CORREO = 50;
	//en total 50 carácteres para el correo y en total 100bytes
	//Char: 2 bytes
	//String: 2 bytes por cada caracter.
	//en este caso, cada registro seria 35 bytes (4 (int) + (10 * 2) (string) + 8 (double) + 1 (boolean) + 2 (char)).
//Es importante ver como añado los String, uso la clase StringBuffer y lo limito al tamaño que yo desee, 
	//en este caso a 10 caracteres, si tiene menos caracteres, lo rellenará con espacios y si tiene más lo cortará. 
	//Como he comentado, es importante saber cuánto ocupa cada String para después leer, por eso todos deben tener un tamaño fijo.
	private final int TAMANO_REGISTRO=108;
	Scanner teclado=new Scanner(System.in);

	public AgendaDao() {
		this.fichero = new File ("agenda.dat");
	}

	@Override
	public Contacto buscarContacto(int id) {
		try(RandomAccessFile file = new RandomAccessFile(this.fichero, "r")){
			int indice = 0;
			int ind =0;
			int telefono = 0;
			char caracter;
			String correo="";
		//	int tamaño=Integer.BYTES; para saber cuantos bytes ocupa
			while(file.getFilePointer()!=file.length()) {
				indice=file.readInt();
				if(indice==id) {
					telefono=file.readInt();
					caracter=file.readChar();
					while(caracter!='#') {
						correo+=caracter;
						caracter=file.readChar();
					}
					return new Contacto(indice,telefono,correo);
				} 
				ind+=TAMANO_REGISTRO;
				file.seek(ind);
				System.out.println(file.getFilePointer());
			}
			
			return null;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
	
	public int buscarContactoPointer(int id) {
		try(RandomAccessFile file = new RandomAccessFile(this.fichero, "r")){
			int indice = 0;
			int ind =0;
			while(file.getFilePointer()!=file.length()) {
				indice=file.readInt();
				if(indice==id) {
					return (int) (file.getFilePointer()-4);
				} 
				ind+=TAMANO_REGISTRO;
				file.seek(ind);
			}
			
			return -1;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return -1;
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			return -1;
		}
	}
	

	@Override
	public void guardarContacto(Contacto contacto) {
		String correoFinal=contacto.getCorreo();
		try(RandomAccessFile file = new RandomAccessFile(this.fichero, "rw")) {
			file.seek(file.length());
			file.writeInt(contacto.getId());
			file.writeInt(contacto.getTelefono());
			for(int i=correoFinal.length();i<TAMANO_CORREO;i++) {
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
	
	public String rellenar(String palabra) {
		String palabraFinal=palabra;
		for(int i=palabra.length();i<TAMANO_CORREO;i++) {
			palabraFinal+="#";
		}
		return palabraFinal;
	}

	@Override
	public void modificarContacto(Contacto contacto) {
		int respuesta;
		String nuevoCorreo;
		int indice=this.buscarContactoPointer(contacto.getId());
		System.out.println("Dato modificar: 1.Telefono o 2.Correo");
		respuesta=Integer.parseInt(teclado.nextLine());
		if(indice!=-1) {
		if(respuesta==1) {
			System.out.println("Ingresa el telefono");
			respuesta=Integer.parseInt(teclado.nextLine()); 
			try(RandomAccessFile file = new RandomAccessFile(this.fichero, "rw")) {
				file.seek(indice);
				file.writeInt(contacto.getId());
				file.writeInt(respuesta);
				file.writeChars(this.rellenar(contacto.getCorreo()));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if(respuesta==2) {
			System.out.println("Ingresa el Correo");
			nuevoCorreo=teclado.nextLine();
			try(RandomAccessFile file = new RandomAccessFile(this.fichero, "rw")) {
				file.seek(indice);
				file.writeInt(contacto.getId());
				file.writeInt(contacto.getTelefono());
				file.writeChars(this.rellenar(nuevoCorreo));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 }
		}	
}
	
	
	
	

