package arraylist_piloto;

import java.util.ArrayList;

public class Piloto {
	private int nLicencia;
	private String nombre;
	private String apellido;
	private String nacionalidad;
	private ArrayList<Carrera> listaCarreras;
	private ArrayList<Integer> puntos;
	
	public int getnLicencia() {
		return nLicencia;
	}
	public void setnLicencia(int nLicencia) {
		this.nLicencia = nLicencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public ArrayList<Carrera> getListaCarreras() {
		return listaCarreras;
	}
	public void setListaCarreras(ArrayList<Carrera> listaCarreras) {
		this.listaCarreras = listaCarreras;
	}
	
	public Piloto(int nLicencia, String nombre, String apellido, String nacionalidad) {
		this.nLicencia = nLicencia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.listaCarreras = new ArrayList<Carrera>();
		this.puntos = new ArrayList<Integer>();
	}
	
	public void agregarPuntosCarrera (int numeroCarrera, int punto) {
		listaCarreras.add(new Carrera(numeroCarrera,punto));
	}
	
	public void añadirPuntosNacho(ArrayList<Integer> puntosPiloto) {
		this.puntos= new ArrayList<Integer>(puntosPiloto);
	}
	
	public ArrayList<Integer> getPuntos() {
		return puntos;
	}
	public void setPuntos(ArrayList<Integer> puntos) {
		this.puntos = puntos;
	}
	public void añadirPuntosAlFinalNacho(int puntos) {
		this.puntos.add(puntos);
	}
	
	public void añadirPuntosAlFinal(int puntos) {
		int posicion=this.listaCarreras.size()-1;
		int numCarr=this.listaCarreras.get(posicion).getNumeroDeCarrera()+1;
		this.listaCarreras.add(new Carrera(numCarr,puntos));
	}
	
	public void mostrarPuntos() {
		for(Integer puntos: this.puntos) {
			System.out.println("Carrera" +puntos);
		}
	}
	
	public boolean puntuacionBaja(int puntosMinimo) {
		int minimo;
		
		minimo=this.puntos.get(0);
		for (int i=1;i<this.puntos.size();i++) {
			if (this.puntos.get(i)<minimo) {
				minimo=this.puntos.get(i);
			}
		}
		if (minimo==puntosMinimo) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
