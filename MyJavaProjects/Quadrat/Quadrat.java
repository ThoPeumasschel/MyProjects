/**
 * Erstes Java-Beispielprogramm.
 * Java-Insel Aulage 12, Listing 1.1
 * Kap. 1.5.2
 */

public class Quadrat {

	static int quadrat( int n ) {
		return n * n;
	}

	static void ausgabe( int n ) {
		for ( int i = 1; i <= n; i = i + 1 ) {
			String s = "Quadrat(" + i + ") = " + quadrat( i );
			System.out.println( s );
		}
	}

	public static void main( String[] args ) {
		ausgabe( 16 );
	}
}


