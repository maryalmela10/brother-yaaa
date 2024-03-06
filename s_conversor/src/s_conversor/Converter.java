package s_conversor;

public class Converter {
	
	private String text;

	public Converter(String text) {
		this.text = text;
	}
	
	public boolean validate() {
		for(int i=0; i<this.text.length(); i++) {
			 if (this.text.charAt(i)!='0' && this.text.charAt(i)!='1') {
				 return false;
			 } 
		}
		return true;
	}

	public String Convert() {
		String hexadecimal="";
		//Rellenar
		if(this.validate()) {
			while(this.text.length()%4!=0) {
				this.text="0"+this.text;
			}
			//Cálculo de hexadecimal
		for (int i=0; i<this.text.length(); i+=4) {
			switch(this.text.substring(i, i+4)) {
			case "0000":
				hexadecimal+="0";
			break;
			case "0001":
				hexadecimal+="1";
			break;
			case "0010":
				hexadecimal+="2";
			break;
			case "0011":
				hexadecimal+="3";
			break;
			case "0100":
				hexadecimal+="4";
			break;
			case "0101":
				hexadecimal+="5";
			break;
			case "0110":
				hexadecimal+="6";
			break;
			case "0111":
				hexadecimal+="7";
			break;
			case "1000":
				hexadecimal+="8";
			break;
			case "1001":
				hexadecimal+="9";
			break;
			case "1010":
				hexadecimal+="A";
			break;
			case "1011":
				hexadecimal+="B";
			break;
			case "1100":
				hexadecimal+="C";
			break;
			case "1101":
				hexadecimal+="D";
			break;
			case "1110":
				hexadecimal+="E";
			break;
			case "1111":
				hexadecimal+="F";
			break;
				}
			}
		}
		return hexadecimal;
	}
}
