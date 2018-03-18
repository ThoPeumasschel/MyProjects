
public class Fakultaet {
	
	// iterativer Algorithmus, wesentlich schneller
	static int compFact(int x)
	{
		int result = 1;
		while (x > 1)
		{
			result *= x;
			x--;
		}
		return result;
	}
	// rekursiver Algorithmus, wesentlich langsamer
	static int compFactRec(int x)
	{
		if (x > 0)
			return x * compFactRec(x - 1); // compFactRec(x-1) ist rekursiver
											// Funktionsaufruf
		else
			return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int erg, fac = 4;
		erg = compFact(fac);
		System.out.println("Fakultaet von " + fac + " ist " + erg);
		erg = compFactRec(fac);
		System.out.println("Fakultaet von " + fac + " rekursiv berechnet ist " + erg);
	}

}
