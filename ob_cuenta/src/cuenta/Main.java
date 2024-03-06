package cuenta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta cuenta1;
		cuenta1= new Cuenta(23, 1200);
		
		cuenta1.ingresar(1000);
		cuenta1.retirar(500);
		System.out.println(cuenta1);
	}

}
