package automovil;

public class Carro {
	private char marca, combustible, automovil, color;
	private int matricula, modelo, motor, puertas, velocidadMaxima, velocidadActual;
	
	public Carro(char marca, char combustible, char automovil, char color, int matricula, int modelo, int motor,
			int puertas, int velocidadMaxima, int velocidadActual) {
		this.marca = marca;
		this.combustible = combustible;
		this.automovil = automovil;
		this.color = color;
		this.matricula = matricula;
		this.modelo = modelo;
		this.motor = motor;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = velocidadActual;
	}
	
	public void acelerar(int aceleracion) {
		int nuevaVelocidad=this.velocidadActual+aceleracion;
		if (nuevaVelocidad<=this.velocidadMaxima) {
			this.setVelocidadActual(nuevaVelocidad);
		} else {
			this.setVelocidadActual(100);
			System.out.println("Sobrepasas el limite de velocidad");
		}
	}
	
	public void desacelerar(int desaceleracion) {
		int nuevaVelocidad=this.velocidadActual-desaceleracion;
		if (nuevaVelocidad>=0) {
			this.setVelocidadActual(nuevaVelocidad);
		} else {
			this.setVelocidadActual(0);
			System.out.println("No puedes desacelerar en negativo");
		}
	}
	
	public void frenar() {
		this.setVelocidadActual(0);
	}
	
	public int tiempoLlegada(int kilometros) {
		int resultado = kilometros/this.velocidadActual;
		return resultado;
	}

	public char getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", combustible=" + combustible + ", automovil=" + automovil + ", color="
				+ color + ", matricula=" + matricula + ", modelo=" + modelo + ", motor=" + motor + ", puertas="
				+ puertas + ", velocidadMaxima=" + velocidadMaxima + ", velocidadActual=" + velocidadActual + "]";
	}

	public void setMarca(char marca) {
		this.marca = marca;
	}

	public char getCombustible() {
		return combustible;
	}

	public void setCombustible(char combustible) {
		this.combustible = combustible;
	}

	public char getAutomovil() {
		return automovil;
	}

	public void setAutomovil(char automovil) {
		this.automovil = automovil;
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	
	
	
	
}
