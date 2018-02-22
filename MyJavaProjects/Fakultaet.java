
public class Fakultaet {


	// iterativer Algorithmus , wesentlich schneller. 	
	static int compFact(int x) {


			
		int result = 1;
		while (x>1) {
			result *= x;
			x--;
		}
		return result;
	}


	// rekursiver Algorithmus, wesentlich langsamer!
	static int compFactRec(int x) {

		if (x > 0)
			return x * compFactRec(x - 1); //comFactRec(x - 1) ist
											//rekursiver Funktionsaufruf .
		else 
			return 1;

	}

	public static void main(String... args) {

		int erg; int fac = 5;
		erg = compFact(fac);
		System.out.println("Fakultaet von " + fac + " ist " + erg);
		erg = compFactRec(fac);
		System.out.println("Fakultaet von " + fac + " rekursiv berechnet ist " + erg);
		
	}
}
