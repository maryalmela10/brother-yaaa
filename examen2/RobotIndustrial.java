package robot;

public class RobotIndustrial extends Robot{
	String nombreFabricante;
	
	public RobotIndustrial(String identificador, String modelo, int numPiezas, String nombreFabricante ) {
		super(identificador, modelo, numPiezas);
		this.nombreFabricante = nombreFabricante;
	}

	public String getNombreFabricante() {
		return nombreFabricante;
	}

	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}
	
	public String tipodeRobot() {
		return "Robot Industrial";
	}

	@Override
	public String toString() {
		return super.toString() + "RobotIndustrial [nombreFabricante=" + nombreFabricante + "]";
	}
	
}
