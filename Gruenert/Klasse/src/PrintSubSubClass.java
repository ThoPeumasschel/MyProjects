
public class PrintSubSubClass extends PrintSubClass {
	private int u = 4;

	@Override
	void printMe() {
		super.printMe(); // super ruft Methode aus Oberklasse auf
		System.out.println("U = " + u);
	}

	

	}


