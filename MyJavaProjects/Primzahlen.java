
public class Primzahlen {

	public static void main(String[] args) {

		int i, j, k, max;	

		max = 1000;

		int[] Zahlen = new int[max];

		Zahlen[0] = 0;
		Zahlen[1] = 0;

		for (i = 2; i < Zahlen.length; i++) { 	// Belegung Array
			Zahlen[i] = i;

		}

		j = 2;
		while ((j * j) < Zahlen.length) { 		// Für alle Zahlen ab 2 deren Quadrat kleiner als die Arraylänge ist

			if (Zahlen[j] != 0) { 				// Falls die Zahl nicht bereits ein Vielfaches ist

				k = 2;
				while ((k * j) < Zahlen.length) { // Setze alle Vielfachen der Zahl auf 0
					Zahlen[k * j] = 0;
					k++;

				}
			}

			j++;

		}

		for (i = 0; i < Zahlen.length; i++) { 	// Ergebnisausgabe
			if (Zahlen[i] != 0) {
				System.out.println(Zahlen[i]);
			}
		}
	}

}
