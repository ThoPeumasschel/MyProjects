/*Algorithmus soll fünf Wertepaare in ein zweidimensionales Array einlesen. 
 * Nach der Eingabe sollen die Produkte der Wertepaare berechnet und ausgegeben werden. 
 *
 */

class ReadMultiNumbers2 {
	public static void main(String... args) {

		int i, j, temp1, temp2, mult;
		

		int[][] product = {{12, 18}, {9, 19}, {4, 3}, {5, 11}, {31, 21}};			
			

			
			for (i = 0; i < product.length; i++) {
				j = 0;
				while (j < 1) {
					temp1 = product[i][j];
					j++;
					temp2 = product[i][j];
					mult = temp1 * temp2;
					System.out.println("Produkt von " + temp1 + " und " + temp2 + " = " + mult);

				
			}
		}
	}
}




//	public static void main(String... args) {

