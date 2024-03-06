package array_string;

public class Arrays {
	/*dado un array de String devolver el string con el mayor numero de caracteres
	devolver un booleano si los elementos del array están ordenados alfabéticamente 
	dado un array de String devolver cuantos palindromos hay 
	dado un array de string que devuelva otro array de string pero al revés
	dado un array de string que devuelva de manera aleatoria un elemento del array
	opcional uno inventado*/
	
	//devolver un booleano si los elementos del array están ordenados alfabéticamente 
	public static boolean ordenadosAlfabeticamente(String[] array) {
		boolean ordenados=true;
		for(int i=0;i<array.length-1;i++) {
			if (array[i].compareToIgnoreCase(array[i+1])>0) {
				ordenados=false;
			}
		}
		return ordenados;
	}
	
	//dado un array de String devolver el string con el mayor numero de caracteres
	public static String stringMayor(String[] array) {
		String stringMayor=new String("");
		if(array!=null) {
			//To-DO:Elegir un valor no nulo
			int indiceArrayMayor=0;
			//recorrer array e inicializar mayor con distinto de null
			for(int i=1; i<array.length;i++) {
				if ((array[indiceArrayMayor]!=null&&array[i]!=null)&&array[i].length()>array[indiceArrayMayor].length()) {
					indiceArrayMayor=i;
				}
			}
			stringMayor=array[indiceArrayMayor];	
		}else {
			stringMayor=null;	
		}
		return stringMayor;
	}
	
	private static boolean palindromo(String texto) {
		String newText=new String("");
		int length= texto.length();
		for(int i=length-1;i>=0;i--) {
        	newText+=texto.charAt(i);
        }	
		return texto.equalsIgnoreCase(newText);
	}
	
	//dado un array de String devolver cuantos palindromos hay 
	private static int contarPalindromos(String[] array) {
		int contador=0;
		
		for(int i=0;i<array.length;i++) {
			if(Arrays.palindromo(array[i])) {
				contador++;
			}
		}
		return contador;
	}
	
	//dado un array de string que devuelva otro array de string pero al revés
	private static String[] alReves(String[] array) {
		String[] alReves;
		alReves=new String[array.length];
		for(int i=array.length-1;i>=0;i--) {
			alReves[array.length-1-i]=array[i];
		}
		return alReves;
	}
	
	//dado un array de string que devuelva de manera aleatoria un elemento del array
	private static String elegirAleatorio(String[] array) {
		int aleatorio;
		
		//entre 0 y 5
		aleatorio=(int)(Math.random()*array.length);
		
		return array[aleatorio];
	}

	private int contarCaracteresTotales(String[] texto) {
		int suma=0;
		
		/*for (String elemento:textos) {
			suma+=elemento.length();
		}*/
		
		for (int i=0; i<texto.length;i++) {
			suma+=texto[i].length();
		}
		return suma;
	}
	
	//Metodo que devuelva cuantas a minusculas hay en todo el array
	
	private static int contar(String texto, char caracter) {
		int contador=0;
		for(int i=0; i<texto.length();i++) {
			if (texto.charAt(i)==caracter) {
				contador++;
			}
		}
		return contador;
	}
	
	public static int contadorA(String[] texto, char caracter) {
		int contadorA=0;
		
		for (int i=0; i<texto.length;i++) {
			contadorA+=Arrays.contar(texto[i], caracter);
		}
		
		return contadorA;
	}
}
