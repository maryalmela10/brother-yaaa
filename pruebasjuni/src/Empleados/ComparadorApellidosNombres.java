package Empleados;

import java.util.Comparator;

public class ComparadorApellidosNombres implements Comparator<Empleados> {

	@Override
	public int compare(Empleados o1, Empleados o2) {
		int resultado = o1.getApellidos().compareToIgnoreCase(o2.getApellidos());
		if(resultado<0) {
			return -1;
		}else {
			if(resultado>1) {
				return 1;
			} else {
				int resultadoNombre=o1.getNombre().compareToIgnoreCase(o2.getNombre());
				return resultadoNombre;
			}
		}
	}

}
