package Bascket;

public class Jugador {

	private double altura;
	private double porcentajeDeDos;
	private double porcentajeDeTres;
	
	public Jugador() {
		this.altura = 1.85;
		this.porcentajeDeDos = 40;
		this.porcentajeDeTres = 25;
	}
	
	public Jugador(double altura, double porcentajeDeDos, double porcentajeDeTres) {
		this.altura = altura;
		this.porcentajeDeDos = porcentajeDeDos;
		this.validarPorcentajeDos();
		this.porcentajeDeTres = porcentajeDeTres;
		this.validarPorcentajeTres();
	}
	
	private void validarPorcentajeDos() {
		if (this.porcentajeDeDos>100) {
			this.porcentajeDeDos=100;
		}
	}
	
	private void validarPorcentajeTres() {
		if (this.porcentajeDeTres>100) {
			this.porcentajeDeTres=100;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPorcentajeDeDos() {
		return porcentajeDeDos;
	}

	public void setPorcentajeDeDos(double porcentajeDeDos) {
		this.porcentajeDeDos = porcentajeDeDos;
		this.validarPorcentajeDos();
	}

	public double getPorcentajeDeTres() {
		return porcentajeDeTres;
	}

	public void setPorcentajeDeTres(double porcentajeDeTres) {
		this.porcentajeDeTres = porcentajeDeTres;
		this.validarPorcentajeTres();
	}
	
	
	@Override
	public String toString() {
		return "Jugador [altura=" + altura + ", porcentajeDeDos=" + porcentajeDeDos + ", porcentajeDeTres="
				+ porcentajeDeTres + "]";
	}

	public boolean lanzarDeTres() {
		double lanzadaRandom=Math.random();
		boolean encesto;
		if (lanzadaRandom<=this.porcentajeDeTres/100) {
			encesto=true;
		} else {
			encesto=false;
		}
		return encesto;
	}
	
	
		public boolean lanzarDeDos() {
			double lanzadaRandom=Math.random();
			boolean encesto=true;
			if (lanzadaRandom<=this.porcentajeDeDos/100) {
				encesto=true;
			} else {
				encesto=false;
			} 
			return encesto;
	}
		
		public void entrenarDos() {
			double entrenar=Math.random();
			if (entrenar<=0.50) {
				this.setPorcentajeDeDos(this.porcentajeDeDos+0.50);
			} 
		}
		
		public void entrenarTres() {
			double entrenar=Math.random();
			if (entrenar<=0.50) {
				this.setPorcentajeDeTres(this.porcentajeDeTres+0.50);
			} 
			
		}
		//Por conjunto de días
		/*
		public void entrenarDos(int dias) {
			double entrenar=Math.random();
			double nuevoPorcentaje = this.porcentajeDeDos+0.50*dias;
			if (entrenar<=0.50 && nuevoPorcentaje<100) {
				this.setPorcentajeDeDos(nuevoPorcentaje);
				} 
			}
		
		public void entrenarTres(int dias) {
				double entrenar=Math.random();
				double nuevoPorcentaje = this.porcentajeDeTres+0.50*dias;
				if (entrenar<=0.50 && nuevoPorcentaje<100) {
					this.setPorcentajeDeTres(nuevoPorcentaje);
				} 
			}
		*/
		
		public void entrenarDos(int dias) {
			for (int i=1; i<=dias;i++) {
				this.entrenarDos();
			}
		}
		
		public void entrenarTres(int dias) {
			for (int i=1; i<=dias;i++) {
				this.entrenarTres();
			}
		}
			
		

		
		
		
		
		
		
	
	
	
}
