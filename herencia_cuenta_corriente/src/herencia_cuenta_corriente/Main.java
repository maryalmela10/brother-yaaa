package herencia_cuenta_corriente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Titular titular1=new Titular("Mary", "Almela","20");
		Titular titular2=new Titular("Alejandra", "Almela","20");
		Titular titular3=new Titular("Alejandra", "Torrealba","20");
		CuentaCorriente cuentaCorriente=new CuentaCorriente(titular1,"1234");
		CuentaAhorro cuentaAhorro=new CuentaAhorro(titular2,"4568",4,5);
		CuentaAhorro cuentaAhorro2=new CuentaAhorro(titular3,"4568",4,5);
		System.out.println(cuentaAhorro2.compararCuentas(cuentaAhorro));
	}

}
