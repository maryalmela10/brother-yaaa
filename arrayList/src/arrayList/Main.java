package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Mary");
		lista.add("MaryaM");
		lista.add("MaryA");
		lista.add("MaryR");
		lista.add("MaryY");
		
		for(String elemento: lista) {
			System.out.println(elemento);
		}
		
		Numeros.listaInvertida(lista);
		for(String elemento: lista) {
			System.out.println(elemento);
		}
		
		/*ArrayList<Integer> numeros = new ArrayList<Integer>();
		boolean hayCero=false;
		int numero,suma=0,media;
		while(!hayCero) {
			System.out.println("Ingresa numeros");
			numero=teclado.nextInt();
			if(numero!=0) {
				numeros.add(numero);
			}else {
				hayCero=true;
			}
		}
		
		for(int i=0;i<numeros.size();i++) {
			
		}
		
		
		/*ArrayList<Integer> numeros = new ArrayList<Integer>();
		boolean hayCero=false;
		int numero,suma=0,media;
		
		while(!hayCero) {
			System.out.println("Ingresa numeros");
			numero=teclado.nextInt();
			if(numero!=0) {
				numeros.add(numero);
			}else {
				hayCero=true;
			}
		}
		
		for(Integer i: numeros){
		    suma+=i;                 
		}
		
		for(Integer i: numeros){
		    System.out.println(i);                 
		}
		
		System.out.println("La suma es "+suma);
		
		if(numeros.size()==0) {
			System.out.println("La media es 0 ");
			}else {
				media=suma/numeros.size();
				System.out.println(media);
			}

		
		nombres.add("Ana");
		nombres.add("Luisa");
		nombres.add("Felipe");
		System.out.println(nombres); // [Ana, Luisa, Felipe]
		nombres.add(1, "Pablo");
		System.out.println(nombres); // [Ana, Pablo, Luisa, Felipe]                                                       
		nombres.remove(0);
		System.out.println(nombres); // [Pablo, Luisa, Felipe]
		nombres.set(0,"Alfonso");
		System.out.println(nombres); // [Alfonso, Luisa, Felipe]                                                          
		String s = nombres.get(1);
		String ultimo = nombres.get(nombres.size() - 1);
		System.out.println(s + " " + ultimo);  // Luisa Felipe*/
		
		
		
	}

}
