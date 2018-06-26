package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/*
 * 	COLLECTION:
 * 
 * 		-> Datenstruktur, welche Operationen auf eine Menge von Objekten abbildet(Elementsammlung)
 * 
 * 		-> Collections in Java akzeptieren KEINE primitiven Typen, nur Objekte!
 * 
 * 		-> Zunächsteinmal wird ALLES, was man in einer Collection ablegt, nach Object gecastet
 * 
 * 			-> Vorsicht! -> Typprüfungen und Typkonvertierungen beim Auslesen erforderlich!
 * 
 * 		-> Grob betrachtet gibt es 4 Gruppen von Collections in Java:
 * 
 * 				1. List
 * 				2. Set
 * 				3. Map
 * 				4. Queue
 * 
 */

@SuppressWarnings("all")
public class Main
{

	public static void main(String[] args)
	{
		// Collections vom Typ List:
		/*
		 * Haupteigenschaften von List:
		 * 
		 * -> Halten zuasammenhängende Objekt-Listen, auf welche sequentiell oder
		 * wahlfrei zugegriffen werden kann -> Bieten einen Iterator an -> wachsen und
		 * schrumpfen implizit dynamisch beim Einfügen/Entfernen von Elementen -> Neue
		 * Elemente werden implizit hinten an die Liste angehängt -> Neue Elemente
		 * können auch an einer bestimmten Stelle eingefügt werden -> Verfügen über
		 * einen Index
		 * 
		 */

		ArrayList listeA = new ArrayList(180); // verwaltet seine elemente implizit per Object-Array!
		Auto karre = new Auto(120, "Audi");
		Auto rolli = new Auto(45, "Lada");
		Auto auto = new Auto(120, "Audi");

		listeA.add(karre);
		listeA.add(rolli);
		listeA.add(auto);

		// iterator aus arraylist holen:
		Iterator it = listeA.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println("-----------------------");

		listeA.remove(1);

		Iterator it2 = listeA.iterator();
		while (it2.hasNext())
		{
			System.out.println(it2.next());
		}

		System.out.println("-------------------------");

		listeA.remove(auto);

		Iterator it3 = listeA.iterator();
		while (it3.hasNext())
		{
			System.out.println(it3.next());
		}

		Vector v = new Vector(); // "alte" klasse des collection-frameworks, welche implizit threadsicher ist!

		LinkedList lili = new LinkedList(); // über objektknoten realisierte, doppelt verkettete Liste
		// -> Schreibende und löschende Operationen sind bei LinkedListe performanter
		// als bei ArrayList
		// -> Lesende Zugriffe sind bei ArrayList im Schnitt schneller als bei
		// LinkedList

		// *******************************************************************************************************************

		// Wann sind zwei Objekte gleich?
		Auto a1 = new Auto(100, "Auto");
		Auto a2 = new Auto(100, "Auto");

		Auto neu = a1;

		if (a1.equals(a2))
		{
			System.out.println("gleiche Autos");
		} else
		{
			System.out.println("ungleiche Autos");
		}

		// Collections vom Typ Set
		/*
		 * Eigenschaften:
		 * 
		 * -> Nehmen keine doppelten Objekte auf(inhaltlich gleiche Objekte)
		 * 
		 * -> Ein Set, welches 2 gleiche Objekte hält, gilt als nicht definiert und darf
		 * nicht benutzt werden!
		 * 
		 * -> Einfügereihenfolge entspricht nicht garantiert der Ausgabereihenfolge
		 * 
		 * -> null ist erlaubt
		 * 
		 */

		HashSet hs = new HashSet();
		hs.add(a1);
		hs.add(a2);

		System.out.println("-------------------------");
		Iterator it4 = hs.iterator();
		while (it4.hasNext())
		{
			System.out.println(it4.next());
		}

	}

}
