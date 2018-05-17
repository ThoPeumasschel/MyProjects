import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Eingabe einer Zahl zur Berechnung des Vielfachen von 10: ");
		Scanner sca = new Scanner(System.in);
		int eingabe = sca.nextInt();
		if(eingabe % 10 == 0)
			System.out.println("für die Zahl " + eingabe + " aufgerundet auf nächste Vielfache von 10: " + (eingabe + 10) );
		else
			System.out.println("für die Zahl " + eingabe + " aufgerundet auf nächste Vielfache von 10: " + ( (eingabe+9) - ((eingabe + 9)%10)) );
	}
}
