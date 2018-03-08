// Folgende Probleme: 

public class Person3Test {

	int iIndex;
	String name, vorname, adresse, telefonnummer;
	int stundenlohn, anzahlStunden, monatsgehalt;

	Angestellter[] angarr = new Angestellter[30];
	Arbeiter[] arbarr = new Arbeiter[30];

	public static void main(String[] args) {
		Firma f = new Firma();
		int cEingabe;

		do {
			System.out.println("||||||||||||||||||||||||||||||||||||");
			System.out.println("Angestellten Daten eingeben.........1");
			System.out.println("Arbeiter Daten eingeben.............2");
			System.out.println("Angestellten Daten anzeigen.........3");
			System.out.println("Arbeiter Daten zeigen...............4");
			System.out.println("Mitarbeiterzahl.....................5");
			System.out.println("Programmende........................0");
			System.out.println("||||||||||||||||||||||||||||||||||||");

			cEingabe = Integer.parseInt(f.readString("Auswahl "));
			System.out.println("Eingabe: " + cEingabe);
			switch (cEingabe) {

			case 1: {

				System.out.println("Neue Angestellte erfassen."); // Satzeingabe-Funktion
				f.getDataAng();
				Angestellter ang = new Angestellter(f.name, f.vorname, f.adresse, f.telefonnummer, f.monatsgehalt);
				f.angarr[f.iangarr++] = ang;
				if (f.iangarr > 2) {
					System.out.println("\n\tEinstellungsstop!\nWir können keine Angestellten mehr einstellen!");
				}

				break;
			}

			case 2: {

				System.out.println("Neue Arbeiter erfassen."); // Satzzeigen-Funktion
				f.getDataArb();
				Arbeiter arb = new Arbeiter(f.name, f.vorname, f.adresse, f.telefonnummer, f.stundenlohn,
						f.anzahlStunden);
				f.arbarr[f.iarbarr++] = arb;
				if (f.iarbarr > 2) {
					System.out.println("\\n\\tEinstellungsstop!\\nWir können keine Arbeiter mehr einstellen!");
				}
				// f.arbarr[f.iarbarr++] = new Arbeiter("Dödel", "Paul", "Augsburg",
				// "0175/534231", 34, 23);
				// f.arbarr[f.iarbarr++] = new Arbeiter("Dödel", "Rudolf", "Augsburg",
				// "0175/511111", 43, 35);
				// f.arbarr[f.iarbarr++] = new Arbeiter("Dödel", "Dieter", "Augsburg",
				// "0175/522222", 27, 17);

				break;
			}

			case 3: {

				System.out.println("Angestellten Daten zeigen");
				// f.angarr[f.iangarr++] = new Angestellter("Ehrlich", "Paul", "Augsburg",
				// "0175/534231", 4300);
				// f.angarr[f.iangarr++] = new Angestellter("Ehrlich", "Rudolf", "Augsburg",
				// "0175/511111", 2300);
				// f.angarr[f.iangarr++] = new Angestellter("Ehrlich", "Dieter", "Augsburg",
				// "0175/522222", 4700);

				for (int i = 0; i < f.iangarr; i++) {
					System.out.println("Angestellter " + (i + 1) + " : " + f.angarr[i].getName() + ", "
							+ f.angarr[i].getVorname() + "\nAdresse: " + f.angarr[i].getAdresse() + "\nTelefon: "
							+ f.angarr[i].getTelefonnummer() + "\nMonatsgehalt: " + f.monatsgehalt);

				}

				break;
			}

			case 4: {

				System.out.println("Arbeiter Daten zeigen");

				for (int i = 0; i < f.iarbarr; i++) {
					System.out.println("Angestellter " + (i + 1) + " : " + f.arbarr[i].getName() + ", "
							+ f.arbarr[i].getVorname() + "\nAdresse: " + f.arbarr[i].getAdresse() + "\nTelefon: "
							+ f.arbarr[i].getTelefonnummer() + "\nStundenlohn: " + f.stundenlohn + "\nStundenzahl: "
							+ f.anzahlStunden);

				}

				break;
			}
			case 5: {

				System.out.println("Aktuell sind " + f.countMembers() + " Mitarbeiter im Unternehmen beschäftigt.");

			}

				break;

			/*
			 * case 5: {
			 * 
			 * handoutFile(); // Datensatz speichern-Funktion break;
			 * 
			 * }
			 */ }

		} while (cEingabe != 0);

	}
	/*
	 * private void getDataArb() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * private void getDataAng() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * private static String readString(String string) { // TODO Auto-generated
	 * method stub return null; }
	 */
}
