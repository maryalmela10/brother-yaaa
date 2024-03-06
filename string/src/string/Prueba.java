package string;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto;
		String palabra;
		int numeroCaracteres, posicion,resultado;
		char letra;
		
		texto=new String("kola");
		palabra="hola";
		numeroCaracteres=palabra.length();
		//Devuelve el caracter que esta en esa posicion
		letra=palabra.charAt(palabra.length()-1);
		//devuelve 
		posicion=palabra.indexOf("ola");
		posicion=palabra.indexOf('a',2);
		//Devuelve 0, equals devuelve boolean
		resultado=texto.compareTo(palabra);
		System.out.println(resultado);
		if (resultado==0) {
			System.out.println("Mismo contenido");
		}
		
		palabra=palabra.substring(1,3);
		System.out.println(palabra);
		
		
	}

}
