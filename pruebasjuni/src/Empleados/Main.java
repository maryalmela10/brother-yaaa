package Empleados;

public class Main {

	public static void main(String[] args) {
		ListaEmpleados empresa=new ListaEmpleados();
		empresa.ordenarPorId();
		empresa.ordenarPorApellidosNombres();
		empresa.mostrar();
	}

}
