package nacho;

public class Cesar {

	static String letters="abcdefghijklmnñopqrstuvwxyz";
	private int distance;
	
	
	
	public Cesar(int distance) {
		this.distance = distance;
	}

	public static String code(String text) {
		String encodeText= "";
		int encodeCharacter;
		char letter;
		for(int i=0;i<text.length();i++) {
			letter=text.charAt(i);
			if (letter=='x') {
				encodeCharacter='a';
			} else {
				if (letter=='y') {
					encodeCharacter='b';
				} else if (letter=='z') {
					encodeCharacter='c';
				} else {
					encodeCharacter=text.charAt(i)+3;
				}
			}
			
			encodeText=encodeText+(char)encodeCharacter;
		}
		return encodeText; 
	}
	
	   public String code2(String text) {
		   text=text.toLowerCase();
	        String encodeText="";
	        int position;
	        char letter,encodeLetter;
	        
	        for(int i=0;i<text.length();i++) {
	            letter=text.charAt(i);               
	            position=letters.indexOf(letter);
	            if (position>=0) {
	            	position=position+this.distance;
		            encodeLetter=letters.charAt(position%27);	
	            } else {
	            	 encodeLetter=letter;
	            }
 	            encodeText+=encodeLetter;
	        }
	        return encodeText;
	    }
	   
	//posicion%27
	/* 
	 public static String cifrar(String text) {
	 int position;
	char letter,encodeLetter;
	for(int i=0;i<text.length();i++) {
		letter=text.charAt(i);
		position=
			}
	
	}
	 */
}
