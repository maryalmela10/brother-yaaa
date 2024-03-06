package Empleados;

import java.util.Comparator;

public class OrdenarPorSalario implements Comparator<Empleados>{

	@Override
	public int compare(Empleados o1, Empleados o2) {
		return (int) (o2.getSalario()-o1.getSalario());
	}

	
}
