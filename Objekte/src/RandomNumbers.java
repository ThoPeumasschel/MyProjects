import java.util.*;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Klassenname = benutzerdefinierter Datentyp
		Random r1, r2, r3;
		r1 = new Random();	// Objekt
		System.out.println("Random value 1: " + r1.nextDouble());
		
		r2 = new Random(8675309);	// Objekt
		System.out.println("Random value 2: " + r2.nextDouble());
		
		r3 = new Random();
		int number = (int) (r3.nextDouble() * 12);
		System.out.println("Random value 3: " + number);
	}

}
