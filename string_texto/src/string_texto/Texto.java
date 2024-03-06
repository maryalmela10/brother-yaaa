package string_texto;

public class Texto {
	
	private static String letters="abcdefghijklmnñopqrstuvwxyz";
	String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Texto(String texto) {
		//String newText= new String("");
		this.texto = "";
		int length=texto.length();
		int found;
		for (int i=0; i<length; i++) {
			found=letters.indexOf(texto.charAt(i));
			if (found>=0) {
				this.texto+=texto.charAt(i);
			}
		}
		//this.setTexto(newText);
	}
	
	public boolean palindromo() {
		String newText=new String("");
		int length= this.texto.length();
		for(int i=length-1;i>=0;i--) {
        	newText+=this.texto.charAt(i);
        }	
		return this.texto.equalsIgnoreCase(newText);
	}
	
}
