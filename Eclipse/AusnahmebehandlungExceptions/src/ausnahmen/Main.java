package ausnahmen;
/*
 * 	Ausnahmen / Ausnahmebehandlung
 * 
 * 
 * 		-> Was ist eine Ausnahme?
 * 
 * 			- Es ist eine Situation zur Laufzeit, welche eine Unterbrechung der Befehls-Abarbeitung an aktueller Stelle erfordert,
 * 			  so dass mit einem alternativen Codestrang das Problem behandelt wird und danach wieder die urspr�ngliche Abarbeitung
 * 			  fortgesetzt wird
 * 
 * 		-> Die Ausnahmebehandlung ist ein Werkzeug f�r Entwickler, genau an dieser Stelle steuernd und entscheidend anzusetzen
 * 
 * 
 * 		-> Ziel: Kontrollierte, strukturierte und im Code sichtbar manifestierte Behandlung von Ausnahmen
 * 
 * 
 * 		-> F�r welche (potenzielle)Probleme setzt man Ausnahmebehandlung ein?
 * 
 * 			-> Behandelt werden Code-Abschnitte, von denen man ausgehen kann, dass dort zur Laufzeit bestimmte Probleme auftreten
 * 
 * 				-> I/O-Zugriffe, I/O-Operationen
 * 				-> Datenbankzugriffe
 * 				-> Typkonvertierungen
 * 				-> Multithreading
 * 				-> Arithmetische Operationen
 * 				-> Zugriff auf Indizes und Datenstrukturen
 * 				
 * 
 * 		-> Es gibt in der Klassenstruktur der Java-Exceptionklasse solche, welche gepr�ft werden(checked exceptions) und solche, welche
 * 		   nicht gepr�ft werden(unchecked) 
 * 	
 * 				-> In Java sind alle Exceptions, welche NICHT von der Klasse RuntimeException erben, checked-Exceptions !!!
 * 
 * 				-> Eine RuntimeExcpetion KANN der Javaentwickler behandeln, MUSS er aber nicht!
 * 
 * 
 * 		-> Im try-Block steht NUR derjenige Code, von dem der Entwickler annimmt, dass er Probleme verursachen k�nnte!
 * 
 * 		-> Wenn an einer Stelle im try-Block eine Ausnahme auftritt, WIRD DER REST-CODE IM TRY-BLOCK NICHT MEHR AUSGEF�HRT!
 * 
 * 		
 * 
 * 		-> Regel: "catch-or-throw":
 * 
 * 				-> Wenn ein Aufrufer eine Methode nutzt, welche in ihrer Signatur kommuniziert, dass sie ein Ausnahme wirft, dann
 * 				gibt es f�r den Aufrufer zwei M�glichkeiten:
 * 
 * 					1. Der Aufruf dieser Methode steht in einem try-catch
 * 					2. Der Aufrufer wirft seinerseits diese Ausnahme weiter
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
 * 
 */
public class Main {

	public static void main(String[] args) //throws Exception
	{
		
		Main m=new Main();
		int zahl=0;
		SpezialMain sm=new SpezialMain();
		//sm.testeAusnahmen();
		
		
		
		try
		{
			sm=(SpezialMain)m;
			int ergebnis=12/zahl;
			
			System.out.println("Ergebnis ist: " + ergebnis);
		}
		
		catch(ArithmeticException e)
		{
			//Was sollte in so einem catch-Block stehen?
			// -> Angemessene Fehlermeldungen und Anweisungen
			// -> Fehler-Log f�hren/erstellen
			// -> Zus�tzliche, spezifische Infos zum entstandenen Problem sammeln
			System.out.println("Eine Ausnahme ist zur Laufzeit bei der Berechnung aufgetreten: " + e.getMessage());
		}
		catch(ClassCastException e)
		{
			System.out.println("Die Typkonvertierung ist gescheitert");
		}
		catch(Exception e)
		{
			System.out.println("Ein allgemeiner Fehler ist aufgetreten...das Programm hat folgendes Problem entdeckt: " + e.getMessage());
		}
		
		System.out.println("Hier ist noch Code nach dem Try-Block....");
		
		try
		{
			Thread.sleep(3);
		}
		catch(InterruptedException e)
		{
			//verschlucken von problemen --> GANZ SCHLECHTER STIL!!!!
		}
		
		
		
		try
		{
			//macheEtwas();
			
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			//hier k�nnen abschliessende aufr�umarbeiten durchgef�hrt werden, wenn eine ausnahme aufgetreten ist....
			// was kann man hier machen?
			
			//-> I/O-Streams sauber beenden, Datenbankverbindungen ordentlich abschliessen, Datenm�ll beseitigen....
			
			
			//Wann wird ein finally-Block eigentlich betreten?
			// -> Antwort -> (fast) immer!
			// -> Wenn eine Ausnahme auftritt im try
			// -> Wenn keine Ausnahme aufttritt im try
			// -> Wenn eine Ausnahme im try auftritt und lokal nicht behandelt wird
		}
		
		
		//wenn an einen try sich kein catch direkt anschliesst, MUSS dann ein finally folgen!
		try
		{
			
		}
		finally
		{
			
		}
		
		try {
			macheEtwas();
		}
		catch(Exception e)
		{
			System.out.println("Exception-Behandlung beim Aufrufer von macheEtwas()");
		}
		

	}
	
	//diese methode kann unter umst�nden etwas vom typ ArrayIndexOutOfBoundsException oder eine ClassCastException werfen(an den Aufrufer)
	private static void macheEtwas() throws ArrayIndexOutOfBoundsException, ClassCastException
	{
		try
		{
			int[] array=new int[5];
			int zahl=0;
			for(int i=0;i<2;i++)
			{
				zahl=array[i];
			}
			
			try
			{
				for(int i=0;i<50;i++)
				{
					zahl=array[i];
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Ein Konvertierungfehler im inneren try");
			}
			finally
			{
				System.out.println("Finally im inneren try");
			}
			System.out.println("Hier gehts weiter nach dem inneren try....");
			
		}
		catch(Exception e)
		{
			System.out.println("Allgemeiner Fehler im �usseren catch behandelt....");
		}
		finally
		{
			System.out.println("Das finally des �usseren try wurde ausgef�hrt.....");
		}
		
	}
	
	
	public static void wirftException()
	{
		throw new ClassCastException("Sinnloses Werfen einer unn�tzen Ausnahme...");
	}
	
	
	public void testeAusnahmen() throws Exception
	{
		
	}
	

}


class SpezialMain extends Main
{
	
	/*
	 *  1. Wenn in der Supermethode eine throws-Anweisung steht, dann KANN beim �berschreiben diese ber�cksichtigt werden, MUSS aber nicht!
	 *  	(wird NICHT automatisch in der �berschriebenen Variante �bernommen)
	 * 
	 * 	2. Die �berschriebene Variante darf, wenn sie selbst auch die throws-Anweisung setzt, nur solche Exceptions werfen, welche
	 * 	   mit denen aus der super-throws-Anweisung kovariant-kompatibel sind!
	 * 
	 */
	
	
	/**
	 * 
	 * Methode wirft unter gegebenen Umst�nden folgende Ausnahmen:
	 * @throws ClassCastException, ArithmeticException
	 * 
	 * 
	 */
	@Override
	public void testeAusnahmen() throws ClassCastException, ArithmeticException, MeineEigeneException
	{
		throw new MeineEigeneException("Fehler bla bla bla");
	}
}





