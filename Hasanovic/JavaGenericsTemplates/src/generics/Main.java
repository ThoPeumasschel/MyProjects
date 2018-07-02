package generics;
import java.util.*;
/*
 * 	Generische Programmierung:
 * 
 * 		-> Komplexe Typen lassen sich parametriesieren und auf einen konkreten abstrakten Typen in der Nutzung zur Laufzeit
 * 		   festlegen
 * 
 * 
 * 		-> Alle generischen Angaben sind REINE COMPILERZEIT! Zur Laufzeit werden diese Angaben alle gelöscht!
 * 				-> Die Laufzeit "weiß" also absolut gar nichts über das, was man vorher generisch mit dem Compiler vereinbart hat!
 * 
 * 
 * 
 * 		-> Generische Angaben werden dem Compiler über den sog. Diamond Oprator mitgeteilt <>
 * 
 * 		-> Generics macht in der Praxis Typüberprüfungen und Downcasts überflüssig!
 * 
 * 
 * 
 * 
 * 
 */







public class Main 
{

	public static void main(String[] args) 
	{
		//Regel: Die Parametrisierung eines generischen Roh-Typen ist kovariant!
		// -> Da diese Liste ALLES vom Typ Artikel aufnimmt, nimmt sie auch etwas an, was von Artikel erbt!
		ArrayList<Artikel> bla=new ArrayList<Artikel>(); //hier wird mit dem compiler vereinbart, dass auf die liste nur Artikel kommen
		bla.add(new Artikel());
		//bla.add(new Auto());  -> Compilerfehler!
		bla.add(new Werkzeug());
		
		ArrayList<Object> oList=new ArrayList<Object>();
		
		//Auto<Object> auto=new Auto<Object>(); Auto kann man nicht parametrisieren, das die Klasse kein generischer Typ ist!
		
		Comparable<Artikel> comp=new Artikel();
		
		
		/*	Begriffe der generischen Programmierung:
		 * 
		 * 		Gegeben sei: ArrayList<Artikel> list=new ArrayList<Artikel>();
		 * 
		 * 
		 * 		-> Artikel = Typparameter
		 * 		-> ArrayList = Rohtyp(raw type)
		 * 		-> ArrayList<Artikel> = Ein parametrisierter Typ
		 * 		-> class ArrayList<E> = generischer Typ(generic type)
		 * 		-> E = Formaler Typparameter, Typvariable
		 * 
		 */
		
		//der iterator sollte auch entsprechend paremetrisiert werden!
		Iterator<Artikel> it=bla.iterator();
		while(it.hasNext())
		{
			it.next().getEAN();
		}

		//dieses set akzeptiert nur objekte, welche vom typ Auto sind
		HashSet<Auto> hSet=new HashSet<Auto>();
		//diese map akzeptiert als schlüssel nur Strings und als Wert nur Artikel!
		HashMap<String, Artikel> tabelle=new HashMap<String, Artikel>();
		
		HashMap<Artikel, ArrayList<String>> map2=new HashMap<Artikel, ArrayList<String>>();
		
		//generische parametrisierungen können auch zu schwer lesbarem code führen:
		HashMap<HashMap<ArrayList<Artikel[]>, Object[]>, HashSet<LinkedList<String>>> komplexeMap=new HashMap<>();
		
		
		MyList<Auto> mylist=new MyList<Auto>();
		MyList<Werkzeug> werkzeugListe=new MyList<Werkzeug>();
		//einen generischen typen kann man auch non-generisch nutzen -> dann wird die typvariable in der generischen klasse durch Object ersetzt
		MyList li=new MyList();
		//ein iterator, welcher einen parametrisierten, generischen typen durchlaufen soll, sollte seinerseits AUCH parametrisiert werden!
		Iterator<Auto> autoIt=mylist.iterator();
		while(autoIt.hasNext())
		{
			autoIt.next().fahren();
		}
		
		//Generics und Methodenaufrufe:
		LinkedList<Auto> lili=new LinkedList<Auto>();
		manipuliereCollection(lili);
		
		ArrayList arrayList=new ArrayList();
		manipuliereCollection(arrayList);
		
		
		printAutoListe(lili);
		
		//WILDCARDS:
		
		LinkedList<Werkzeug> werkzeuge=new LinkedList<Werkzeug>();
		LinkedList<Artikel> artikel=new LinkedList<Artikel>();
		testeWerkezuge(werkzeuge);
		//testeWerkezuge(artikel); -> verboten! typen sind inkompatibel
		
		
		//ArrayList<Artikel> li3=new ArrayList<Werkzeug>(); -> verboten! typen sind inkompatibel(-> invariant)
		
		//die referenzvariabe li3 kann auch alles zeigen, was eine ArrayList ist, welche genersich auf Artikel oder seine Untertypen
		//parametrisert wurde(-> kovariant)
		ArrayList<? extends Artikel> li3=new ArrayList<Werkzeug>();
		//li4 darf auf alle ArrayList zeigen, welche generisch auf Werkzeug und seine Supertypen parametreisert wurde(-> kontravariant)
		ArrayList<? super Werkzeug> li4=new ArrayList<Artikel>();
		//li3.add(new Werkzeug()); //BEI TYPEN MIT WILDCARD IST DAS HINZUFÜGEN GRUNDSÄTZLICH VERBOTEN
		List<?> komischeListe;
		
		komischeListe=li3;
		komischeListe=li4;
		//komischeListe.add(new Object());   COMPILERFEHLER!
		
		
		
	}
	
	//REGEL: ALLEIN MIT GENERISCHEN PARAMETERN KANN EINE METHODE NICHT ÜBERLADEN WERDEN!
	
	//methode akzeptiert ALLE MyList, EGAL wie sie parametrisiert wurden!!!
	private static void testeListen3(MyList<?> meineListe)
	{
		//hinzufügen verboten
	}
	
	
	//methode empfängt alle listen, welche generisch auf artikel kovariant parametrsiert wurden
	private static void testeListen(List<? extends Artikel> liste)
	{
		//liste.add(new Werkzeug()); HINZUFÜGEN NICHT ERLAUBT!!!!
	}
	
	
	private static void testeListen2(List<? super Artikel> liste)
	{
		//HINZUFÜGEN VERBOTEN!
	}
	
	
	
	
	private static void testeWerkezuge(List<Werkzeug> liste)
	{
		
	}
	
	
	
	//diese methode empfängt nur listen, welche auf Auto generisch parametrisiert wurden!
	private static void printAutoListe(List<Auto> li)
	{
		//li.add(new Karton()); //hier dürfen nur Autos hunzugefügt werden - ansonsten Compilerfehler!
		li.add(new Auto());
	}
	
	//VORSICHT!!! -> Wenn man einen generisch parametrisierten Typen an eine Methode übergibt, dessen Parameter NICHT auch parametrisert sind,
	//übernimmt der Compiler KEINE Verantwortung mehr für die Einhaltung des generischen Parameters!!!!!
	private static void manipuliereCollection(List liste)
	{
		liste.add(new Karton());
	}
	
	

	
	private static void testCollections(List liste)
	{
		Iterator it=liste.iterator();
		while(it.hasNext())
		{
			Object temp=it.next();
			if(temp instanceof Artikel)
			{
				Artikel artikel=(Artikel)temp;
				
			}
		}
		
	}
	
	
}
