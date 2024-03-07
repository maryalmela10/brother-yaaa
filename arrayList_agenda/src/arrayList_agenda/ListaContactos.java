package arrayList_agenda;

import java.util.ArrayList;
import java.util.Collections;

public class ListaContactos {

	ArrayList<Contacto_Persona> ContactosPersonas;
	ArrayList<Contacto_Empresa> ContactosEmpresas;
	
	public ListaContactos() {
		ContactosPersonas = new ArrayList<Contacto_Persona>();
		ContactosEmpresas = new ArrayList<Contacto_Empresa>();
	}

	public void altaPersona(Contacto_Persona contacto) {
		this.ContactosPersonas.add(contacto);
	}
	
	public void altaEmpresa(Contacto_Empresa contacto) {
		this.ContactosEmpresas.add(contacto);
	}
	
	public boolean baja(int id) {
		//buscar en las dos listas para borrar
		ArrayList<Integer> lista=this.buscarContacto(id);
		if(lista.get(0)!=-1) {
			int indiceContacto=lista.get(1);
			if(lista.get(0)==0) {
				this.ContactosPersonas.remove(indiceContacto);
				return true;
			} else {
				this.ContactosEmpresas.remove(indiceContacto);
				return true;
			}
		}
		 else {
			return false;
		}
	}	
	
	public boolean modificarTelefono(int id,String nuevoTelefono) {
		//buscar en las dos listas para modificar
		ArrayList<Integer> lista=this.buscarContacto(id);
		if(lista.get(0)!=-1) {
			int indiceContacto=lista.get(1);
			if(lista.get(0)==0) {
				this.ContactosPersonas.get(indiceContacto).setTelefono(nuevoTelefono);
				return true;
			} else {
				this.ContactosEmpresas.get(indiceContacto).setTelefono(nuevoTelefono);
				return true;
			}
		}
		 else {
			return false;
		}
		
	}
	
	private ArrayList<Integer> buscarContacto(int id) {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		for(int i=0;i<this.ContactosPersonas.size();i++) {
			if(this.ContactosPersonas.get(i).getId()==id) {
				lista.add(0);
				lista.add(i);
				return lista;
			}
		}
		
		for(int i=0;i<this.ContactosEmpresas.size();i++) {
			if(this.ContactosEmpresas.get(i).getId()==id) {
				lista.add(1);
				lista.add(i);
				return lista;
			}
		}
		lista.add(-1);
		return lista;
	}
	
	public void listarDatos() {
		//recorrer las dos listas y mostrar datos
		System.out.println("Personas");
		for(Contacto_Persona p:this.ContactosPersonas) {
			System.out.println(p);
		}
		System.out.println("Empresas");
		for(int i=0;i<this.ContactosEmpresas.size();i++) {
			System.out.println(this.ContactosEmpresas.get(i));
		}
	}
	
	
	public void numeroEmpresasPorSector() {
		ArrayList<Dato> listaSectores=new ArrayList<Dato>();
		for(Contacto_Empresa contacto:this.ContactosEmpresas) {
			boolean esta=false;
			for(Dato dato:listaSectores) {
				if(contacto.getSector().equalsIgnoreCase(dato.getSector())) {
					esta=true;
					dato.setContador(dato.getContador()+1);
				}	
			}
			if(!esta) {
				listaSectores.add(new Dato(contacto.getSector()));
			}
		}
		
		for(Dato dato:listaSectores) {
			System.out.println(dato);
		}
	}
	
	public void listarPorEmail() {
		ArrayList<Email>listaEmail=new ArrayList<Email>();
		for(int i=0;i<this.ContactosEmpresas.size();i++) {
			listaEmail.add(new Email(this.ContactosEmpresas.get(i).getCorreo(),i,1));
		}
		
		for(int i=0;i<this.ContactosPersonas.size();i++) {
			listaEmail.add(new Email(this.ContactosPersonas.get(i).getCorreo(),i,0));
		}
		
		for(int i=0;i<listaEmail.size()-1;i++) {
			Email emailGuardado;
			if(listaEmail.get(i).getCorreo().compareToIgnoreCase(listaEmail.get(i+1).getCorreo())>0) {
				emailGuardado=listaEmail.get(i);
				listaEmail.set(i, listaEmail.get(i+1));
				listaEmail.set(i+1, emailGuardado);
			}
		}
		
		for(Email email:listaEmail) {
			if(email.getArray()==0) {
				System.out.println(this.ContactosPersonas.get(email.posicion));
			} else {
				System.out.println(this.ContactosEmpresas.get(email.posicion));
			}
		}
	}
}
