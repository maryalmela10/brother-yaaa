package herencia_forma;

public class Punto {
	private int ejeX;
	private int ejeY;
	public int getEjeX() {
		return ejeX;
	}
	public void setEjeX(int ejeX) {
		this.ejeX = ejeX;
	}
	public int getEjeY() {
		return ejeY;
	}
	public void setEjeY(int ejeY) {
		this.ejeY = ejeY;
	}
	
	public Punto(int ejeX, int ejeY) {
		this.ejeX = ejeX;
		this.ejeY = ejeY;
	}
	@Override
	public String toString() {
		return "Punto [ejeX=" + ejeX + ", ejeY=" + ejeY + "]";
	}
}
