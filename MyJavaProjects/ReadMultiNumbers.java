/*Algorithmus soll fünf Wertepaare in ein zweidimensionales Array einlesen. 
 * Nach der Eingabe sollen die Produkte der Wertepaare berechnet und ausgegeben werden. 
 *
 */

class ReadMultiNumbers {
	public static void main(String... args) {
	int[][] product = new int[5][2];
	for (int i = 0; i < product.length; i++) {
		for (int j = 0; j < product[i].length; j++) {
			product[i][j] = (i + 1) * (j + 1); 
			System.out.print("Index "+ i + "/" + j + ": ");
			System.out.println("Produkt von " + (i+1) + " und "+(j+1)+" ist " + product[i][j]);

			}
		}
	}
}




//	public static void main(String... args) {
