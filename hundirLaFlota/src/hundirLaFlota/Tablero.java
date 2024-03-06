package hundirLaFlota;

public class Tablero {

	private char[][] tablero;

	public Tablero(char[][] tablero) {
		this.tablero = tablero;
	}

	public Tablero() {
		tablero = new char[10][10];
		for (int i = 0; i < tablero.length; i++) {
			for (int k = 0; k < tablero[i].length; i++) {
				tablero[i][k] = '*';
			}
		}
	}

	public void ubicarBarco(Barco barco) {
		int x, y;
		boolean estaLibre = true;

		if (barco.isOrientacion()) {
			// horizontal
			x = (int) (Math.random() * 10);
			y = (int) (Math.random() * (tablero[0].length - barco.getLongitud() + 1));

			estaLibre = true;
			for (int i = 0; i < barco.getLongitud(); i++) {
				if (tablero[x][y + i] == 'B') {
					estaLibre = false;
					break;
				}
			}
		} else {
			// vertical
			x = (int) (Math.random() * (tablero.length - barco.getLongitud() + 1));
			y = (int) (Math.random() * 10);
		}

		while (!estaLibre) {

			if (barco.isOrientacion()) {
				// horizontal
				x = (int) (Math.random() * 10);
				y = (int) (Math.random() * (tablero[0].length - barco.getLongitud() + 1));
				estaLibre = true;
				for (int i = 0; i < barco.getLongitud(); i++) {
					if (tablero[x][y + i] == 'B') {
						estaLibre = false;
						break;
					}
				}

				if (estaLibre) {
					for (int i = 0; i < barco.getLongitud(); i++) {
						tablero[x][y + i] = 'B';
					}
				}
			} else {
				// vertical
				x = (int) (Math.random() * (tablero.length - barco.getLongitud() + 1));
				y = (int) (Math.random() * 10);

				estaLibre = true;
				for (int i = 0; i < barco.getLongitud(); i++) {
					if (tablero[x + i][y] == 'B') {
						estaLibre = false;
						break;
					}
				}

				if (estaLibre) {
					for (int i = 0; i < barco.getLongitud(); i++) {
						tablero[x + i][y] = 'B';
					}
				}
			}

		}

	}

	public char[][] getTablero() {
		return tablero;
	}

	public void setTablero(char[][] tablero) {
		this.tablero = tablero;
	}

}
