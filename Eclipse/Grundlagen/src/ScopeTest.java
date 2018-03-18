
public class ScopeTest {
	static int test = 10;		// globale Variable
	
	static void printTest()
	{
		int test = 20;		// lokale Variable
		System.out.println("test lokal = " + test);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTest();
		System.out.println("test global = " + test);
	}

}
