package threads;
/*
 * 	MULTITHREADING:	
 * 
 * 
 * 
 * 		-> Was ist ein Prozess?
 * 
 * 			-> Ein Programm liegt in aller Regel compiliert, vorkompiliert, als Zwischenkompilat in Form von Dateien vor
 * 
 * 			-> Ein Prozess ist ein Programm, welches zur Laufzeit unter der Kontrolle eines OS abgearbeitet wird
 * 
 * 			-> Die Laufzeitumgebung ist die Summer aller Umgebungsparameter, welche das Programm ben�tigt, um abgearbeitet werden
 * 			   zu k�nnen (genug RAM, I/O-Ressourcen...die n�tigen Rechte...)
 * 
 * 			-> Jedes OS hat eine Prozessteuerung -> Prozesse werden schlafen gelegt geweckt, beendet, erhalten Ressorcen und
 * 			   CPU-Zeit usw....
 * 
 * 
 * 			-> Prozesse teilen sich normalerweise keine gemeinsamen Ressourcen(Ausnahmen: IPC)
 * 
 * 			
 * 		-> Was ist ein Thread?
 * 
 * 			-> Ein Code-Ablaufstrang innerhalb eines Prozesses
 * 					-> In einem Prozess kann es mehrere parallele Codestr�nge geben
 * 
 * 
 * 			-> Threads teilen sich alle dem zugeh�rigen Prozess zugewiesenen Ressourcen
 * 
 * 
 * 			-> Jeder Thread l�uft auf einem separaten, eigenen Stack
 * 			
 * 
 * 			-> In Java:
 * 
 * 				-> JEDES Java-Programm l�uft in mindestens einem Thread(dem Thread 'main')
 * 
 * 
 * 			-> Threads realisieren nebenl�ufigen Code
 * 
 * 
 * 			-> Starten eigener Threads in Java:
 * 
 * 				1. �ber die Klasse Thread
 * 				2. �ber das Interface Runnable
 * 
 * 
 * 		-> Wir k�nnen einen Thread �ber eine Instanz der Klasse Thread erzeugen, indem wir diesem Thread-Objekt ein Runnable �bergeben
 * 
 * 		-> Wir k�nnen ein Runnable erzeugen(direkt �ber das Interface) und dieses mit einer lebendigen Thread-Instanz arbeiten lassen
 * 
 * 
 * 		-> Wichtige Methoden:
 * 
 * 
 * 			-> Die Methode start()
 * 
 * 				- Initialisiert implizit einen neuen Thread - dieser Thread wird der Ausf�hrungskontrolle der JVM �bergeben
 * 
 * 				- Ohne die start() aufzurufen, kann es keinen neuen Thread geben!
 * 
 * 
 * 			-> Die Methode run()
 * 
 * 				- In dieser Methode steht derjenige Code, welcher parallel in einem separaten Stack(Thread) abgearbeitet werden soll!
 * 
 * 
 * 			-> Wenn ein Entwickler in seinem Programm mehrere Threads initialisiert, dann hat der Entwickler KEINE Gewissheit dar�ber,
 * 
 * 					1. Wann welcher von diesen Threads starten wird(wann wird die run() abgerabeitet?)
 * 					2. Wann welcher Thread mit der Abarbeitung der run() aufh�rt, weitermacht oder komplett zu Ende laufen wird!!
 * 
 * 
 * 
 * 			-> Zust�nde von Threads:
 * 
 * 				- "new" -> Hier liegt lediglich eine neue Instanz der Klasse Thread auf dem Heap
 * 
 * 				- "runnable" -> Wenn in diesem neuen Thread die start() aufgerufen wird -> THREAD L�UFT NICHT UNBEDINGT SOFORT LOS!!!!
 * 
 * 				- "running" -> Der Code in der run() von diesem Thread wird aktuelle abgearbeitet
 * 
 * 				- "blocked"/"waiting"/"sleeping" -> Thread h�rt tempor�r mit der Abarbeitung der run() auf und wartet auf ein Signal, um
 * 					genau dort weiter zu machen, wo er in der run() aufgeh�rt hat!
 * 
 * 				- "dead"/"terminated" -> Thread lebt nicht mehr(normalerweise passiert das, wenn das Ende der run() erreicht wurde)
 * 
 * 
 * 
 * 			-> Wann wird ein Thread beendet?
 * 
 * 				1. Wenn die Laufzeit mit System.exit() beendet wird
 * 
 * 				2. Wenn die run() komplett abgearbeitet wurde
 * 
 * 				3. Wenn in der run() eine Exception geworfen und nicht behandelt wird(auch nicht vom Aufrufer)
 * 
 * 
 * 
 * 			-> Ein Java-Programm endet, wenn alle seine Threads abgearbeitet sind
 * 
 * 
 * 
 * 
 * 
 */
