package automovil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro1;
		carro1 = new Carro('N','L','M','5', 8, 10, 8, 7,200,100);
		carro1.acelerar(20);
		System.out.println(carro1.getVelocidadActual()); 
		carro1.desacelerar(50);
		System.out.println(carro1.getVelocidadActual()); 
		carro1.frenar();
		System.out.println(carro1.getVelocidadActual()); 
	}

}
