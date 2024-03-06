package calculadora;

public class Calculadora {

	private int suma;
	private int resta;
	private int multiplicacion;
	private int division;
	
	public Calculadora() {
		System.out.println("Cacluladora creada");
	}
	
	
	public int getSuma() {
		return suma;
	}



	public void setSuma(int suma) {
		this.suma = suma;
	}



	public int getResta() {
		return resta;
	}



	public void setResta(int resta) {
		this.resta = resta;
	}



	public int getMultiplicacion() {
		return multiplicacion;
	}



	public void setMultiplicacion(int multiplicacion) {
		this.multiplicacion = multiplicacion;
	}



	public int getDivision() {
		return division;
	}



	public void setDivision(int division) {
		this.division = division;
	}


	public int sumar(int suma2) {
		int resultado;
		resultado = this.suma + suma2;
		return resultado;
	}
	
	public int restar(int resta2) {
		int resultado;
		resultado = this.resta - resta2;
		return resultado;
	}
	
	public int multiplicar(int multiplo2) {
		int resultado;
		resultado = this.multiplicacion * multiplo2;
		
		return resultado;
	}
	
	public int dividir(int division2) {
		int resultado;
		resultado = this.division / division2;
		return resultado;
	}
	
	public int aplicacion(numeroTeclado) {
		switch (numeroTeclado) {
		case 1: calculadora1.setSuma(numero1);
		System.out.println("El resultado es: "+ calculadora1.sumar(numero2)); 
		break;
		case 2: calculadora1.setResta(numero1);
		System.out.println("El resultado es: "+ calculadora1.restar(numero2)); 
		break;
		case 3: calculadora1.setMultiplicacion(numero1);
		System.out.println("El resultado es: "+ calculadora1.multiplicar(numero2)); 
		break;
		case 4: calculadora1.setDivision(numero1);
		System.out.println("El resultado es: "+ calculadora1.dividir(numero2)); 
		break;
	}

	
}

	