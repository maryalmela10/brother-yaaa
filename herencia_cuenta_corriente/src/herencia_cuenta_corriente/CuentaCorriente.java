package herencia_cuenta_corriente;

public class CuentaCorriente {
	private Titular titular;
	private String numeroDeCuenta;
	private double saldo;
	
	public CuentaCorriente(Titular titular, String numeroDeCuenta, double saldo) {
		this.titular = titular;
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
	}

	public CuentaCorriente(Titular titular, String numeroDeCuenta) {
		this.titular = titular;
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = 15.3;
	}

	public Titular getTitular() {
		return titular;
	}

	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean deposito(double cantidad) {
		if (cantidad>0) {
			this.saldo+=cantidad;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean retiro(double cantidad) {
		if ((this.saldo>cantidad)||(cantidad>0)) {
			this.saldo-=cantidad;
			return true;
		} else {
			return false;
		}
	}
	
	public void imprimirCuenta() {
		System.out.println("Numero de cuenta: "+this.numeroDeCuenta);
        System.out.println("Saldo: "+this.saldo);	
	}
	
	public boolean compararCuentas(CuentaCorriente cuentaComparar) {
		if(this.numeroDeCuenta.compareTo(cuentaComparar.getNumeroDeCuenta())==0) {
			return true;
		} else {
			return false;
		}
	}
	
}
