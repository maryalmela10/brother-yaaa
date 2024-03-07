package herencia_forma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Punto centro = new Punto(2, 5);
        Rectangulo rectangulo = new Rectangulo("Rojo", centro, 3, 5);
        
        System.out.println(rectangulo);
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.perimetro());
 
        rectangulo.setColor("Azul");
        rectangulo.moverCentro(10, 12);
        rectangulo.cambiarTamaño(2);
        System.out.println(rectangulo);
	}

}
