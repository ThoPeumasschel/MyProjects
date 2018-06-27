package collections;

import java.util.*;

/*
 * 	COLLECTION:
 * 
 * 		-> Datenstruktur, welche Operationen auf eine Menge von Objekten abbildet(Elementsammlung)
 * 
 * 		-> Collections in Java akzeptieren KEINE primitiven Typen, nur Objekte!
 * 
 * 		-> Zun�chsteinmal wird ALLES, was man in einer Collection ablegt, nach Object gecastet
 * 
 * 			-> Vorsicht! -> Typpr�fungen und Typkonvertierungen beim Auslesen erforderlich!
 * 
 * 		-> Grob betrachtet gibt es 4 Gruppen von Collections in Java:
 * 
 * 				1. List
 * 				2. Set
 * 				3. Map
 * 				4. Queue
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
 * 
 * 
 */

@SuppressWarnings("all")
public class Main {

	public static void main(String[] args) 
	{
		//Collections vom Typ List:
		/*
		 * 	Haupteigenschaften von List:
		 * 
		 * 		-> Halten zuasammenh�ngende Objekt-Listen, auf welche sequentiell oder wahlfrei zugegriffen werden kann
		 * 		-> Bieten einen Iterator an
		 * 		-> wachsen und schrumpfen implizit dynamisch beim Einf�gen/Entfernen von Elementen
		 * 		-> Neue Elemente werden implizit hinten an die Liste angeh�ngt
		 * 		-> Neue Elemente k�nnen auch an einer bestimmten Stelle eingef�gt werden
		 * 		-> Verf�gen �ber einen Index
		 * 		
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		ArrayList listeA=new ArrayList(180); //verwaltet seine elemente implizit per Object-Array!
		Auto karre=new Auto(120, "Audi");
		Auto rolli=new Auto(45, "Lada");
		Auto auto=new Auto(120, "Audi");
		
		listeA.add(karre);
		listeA.add(rolli);
		listeA.add(auto);
		
		for(int i=0;i<listeA.size();i++)
		{
			listeA.get(i);
		}
		
		
		//iterator aus arraylist holen:
		Iterator it=listeA.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-----------------------");
		
		
		listeA.remove(1);
		
		Iterator it2=listeA.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
		System.out.println("-------------------------");
		
		listeA.remove(auto);
		
		Iterator it3=listeA.iterator();
		while(it3.hasNext())
		{
			System.out.println(it3.next());
		}
		
		Vector v=new Vector(); //"alte" klasse des collection-frameworks, welche implizit threadsicher ist! 
		
		LinkedList lili=new LinkedList(); //�ber objektknoten realisierte, doppelt verkettete Liste
		//-> Schreibende und l�schende Operationen sind bei LinkedListe performanter als bei ArrayList
		//-> Lesende Zugriffe sind bei ArrayList im Schnitt schneller als bei LinkedList
		
		//*******************************************************************************************************************
		
		//Wann sind zwei Objekte gleich?
		Auto a1=new Auto(100, "Auto");
		Auto a2=new Auto(100, "Auto");
		
		Auto neu=a1;
		
		
		if(a1.equals(a2))
		{
			System.out.println("gleiche Autos");
		}
		else
		{
			System.out.println("ungleiche Autos");
		}
		
		//Collections vom Typ Set
		/*
		 * 	Eigenschaften:
		 * 
		 * 		-> Nehmen keine doppelten Objekte auf(inhaltlich gleiche Objekte)
		 * 
		 * 		-> Ein Set, welches 2 gleiche Objekte h�lt, gilt als nicht definiert und darf nicht benutzt werden!
		 * 
		 * 		-> Einf�gereihenfolge entspricht nicht garantiert der Ausgabereihenfolge
		 * 
		 * 		-> null ist erlaubt
		 * 
		 * 		
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		//REGEL: Ab jetzt sollten ALLE Klassen sowohl die hashCode als auch die equals ordentlich �berschreiben!
		
		HashSet hs=new HashSet();
		hs.add(a1);
		hs.add(a2);
		
		System.out.println("-------------------------");
		Iterator it4=hs.iterator();
		while(it4.hasNext())
		{
			System.out.println(it4.next());
		}
		
		//linkedhashset garantiert, dass die einf�gereihenfolge=ausgabereihenfolge ist(LANGSAMER als HashSet!!!)
		LinkedHashSet linkedSet=new LinkedHashSet();
		
		//dieses Set sortiert alle ihre Objekte nach einer bestimmten Sortierlogik
		TreeSet tSet=new TreeSet();
		
		//brot-objekte, welche auf dem treeset aufsteigend nach gewicht sortiert werden sollen
		Brot baguette=new Brot("Baguette", 200);
		Brot toast=new Brot("Toast", 100);
		Brot dinkelbrot=new Brot("Dinkelbrot", 1200);
		Brot fraenkischesBauernbrot=new Brot("Bauernbrot", 5000);
		Brot vollkorn=new Brot("Vollkorn", 500);
		
		tSet.add(baguette);tSet.add(toast);tSet.add(dinkelbrot);tSet.add(fraenkischesBauernbrot);tSet.add(vollkorn);
		System.out.println("---------------------------------");
		Iterator setIter=tSet.iterator();
		while(setIter.hasNext())
		{
			System.out.println(setIter.next());
		}
		
		//----
		System.out.println("-----------------------------");
		TreeSet tset2=new TreeSet(new BrotSortiererExtern());
		tset2.add(baguette);tset2.add(toast);tset2.add(dinkelbrot);tset2.add(fraenkischesBauernbrot);tset2.add(vollkorn);
		Iterator itcomparator=tset2.iterator();
		while(itcomparator.hasNext())
		{
			System.out.println(itcomparator.next());
		}
		
		//---
		ArrayList brotliste=new ArrayList();
		brotliste.add(baguette);brotliste.add(toast);brotliste.add(dinkelbrot);brotliste.add(fraenkischesBauernbrot);brotliste.add(vollkorn);
		Collections.sort(brotliste, new BrotSortiererExtern()); //sortieren von listen mit der utilityklasse Collections
		
		//*****************************************************************************************************************
		/*
		 * 	Collections vom Typ Map:
		 * 
		 * 		-> Bilden Schl�ssel-Wert-Paare auf einer Datenstruktur ab
		 * 
		 * 		-> Sowohl Schl�ssel, als auch die Werte sind Objekte
		 * 
		 * 		-> Zu einem Schl�ssel gibt es einen zugeh�rigen Wert, oder nicht(Wert kann null sein)
		 * 
		 * 		-> Der Wert, der zu einem Schl�ssel geh�rt, ist austauschbar
		 * 
		 * 		-> Sowohl Wert, als auch Schl�ssel k�nnen null sein(f�r Schl�ssel darf es nat�rlich dann nur ein null geben)
		 * 
		 * 		-> Bietet an sich keinen direkten Iterator an
		 * 
		 * 
		 * 
		 */
		
		HashMap hmap=new HashMap();
		//hinzuf�gen von schl�ssel-wert-paaren:
		hmap.put(toast, new Auto(120, "Kombi"));
		//holen eines wertes �ber einen schl�ssel:
		Object obj=hmap.get(toast);
		//�ber den schl�ssel l�schen:
		hmap.remove(toast);
		
		//den wert direkt in einer map suchen:
		if(hmap.containsValue(vollkorn))
		{
			
		}
		
		//ist ein schl�ssel in der map vorhanden?
		if(hmap.containsKey(toast))
		{
			
		}
		
		//eine map bietet f�r das iterieren 3 sichten an:
		
		//1. Sicht: View auf die Schl�ssel(keySet)
		Iterator itermap=hmap.keySet().iterator();
		while(itermap.hasNext())
		{
			//...
		}
		
		//2. Sicht: View auf die Werte(values)
		Iterator itermap1=hmap.values().iterator();
		while(itermap1.hasNext())
		{
			
		}
		
		Person tobi=new Person();
		tobi.setName("Tobi");
		Person olaf=new Person();
		olaf.setName("Olaf");
		olaf.setTelNummer("01762109867");
		tobi.setTelNummer("02038624628469");
		HashMap kontakte=new HashMap();
		kontakte.put("superHawkLayLover69@gmail.com", tobi);
		kontakte.put("olaf@gmx.de", olaf);
		
		
		//3. Sicht: View auf die Schl�ssel-Wert-Paare(entrySet)
		Iterator itermap2=kontakte.entrySet().iterator();
		while(itermap2.hasNext())
		{
			Map.Entry eintrag=(Map.Entry)itermap2.next();
			System.out.println("Mail: " + eintrag.getKey() + " -> Person: " + eintrag.getValue());
			System.out.println(((Person)eintrag.getValue()).getTelNummer());
		}
	}

}




















