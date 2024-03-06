package arrayList_agenda;

public class Dato {

	private int contador;
	private String sector;
	
	public Dato(String sector) {
		this.contador = 1;
		this.sector = sector;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	@Override
	public String toString() {
		return "Dato [contador=" + contador + ", sector=" + sector + "]";
	}	
	
}
