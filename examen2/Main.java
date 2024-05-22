package robot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobotInvestigacion r1 = new RobotInvestigacion("1","a",10,80);
		RobotInvestigacion r2 = new RobotInvestigacion("2","b",25,50);
		RobotInvestigacion r3 = new RobotInvestigacion("3","b",10,96);
		RobotInvestigacion r4 = new RobotInvestigacion("4","c",7,36);
		RobotInvestigacion r5 = new RobotInvestigacion("5","m",10,100);
		RobotIndustrial r6 = new RobotIndustrial("8","acv",30,"Phillip");
		RobotIndustrial r7 = new RobotIndustrial("9","b",30,"IBM");
		RobotIndustrial r8 = new RobotIndustrial("10","c",30,"Phillip");
		RobotIndustrial r9 = new RobotIndustrial("11","d",30,"IBM");
		RobotIndustrial r10 = new RobotIndustrial("12","f",30,"Samsung");
		AplicacionRobots aplicacion = new AplicacionRobots();
		aplicacion.introducirRobot(r1);
		aplicacion.introducirRobot(r2);
		aplicacion.introducirRobot(r3);
		aplicacion.introducirRobot(r4);
		aplicacion.introducirRobot(r5);
		aplicacion.introducirRobot(r6);
		aplicacion.introducirRobot(r7);
		aplicacion.introducirRobot(r8);
		aplicacion.introducirRobot(r9);
		aplicacion.introducirRobot(r10);
		Robot robolResultado = aplicacion.robotMayor("1");
		if(robolResultado!=null) {
			System.out.println("---------------");
			System.out.println(robolResultado.toString());
		} else {
			System.out.println("No hay ningun robot con ese identificador");
		}
		
		aplicacion.ordenAlfabeticoModeloPiezas();
		for(Robot elemnto: aplicacion.getListaRobots()) {
			System.out.println("Modelo "+elemnto.getModelo()+" Piezas "+elemnto.getNumPiezas());
		}
	}

}
