package s_cuentasBancarias;

public class Account {

	private int id;
	private double balance;
	private Holder holder;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Holder getHolder() {
		return holder;
	}
	public void setHolder(Holder holder) {
		this.holder = holder;
	}
	public Account(int id, double balance, Holder holder) {
		this.id = id;
		this.balance = balance;
		this.holder = holder;
	}
	//• mostrar(): Muestra los datos de la cuenta (incluyendo los del titular).
	public void show() {
	System.out.println("id: " + this.getId());
	System.out.println("Balance: " + this.getBalance());
	System.out.println("Nif: " + this.getHolder().getNif());
	System.out.println("Name: " + this.getHolder().getName());
	System.out.println("Last name: " + this.getHolder().getLast_name());
	System.out.println("Birth date: " + this.getHolder().getBirth_date());
	}
	
	//• ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se
	//hará nada. 
	public void deposit(double amount) {
		if (amount>0) {
			this.balance=this.balance+amount;
		}
	}
	
	//• retirar(cantidad): se retira una cantidad a la cuenta. La cuenta no puede estar en números rojos.
	public void withdrawal(double amount) {
		if ((this.balance>=0)&&(amount>0)) {
			this.balance-=amount;
		}
	}
	
	//• compararIdCuenta(cuenta2): true si las dos cuentas tienen el mismo id.
	public boolean compareId(Account otherAccount) {
		int otherId= otherAccount.id;
		if (this.id==otherId) {
			return true;
		}
		
		return false;
	}
	
	//• compararTitular(cuenta2): true si las dos cuentas tienen un titular con el mismo nif, mismo
	//nombre y apellidos y misma fecha de nacimiento.
	
	public boolean compareHolder(Account otherAccount) {
		String otherNif= otherAccount.holder.getNif();
		String otherName= otherAccount.holder.getName();
		String otherLastName= otherAccount.holder.getLast_name();
		Fecha otherBirthDate= otherAccount.holder.getBirth_date();
		
		if (!(otherNif.equalsIgnoreCase(this.holder.getNif()))){
			return false;
		}else {
			if (!(otherName.equalsIgnoreCase(this.holder.getName()))) {
				return false;
			} else {
				if (!(otherLastName.equalsIgnoreCase(this.holder.getLast_name()))) {
					return false;
				} else {
					if (!(otherBirthDate.igualQue(this.holder.getBirth_date()))) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	/*• compararTitularSimilar(cuenta2): true si las dos cuentas tienen un titular muy parecido: nif con 
	solo un dígito distinto (en la misma posición), nombre y apellidos solo con un carácter distinto (en 
	la misma posición) y fecha de nacimiento con diferencia menor a 5 días*/
	
	public boolean similar(Account otherAccount) {
		String otherNif= otherAccount.holder.getNif();
		//String otherName= otherAccount.holder.getName();
		//String otherLastName= otherAccount.holder.getLast_name();
		//Fecha otherBirthDate= otherAccount.holder.getBirth_date();
		int counter=0;
		boolean similar=true;
		
		for(int i=0; i<otherNif.length()-1;i++) {
			if (this.holder.getNif().charAt(i)!=otherNif.charAt(i)) {
				counter++;
			}
		}
			if (counter>1) {
				return false;
			}

		return similar;
	}
}

