package lambdas;
import java.nio.file.attribute.AclEntry.Builder;
import java.util.*;
/*
 * 	Lambda-Ausdrücke:
 * 
 * 
 * 		-> Funktionale Programmierung (Lisp ... Haskell)
 * 
 * 			-> ALLES ist Funktion
 * 			-> Funktionen höherer Ordnung kapseln andere Funktionen(-> Formalisieren von Funktionen)
 * 
 * 
 * 		-> Lambda-Ausdrücke gehören zum funktionalen Programmierparadigma
 * 
 * 			-> Konzept:
 * 	
 * 				1. Definiere eine Funktion und sage, was diese TUN soll (Beispiel: Nehme zwei Parameter entgegen und liefere einen boolean)
 * 
 * 				2. Später definiere unterschiedliche Logiken, welche beschreiben, WIE die in 1. definierte Funktion zum Ergebnis kommt
 * 
 * 				3. Die Funktionen aus 1. müssen in funktionalen Interfaces stehen(functional interfaces)
 * 
 * 
 * 		-> Wie definieren in funktionalen Schnittstellen einmal eine Methode, welche beschreibt, WAS getan werden soll -
 * 	       später referenzieren wir immer wieder diese Methode, indem wir mit einer konkreten Logik defineren, WIE die Funktion konkret
 * 			erfüllt werden soll
 * 
 * 
 * 		-> Die Syntax von Lambda-Ausdrücken:
 * 
 * 				(Lambda-Params) -> { Anweisungen }
 * 
 * 			-> Die Lambda-Params:
 * 
 * 				- bestehen aus Typ + Name
 * 				- varargs ist verboten!
 * 
 * 
 * 
 * 		-> In Java ist JEDER Lambda-Ausdruck verknüpft mit einem exisitierenden, funktionalen Interface !!!
 * 
 * 			-> Es gibt schon ältere funkt. Interfaces
 * 
 * 				- Runnable, Comparable...
 * 
 * 
 * 			-> Ab Java 8 sind viele neue funkt. Interfaces im package java.util.function hinzugekommen:
 * 
 * 				- Jedes dieser Interfaces steht für ein Grundkonzept, was geschehen soll -> Aber WIE das dann konkret geschieht, das definieren
 * 				  die Lambda-Ausdrücke
 * 
 * 
 * 				- Einige wichtige:
 * 
 * 					-> Predicate<T> -> liefert einen boolean
 * 					-> Consumer<T> -> liefert void, ideal für Ausgaben
 * 					-> Function<T, R> -> liefert R zurück
 * 					-> Supplier<R> -> liefert ein R: ideal, um ein R zu erzeugen und dann auch zurück zu geben  (Design Pattern Factory)
 * 					-> UnaryOperator<R> -> liefert R: ideal, um den übergebenen Typen zu ändern und verändert zurück zu geben
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






public class Main 
{

	public static void main(String[] args) 
	{
		
		Main m=new Main();
		ArrayList<Brot> bListe=new ArrayList<Brot>();
		bListe.add(new Brot("Schwarzbrot", 1000));
		bListe.add(new Brot("Toast", 100));
		bListe.add(new Brot("Baguette", 250));
		bListe.add(new Brot("Vollkorn", 800));
		bListe.add(new Brot("Dinkel", 680));
		
		//sortierung der brote per anonyme klasse:
		Collections.sort(bListe, new Comparator<Brot>()
				{

					@Override
					public int compare(Brot o1, Brot o2) 
					{
						if(o1.getGewicht()>o2.getGewicht())
						{
							return -1;
						}
						else if(o1.getGewicht()<o2.getGewicht())
						{
							return 1;
						}
						else
						{
							return 0;
						}
					}
			
				});
		
		Iterator<Brot> it=bListe.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		int x=4;
		
		//selbe sortierung per lambda:
		Collections.sort(bListe, (Brot b1, Brot b2) -> {
			if(b1.getGewicht()>b2.getGewicht())
			{
				return -1;
			}
			else if(b1.getGewicht()<b2.getGewicht())
			{
				return 1;
			}
			else
			{
				return 0;
			}
		});
		
		//Zuweisung eines Lambda-Ausdrucks einer Variablen
		Comparator<Brot> cSort = (Brot b1, Brot b2) -> { return b1.getBezeichnung().compareTo(b2.getBezeichnung());  };
		Collections.sort(bListe, cSort);
		
		//Der Compiler kann per Typinferenz in diesem Fall auf die beiden Typen der Parameter schliessen, deshalb muss man sie nicht angeben:
		Comparator<Brot> cSortOhneTypen = (b1, b2) -> { return b1.getBezeichnung().compareTo(b2.getBezeichnung() ); };
		
		//Da die Anweisungsklammern nur einen einzigen Ausdruck haben, kann man auf das return-Statement verzichten -> allerdings DARF man dann 
		//die geschweiften Klamern auch nicht mehr anführen
		Comparator<Brot> cSortOhneReturn = (b1, b2) ->  b1.getBezeichnung().compareTo(b2.getBezeichnung());
		
		Comparator<String> compareString = (s1, s2) -> 0;
		
		//weil die parameterlist nur EINEN parameter enthält, kann die runde klammer dafür wegfallen:
		Comparable<String> zeichenSort = s ->  s.length(); 
		
		//Stream API
		
		//Wenn im Anweisungsteil die einzige Parametervariable eh nicht benutzt wird, kann man auch einfach den Typ der Parametervariable schreiben:
		Comparable<String> sortOhneParam = String -> 0;
		
		//***********************************************************************************************************************
		
		Diskothek pulp=new Diskothek();
		IrishPub greenGoose=new IrishPub();
		
		Gast peter=new Gast(19, "m");
		Gast gisela=new Gast(16, "w");
		
		
		boolean duDarfschstRein=pulp.getTuerSteher().eintrittOK(gisela, g -> g.getAlter()>=21 );
		if(duDarfschstRein)
		{
			System.out.println("Gisela darf rein");
		}
		else
		{
			System.out.println("Gisela darf nicht rein");
		}
		
		//************************************************************************************************************************************
		// Das Konzept der Komposition
		
		// Zeichenkette -> trim -> substring -> toLowerCase -> Ergebnis Zeichenkette 
		
		String text="   Text   ";
		String manipuliert=StringTransformator.transform(text, StringTransformator.komposition(String::trim, s -> s.substring(0, 3), String::toLowerCase));
		System.out.println(manipuliert);
		
		//************************************************************************************************************************************
		// Das Konzept Lazyness
		
		String trans=StringKonfig.of("  WoRT")
				.config(String::toLowerCase)
				.config(String::trim)
				.config(s -> s.replace('o', 'x'))
				.toString();
			
		
		
		
		
	}

}


class Brot
{
	private String bezeichnung;
	private int gewicht;
	
	public Brot(String bez, int gew)
	{
		this.bezeichnung=bez;
		this.gewicht=gew;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	@Override
	public String toString() {
		return "Brot [bezeichnung=" + bezeichnung + ", gewicht=" + gewicht + "]";
	}
	
	
	
	
	
	
	
	
}



















