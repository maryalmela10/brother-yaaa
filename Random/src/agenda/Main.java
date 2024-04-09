package agenda;

public class Main {

	public static void main(String[] args) {
		AgendaDao agenda = new AgendaDao();
		Contacto mary = new Contacto(1,72220433,"Maryalmela@gmail.com");
		Contacto mario = new Contacto(2,725333,"mario@gmail.com");
		Contacto carlos = new Contacto(3,5320433,"carlos@gmail.com");
		Contacto juan = new Contacto(4,7250433,"juan@gmail.com");
		Contacto andrea = new Contacto(5,72369433,"andrea@gmail.com");
		agenda.guardarContacto(mary);
		agenda.guardarContacto(mario);
		agenda.guardarContacto(carlos);
		agenda.guardarContacto(juan);
		agenda.guardarContacto(andrea);
		System.out.println(agenda.buscarContacto(andrea.getId()));
		agenda.modificarContacto(juan);
		System.out.println(agenda.buscarContacto(juan.getId()));
	}

}
