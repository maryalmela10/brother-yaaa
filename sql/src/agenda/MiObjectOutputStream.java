package agenda;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOutputStream extends ObjectOutputStream {
	//el lector modificado para escibir cuando ya hay objetos escritos en el fichero
	public MiObjectOutputStream(OutputStream out) throws IOException{
		super(out);
	}
	
	protected void writeStreamHeader() throws IOException{
		
	}
}
