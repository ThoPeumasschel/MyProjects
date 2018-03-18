// Vererbung durch 'extends'
public class PrintSubClass extends PrintClass {
	private int z = 3;

	@Override
	void printMe() {
		super.printMe(); // super ruft Methode aus Oberklasse auf
		System.out.println("Z = " + z);
	}

	

}
