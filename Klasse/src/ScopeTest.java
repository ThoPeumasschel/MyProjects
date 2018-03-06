
public class ScopeTest {
	int test = 10;		// globale Variable
	
	void printTest() {
		int test = 20;
		System.out.println("test lokal = " + test);
		System.out.println("test global = " + this.test);
	}
	
	public static void main (String...args) {
		
		ScopeTest st = new ScopeTest();
		st.printTest();
		System.out.println("test global = " + st.test);
		
		
	}
}

// das ganze Programm ist eine Klasse, über eine Instanz der Klasse (Objekt) 
// kann man auf alle Attribute und Funktionen zugreifen. 