package robot;

import java.util.Comparator;

public class AlfabeticamenteMayor implements Comparator<Robot>{

	@Override
	public int compare(Robot o1, Robot o2) {
		return o2.getModelo().compareTo(o1.getModelo());
	}
	
}
