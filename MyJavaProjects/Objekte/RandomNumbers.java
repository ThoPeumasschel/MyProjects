import java.util.*;

public class RandomNumbers {
	
	public static void main(String... args) {

		// Klassenname = benutzerdefinierter Datentyp. 
		Random r1, r2, r3;
		r1 = new Random(); // Objekt erzeugt. 
		System.out.println("Random value 1: " + r1.nextDouble()); 

		r2 = new Random(876543);	//Objekt
		System.out.println("Random value 2: " + r2.nextDouble());

		r3 = new Random();
		int number = (int) (r3.nextDouble() * 50);
		System.out.println("Random Lotto_value 3: " + number);


	}

}

