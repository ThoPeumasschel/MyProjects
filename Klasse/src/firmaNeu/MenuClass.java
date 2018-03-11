package firmaNeu;

import java.util.*;

public class MenuClass {

	Firma firma = new Firma();

	Angestellter ang = new Angestellter();
	Arbeiter arb = new Arbeiter();

	public void menu() {
		int cEingabe;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("||||||||||||||||||||||||||||||||||||");
			System.out.println("Angestellten Daten eingeben.........1");
			System.out.println("Arbeiter Daten eingeben.............2");
			System.out.println("Angestellten Daten anzeigen.........3");
			System.out.println("Arbeiter Daten zeigen...............4");
			System.out.println("Mitarbeiterzahl.....................5");
			System.out.println("Angestellte sortieren...............6");
			System.out.println("Arbeiter sortieren..................7");
			System.out.println("Programmende........................0");
			System.out.println("||||||||||||||||||||||||||||||||||||");

			cEingabe = sc.nextInt();
			System.out.println("Eingabe: " + cEingabe);
			switch (cEingabe) {

			case 1: {

				System.out.println("Neue Angestellte erfassen."); // Satzeingabe-Funktion
				ang.getData();
				if (ang.iangarr > 2) {
					System.out.println("\n\tEinstellungsstop!\nWir können keine "
							+ "weiteren Angestellten mehr einstellen!");
				}

				break;
			}

			case 2: {

				System.out.println("Neue Arbeiter erfassen."); // Satzzeigen-Funktion
				arb.getData();
				Arbeiter arb1 = new Arbeiter(arb.getName(), arb.getVorname(), arb.getAdresse(), arb.getTelefonnummer(),
						arb.getStundenlohn(), arb.getAnzahlStunden());
				// arb.arbarr[arb.iarbarr++] = arb;
				if (arb.iarbarr > 2) {
					System.out.println("\\n\\tEinstellungsstop!\\nWir können keine weiteren Arbeiter mehr einstellen!");
				}

				break;
			}

			
			  case 3: {
			  
			  System.out.println("Angestellten Daten zeigen");
			  
			  for (int i = 0; i < ang.iangarr; i++) { System.out.println("Angestellter " +
			  (i + 1) + " : " + ang.angarrL[i].getName() + ", " + ang.angarrL[i].getVorname()
			  + "\nAdresse: " + ang.angarr[i].getAdresse() + "\nTelefon: " +
			  ang.angarr[i].getTelefonnummer() + "\nMonatsgehalt: " +
			  ang.angarr[i].getMonatsgehalt());
			  
			  }
			  
			  break; }
			  
			  case 4: {
			  
			  System.out.println("Arbeiter Daten zeigen");
			  
			  for (int i = 0; i < arb1.iarbarr; i++) { System.out.println("Angestellter " +
			  (i + 1) + " : " + arb.arbarr[i].getName() + ", " + arb.arbarr[i].getVorname()
			  + "\nAdresse: " + arb.arbarr[i].getAdresse() + "\nTelefon: " +
			  arb.arbarr[i].getTelefonnummer() + "\nStundenlohn: " +
			  arb.arbarr[i].getStundenlohn() + "\nStundenzahl: " +
			  arb.arbarr[i].getAnzahlStunden());
			  
			  }
			  
			  break; } case 5: {
			  
			  System.out.println("\n\tAktuell sind " + (arb.iarbarr + ang.iangarr) +
			  " Mitarbeiter im Unternehmen beschäftigt.");
			  
			  }
			  
			  break;
			  
			  case 6: {
			  
			  System.out.println("Name Ang. Nr. 1: " ); //
			  Collections.sort(firma.name); // Arrays.sort(arbarr);
			  
			  }

		} while (cEingabe != 0);
		sc.close();
	}

}
