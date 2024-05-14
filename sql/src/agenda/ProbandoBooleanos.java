package agenda;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ProbandoBooleanos {
	public static void main(String[] args) {
		boolean probando = false;
		boolean probando2 = true;
		try(RandomAccessFile file = new RandomAccessFile("probandoBooleanByte", "rw")){
			file.writeBoolean(probando);
			file.writeBoolean(probando2);
			file.seek(file.getFilePointer()-1);
			System.out.println(file.readBoolean());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
