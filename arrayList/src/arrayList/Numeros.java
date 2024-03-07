package arrayList;

import java.util.ArrayList;

public class Numeros {

	public static void listaInvertida(ArrayList<String> lista) {
        int n = lista.size();
        for (int i = 0; i < n / 2; i++) {
            String temp = lista.get(i);
            lista.set(i, lista.get(n - i - 1));
            lista.set(n - i - 1, temp);
        }

	}
}
