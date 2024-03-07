package estadisticas;

public class ListaArray implements Estadistica{

	private int[] lista;

	public ListaArray(int[] lista) {
		this.lista = lista;
	}

	@Override
	public int minimo() {
		if(!this.estaVacio()) {
			int numeroMenor=this.lista[this.primerElemento()];
			for(int i=this.primerElemento()+1;i<this.lista.length;i++) {
				if(this.lista[i]<numeroMenor) {
					numeroMenor=this.lista[i];
				}
			}
			return numeroMenor;
		} else {
			System.out.println("El array está vacio");
			return 0;
		}
	}
	
	@Override
	public int maximo() {
		if(!this.estaVacio()) {
			int numeroMayor=this.lista[this.primerElemento()];
			for(int i=this.primerElemento()+1;i<this.lista.length;i++) {
				if(this.lista[i]>numeroMayor) {
					numeroMayor=this.lista[i];
				}
			}
			return numeroMayor;
		} else {
			System.out.println("El array está vacio");
			return 0;
		}
	}

	@Override
	public int sumatorio() {
		int suma=0;
		if(!this.estaVacio()) {
			for(int i=0;i<this.lista.length;i++) {
				suma+=this.lista[i];
			}
		} else {
			return suma;
		}
		return suma;
	}
	
	private boolean estaVacio() {
		boolean resultado = true;
		for(int i=0;i<this.lista.length;i++) {
			if(this.lista[i]!=0) {
				return false;
			}
		}
		
		return resultado;
	}
	
	private int primerElemento() {
		if(!this.estaVacio()) {
			for(int i=0;i<this.lista.length;i++) {
				if(this.lista[i]!=0) {
					return i;
				}
			}
		} 
		return 0;
	}
	
}
