
public class PrintSubSubClass extends PrintSubClass {
	private int u = 4;

	void printMe() {
		super.printMe(); // super ruft Methode aus Oberklasse auf
		System.out.println("U = " + u);
	}

	

	}


