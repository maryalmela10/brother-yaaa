package parte1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayNumeros= {12,15,4,6,9,85,7,5};
		int[] arrayNumeros2= {10,5,6,49,85,5,6,48,46,56,8,2,6};
		String[] arrayString= {"monica","erika","dani","mariela","sfsdfsdgfsrgsgfdg"};
		//quiero
		System.out.println(Ejercicio_uno.uno(arrayNumeros2, 6));
		System.out.println(Ejercicio_uno.dos(arrayString));
		Ejercicio_uno.tres(arrayString,'m');
		int[]resultado=Ejercicio_uno.cuatro(arrayNumeros, arrayNumeros2);
		for(int i=0;i<resultado.length;i++) {
			System.out.println(resultado[i]);
		}
	}

}
