package robot;

public abstract class Robot {
	String identificador;
	String modelo;
	int numPiezas;
	
	public Robot(String identificador, String modelo, int numPiezas) {
		super();
		this.identificador = identificador;
		this.modelo = modelo;
		this.numPiezas = numPiezas;
	}

	public String getIdentificador() {
		return identificador;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPiezas() {
		return numPiezas;
	}

	public void setNumPiezas(int numPiezas) {
		this.numPiezas = numPiezas;
	}
	
	public abstract String tipodeRobot();

	@Override
	public String toString() {
		return "Robot [identificador=" + identificador + ", modelo=" + modelo + ", numPiezas=" + numPiezas + "]";
	}
	
}
