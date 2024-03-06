package Empleados;

import java.util.Comparator;

public class OrdenarPorId implements Comparator<Empleados>{

	@Override
	public int compare(Empleados o1, Empleados o2) {
		if(o1.getId()<o2.getId()) {
			return -1;
		} else {
			if(o1.getId()<o2.getId()) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
	

}
