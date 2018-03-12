package firmaNeu;

import java.util.*;

import firmaMitVererbung.Angestellter;
import firmaMitVererbung.Arbeiter;

public class MenuClass {

	FirmaNeu firma = new FirmaNeu();

	AngestellterNeu ang = new AngestellterNeu();
	ArbeiterNeu arb = new ArbeiterNeu();
	
	AngestellterNeu[] angarrL = new AngestellterNeu[30];
	ArbeiterNeu[] arbarrL = new ArbeiterNeu[30];

	public void menu() {
		int cEingabe;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("||||||||||||||||||||||||||||||||||||");
			System.out.println("Angestellten Daten eingeben.........1");
			System.out.println("ArbeiterNeu Daten eingeben.............2");
			System.out.println("Angestellten Daten anzeigen.........3");
			System.out.println("ArbeiterNeu Daten zeigen...............4");
			System.out.println("Mitarbeiterzahl.....................5");
			System.out.println("Angestellte sortieren...............6");
			System.out.println("ArbeiterNeu sortieren..................7");
			System.out.println("Programmende........................0");
			System.out.println("||||||||||||||||||||||||||||||||||||");

			cEingabe = sc.nextInt();
			System.out.println("Eingabe: " + cEingabe);
			switch (cEingabe) {

			case 1: {

				System.out.println("Neue Angestellte erfassen."); // Satzeingabe-Funktion
				ang.getData();
				System.out.printf(ang.getName(), ang.getVorname(), ang.getAdresse(), ang.getTelefonnummer(), ang.getMonatsgehalt());
				if (ang.iangarr > 2) {
					System.out.println("\n\tEinstellungsstop!\nWir können keine "
							+ "weiteren Angestellten mehr einstellen!");
				}

				break;
			}

			case 2: {

				System.out.println("Neue ArbeiterNeu erfassen."); // Satzzeigen-Funktion
				arb.getData();
				
				// arb.arbarr[arb.iarbarr++] = arb;
				if (arb.iarbarr > 2) {
					System.out.println("\\n\\tEinstellungsstop!\\nWir können keine weiteren ArbeiterNeu mehr einstellen!");
				}

				break;
			}

			
			  case 3: {
			  
			  System.out.println("Angestellten Daten zeigen");
			  
			  for (int i = 0; i < ang.iangarr; i++) { System.out.println("AngestellterNeu " +
			  (i + 1) + " : " + angarrL[i].getName() + ", " + angarrL[i].getVorname()
			  + "\nAdresse: " + angarrL[i].getAdresse() + "\nTelefon: " +
			  angarrL[i].getTelefonnummer() + "\nMonatsgehalt: " +
			  angarrL[i].getMonatsgehalt());
			  
			  }
			  
			  break; }
			  
			  case 4: {
			  
			  System.out.println("ArbeiterNeu Daten zeigen");
			  
			  for (int i = 0; i < arb.iarbarr; i++) { System.out.println("AngestellterNeu " +
			  (i + 1) + " : " + arbarrL[i].getName() + ", " + arbarrL[i].getVorname()
			  + "\nAdresse: " + arbarrL[i].getAdresse() + "\nTelefon: " +
			  arbarrL[i].getTelefonnummer() + "\nStundenlohn: " +
			  arbarrL[i].getStundenlohn() + "\nStundenzahl: " +
			  arbarrL[i].getAnzahlStunden());
			  
			  }
			  
			  break; } case 5: {
			  
			  System.out.println("\n\tAktuell sind " + (arb.iarbarr + ang.iangarr) +
			  " Mitarbeiter im Unternehmen beschäftigt.");
			  
			  }
			  
			  break;
			  
/*			  case 6: {
			  
			  System.out.println("Name Ang. Nr. 1: " ); //
			  Collections.sort(firma.name); // Arrays.sort(arbarr);
		*/	  
			  }

		} while (cEingabe != 0);
		sc.close();
	}

}
