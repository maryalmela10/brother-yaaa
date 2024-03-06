package fecha;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha fecha1, fecha2;
		fecha1= new Fecha(20,7,2007);
		fecha2= new Fecha(20,7,2003);
		System.out.println(fecha1.diferenciaDias(fecha2));
		System.out.println(fecha2);
	}

}
