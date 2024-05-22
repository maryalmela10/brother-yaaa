package robot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AplicacionRobots {
	ArrayList<Robot> listaRobots;
	int contadorRobots;

	public AplicacionRobots() {
		super();
		this.listaRobots = new ArrayList<Robot>();
		this.contadorRobots=0;
	}
	
	public boolean introducirRobot(Robot r){
		if(contadorRobots<10) {
			this.listaRobots.add(r);
			this.contadorRobots++;
			return true;
		} else {
			return false;
		}
	}
	
	public String existeRobot(String identificador) {
		for(int i=0;i<this.listaRobots.size();i++) {
			if(this.listaRobots.get(i).getIdentificador().equalsIgnoreCase(identificador)) {
				return this.listaRobots.get(i).tipodeRobot();
			}
		}
		return "No hay ningun robot con ese identificador";
	}
	
	public int existeRobotIndice(String identificador) {
		for(int i=0;i<this.listaRobots.size();i++) {
			if(this.listaRobots.get(i).getIdentificador().equalsIgnoreCase(identificador)) {
				return i;
			}
		}
		return -1;
	}
	
	public Robot robotMayor(String identificador) {
		int indiceRobotEncontrado;
		ArrayList<Robot> robots = new ArrayList<Robot>();
		indiceRobotEncontrado=this.existeRobotIndice(identificador);
		if (indiceRobotEncontrado!=-1) {
			robots.add(this.listaRobots.get(indiceRobotEncontrado));
			for(int i=0;i<this.listaRobots.size();i++) {
				if(i!=indiceRobotEncontrado) {
					if(this.listaRobots.get(indiceRobotEncontrado).tipodeRobot().equalsIgnoreCase(this.listaRobots.get(i).tipodeRobot())
							&& this.listaRobots.get(indiceRobotEncontrado).getNumPiezas()==this.listaRobots.get(i).getNumPiezas()){
						robots.add(this.listaRobots.get(i));
					}
				}
			}
			Collections.sort(robots, new AlfabeticamenteMayor());
			return robots.get(0);
		}
		return null;
	}
	
	public void ordenAlfabeticoModeloPiezas() {
		Collections.sort(this.listaRobots, new ModeloPieza());
	}

	public int getContadorRobots() {
		return contadorRobots;
	}

	public ArrayList<Robot> getListaRobots() {
		return listaRobots;
	}
	
}