public class Main {

	public static void main(String[] args) 
	{
		//Thread a=new Thread(new MyThread("TestThread"));
		//a.start(); //per aufruf dieser methode wird eine implizite erzeugung eines neuen thread angestossen
		//a.start(); //REGEL: Einen bereits gestarteten Thread darf man nicht nochmal starten -> Laufzeitfehler!
		//a.run(); //dieser aufruf sorgt NICHT daf�r, dass diese run() auf einem separaten Thread abgearbeitet wird(normaler aufruf einer Methode)
		/*int zahl=0;
		while(zahl<6)
		{
			System.out.println("Wert von zahl in Thread main: " + zahl);
			zahl++;
		}*/
		//hier werden 4 threads gestartet, jeder dieser threads erh�lt einen stack, und auf diesem stack jeweils eine kopie der methode run()
		MyThread my1=new MyThread("MT1");
		MyThread my2=new MyThread("MT2");
		MyThread my3=new MyThread("MT3");
		MyThread my4=new MyThread("MT4");
		my1.start();my2.start();my3.start();my4.start();
		
		//wenn man von klasse, welche Runnable implementieren Threads starten m�chte, muss man IMMER �ber eine lebendige Instanz der Klasse
		//Thread gehen(-> Nur die Klasse Thread hat die start/()-Methode, in dem Interface Runnable befindet sich nur die run())
		MySpezialThread szThread=new MySpezialThread();
		new Thread(szThread).start();
		
		Thread schnellThread=new Thread()
		{
			@Override
			public void run()
			{
				//dieser code soll parallel ablaufen...
				
				
				
			}
			
			
		};
		schnellThread.start();
		
		//hier wird eine Instanz von Thread erzeugt und an den Konstruktor ein anonymer Implementierer(anonyme Klasse) von Runnable �bergeben 
		new Thread(new Runnable() {
			@Override
			public void run()
			{
				//paralleler code....
			}
		}).start();
		
		
		//****************************************************************************
		Thread.yield(); //Der aktuelle Thread(current thread) kann unter Umst�nden seine CPU-zeitscheibe tempor�r an eine anderen Thread
					   //abgeben(wom�glich an einen h�her priorisierten) ---> ES GIBT KEINE GARANTIE!!!!
		
		
		
		
		
		try 
		{
			my1.join();
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //hier wartet der Thread "main" solange mit weiterer Abarbeitung, bis der Thread my1 seine run() beendet hat
		
		
		//Ausflug: Dead Locks:
		/*
		 * 	1. Thread A wartet auf ein Ergebnis von Thread B, um dann weiter zu machen
		 *  2. Thread B, wartet auf ein Ergebnis von Thread A, um weiter zu machen
		 *  
		 *  
		 * 	-> Die beiden Threads A und B geraten nun in eine sogenannte Verklemmung(dead lock)
		 * 
		 * 			-> Beide Threads warten auf den jeweils anderen in gegenseitiger Abh�ngigkeit!
		 */
		
		
		
		
		
		
		
		
		
		
			
	}

}
