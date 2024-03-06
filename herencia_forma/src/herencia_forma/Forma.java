package herencia_forma;

public class Forma {

	private String color;
	private Punto centro;
	
	public Forma(String color, Punto centro) {
		super();
		this.color = color;
		this.centro = centro;
	}
	
	public Forma(String color,int x, int y) {
		super();
		this.color = color;
		this.centro = new Punto(x,y);
	}

	@Override
	public String toString() {
		return "Forma [color=" + color + ", centro=" + centro;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	
	public void moverCentro(int x, int y) {
		this.centro.setEjeX(x);
		this.centro.setEjeY(y);
	}
}
