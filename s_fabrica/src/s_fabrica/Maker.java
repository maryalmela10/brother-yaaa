package s_fabrica;

public class Maker {
	private static String letters="abcdefghijklmnñopqrstuvwxyz";
	private String name;
	private String telephone;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Maker(String name, String telephone, String email) {
		this.name = name;
		this.telephone = telephone;
		this.email = email;
	}
	
	public void validate() {
		String newName= new String("");
		boolean justDigit=true;
		int atPosition;
		int dotPosition;
		for (int i=0; i<this.name.length();i++) {
			char character=this.name.charAt(i);
			//Para saber si es letra
			//opcion 1
			if(letters.indexOf(character)>=0) {
				newName+=character;
			}
			//opcion2
			//if(Character.isLetter(this.name.charAt(i))) {
				//
			//}
			//opcion3
			//if ((this.name.charAt(i)>='a')
					//&& (this.name.charAt(i)<='z')) {
				//
			//}
			
		}
		this.name=newName;
		
		if (this.telephone.length()<9||
			this.telephone.length()>11){
				this.telephone="error";
			} else {
				for(int i=0; i<this.telephone.length();i++) {
					if (!Character.isDigit(this.telephone.charAt(i))) {
						justDigit=false;
						break;
					}
				}
				if(!justDigit) {
					this.telephone="error";
				}
				
				atPosition=this.email.indexOf('@');
				dotPosition=this.email.indexOf('.');
				
				if(!((atPosition!=-1
					&& dotPosition!=-1 &&
					(dotPosition-atPosition>1)
					&& atPosition>0
					&& dotPosition<this.email.length()-1
					))) {
						this.email="Sin email";
					}
				
				
			}
	}
	
	
	
	/*2. Crea una clase Fabricante con atributos nombre (String),teléfono (String),email(String). 
Tendrá:
Constructor
Getters y setters
Métodos:
valida(): comprueba que el nombre solo tiene letras, en caso contrario elimina lo que no sea letras. 
Comprueba que teléfono tiene solo dígitos y que tiene entre 9 y 11 dígitos, en caso contrario 
almacena “error” en teléfono. Comprueba que el email es válido: 1 o más caracteres seguidos de @,
seguido de 1 o más caracteres seguido de ‘.’ seguido de 1 o más caracteres. En caso contrario 
almacena “sin email”. 
Crea una clase Producto con atributos: código (String), marca(String), modelo(String), 
precio(double), fabricante (Fabricante).
Tendrá:
Constructor
Getters y setters
Métodos:
valida(): comprueba si el código cumple que tiene 5 caracteres, el primero una mayúscula del 
alfabeto inglés, luego tres dígitos y luego una minúscula del alfabeto inglés. Si no lo cumple se 
asigna A000a como código. También comprueba que marca solo tiene letras y dígitos, si no lo 
cumple se eliminan los caracteres que no sean letras, por ejemplo “a4,.*d” se queda en “a4d” .Lo 
mismo para modelo. También valida el fabricante con el método valida() de Fabricante*/
	
	
}
