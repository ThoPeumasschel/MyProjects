/*Algorithmus soll fünf Wertepaare in ein zweidimensionales Array einlesen. 
 * Nach der Eingabe sollen die Produkte der Wertepaare berechnet und ausgegeben werden. 
 *
 */

class ReadMultiNumbers2 {
	public static void main(String... args) {

		
			int[][] product = {{2,4,6,8,10}, {3,5,7,9,11}};			
			
//			int[][] product = new int[5][5];
			
			for (int i : product) {
				for (int j : product[i]) {
					product[i][j] = (i + 1) * (j + 1); 
					System.out.print("Index "+ i + "/" + j + ": ");
					System.out.println("Produkt von " + (i+1) + " und "+(j+1)+" ist " + product[i][j]);

			}
		}
	}
}




//	public static void main(String... args) {

