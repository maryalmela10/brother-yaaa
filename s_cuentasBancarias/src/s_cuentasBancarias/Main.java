package s_cuentasBancarias;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Holder mary,otherHolder;
		Fecha birth_date=new Fecha(11,31,2008);
		Fecha other_birth_date=new Fecha(10,02,2008);
		Account myAccount, otherAccount;
		
		mary=new Holder("06621803B", "Mary", "Torrealba", birth_date);
		myAccount= new Account(12345,1000,mary);
		otherHolder=new Holder("06681803M", "Mary", "Torrealba", other_birth_date);
		otherAccount= new Account(89525,1000,otherHolder);
		myAccount.show();
		myAccount.deposit(150);
		System.out.println(myAccount.getBalance());
		myAccount.withdrawal(1155);
		System.out.println(myAccount.getBalance());
		System.out.println(myAccount.compareId(otherAccount));
		System.out.println("Los titulares tienen los mismos datos?"+myAccount.compareHolder(otherAccount));
		System.out.println("tienen dni similar "+myAccount.similar(otherAccount));
		
	}

}
