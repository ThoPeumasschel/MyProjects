import java.text.DecimalFormat;
import java.util.Scanner;


public class KingChess {
	static int zaehler = 1;
	static Scanner sc = new Scanner(System.in);
	
	static double countRice(double grains, int fields) {
		
		if (fields > 1) {
			zaehler++; //nicht nötig, nur um die Anzahl auf jedem Feld auszugeben. 
			grains*=2;
			System.out.println("Feld " + zaehler + ": " + grains + " Koerner.");
			return (grains + countRice(grains, fields-1));
			}
			else  

			return -1;	
				
	}	

	static int userInput1() { 
		int felder = 0;
		do {	
			System.out.print("\nAuf wie vielen Feldern soll ich das Schachproblem berechnen? ");
		try {
			felder = sc.nextInt();
			if (felder == 1) {
				System.out.println("\n... moment mal! Schon mal ein Schachbrett mit nur einem einzigen Feld gesehen??");
				break; // An dieser Stelle soll das Programm abbrechen. Exit()??
			}
			} catch (Exception e) {
				System.out.println("\n\tUngueltige Eingabe! Bitte nur ganze Zahlen eingeben." 
					+ "\n\t\tNeuer Versuch: ");
				sc.next(); //unguültige Eingabe entfernen.
			}
		} while (felder == 0);

		return felder;
	}

	static double userInput2() {
		double koerner = 0.0;
		do {
			System.out.print("\nMit wie vielen Koernern soll ich auf dem ersten Feld beginnen? ");
		try {
			koerner = sc.nextDouble();
			} catch (Exception e) { 
				System.out.println("\n\tUngueltige Eingabe! Bitte nur ganze Zahlen eingeben."
					+ "\n\t\tNeuer Versuch: ");
				sc.next();
			}
		} while (koerner == 0.0);
		return koerner;	
	}

	static char userInput3() {

		System.out.println("Soll ich noch das Gewicht der Koerner berechnen? [j/n]." 
		+ "\n(angenommen, ein Korn wiegt 0,002 gramm)");	
		char antwort = sc.next().charAt(0);
		return antwort;
	}

	static void riceWeight(double k) {
		double weight = 0;
		// 1 Korn wiegt ca. 0.00000002 tonnen;
		double weightgito = 0.00000000000002, weightmgto = 0.00000000002, weightto = 0.00000002, 
			weightkg = 0.00002, weightgr = 0.02, l = 10000000000.0;
		if(k <= 0) {
			System.out.println("Error!");
		}	else if (k < 100000) {  
				weight = weightgr * k;
				System.out.println(k + " Koerner wiegen " 
					+ new DecimalFormat("0.00").format(weight) + " gramm.");
		}	else if (k < 10000000) {
				weight = weightkg * k;
				System.out.println(k + " Koerner wiegen " 
					+ new DecimalFormat("0.00").format(weight) + " kilogramm.");
		}	else if (k < l) {
				weight = weightto * k;
				System.out.println(k + " Koerner wiegen " 
					+ new DecimalFormat("0.00").format(weight) + " tonnen!");
		}	else if (k < (l*1000)) {
				weight = weightmgto * k;
				System.out.println(k + " Koerner wiegen " 
					+ new DecimalFormat("0.00").format(weight) + " megatonnen!");
		}
		else {
				weight = weightgito * k;
				System.out.println(k + " Koerner wiegen " 
					+ new DecimalFormat("0.00").format(weight) + " gigatonnen!");
		}
	}

	static boolean abfragen(char a, double ergebnis) {
		boolean nochmalabfragen = true;

		if (a=='J' || a=='j' || a=='Y' || a=='y') {
			riceWeight(ergebnis); // Hier wird das Gesamtgewicht der Körner berechnet.
			nochmalabfragen = false;
		} 
		else if (a=='N' || a=='n') {
			System.out.println("\nGut, dann nicht. Auf Wiedersehen!\n");
			nochmalabfragen = false;
		} else {
			System.out.println("Bitte nur die Zeichen 'j/J/y/Y' oder 'n/N' verwenden!\n");
			nochmalabfragen = true;
		}
			return nochmalabfragen;
	}


public static void main(String...args) {

	System.out.println("\nDieses Programm berechnet die sog. Weizenkornlegende, " 
		+ "wonach die Zahl der Koerner \nauf jedem weiteren Feld verdoppelt wird. " 
		+ "\nDaraus ergibt sich bei 64 Feldern am Ende eine sehr hohe Zahl im Trillionenbereich.");

	int felder = userInput1();

	double koerner = userInput2();
	
	double ergebnis = countRice(koerner, felder); 
	System.out.println("\nAuf einer Ebene mit " + felder + " Feldern und " + koerner + 
		" Koernern befinden sich dann insgesamt " + ergebnis + " Koerner!\n");

	char antwort;
	boolean nochmal;

	do {
		antwort = userInput3();
		nochmal = abfragen(antwort, ergebnis);
		} while (nochmal == true);		
	

		}	
	
	}



