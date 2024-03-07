package agenda_interfaz;

import java.util.Comparator;

public class OrdenarPorTelefono implements Comparator<Contacto>{

	@Override
	public int compare(Contacto o1, Contacto o2) {
		// TODO Auto-generated method stub
		return o1.getCorreo().compareTo(o2.getCorreo());
	}

	
}
