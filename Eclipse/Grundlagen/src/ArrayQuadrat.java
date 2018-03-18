
public class ArrayQuadrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] squareNumber = new int[10];
		for (int i=0; i < squareNumber.length; i++)
		{
			squareNumber[i] = (i + 1) * (i + 1);
			System.out.print("Index: " + i + " - ");
			System.out.println("Die Quadratzahl von " + (i + 1) + " ist " +
					squareNumber[i]);
		}
		System.out.println();
		
		int[][] produkt = new int[10][10];
		for(int i = 0; i < produkt.length; i++)
		{
			for (int j=0; j < produkt[i].length; j++)
			{
				produkt[i][j] = (i + 1) * (j + 1);
				System.out.print("Index: " + i + "/ " + j + ": ");
				System.out.println("Das Produkt von " + (i + 1) + 
						" und " + (j + 1) + " ist "+ produkt[i][j]);
			}
		}
	}
}
