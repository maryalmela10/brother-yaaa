package s_ahorcado;

import java.util.Scanner;

public class Ahorcado {
	private String palabraSecreta;
	private int intento;
	
	
	
	public Ahorcado(String palabraSecreta, int intento) {
		this.palabraSecreta = palabraSecreta;
		this.intento = intento;
	}



	public void jugar() {
		Scanner teclado=new Scanner(System.in);
		String palabraMostrar="";
		String palabraFinal="";
		String letra;
		int contadorIntentos=0;
		int inicioCadena=0;
		
		palabraMostrar=generarPalabraMostrarInicial(this.palabraSecreta.length());
		System.out.println(palabraMostrar);
		while (contadorIntentos<this.intento 
				&& !(palabraFinal.equals(this.palabraSecreta))) {
			System.out.println("Letra");
			letra=teclado.nextLine();
			//validar letra(en casa)
			if(this.palabraSecreta.indexOf(letra)==-1) {
				contadorIntentos++;
			} else {
				//int inicioCadena=0;
				for (int i=0; i<this.palabraSecreta.length(); i++) {
					char caracter = this.palabraSecreta.charAt(i);
					if (caracter==letra.charAt(0)){
						palabraFinal=palabraMostrar.substring(0, i)+letra.charAt(0);
						palabraFinal+=palabraMostrar.substring(i+1, palabraMostrar.length());
					}  
					palabraMostrar="";
					palabraMostrar=palabraFinal;
				}
				palabraMostrar=palabraFinal;
				System.out.println(palabraFinal);
				contadorIntentos++;
			}
			
		} 
		teclado.close();
		if(palabraFinal.equals(this.palabraSecreta)){
			System.out.println("Ganaste");
		} else {
			System.out.println("Agotaste los intentos");
		}
	}
	
	
	private String generarPalabraMostrarInicial(int cantidad) {
		String palabra="";
		for(int i=0;i<cantidad;i++) {
			palabra+='*';
		}
		return palabra;
	}
}
