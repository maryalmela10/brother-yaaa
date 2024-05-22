package robot;

import java.util.Comparator;

public class ModeloPieza implements Comparator<Robot>{

	@Override
	public int compare(Robot o1, Robot o2) {
		int resultado = o1.getModelo().compareToIgnoreCase(o2.getModelo());
		if(resultado!=0) {
			return resultado;
			} else {
				return (o2.getNumPiezas()-o1.getNumPiezas());
		}
	}
}
