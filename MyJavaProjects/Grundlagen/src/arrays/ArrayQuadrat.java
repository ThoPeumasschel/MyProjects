package arrays;

public class ArrayQuadrat {

	public static void main(String[] args) {
		
		int[] squareNumber = new int[10];
		for  (int i=0; i < squareNumber.length; i++)
		{
			squareNumber[i] = (i + 1) * (i + 1);
			System.out.print("Index: " + i + " - ");
			System.out.println("Die Quadratzahl von " + (i + 1) + " ist " + squareNumber[i]);
		}

	}

}
