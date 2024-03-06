package Empleados;

import java.util.ArrayList;
import java.util.Collections;

public class ListaEmpleados {
	ArrayList<Empleados> listaEmpleados;

	public ListaEmpleados() {
		super();
		this.listaEmpleados = new ArrayList<Empleados>();
		listaEmpleados.add(new Empleados(1,"a","b",2000));
		listaEmpleados.add(new Empleados(5,"b","c",2100));
		listaEmpleados.add(new Empleados(3,"c","a",3000));
		listaEmpleados.add(new Empleados(2,"a","a",12000));
		listaEmpleados.add(new Empleados(4,"d","d",2000));
	}
	
	public void ordenarPorId() {
		Collections.sort(this.listaEmpleados, new OrdenarPorId());
	}
	
	public void ordenarPorApellidosNombres() {
		Collections.sort(this.listaEmpleados, new ComparadorApellidosNombres());
	}
	
	
	public void mostrar() {
		for(Empleados elemento: this.listaEmpleados) {
			System.out.println(elemento);
		}
	}
	
}
