
public class Program {

	static int zahl;
	int zahl2;
	
	public static void main(String[] args) {
		
		Program p = new Program();
		p.testMethode();
		System.out.println( p.zahl2 );
		
		Program.testMethode();
		testMethode();
		
		System.out.println(zahl);
		
		
		Test t = new Test();
		t.testMethode();
		
		
		int i = 100;
		double d = 99.99;
		byte b = 20;
		int berechnung = (int)testMethode(i, b);
		System.out.println(berechnung);
		
		testMethode(i, b);
	}
	
	// überladene Methoden, müssen sich unterscheiden in der Parameterliste, Anzahl und/oder datentyp 
	static int testMethode(){
		System.out.println("nothing");
		return 0;
	}
	
	
	static int testMethode(int x, int y){
		System.out.println("int, int");
		return 0;
	}
	
	
	static double testMethode(int x, byte y){
		System.out.println("int, byte");
		return x + y;
	}
	
	static double testMethode(int x, byte y, int z){
		System.out.println("int, byte");
		return x + y;
	}
	
	static int testMethode(int x, double y){
		System.out.println("int, double");
		return 0;
	}

	static int testMethode(double x, int y){
		System.out.println("double, int");
		return 0;
	}
	
	

}
