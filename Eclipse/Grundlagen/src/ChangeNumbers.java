
public class ChangeNumbers {
	
	// Funktionskopf oder Prototyp: void change(int n1, int n2)
	// Signatur: change(int n1, int n2)
	static void change(int n1, int n2)
	{
		System.out.println("Ausgabe 1: Zahl 1: " + n1 + " - Zahl 2: " + n2);
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("Ausgabe 2: Zahl 1: " + n1 + " - Zahl 2: " + n2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 1234;
		int n2 = 5678;
		change(n1, n2);
		System.out.println("Ausgabe 3: Zahl 1: " + n1 + " - Zahl 2: " + n2);
	}

}
