package herencia_magos;

import java.util.ArrayList;

public class Menu {
	private ArrayList<Personaje> listaMenu;
	private final int TAMAÑO_MAXIMO = 200;

	public Menu(ArrayList<Personaje> listaMenu) {
		super();
		this.listaMenu = listaMenu;
	}

	public Menu() {
		this.listaMenu = new ArrayList<Personaje>();
	}

	private boolean atacar(int idAtacante, int idDefensor) {
		int posicionAtacante, posicionDefensor;
		boolean resultado = false;
		;

		posicionAtacante = this.buscarPersonaje(idAtacante);
		if (posicionAtacante != -1) {
			posicionDefensor = this.buscarPersonaje(idDefensor);
			if (posicionDefensor != -1) {
				resultado = true;
				this.listaMenu.get(posicionAtacante).atacar(this.listaMenu.get(posicionDefensor));

			}
		}
		return resultado;
	}

	public boolean añadir(Personaje personaje) {
		if (this.listaMenu.size() < TAMAÑO_MAXIMO) {
			this.listaMenu.add(personaje);
			return true;
		}
		return false;

	}

	public boolean borrar(int id) {
		int posicionPersonaje = this.buscarPersonaje(id);
		if (posicionPersonaje != -1) {
			this.listaMenu.remove(posicionPersonaje);
			return true;
		} else {
			return false;
		}
	}

	private int buscarPersonaje(int id) {
		for (int i = 0; i < this.listaMenu.size(); i++) {
			if (this.listaMenu.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}

	public void listarDatosPaladinesBendecidos() {
		Paladin paladin;
		for (Personaje p : this.listaMenu) {
			if (p instanceof Paladin) {
				paladin = (Paladin) p;
				if (paladin.isBendecido()) {
					System.out.println(paladin);
				}
			}
		}
	}
}
