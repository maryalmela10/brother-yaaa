package matriz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] array = { {"5",	"59",	"58",	"69",	"locamen"}, 
							{"maryu","569",	"2",	"locamen","locamen"},
							{"maryu","chucho","cpñ","999","55sd"},
							{"1",	"2",	"693",	"4",		"locamen"},
							{"256",	"565",	"chacho","locamen",	"locamen"}
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
