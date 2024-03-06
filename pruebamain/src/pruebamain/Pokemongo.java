package pruebamain;

public class Pokemongo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//la primera division son las filas
		int op1,op2;
		int suma;
		if(args.length==2) {
			op1=Integer.parseInt(args[0]);
			op2=Integer.parseInt(args[1]);
			suma=op1+op2;
			System.out.println(suma);
		}
	}

}
