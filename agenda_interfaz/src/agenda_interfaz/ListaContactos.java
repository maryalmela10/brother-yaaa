package agenda_interfaz;

import java.util.ArrayList;
import java.util.Collections;

import arrayList_agenda.Contacto_Empresa;
import arrayList_agenda.Dato;

public class ListaContactos implements Agenda {
	ArrayList<Contacto> listaContactos;
	int numeroElementos;

	public ListaContactos() {
		this.listaContactos = new ArrayList<Contacto>();
	}

	public void ordenarPorEmail() {
		Collections.sort(this.listaContactos);
	}

	private int buscarContacto(int id) {
		for (int i = 0; i < this.listaContactos.size(); i++) {
			if (this.listaContactos.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean altaContacto(Contacto contacto) {
		if (this.buscarContacto(contacto.getId()) == -1) {
			this.listaContactos.add(contacto);
			numeroElementos++;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean bajaContacto(Contacto contacto) {
		int indice = this.buscarContacto(contacto.getId());
		if (indice != -1) {
			this.listaContactos.remove(indice);
			this.numeroElementos--;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean modificarTelefono(int id, String nuevoNumero) {
		int indice = this.buscarContacto(id);
		if (this.buscarContacto(id) != -1) {
			this.listaContactos.get(indice).setTelefono(nuevoNumero);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void listarDatos() {
		for (Contacto contacto : this.listaContactos) {
			System.out.println();
			System.out.println(contacto);
		}
	}

	@Override
	public void empresasDeSector() {
		ArrayList<Dato> listaSectores = new ArrayList<Dato>();
		for (Contacto contacto : this.listaContactos) {
			boolean esta = false;
			if (contacto instanceof Contacto_Empresa) {
				Contacto_Empresa contactico = (Contacto_Empresa) contacto;
				for (Dato dato : listaSectores) {
					if (contactico.getSector().equalsIgnoreCase(dato.getSector())) {
						esta = true;
						dato.setContador(dato.getContador() + 1);
					}
				}
				if (!esta) {
					listaSectores.add(new Dato(contactico.getSector()));
				}
			}

		}
	}

	}

	@Override
	public void listarOrdenEmail() {
		// TODO Auto-generated method stub

	}

}
