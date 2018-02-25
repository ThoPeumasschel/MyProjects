import java.util.Scanner;

public class GreatestCommonDivisor {

	static int doEuklid(int a, int b) {

		int c = 0;

		if (a < b) 
		{	c = b;	b = a;	a = c;	}

			c = a % b;
		
			while (c!=0) 
			{	a = b;	b = c;	c = a % b;	}
	 		return b;
	}

	public static void main(String...args) {

		System.out.print("\nIch kann dir den groessten gemeinsamen Teiler " + 
			"von zwei beliebigen Zahlen berechnen. " + "\nLos geht's, gib die erste Zahl ein: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("Ok, und jetzt die zweite Zahl: ");
		int y = sc.nextInt();
		int erg = doEuklid(x, y);
		System.out.println();
		System.out.println("Der groesste gemeinsame Teiler von " + x + " und " + y +
			" ist " + erg + ".");
		System.out.println();
	}
}
