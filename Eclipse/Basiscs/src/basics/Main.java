package basics;

public class Main 
{

	//Attribute/Member der Klasse
	
	int wert; //Sichtbarkeit: default
	private static int var; //Klassenvariable(static) --> ist bereits im Speicher, bevor irgendeine Instanz der zugehörigen Klasse existiert!
	private String name; //Instanzvariable
	private final int[] arr;
	
	public Main()
	{
		arr=new int[12];
	}
	
	
	//Startmethode -> Klassenmethode
	public static void main(String[] args) 
	{
		Main m=new Main();
		m.wert=12; //m ist eine Referenzvariable ->> Speichern die Adresse(Heap), unter welcher man dieses Objekt ansprechen kann
		Main neu=new Main();
		neu.wert=20; //neu ist eine Referenzvariable
		m.var=2;
		
		
		Auto.typ="Kombi"; //--> Zugriff auf statische Klassenvariablen können DIREKT über den Klassennamen erfolgen(OHNE INSTANZIIERUNG)
		Auto.bremsen(); //--> für Methoden auch
		
		Auto karre=new Auto();
		karre.bremsen();
		
		//addiere(2,4); --> Aus einem static-Kontext kann man DIREKT nur auf static-Elemente zugreifen!
		neu.arr[1]=12;
		int[] lokalArr=new int[12];
		
		
		
		//CALL BY VALUE:
		
		int x=5; //die 5 hier nennt man "Literal"
		Main testMain=new Main(); //Adresse: ABCDE
		testMain.name="testMain";
		
		testByVal(x); // AN DIESE METHODE WURDE EINE WERTEKOPIE DER 5, WELCHE IN x GESPEICHERT IST, ÜBERGEBEN!!!! --> Call by Value
		System.out.println("Mein x ist: " + x);
		
		testByValString(testMain);
		System.out.println("Mein name ist: " + testMain.name);
		
		
	}

	private static void testByVal(int x)
	{
		x*=10;
	}
	
	private static void testByValString(Main m)
	{
		m.name="Peter";
		m=new Main();
		m.name="Otto";
	}
	
	
	//Klassenmethode
	private static void methodeA()
	{
		
	}
	
	//diese methode existiert erst im speicher, wenn es eine instanz von Main gibt!
	private int addiere(int a, int b)
	{
		return a+b;
	}
	
	
	private Main testMain(Main m)
	{
		return null;
	}
	
	
	
	
	
}


/*
	-> Der Scope einer Klasse/Methode/Schleifen/Verzweigungen...beschreibt den Gültigkeitsbereich(begrenzt durch geschweifte Klammern)
	-> Methodenrumpf umfasst den Code, welcher sich in dem Scope der Methode befindet
	-> Sichtbarkeitsmodifikatoren:
	
		- private
			-> Element ist nur innerhalb der Klasse selbst sichtbar! In Unterklasse auch nicht sichtbar!
		
		
		- public
			-> Grundsätzlich überall sichtbar
		
		- protected
			-> Element ist paketweit sichtbar(also in allen Klassen, welche sich im selben Paket befinden)
				-> In Unterklassen, welche sich in anderen Paketen befinden, als deren Superklasse, sind protected-Elemente sichtbar!
		
		
		- default
			-> Element ist paketweit sichtbar(also in allen Klassen, welche sich im selben Paket befinden)
				-> In Unterklassen, welche sich in anderen Paketen befinden, als deren Superklasse, sind default-Elemente nicht sichtbar!
			
		
	-> Zugriffsmodifikatoren:
	
		- static
			-> Elemente sind gebunden an die Existenz der zugehörigen Klasse(und NICHT an deren Objekte, welche später erzeugt werden!)
				-> Existieren also bereits EINMALIG im Speicher, bevor irgendeine Instanz der Klasse explizit erzeugt wird
				
				
			-> Zugriff auf static-Elemente kann erfolgen:
			
				1. Über den Klassennamen ---> Klassenname.element
				2. Über eine Referenzvariable ---> referenzvariable.element
		
			-> static wird für das Definieren von Konstanten genutzt:
			
				static final int STEUERSATZ = 25;
		
		
		- final
			
			-> Wenn eine Variable final ist:
			
				-> bei primitiven:
					-> Der beim Init zugewiesene Wert kann nicht mehr geändert werden
					
				-> bei komplexen(Referenzen):
					-> Das Objekt, auf welches die Referenz verweise, kann ausgelesen und verändert werden!
					-> ABER: Die final Referenzvariable darf nach dem Init NICHT MEHR AUF EIN ANDERES OBJEKT VERWEISEN!
				
				-> bei Variablen, welche Attribute sind:
					-> müssen SPÄTESTENS in Konstruktor initialisiert werden!
				
			-> Wenn eine Methode final ist:
			
				-> Methode kann nicht überschrieben werden!
				
				
			-> Wenn eine Klasse final ist:
			
				-> Die Klasse kann nicht erweitert werden(sie kann nicht vererben)
		
		- abtract
		
			
		
		
		-> REGEL: Java übergibt ALLE Werte an Methoden per "Call by Value" / ByVal
		
		
		
		

			


*/