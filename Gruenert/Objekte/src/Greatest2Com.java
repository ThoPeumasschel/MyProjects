

import java.util.Scanner;

public class Greatest2Com {
		
		static int zaehler = 0;
		static int c = 0;
		static int erg = 0;	
		static Scanner sc = new Scanner(System.in); // Hier wird ein statisches Objekt der 
													// Scanner-Klasse erzeugt, das ich dann mit 
													// der 'nextInt'-Methode aufrufen kann. 
	static int doEuklid(int a, int b) {

//		if (a < b)			// um sicherzustellen, dass immer die 
							// größere Zahl durch die kleinere geteilt wird.  
//		{	c = b;	b = a;	a = c;	} // Zum vertauschen wird a in b gespeichert und umgekehrt. 
			c = a % b;		// jetzt geht's eigentlich erst richtig los. Modulo! 
		
			while (c!=0) 	// läuft bis kein Rest mehr da ist. 
			{	a = b;	b = c;	c = a % b;	}
	 		return b;		// gibt den vorletzten Wert aus. Der letzte ist ja '0'...
	}

	static int rekursivEuklid(int a, int b) { // wollte mal sehen, ob das Ganze auch 
											  // rekursiv zu machen ist. 
			c = a % b;						  // im Prinzip das gleiche...
		if (c != 0) {						  // nur jetzt nur 'if'. 
			zaehler++;
			System.out.printf("Iteration " + zaehler + " %d Modulo %d = %d", a, b,c);
			a = b; b = c; 
			System.out.println();
			return rekursivEuklid(a, b);	  // Funktion ruft sich selber auf...
			
		}									  // ... bis c=0...  
		else { 
			return b;						  // ... und gibt 'b' zurück. 
		}
	}

	public static void main(String...args) {

		System.out.print("\nIch kann dir den groessten gemeinsamen Teiler " + 
			"von zwei beliebigen Zahlen berechnen. " + "\nLos geht's, gib die erste Zahl ein: ");
		int x = 0;
		int y = 0;
		do {
			try {
				x = sc.nextInt();
			} catch (Exception e) {
				System.out.println("\n\tBitte nur ZAHLEN eingeben, Danke.");
				sc.next();
			}
		} while (x == 0);
		System.out.print("Ok, und jetzt die zweite Zahl: ");
		do {			
			try {
				y = sc.nextInt();
			} catch (Exception e) {
				System.out.println("\n\tAuch hier bitte eine ZAHL eingeben!");
				sc.next();
			}
		} while (y == 0);

		System.out.println("\n\tDas kommt davon, wenn man eine 'while-Schleife' benutzt: "); 
		
		erg = doEuklid(x, y); // Der erste Methodenaufruf
		
		System.out.println("Der groesste gemeinsame Teiler von " + x + " und " + y +
			" ist " + erg + ".");
	
		System.out.println("\n\tJetzt folgt noch die rekursive Methode. "
						+ "Erst die Einzelschritte: "); 
		
		erg = rekursivEuklid(x, y);	// Der zweite Methodenaufruf. 
		
		System.out.println("\nUnd jetzt der groesste gemeinsame Teiler von " + x + " und " + y +
			" : " + erg + ".");
		System.out.println();
	}
}	
