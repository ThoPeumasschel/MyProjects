
public class Vergleiche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		a = 4; b = 4;
		System.out.println("Gleichheit: " + (a == b));
		System.out.println("Ungleichheit: " + (a != b));
		a--;
		System.out.println("Kleiner: " + (a < b));
		System.out.println("Groesser: " + (a > b));
		System.out.println("Kleiner gleich: " + (a <= b));
		System.out.println("Groesser gleich: " + (a >= b));
		System.out.println();
		
		boolean x = true, y = true;
		System.out.println("Logisches nicht: " + !x);
		System.out.println("Logisches und: " + (x && y));
		System.out.println("Logisches oder: " + (x || !y));
		System.out.println();
		
		//a = a + 12;
		a += 12;		// Operatoren: +=, -=, *= und /=
		System.out.println("a: " + a);
	    a *= b;
	    System.out.println("a: " + a);
	}
}
