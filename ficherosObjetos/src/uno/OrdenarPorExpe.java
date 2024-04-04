package uno;

import java.util.Comparator;

public class OrdenarPorExpe implements Comparator<Alumnos>{

	@Override
	public int compare(Alumnos o1, Alumnos o2) {
		return o1.getNumExpe()-o2.getNumExpe();
	}

}
