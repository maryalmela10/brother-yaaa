package herencia_forma;

public class Rectangulo extends Forma{
	private int ladoMenor;
	private int ladoMayor;
	
	public Rectangulo(String color, Punto centro, int ladoMenor, int ladoMayor) {
		super(color, centro);
		this.ladoMenor = ladoMenor;
		this.ladoMayor = ladoMayor;
	}
	
	public Rectangulo(String color, int x, int y, int ladoMenor, int ladoMayor) {
		super(color, x, y);
		this.ladoMenor = ladoMenor;
		this.ladoMayor = ladoMayor;
	}

	@Override
	public String toString() {
		return "Rectangulo" + super.toString() +"ladoMenor=" + ladoMenor + ", ladoMayor=" + ladoMayor + "]" ;
	}
	
	public int calcularArea() {
		return (this.ladoMenor*this.ladoMayor);
	}
	
	public int perimetro() {
		return((2*this.ladoMenor)+(2*this.ladoMayor));
	}
	
	public void cambiarTamaño(double factor) {
        this.ladoMayor = (int) (ladoMayor * factor);
    }
	
}
