
public class GreatestCommonDivisor {

	static int doEuklid(int a, int b) {

		int c = 0;

		if (a < b) {

			c = b;
			b = a;
			a = c;
		}
			c = a % b;
		
			while (c!=0) { 
				a = b;
				b = c;
				c = a % b;
		}
	 	return b;
	}

	public static void main(String...args) {

		int x = 75, y = 54;
		int erg = doEuklid(x, y);
		System.out.println("");
		System.out.println("Der groesste gemeinsame Teiler von " + x + " und " + y +
			" ist " + erg + ".");
		System.out.println();
	}
}
