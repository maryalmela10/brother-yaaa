package arraylist_piloto;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista_pilotos {
	private ArrayList<Piloto> lista_pilotos;
	private ArrayList<Integer> listaLicencias;
	Scanner teclado = new Scanner(System.in);

	public boolean altaPiloto(int nLicencia, String nombre, String apellido, String nacionalidad) {
		boolean licenciaExistente=false;
		for(int licencias:this.listaLicencias) {
			if(nLicencia==licencias) {
				licenciaExistente=true;
			}
		}
		
		if(!licenciaExistente) {
			Piloto pilotoCreado = new Piloto(nLicencia,nombre,apellido,nacionalidad);
			this.lista_pilotos.add(pilotoCreado);
			this.listaLicencias.add(nLicencia);
			return true;
		} else {
			System.out.println("Ya existe un piloto con tu licencia");
			return false;
		}
		
	}
	
	public boolean ponerPuntosNacho(int id, ArrayList <Integer> puntos) {
		boolean resultado=false;
		int posicion;
		ArrayList<Integer> puntosPiloto;
		Piloto piloto;
		
		posicion=this.buscarPiloto(id);
		if(posicion!=-1) {
			puntosPiloto=new ArrayList<Integer>(puntos);
			piloto=this.lista_pilotos.get(posicion);
			piloto.añadirPuntosNacho(puntosPiloto);
			this.lista_pilotos.set(posicion, piloto);
			
			resultado=true;
			this.lista_pilotos.get(posicion).mostrarPuntos();
			return resultado;
		}
		return resultado;
	}
	
	public boolean puntosTodasCarreras(int id,int cantidad) {
		int puntuacion;
		for(int i=1;i<=cantidad;i++) {
			System.out.println("Introduce la puntuación de la carrera "+i);
			puntuacion = Integer.parseInt(teclado.nextLine());
			Carrera CarreraAgregar=new Carrera(i,puntuacion);
			int pilotoCarrera=this.buscarPiloto(id);
				if (pilotoCarrera!=-1) {
					this.lista_pilotos.get(pilotoCarrera).getListaCarreras().add(CarreraAgregar);
					} else {
						System.out.println("Piloto inexistente");
						return false;
					}
				}
			return true;
		}
	
		
	
	/*public boolean puntosUltimaCarrera(int id) {
		
		int pilotoCarrera=this.buscarPiloto(id);
		if (pilotoCarrera!=-1) {
			int ultimaCarrera=this.lista_pilotos.get(pilotoCarrera).getListaCarreras().size()-1;
			int numeroUltimaCarrera=this.lista_pilotos.get(pilotoCarrera).getListaCarreras()
			System.out.println("Ingresa los puntos de la carrera"+);
			
		}
	}*/
	
	public boolean ponerPuntosUltimaCarreraNacho (int puntos, int id) {
		boolean resultado = false;
		int posicion;
		Piloto piloto;
		
		posicion=this.buscarPiloto(id);
		if (posicion!=-1) {
			piloto=this.lista_pilotos.get(posicion);
			piloto.añadirPuntosAlFinalNacho(puntos);
			this.lista_pilotos.set(posicion, piloto);
			
			resultado = true;
			this.lista_pilotos.get(posicion).mostrarPuntos();
			return resultado;
		}
		
		return resultado;
	}
	
public void listarPilotosFIltradoPor5() {
		
		final int PUNTUACION_MINIMA=5;
		Piloto piloto;
		
		for (int i=0;i<this.lista_pilotos.size();i++) {
			piloto=this.lista_pilotos.get(i);
			if (piloto.puntuacionBaja(PUNTUACION_MINIMA)) {
				System.out.println(piloto);
			}
		}
	}
	
	private int buscarPiloto(int id) {
		for(int i=0;i<this.lista_pilotos.size();i++) {
			if(this.lista_pilotos.get(i).getnLicencia()==id) {
				return i;
			}
		}
		return -1;
	}
	
	public Lista_pilotos() {
		this.lista_pilotos = new ArrayList<Piloto>();
		this.listaLicencias = new ArrayList<Integer>();
	}
	
	public void puntuacionAlta() {
		ArrayList<Integer> sumaPilotos=new ArrayList<Integer>();
		for(Piloto piloto:this.lista_pilotos) {
			int suma=0;
			for(Integer puntos:piloto.getPuntos()) {
				suma+=puntos;
			}
			sumaPilotos.add(suma);
		}
		
		
		int posicionMayor=0;
		for(int i=1;i<sumaPilotos.size();i++) {
			if(sumaPilotos.get(i)>sumaPilotos.get(posicionMayor)) {
				posicionMayor=i;
			}
		}
		
		System.out.println("Licencia Piloto con puntuación más alta: "+this.lista_pilotos.get(posicionMayor).getnLicencia());
		System.out.println("puntuación total: "+sumaPilotos.get(posicionMayor));
	}
	
	public void datosOrdenAlfabetico() {
		ArrayList <Nombres> nombres=new ArrayList<Nombres>();
		for(int i=0;i<this.lista_pilotos.size();i++) {
			String nombre=this.lista_pilotos.get(i).getNombre();
			String apellido=this.lista_pilotos.get(i).getApellido();
			int posicion=i;
			nombres.add(new Nombres(nombre,apellido,posicion));
		}
		
		for(int i=0;i<nombres.size();i++) {
			int posicionMenor=i;
			for(int k=i+1;i<nombres.size();i++) {
				if(nombres.get(k).getApellido().compareToIgnoreCase(nombres.get(posicionMenor).getApellido())<0) {
					posicionMenor=k;
					Nombres valorMenor=nombres.get(k);
					nombres.set(k, nombres.get(i));
					nombres.set(i,valorMenor);
				}
			}
		}
	}

	public ArrayList<Piloto> getLista_pilotos() {
		return lista_pilotos;
	}

	public void setLista_pilotos(ArrayList<Piloto> lista_pilotos) {
		this.lista_pilotos = lista_pilotos;
	}

	@Override
	public String toString() {
		return "Lista_pilotos [lista_pilotos=" + lista_pilotos + "]";
	}
	
}
