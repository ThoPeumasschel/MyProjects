
public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double MWST = 0.19; 		// Definition einer Konstanten
		System.out.println("MwSt: " + MWST);
		
		int a;			// Deklaration
		a = 4;			// Definition
		a = +a;			// Vorzeichenoperator
		System.out.println("a: " + a);
		a = -a;			// Vorzeichenoperator
		System.out.println("a: " + a);
		int b = 2, c;		// Definition
		a = -a;
		System.out.println("a: " + a);
		
		c = a + b;
		System.out.println("c nach Addition von a und b: " + c);
		c = a - b;
		System.out.println("c nach Subtraktion von a und b: " + c);
		c = a * b;
		System.out.println("c nach Multiplikation von a und b: " + c);
		c = a / b;
		System.out.println("c nach Division von a und b: " + c);
		c = a % b;			// Modulo-Operator
		System.out.println("c nach Modulo von a und b: " + c);
		
		a = a + 1;
		System.out.println("a: " + a);
		a++;			// a = a + 1
		System.out.println("a: " + a);
		c = a++;		// erst zuweisen, dann erhöhen
		System.out.println("a: " + a + "   c: " + c);
		c = ++a;		// erst erhöhen, dann zuweisen
		System.out.println("a: " + a + "   c: " + c);
		
	}

}
