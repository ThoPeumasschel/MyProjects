
public class Quartalsumsatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anzZeilen = 3, anzSpalten = 4;
		float[][] umsatz = new float[anzZeilen][anzSpalten];
		for (int i=0; i < anzZeilen; i++)
			for (int j = 0; j < anzSpalten; j++)
				umsatz[i][j] = (i + j) * 1000;
		
		for (int i=0; i < anzZeilen; i++) {
			for (int j = 0; j < anzSpalten; j++) {
				System.out.println("Filiale " + i + " hat im Quartal " +
						(j+1) + " folgenden Umsatz: " + umsatz[i][j]);
				
			}
			System.out.println();
		}
	}
}
