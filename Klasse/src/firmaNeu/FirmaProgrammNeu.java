package firmaNeu;

import java.io.*;
import java.util.*;

public class FirmaProgrammNeu {

	public static void main(String[] args) {

		FirmaNeu f = new FirmaNeu();

		AngestellterNeu ang = new AngestellterNeu();
		ArbeiterNeu arb = new ArbeiterNeu();
		
		int cEingabe;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("||||||||||||||||||||||||||||||||||||");
			System.out.println("Angestellten Daten eingeben.........1");
			System.out.println("Angestellten Array anzeigen.........2");
			System.out.println("Angestellten Daten anzeigen.........3");
			System.out.println("ArbeiterNeu Daten zeigen............4");
			System.out.println("Mitarbeiterzahl.....................5");
			System.out.println("Angestellte in Datei schreiben......6");
			System.out.println("Angestellte aus Datei lesen.........7");
			System.out.println("Zeige Person aufrufen...............8");
			System.out.println("Programmende........................0");
			System.out.println("||||||||||||||||||||||||||||||||||||");

			cEingabe = sc.nextInt();
			System.out.println("Eingabe: " + cEingabe);
			switch (cEingabe) {

			case 1: {

				System.out.println("Neue Angestellte erfassen."); // Satzeingabe-Funktion
				ang.getData();
				AngestellterNeu ang1 = new AngestellterNeu(ang.vorname, ang.name, ang.adresse, ang.telefonnummer, ang.monatsgehalt);
				ang.angarr[ang.iangarr++] = ang1;
				
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

				if (ang.iangarr > 2) {
					System.out.println(
							"\n\tEinstellungsstop!\nWir können keine " + "weiteren Angestellten mehr einstellen!");
				}

				break;
			}

			case 2: {

				System.out.println("Angestellten Array anzeigen: \n"); // Satzzeigen-Funktion
				for (int i = 0; i < ang.iangarr; i++) {
					System.out.println(ang.angarr[i]);
				}

				break;
			}

			case 3: {

				System.out.println("Angestellten Daten zeigen");
				try {
					FileInputStream fs = new FileInputStream("Angestellte.ser");
					ObjectInputStream os = new ObjectInputStream(fs);
					AngestellterNeu ang2 = new AngestellterNeu();
					ang2.angarr = (AngestellterNeu[]) os.readObject(); // Einlesen von serialisierten Objekten erfordert
					// Deserialisation.
					// for (int i = 0; i < ang.iangarr; i++) {
					// System.out.println(ang.angarr[i].toString());
					// }
					for(int i = 0; i < ang2.angarr.length; i++) { // Array initialisieren, mit null überschreiben
						ang2.angarr[i].name = null;
						ang2.angarr[i].vorname = null;
						ang2.angarr[i].adresse = null;
						ang2.angarr[i].telefonnummer = null;
						ang2.angarr[i].monatsgehalt = null;
					}
					try {
						System.out.println(ang2.angarr[0].toString());
					} catch (Exception e) {
						System.out.println(e.toString());
					}
		//			System.out.println(ang.toString());
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
			  case 4: {
			  
			  System.out.println("ArbeiterNeu Daten zeigen");
			  
			  for (int i = 0; i < arb.iarbarr; i++) { System.out.println("AngestellterNeu "
			  + (i + 1) + " : " + arbarrL[i].getName() + ", " + arbarrL[i].getVorname() +
			  "\nAdresse: " + arbarrL[i].getAdresse() + "\nTelefon: " +
			  arbarrL[i].getTelefonnummer() + "\nStundenlohn: " +
			  arbarrL[i].getStundenlohn() + "\nStundenzahl: " +
			  arbarrL[i].getAnzahlStunden());
			  
			  }
			  
			  break; } 
			 */ 
			  case 5: {
			  
			  System.out.println("\n\tAktuell sind " + FirmaNeu.iIndex +
			  " Mitarbeiter im Unternehmen beschäftigt.");
			  break;
			  }
			  
			
			 

			case 6: {
				
				writeToFile(ang.iangarr, ang.angarr);
				break;
			}

			case 7: {

				readFromFile();
				break;
			}
			case 8: {
				ang.zeigePerson();
			}
			}

		} while (cEingabe != 0);
		sc.close();
	}

	/*
	 * AngestellterNeu[] angarr1 = new AngestellterNeu[30]; ArbeiterNeu[] arbarr1 =
	 * new ArbeiterNeu[30];
	 * 
	 * AngestellterNeu ang1 = new AngestellterNeu("Balder", "Hugo", "Hamburg",
	 * "0178/34 56 426", "3500"); AngestellterNeu ang2 = new AngestellterNeu("CCCC",
	 * "DD", "HHHH", "3456378", "4564"); AngestellterNeu ang3 = new
	 * AngestellterNeu("EEEE", "UU", "FGHJ", "111111", "22222");
	 * 
	 * angarr1[0] = ang1; angarr1[1] = ang1; angarr1[2] = ang1;
	 * 
	 * ArbeiterNeu arb = new ArbeiterNeu(); FirmaNeu firmaNeu = new FirmaNeu(); //
	 * firmaNeu.writeToFile(); // firmaNeu.readFromFile();
	 */
	
	static void writeToFile(int iangarr, AngestellterNeu[] angarr) {
		
		try {
			Formatter f = new Formatter("C:\\Users\\thoma\\MyProjects\\Klasse\\Angestellte.txt");
			//Formatter f = new Formatter("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Angestellte.txt");
			f.format("\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n", angarr[0].getVorname(), angarr[0].getName(),
					angarr[0].getAdresse(), angarr[0].getTelefonnummer(), angarr[0].getMonatsgehalt());
//			for (int i = 0; i < iangarr; i++) {
//				f.format("\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n", angarr[i].vorname, angarr[i].name,
//						angarr[i].adresse, angarr[i].telefonnummer, angarr[i].monatsgehalt);
	//		}
			f.close();

		} catch (FileNotFoundException e) {

			System.out.println("Error!");
		}
	}

	static void readFromFile() {
		try {
			File x = new File("C:\\Users\\thoma\\MyProjects\\Klasse\\Angestellte.txt");
			//File x = new File("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Angestellte.txt");
			Scanner rff = new Scanner(x);
			while (rff.hasNext()) {
				System.out.println(rff.next());
			}
			rff.close();
		} catch (FileNotFoundException e) {

			System.out.println("Error!");
		}

	}

	}



