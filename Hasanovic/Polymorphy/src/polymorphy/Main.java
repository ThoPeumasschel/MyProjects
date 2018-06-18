package polymorphy;

/*
 * 	Was passiert schrittweise, bei der Instanziierung eines Objektes in Java?
 * 
 * 		1. Die Attribute(Instanzvariablen) der Klasse werden ausgelesen, deren Konstruktor beim Instanziierungsaufruf aufgerufen wurde
 * 
 * 		2. Diese Attribute werden mit adäquaten Defaultwerten initialisiert(für primitive 0, für komplexe null)
 * 
 * 		3. Der konkret aufgerufene Konstruktor wird nun auf den Stack geladen und abgearbeitet
 * 
 * 		4. Aufgrund der Konstruktorverkettung wird dort als erstes per super ein entsprechender Konstruktor der Superklasse 
 * 		   aufgerufen
 * 
 * 		5. Nun werden alle aufgerufenen Konstruktoren auf dem Stack von oben nach unten abgearbeitet
 * 
 * 		6. Nun werden alle Anweisugen der Konstruktoren ausgeführt, die Attribute überschrieben, und letztlich das fertige
 * 		   Objekt auf den Heap geladen - die genannte Referenzvariable speichert nun die Adresse des fertigen Objekts
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

/*
 * 	POLYMORPHIE:
 * 
 * 
 * 		-> Der einmal gesetzte Typ einer Referenzvariablen kann sich NICHT MEHR ÄNDERN!!!!
 * 
 * 		-> Etwas Allgemeines(Supertyp) kann sich grundsätzlich nicht genauso verhalten, wie etwas Spezielles(Unterklassen) !!
 * 
 * 		-> Etwas Spezielles kann sich ohne weiteres so verhalten, wie das Allgemeine
 * 
 * 				-> Konsequenz: Ein Upcast vom Speziellen zum Allgemeinen wird immer problemlos gelingen
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
	
	
	private int zahl;
	private String text;

	public Main()
	{
		super(); // aufruf des parameterlosen superkonstruktors
		zahl=12;
		
	}
	
	
	
	public static void main(String[] args) {
		Main m=new Main();
		Lebewesen l=new Lebewesen(null);
		Fisch f=new Fisch();
		l=f;  //-> Eine Referenzvariable kann auf alles zeigen, was vom eigenen Typ ist oder von einem Untertypen!
			  //-> HIER FINDET EIN IMPLIZITER UPCAST STATT !!!!
		
		//lese: "Eine Referenzvariable lebe, vom Typ Lebewesen, welche auf ein konkretes Fisch-Objekt(auf dem Heap) zeigt"
		Lebewesen lebe=new Fisch(); //Das Fisch-Objekt wird hier auch aus der Perspektive von Lebewesen betrachtet! -> impliziter Upcast
		lebe.wachsen(); // -> es wird IMMER die überschriebene Variante einer Methode bevorzugt!!!!
		
		//Ein Upcast ist nichts anderes, als eine kontravariante Typkonvertierung
		Fisch hai=new Fisch();
		Lebewesen lungenAtmer=new Lebewesen(null);
		
		//-> Ein Downcast wird niemals implizit vom Compiler durchgeführt
		//hai=(Fisch)lungenAtmer; //-> EXPLIZITER DOWNCAST
			// --> Dieser Cast wird der Compiler akzeptieren(weil explizit) - ABER: Die Laufzeitumgebung wird mit einer ClassCastException
			// aussteigen!
		
		
		hai=(Fisch)lebe; //-> Dieser Downcast wird gelingen, weil hinter "lebe" immer noch ein konkretes Fisch-Objekt steckt....mit anderen
						 //Worten: Weil vorher ein Upcast von Fisch zu Lebewesen stattfand, kann nun wieder in einen Fisch zurück
						 //konvertiert werden(Downcast) !!!
		
		hai.getAnzFlossen(); //nun sind alle speziellen Fisch-Methoden auch wieder aufrufbar
		
		
		
		Lebewesen lebeWeiter=new Fisch(); //Man nennt so eine Variable, wie lebeWeiter, eine "polymorphe" Variable !
		Object o=lebeWeiter;
		
		((Fisch)lebeWeiter).blubbern(); //Downcast + spezieller Methodenaufruf
		
		
		
		
		
		Lebewesen[] arr=new Lebewesen[2];
		arr[0]=new Lebewesen(null);
		arr[1]=f; //hier wird der fisch "upgecastet" zu lebewesen!
		m.checkLebewesen(arr);
		
	}
	
	
	private static void ausgabeLebewesen(Lebewesen lebewesen)
	{
		
		lebewesen.getGattung();
		
		if(lebewesen instanceof Fisch)
		{
			Fisch fisch=(Fisch)lebewesen;
			fisch.blubbern();
		}
	}
	
	
	private void checkLebewesen(Lebewesen[] lebewesenArr)
	{
		System.out.println("---------------------------------------");
		for(int i=0; i< lebewesenArr.length;i++)
		{
			lebewesenArr[i].wachsen();
		}
		
		
		
	}
	
	
	
	
	
	public void testeLebewesen(Lebewesen l)
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
