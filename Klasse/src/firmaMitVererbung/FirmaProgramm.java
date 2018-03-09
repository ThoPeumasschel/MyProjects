package firmaMitVererbung;

// Folgende Probleme: 

public class FirmaProgramm {

	int iIndex;
	String name, vorname, adresse, telefonnummer;
	int stundenlohn, anzahlStunden, monatsgehalt;

	Angestellter[] angarr = new Angestellter[30];
	Arbeiter[] arbarr = new Arbeiter[30];

	public static void main(String[] args) {
		Firma f = new Firma();
		Person p = new Person();
		Angestellter ang1 = new Angestellter();
		Arbeiter arb1 = new Arbeiter();
		int cEingabe;

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

			cEingabe = Integer.parseInt(f.readString("Auswahl "));
			System.out.println("Eingabe: " + cEingabe);
			switch (cEingabe) {

			case 1: {

				System.out.println("Neue Angestellte erfassen."); // Satzeingabe-Funktion
				ang1.getData();
				Angestellter ang = new Angestellter(ang1.getName(), ang1.getVorname(), ang1.getAdresse(), ang1.getTelefonnummer(),
						ang1.getMonatsgehalt());
				ang1.angarr[ang1.iangarr++] = ang;
				if (ang1.iangarr > 2) {
					System.out
							.println("\n\tEinstellungsstop!\nWir können keine weiteren Angestellten mehr einstellen!");
				}
				// f.angarr[f.iangarr++] = new Angestellter("Ehrlich", "Paul", "Augsburg",
				// "0175/534231", 4300);
				// f.angarr[f.iangarr++] = new Angestellter("Ehrlich", "Rudolf", "Augsburg",
				// "0175/511111", 2300);
				// f.angarr[f.iangarr++] = new Angestellter("Ehrlich", "Dieter", "Augsburg",
				// "0175/522222", 4700);
				break;
			}

			case 2: {

				System.out.println("Neue Arbeiter erfassen."); // Satzzeigen-Funktion
				arb1.getData();
				Arbeiter arb = new Arbeiter(arb1.getName(), arb1.getVorname(), arb1.getAdresse(), arb1.getTelefonnummer(), arb1.getStundenlohn(),
						arb1.getAnzahlStunden());
				arb1.arbarr[arb1.iarbarr++] = arb;
				if (arb1.iarbarr > 2) {
					System.out.println("\\n\\tEinstellungsstop!\\nWir können keine weiteren Arbeiter mehr einstellen!");
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

				for (int i = 0; i < ang1.iangarr; i++) {
					System.out.println("Angestellter " + (i + 1) + " : " + ang1.angarr[i].getName() + ", "
							+ ang1.angarr[i].getVorname() + "\nAdresse: " + ang1.angarr[i].getAdresse() + "\nTelefon: "
							+ ang1.angarr[i].getTelefonnummer() + "\nMonatsgehalt: " + ang1.angarr[i].getMonatsgehalt());

				}

				break;
			}

			case 4: {

				System.out.println("Arbeiter Daten zeigen");

				for (int i = 0; i < arb1.iarbarr; i++) {
					System.out.println("Angestellter " + (i + 1) + " : " + arb1.arbarr[i].getName() + ", "
							+ arb1.arbarr[i].getVorname() + "\nAdresse: " + arb1.arbarr[i].getAdresse() + "\nTelefon: "
							+ arb1.arbarr[i].getTelefonnummer() + "\nStundenlohn: " + arb1.arbarr[i].getStundenlohn() + "\nStundenzahl: "
							+ arb1.arbarr[i].getAnzahlStunden());

				}

				break;
			}
			case 5: {

				System.out.println("\n\tAktuell sind " + f.countMembers() + " Mitarbeiter im Unternehmen beschäftigt.");

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
