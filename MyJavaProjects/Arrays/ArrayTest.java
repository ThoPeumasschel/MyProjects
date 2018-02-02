import static java.lang.System.out;

class ArrayTest {
	
	public static void main ( String[] args ) {

		System.out.println("Jetzt erzeugen wir mal einen Fehler zur Laufzeit.");

//		int() array = null;
//		array[ 1 ] = 1;   // NullPointerException

		int[] array = new int[ 100 ];
//		array[ -10 ] = 1; // Fehler zur Laufzeit, nicht zur Compilezeit
		array[ 100 ] = 1; // Fehler zur Laufzeit, nicht zur Compilezeit
		
	}
}
