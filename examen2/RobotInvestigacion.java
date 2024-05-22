package robot;

public class RobotInvestigacion extends Robot{
	int horasFuncionamiento;
	
	public RobotInvestigacion(String identificador, String modelo, int numPiezas, int horasFuncionamiento) {
		super(identificador, modelo, numPiezas);
		this.horasFuncionamiento=horasFuncionamiento;
	}
	
	public String tipodeRobot() {
		return "Robot Investigacion";
	}

	public int getHorasFuncionamiento() {
		return horasFuncionamiento;
	}

	public void setHorasFuncionamiento(int horasFuncionamiento) {
		this.horasFuncionamiento = horasFuncionamiento;
	}

	@Override
	public String toString() {
		return super.toString() +"RobotInvestigacion [horasFuncionamiento=" + horasFuncionamiento + "]";
	}
	

}

