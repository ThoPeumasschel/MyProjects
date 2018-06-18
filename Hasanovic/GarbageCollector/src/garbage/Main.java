package garbage;
/*
 * 	Der Garbage Collector(GC):
 * 
 * 		-> Programm, welches unter der Konstrolle der VM läuft
 * 		-> Räumt auf dem Heap abholbereite Objekte ab(eligible)
 * 
 * 		-> Wann ist welches Objekt zur Abholung durch den GC bereit?
 * 
 * 			-> Wenn aus keinem Stack der Anwendung einer Referenzvariable mehr auf ein Objekt auf dem Heap verweist, gilt dieses
 *  		   Objekt als eligible!
 *  
 *  
 *  
 *  	- Es ist nicht garantiert, dass ein Objekt, welches eligible geworden ist, auch sofort vom GC abgeholt wird!
 * 		- Es ist nicht garantiert, dass ein Objekt, welches eligible geworden ist, ÜBERHAUPT zur Laufzeit abgeholt wird!
 * 
 * 			-> Der Java-Entwickler hat darauf auch nur sehr bedingt Einfluss
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

	
	private Main ref;
	
	
	public static void main(String[] args) 
	{
		
		System.gc(); //dieser aufruf bittet den GC, den Heap aufzuräumen(keine garantie)
		
		Main m=new Main();
		
		Main nm=m;
		m=null;  //wie viele objekte sind eligible, nachdem diese zeile abgearbeitet wurde? --> keines
		nm=null; //wie viele objekte sind eligible, nachdem diese zeile abgearbeitet wurde? --> eines(das oben erzeugte Main-Objekt)
		
		//-------------------------------------------------------------------------
		Main a=new Main();
		Main b=new Main();
		Main c=new Main();
		
		a.ref=b;
		b.ref=c;
		c.ref=a;
		
		a=null;
		b=null;
		c=null;  //wieviele objekte sind nach dieser zeile abholbereit? -> drei Objekte --> lose Objektinseln werden auch abgeräumt
		
		
		//----------------------------------------------------------------------------------------
		
		
		Main mTest=new Main();
		
		Object g=mTest.testGC(new Object());
	

	}
	
	private Object testGC(Object o)
	{
		Object a=new Object();
		Object b=new Object();
		a=b;
		b=o;
		return a;
				
	} //wie viele objekte sind abholbereit nach dieser zeile?
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
