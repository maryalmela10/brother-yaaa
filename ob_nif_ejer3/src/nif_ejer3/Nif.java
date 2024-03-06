package nif_ejer3;

public class Nif {

	private int numero;
	private char letra;
	
	public Nif() {
		this.numero = 0;
		this.letra = ' ';
		System.out.println("Nif no valido");
	}

	public Nif(int numero) {
		this.numero = numero;
		this.calculaLetra();
		//this.calcularLetra(numero);
	}
	
	public void mostrarNif() {
		System.out.println(this.numero+"-"+this.letra);
	}
	
	private void calculaLetra() {
		int resto;
		resto=this.numero%23;
		switch (resto) {
		case 0: this.letra='T'; 
		break;
		case 1: this.letra='R';
		break;
		case 2: this.letra='W';
		break;
		case 3: this.letra='A';
		break;
		case 4: this.letra='G';
		break;
		case 5: this.letra='M';
		break;
		case 6: this.letra='Y';
		break;
		case 7: this.letra='F';
		break;
		case 8: this.letra='P';
		break;
		case 9: this.letra='D';
		break;
		case 10: this.letra='X';
		break;
		case 11: this.letra='B';
		break;
		case 12: this.letra='N';
		break;
		case 13: this.letra='J';
		break;
		case 14: this.letra='Z';
		break;
		case 15: this.letra='S';
		break;
		case 16: this.letra='Q';
		break;
		case 17: this.letra='V';
		break;
		case 18: this.letra='H';
		break;
		case 19: this.letra='L';
		break;
		case 20: this.letra='C';
		break;
		case 21: this.letra='K';
		break;
		case 22: this.letra='E';
		break;
		}
	}
	
	/*private void calcularLetra(int nif) {
		int opcion = nif%23;
		switch (opcion) {
		case 0: this.letra='T'; 
		break;
		case 1: this.letra='R';
		break;
		case 2: this.letra='W';
		break;
		case 3: this.letra='A';
		break;
		case 4: this.letra='G';
		break;
		case 5: this.letra='M';
		break;
		case 6: this.letra='Y';
		break;
		case 7: this.letra='F';
		break;
		case 8: this.letra='P';
		break;
		case 9: this.letra='D';
		break;
		case 10: this.letra='X';
		break;
		case 11: this.letra='B';
		break;
		case 12: this.letra='N';
		break;
		case 13: this.letra='J';
		break;
		case 14: this.letra='Z';
		break;
		case 15: this.letra='S';
		break;
		case 16: this.letra='Q';
		break;
		case 17: this.letra='V';
		break;
		case 18: this.letra='H';
		break;
		case 19: this.letra='L';
		break;
		case 20: this.letra='C';
		break;
		case 21: this.letra='K';
		break;
		case 22: this.letra='E';
		break;
		}
	}*/
	
	   
	
}
