package interfaces;

public class Pila implements EstructuraDtos {

	private int[] pila;
	private int numeroElementos;
	
	public Pila(int capacidad) {
		this.pila = new int[capacidad];
		this.numeroElementos=0;
	}

	public boolean introducirDatos(int dato) {
		if(this.estaLlena()||dato<0) {
		return false;
		} else {
			this.pila[this.numeroElementos]=dato;
			this.numeroElementos++;
			return true;
		}
	}

	public int obtenerDatos() {
		if(this.estaVacia()) {
			return -1;
		} else {
			this.numeroElementos--;
			return this.pila[this.numeroElementos];
		}
	}

	public boolean estaLlena() {
		if(this.numeroElementos==this.pila.length) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean estaVacia() {
		if(this.numeroElementos==0) {
			return true;
		} else {
			return false;
		}
	}
	
}
