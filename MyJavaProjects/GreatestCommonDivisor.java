import java.util.Scanner;

public class GreatestCommonDivisor {

		static int c = 0;
		static int erg = 0;	
		static Scanner sc = new Scanner(System.in); // Hier wird ein statisches Objekt der 
													// Scanner-Klasse erzeugt, das ich dann mit 
													// der 'nextInt'-Methode aufrufen kann. 
	static int doEuklid(int a, int b) {

//		if (a < b)			// um sicherzustellen, dass immer die 
							// größere Zahl durch die kleinere geteilt wird.  
//		{	c = b;	b = a;	a = c;	} // Zum vertauschen wird a in b gespeichert und umgekehrt. 
//	So wie es aussieht, braucht man das aber nicht zu tun!!
			c = a % b;		// jetzt geht's eigentlich erst richtig los. Modulo! 
		
			while (c!=0) 	// läuft bis kein Rest mehr da ist. 
			{	a = b;	b = c;	c = a % b;	}
	 		return b;		// gibt den vorletzten Wert aus. Der letzte ist ja '0'...
	}

	static int rekursivEuklid(int a, int b) { // wollte mal sehen, ob das Ganze auch 
											  // rekursiv zu machen ist. 
			c = a % b;						  // im Prinzip das gleiche...
		if (c != 0) {						  // nur jetzt nur 'if'. 
			a = b; b = c; 
		
			return rekursivEuklid(a, b);	  // Funktion ruft sich selber auf...
		}									  // ... bis c=0...  
		else { 
			return b;						  // ... und gibt 'b' zurück. 
		}
	}

	public static void main(String...args) {

		System.out.print("\nIch kann dir den groessten gemeinsamen Teiler " + 
			"von zwei beliebigen Zahlen berechnen. " + "\nLos geht's, gib die erste Zahl ein: ");
		int x = sc.nextInt();
		System.out.print("Ok, und jetzt die zweite Zahl: ");
		int y = sc.nextInt();
		System.out.println("\n\tDas kommt davon, wenn man eine 'while-Schleife' benutzt: "); 
		
		erg = doEuklid(x, y); // Der erste Methodenaufruf
		
		System.out.println("Der groesste gemeinsame Teiler von " + x + " und " + y +
			" ist " + erg + ".");
	
		System.out.println("\n\tWie man gleich sieht, kommt bei der rekursiven Methode " 
								+ "genau dasselbe heraus: "); 
		
		erg = rekursivEuklid(x, y);	// Der zweite Methodenaufruf. 
		
		System.out.println("Der groesste gemeinsame Teiler von " + x + " und " + y +
			" ist " + erg + ".");
		System.out.println();
	}
}
