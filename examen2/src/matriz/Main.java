package matriz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] array = { {"5",	"chucho",	"58",	"69"}, 
							{"maryu","chucho",	"2",	"locamen"},
							{"maryu","chucho","cpñ","999"},
		};
				
		int[][] probando=UtilidadesMatriz.metodo2(array);
		for(int i=0;i<probando.length;i++) {
			for(int j=0; j<probando[i].length;j++) {
				System.out.print(probando[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
