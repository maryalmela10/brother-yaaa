package herencia_cuenta_corriente;

public class CuentaAhorro extends CuentaCorriente{
	 private double interes;
	 
	public CuentaAhorro(Titular titular, String numeroDeCuenta, double saldo, double interes) {
		super(titular, numeroDeCuenta, saldo);
		this.interes = interes;
	}

	public CuentaAhorro(Titular titular, String numeroDeCuenta, double interes) {
		super(titular, numeroDeCuenta);
		this.interes = interes;
	}

	public CuentaAhorro(Titular titular, String numeroDeCuenta) {
		super(titular, numeroDeCuenta);
		this.interes = 2.5;
	}

	public double getInteres() {
		return interes;
	}

	public void calcularInteres(){
		this.setSaldo(this.getSaldo()+(this.getSaldo()*this.interes));
	}

}
