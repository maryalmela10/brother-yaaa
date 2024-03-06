package interfaces;

public class Cola implements EstructuraDtos{
	private int[] cola;
	private int numeroElementos;
	
	public Cola(int capacidad) {
		this.cola = new int[capacidad];
		this.numeroElementos=0;
	}

	/*
	public boolean introducirDatos(int dato) {
		boolean datoIntroducido=false;
		if (dato>0) {
			for(int i=0;i<this.cola.length;i++){
				if(this.cola[i]==0) {
					this.cola[i]=dato;
					datoIntroducido = true;
					return datoIntroducido;
				}
			}
		}
		return datoIntroducido;
	}*/
	
	//nacho
	//wet ya
	public boolean introducirDatos(int dato) {
		if(this.estaLlena()||dato<0) {
			return false;
			} else {
				this.cola[this.numeroElementos]=dato;
				this.numeroElementos++;
				return true;
			}
	}
	 
	//nacho
	public int obtenerDatos() {
		if(this.estaVacia()) {
			return -1;
		} else {
			int dato;
			dato=this.cola[0];
			for(int i=0;i<this.numeroElementos-1;i++) {
				this.cola[i]=this.cola[i+1];
			}
			this.numeroElementos--;
			return dato;
		}
	}

	/*
	public int obtenerDatos() {
		int datoObtenido=this.cola[0];
		for(int i=0;i<this.cola.length-1;i++){
			if(i==this.cola.length-1) {
				this.cola[i]=this.cola[i+1];
				this.cola[i+1]=0;
			}
			this.cola[i]=this.cola[i+1];
			}
		return datoObtenido;
	}*/
	
	public void mostrarDatos() {
		for(int i=0;i<this.cola.length;i++) {
			if(this.cola[i]!=0) {
				System.out.println(this.cola[i]);
				System.out.println();
			}
		}
	}
	
	public boolean estaLlena() {
		if(this.numeroElementos==this.cola.length) {
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
