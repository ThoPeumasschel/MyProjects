package threads;
/*
 * 	Multithreading -> KONKURRIERENDE ZUGRIFFE
 * 
 * 
 * 		-> Problem: Mehrere Thread greifen schreibend/lesend auf denselben Speicherbereich zu!
 * 
 * 
 * 		-> Konsequenz: Bei konkurrierenden Zugriffen muss immer der ensprechende Code threadsicher designt werden!!!
 * 
 * 
 * 		-> Threadsicher(threadsafe) -> Selbst bei konkurrierenden Zugriffen ist der Zustand der Information immer konsistent!
 * 
 * 
 * 		-> Dafür wird in aller Regel ein sogenannter "Monitor" über bestimmte Code-Bereiche gelegt
 * 
 * 			-> Ein Overhead, welcher Threads aussperren kann und auch Informationen darüber hält, welche Threads Interesse
 * 				am Zugriff haben
 * 
 * 			-> Wenn einer der konkurrierenden Threads den Zuschlag bekommt, setzt dieser auf die entsprechenden Speicherbereiche einen
 * 			   "Lock"
 * 
 * 					-> Der Thread "hält" diesen Lock, solange er ihn entweder:
 * 
 * 						1. selbst aufgibt(meistens temporär)
 * 
 * 						2. ihm dieser von Monitor entzogen wird
 * 
 * 			-> Ein Thread kann gleichzeitig auf mehrere Speicherbereiche Locks halten!
 * 
 * 			-> Ein Lock kann nicht zu mehreren Threads gehören!
 * 
 * 
 * 			-> Der Monitor muss für die Threads viele Dinge aktuell und transparent halten:
 * 				
 * 				-> Den Status eines Locks
 * 				-> Den Status eines Speicherbereiches
 * 				-> Den Status von bestimmten non-atomaren Operationen
 * 
 * 
 * 		-> Die Locks von Threads beziehen sich IMMER auf Objekte(niemals auf primitive Variablen selbst)
 * 
 * 		-> Mit Thread.sleep() wird NICHT das Auflösen eines Locks eingeleitet!!! -> Der Thread schläft, hält aber sine Sperre aufrecht!
 * 
 * 		-> Synchronized-Blöcke möglcihst auf kleine Codebereiche ausdehnen!!! -> nur auf die kritischen!
 * 
 * 		-> Wenn in einem synchronized-Bereich eine unbehandelte Exception auftritt, dann gibt der current Thread auch seinen Lock auf!!!
 * 
 * 		-> Threads können sich untereinander Nachrichten schicken:
 * 
 * 			-> Über diese drei Methoden der Klasse Object:
 * 
 *  			-> wait(), notify() und notifyAll()
 *  
 *  		-> Die Methode wait():
 *  
 *  			-> Current Thread wartet nun solange, bis ein notify()- bzw. notifyAll()-Signal eines anderen Threads ankommt
 *  
 *  
 *  		-> Die Methode notify():
 *  
 *  			-> GENAU EIN Thread im Threadpool(hier sitzen alle konkurrierenden Threads und warten auf den Zuschlag) wird benachrichtigt
 *  
 * 				-> notify()
 * 
 * 
 * 					-> nutzen, wenn man weiß, dass alle Threads die gesetzte Bedingung erfüllen(dann ist es egal, welcher von den wartenden als
 * 					   nächstes dran kommt)
 * 
 * 
 * 				-> notifyAll()
 * 
 * 					-> Alle Threads im Pool werden benachrichtigt!!! -> Alle konkurrieren nun darum, wer den Zuschlag erhält
 * 
 * 							-> Das kann allerdings nur ein Thread sein, der auch die Bedingung erfüllt!
 * 					
 * 					-> nutzen, wenn man weiß, dass nur einer der warteden Threads die gesetzte Bedingung erfüllt - dann werden diese
 * 					   solange konkurrieren, bis derjenige an die Reihe kommt, welcher die Bedingung erfüllt
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

	//volatile sorgt dafür, dass der wert der variablen für alle threads stets transparent ist
	// 1. mechanismus: sobald ein thread schreibt, muss er sofort einen flush ausführen -> der minipulierte wert kommt sofort in den 
	//    hauptspeicher
	// 2. mechanismus: wenn es die wahl gibt, zwischen 2 threads - der eine will lesen, der andere schreiben - dann erfolgt auf eine
	///   volatile variable immer erst der schreibende und danach der lesende zugriff!
	
	//---> ABER: das funktioniert nur dann, solange es nur EINEN schreibenden thread gibt und beliebig viele lesende!
	// -> in der praxis: IMMER, wenn es mehrere schreibende threads gibt --> besser synchronized nutzen!
	
	private volatile int zahl;
	private String text;
	
	public static void main(String[] args) 
	{
		/*Auto auto=new Auto();
		
		auto.fahre(); //hier wird de fahren-logik auf diesen thread einfach geladen
		auto.fahrenAsync(); //-> auto fährt auf einem separaten thread
		*/
		/*
		new Thread(new Zaehler(), "Z1").start();
		new Thread(new Zaehler(), "Z2").start();
		new Thread(new Zaehler(), "Z3").start();
		new Thread(new Zaehler(), "Z4").start();
		new Thread(new Zaehler(), "Z5").start();
		*/
		//konkurrierende zugriffe
		/*Zaehler z=new Zaehler();
		new Thread(z, "Z1").start();
		new Thread(z, "Z2").start();
		new Thread(z, "Z3").start();
		*/
		
		new Thread(new Mann("Olaf")).start();
		new Thread(new Frau("Petra")).start();
		
	}

	
	public void macheA()
	{
		synchronized(Main.class)
		{
			synchronized (text) 
			{
				
			}
		}
	}
	
	public void macheB()
	{
		synchronized(text) 
		{
			synchronized(Main.class)
			{
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
