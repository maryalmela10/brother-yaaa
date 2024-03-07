package array_string;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] textos= {"John", "Mike", "James", "John", "Jordanaaaaa"};
		String[] textos2= {"Carro", "Burro", "Americano", "Dedo", "Elefante"};
		
		System.out.println("La palabra más larga en el array es: "+Arrays.stringMayor(textos));
		System.out.println("Están ordenados alfabeticamente? "+Arrays.ordenadosAlfabeticamente(textos2));
	}

}
