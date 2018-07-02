package generics;
/*
 * 
 * 	Klassen, welche generische Interfaces implementieren:
 * 
 * 
 * 		1. Variante: Klasse selbst ist nicht generisch, das Interface wird aber parametrisiert
 * 
 * 		2. Variante: Klasse stellt selbst eine Typvariable vor, Interface kann mit dieser Variable nun auch paramtrisiert werden
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */








public class Karton<E, T> implements Comparable<Artikel>, IBerechenbar<E>
{

	@Override
	public int compareTo(Artikel o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E berechne() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
