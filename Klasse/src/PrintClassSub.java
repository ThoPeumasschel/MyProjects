
public class PrintClassSub extends PrintClass {
	private int v = 10;
	private int w = 20;
	
	void printMe() {
		super.printMe();
		System.out.println("V = " + v);
		System.out.println("W = " + w);
	
	
	}
	
}
