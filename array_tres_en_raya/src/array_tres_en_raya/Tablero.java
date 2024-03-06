package array_tres_en_raya;

public class Tablero {

	private Ficha [][] tablero;
	
	public Tablero() {
	this.tablero=new Ficha[3][3];
	this.inicializar();
	}

	public void inicializar() {
		for(int i=0;i<this.tablero.length;i++) {
			for(int j=0;j<this.tablero[i].length;j++) {
				this.tablero[i][j]=new Ficha('-');
			}	
		}
	}
	
		public void mostrarTablero() {
			for(int i=0;i<this.tablero.length;i++) {
				for(int j=0;j<this.tablero[i].length;j++) {
					System.out.print(this.tablero[i][j].getValor()+" ");
				}
				System.out.println();
			}	
		}
		
		public boolean ponerFicha(Ficha ficha, int fila, int columna) {
			boolean fichaPuesta;
			char valor;
			if((fila<0||fila>2)||(columna<0||columna>2)) {
				fichaPuesta=false;
			} else {
				valor=this.tablero[fila][columna].getValor();
				if(valor!='-') {
					fichaPuesta=false;
				} else {
					this.tablero[fila][columna]=ficha;
					fichaPuesta=true;
				}
			}
			return fichaPuesta;
		}
		
		public boolean estaLleno() {
			char valor;
			for(int i=0;i<this.tablero.length;i++) {
				for(int j=0;j<this.tablero[i].length;j++) {
					valor=this.tablero[i][j].getValor();
					if(valor=='-') {
						return false;
					}
				}
			}
			return true;
		}
	
}


	
	

