package firmaNeu;

import java.io.*;
import java.util.*;

import firmaMitVererbung.Angestellter;

public class MenuClass {

	FirmaNeu firma = new FirmaNeu();

	AngestellterNeu ang = new AngestellterNeu();
	ArbeiterNeu arb = new ArbeiterNeu();

	

	void writeToFile() {

		try {
			// Formatter("C:\\Users\\thoma\\MyProjects\\Klasse\\Angestellte.txt");
			Formatter f = new Formatter("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Angestellte.txt");
			
			for (int i = 0; i < ang.iangarr; i++) {
			f.format("\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n", ang.angarr[i].vorname, ang.angarr[i].name, ang.angarr[i].adresse, ang.angarr[i].telefonnummer,
					ang.angarr[i].monatsgehalt);
			}
			f.close();

		} catch (FileNotFoundException e) {

			System.out.println("Error!");
		}
	}

	void readFromFile() {
		try {
			// File x = new File("C:\\Users\\thoma\\MyProjects\\Klasse\\Angestellte.txt");
			File x = new File("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Angestellte.txt");
			Scanner rff = new Scanner(x);
			while (rff.hasNext()) {
				System.out.println(rff.next());
			}
			rff.close();
		} catch (FileNotFoundException e) {

			System.out.println("Error!");
		}

	}

	public void menu() {
		int cEingabe;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("||||||||||||||||||||||||||||||||||||");
			System.out.println("Angestellten Daten eingeben.........1");
			System.out.println("ArbeiterNeu Daten eingeben..........2");
			System.out.println("Angestellten Daten anzeigen.........3");
			System.out.println("ArbeiterNeu Daten zeigen............4");
			System.out.println("Mitarbeiterzahl.....................5");
			System.out.println("Angestellte in Datei schreiben......6");
			System.out.println("Angestellte aus Datei lesen.........7");
			System.out.println("Programmende........................0");
			System.out.println("||||||||||||||||||||||||||||||||||||");

			cEingabe = sc.nextInt();
			System.out.println("Eingabe: " + cEingabe);
			switch (cEingabe) {

			case 1: {

				System.out.println("Neue Angestellte erfassen."); // Satzeingabe-Funktion
				ang.getData();

				try {
					ang.angarr[ang.iangarr] = ang;
					FileOutputStream fs = new FileOutputStream("Angestellte.ser");
					ObjectOutputStream os = new ObjectOutputStream(fs);
					os.writeObject(ang.angarr);
					os.close();
					System.out.println("Objekt ang wurde serialisiert");
					System.out.println("Objekt ang: " + ang.toString());
				} catch (IOException e) {
					System.out.println(e.toString());
				}

				// System.out.printf(ang.getName(), ang.getVorname(), ang.getAdresse(),
				// ang.getTelefonnummer(), ang.getMonatsgehalt());
				if (ang.iangarr > 2) {
					System.out.println(
							"\n\tEinstellungsstop!\nWir k�nnen keine " + "weiteren Angestellten mehr einstellen!");
				}

				break;
			}

			case 2: {

				System.out.println("Neue ArbeiterNeu erfassen."); // Satzzeigen-Funktion
				arb.getData();

				// arb.arbarr[arb.iarbarr++] = arb;
				if (arb.iarbarr > 2) {
					System.out.println(
							"\\n\\tEinstellungsstop!\\nWir k�nnen keine weiteren ArbeiterNeu mehr einstellen!");
				}

				break;
			}

			case 3: {

				System.out.println("Angestellten Daten zeigen");
				try {
					FileInputStream fs = new FileInputStream("Angestellte.ser");
					ObjectInputStream os = new ObjectInputStream(fs);
					ang.angarr = (AngestellterNeu[]) os.readObject(); // Einlesen von serialisierten Objekten erfordert
																// Deserialisation.
	//				for (int i = 0; i < ang.iangarr; i++) {
	//					System.out.println(ang.angarr[i].toString());
	//				}
					System.out.println(ang.toString());
					os.close();
				} catch (IOException e) {
					System.out.println(e.toString());
				} catch (ClassNotFoundException e) {
					System.out.println(e.toString());
				}
				// for (int i = 0; i < ang.iangarr; i++) { System.out.println("AngestellterNeu "
				// +
				// (i + 1) + " : " + ang.angarr[i].getName() + ", " + ang.angarr[i].getVorname()
				// + "\nAdresse: " + ang.angarr[i].getAdresse() + "\nTelefon: " +
				// ang.angarr[i].getTelefonnummer() + "\nMonatsgehalt: " +
				// ang.angarr[i].getMonatsgehalt());

				break;
			}

			/*
			 * case 4: {
			 * 
			 * System.out.println("ArbeiterNeu Daten zeigen");
			 * 
			 * for (int i = 0; i < arb.iarbarr; i++) { System.out.println("AngestellterNeu "
			 * + (i + 1) + " : " + arbarrL[i].getName() + ", " + arbarrL[i].getVorname() +
			 * "\nAdresse: " + arbarrL[i].getAdresse() + "\nTelefon: " +
			 * arbarrL[i].getTelefonnummer() + "\nStundenlohn: " +
			 * arbarrL[i].getStundenlohn() + "\nStundenzahl: " +
			 * arbarrL[i].getAnzahlStunden());
			 * 
			 * }
			 * 
			 * break; } case 5: {
			 * 
			 * System.out.println("\n\tAktuell sind " + (arb.iarbarr + ang.iangarr) +
			 * " Mitarbeiter im Unternehmen besch�ftigt.");
			 * 
			 * }
			 * 
			 * break;
			 */

			case 6: {

				writeToFile();
				break;
			}

			case 7: {

				readFromFile();
				break;
			}
			}

		} while (cEingabe != 0);
		sc.close();
	}

}
