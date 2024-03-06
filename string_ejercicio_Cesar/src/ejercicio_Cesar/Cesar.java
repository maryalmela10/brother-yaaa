package ejercicio_Cesar;

public class Cesar {
	
	
	static String traducir(String palabra) {
		int indexOfNewCharacter;
		String newText=new String();
		String abc= new String("abcdefghijklmnopqrstuvwxyz");
		int lengthAbc=abc.length();
		int length=palabra.length();
		for (int i=0;i<length;i++) {
			char comparativeCharacter=palabra.charAt(i);
			int indexOfCharacter = abc.indexOf(comparativeCharacter);
			if (indexOfCharacter>=(lengthAbc-3) && indexOfCharacter<=(lengthAbc-1)) {
				if (indexOfCharacter==lengthAbc-1) {
					indexOfNewCharacter=2;
				} else if (indexOfCharacter==lengthAbc-2) {
					indexOfNewCharacter=1;
				} else {
					indexOfNewCharacter=0;
				}
			} else {
				indexOfNewCharacter = indexOfCharacter+3;
			}
			newText+=abc.charAt(indexOfNewCharacter);
		}
		
		return newText; 
	}
	
	static String reverse(String palabra) {
		int indexOfNewCharacter;
		String newText=new String();
		String abc= new String("abcdefghijklmnopqrstuvwxyz");
		int lengthAbc=abc.length();
		int length=palabra.length();
		for (int i=0;i<length;i++) {
			char comparativeCharacter=palabra.charAt(i);
			int indexOfCharacter = abc.indexOf(comparativeCharacter);
			if (indexOfCharacter>=0 && indexOfCharacter<=2) {
				if (indexOfCharacter==2) {
					indexOfNewCharacter=lengthAbc-1;
				} else if (indexOfCharacter==1) {
					indexOfNewCharacter=lengthAbc-2;
				} else {
					indexOfNewCharacter=lengthAbc-3;
				}
			} else {
				indexOfNewCharacter = indexOfCharacter-3;
			}
			newText+=abc.charAt(indexOfNewCharacter);
		}
		
		return newText; 
	}
}	
