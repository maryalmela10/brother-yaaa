package estadisticas;

public class Main {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6};
		ListaArray listado=new ListaArray(array);
		System.out.println(listado.minimo());
		System.out.println(listado.maximo());
		System.out.println(listado.sumatorio());
	}

}
