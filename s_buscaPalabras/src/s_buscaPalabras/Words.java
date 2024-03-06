package s_buscaPalabras;

public class Words {

	public static int wordsCount(String text) {
		int nWords=0;
		
		for (int i=0; i<text.length(); i++) {
			char character=text.charAt(i);
			
			if (character==' ') {
				nWords++;
			}
			
		}
		if(!text.isEmpty()) {
			nWords++;	
		}
		return nWords;
		
	}
	
	public static boolean wordFound(String word, String text) {
		boolean found=false;
		//Comprueba si está dentro de una cadena
		text.contains(word);
		String generatedWord="";
		
		text+=" ";
		for(int i=0;i<text.length();i++)
			if (Character.isLetter(text.charAt(i))) {
			generatedWord+=text.charAt(i);
			} else {
				if (generatedWord.equals(word)) {
					return true;
				}
				generatedWord="";
				
			}
		return found;
	}
}
