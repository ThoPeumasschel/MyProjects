import java.io.*;



public class Person {
	private String name, vorname, adresse, telefonnr;
	public final int ANZPERSONEN = 30;
	public int iang = 0, iarb = 0;
	Person[] ang = new Angestellter[ANZPERSONEN]; // !!!
	Person[] arb = new Arbeiter[ANZPERSONEN]; // !!!

	Person() {
		name = null;
		vorname = null;
		adresse = null;
		telefonnr = null;
	}

	Person(String n, String v, String a, String t) {
		name = n;
		vorname = v;
		adresse = a;
		telefonnr = t;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getVorname() {
		return vorname;
	}

	void setVorname(String vorname) {
		this.vorname = vorname;
	}

	String getAdresse() {
		return adresse;
	}

	void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	String getTelefonnr() {
		return telefonnr;
	}

	void setTelefonnr(String telefonnr) {
		this.telefonnr = telefonnr;
	}

	String zeigePerson() {
		return "Name:\t\t" + name + ", " + vorname + "\nAdresse:\t" + adresse + "\nTelefonnr:\t" + telefonnr + "\n";
	}

	void menue() {
		int cEingabe;

		do {
			System.out.println("Angestellte eingeben............1");
			System.out.println("Arbeiter eingeben...............2");
			System.out.println("Alle Angestellten auflisten.....3");
			System.out.println("Alle Arbeiter auflisten.........4");
			System.out.println("Mitarbeiter Zahlen ausgeben.....5");
			System.out.println("Programmende....................0");
			cEingabe = Integer.parseInt(readString("Auswahl"));
			System.out.println("Eingabe " + cEingabe);
			switch (cEingabe) {
			case 1: {
				// Satzeingabe-Funktion
				System.out.println("Angestellte eingeben");
				getAngestellte();
				break;

			}
			case 2: {
				// Satzzeigen-Funktion
				System.out.println("Arbeiter eingeben");
				getArbeiter();
				break;
			}

			case 3: {
				// Satzaendern-Funktion
				System.out.println("Alle Angestellten auflisten");
				angAuflisten();
				break;
			}

			case 4: {
				// Liste zeigen-Funktion
				System.out.println("Alle Arbeiter auflisten");
				arbAuflisten();
				break;
			}
			case 5: {
				System.out.println("Aktuell sind " + iang + " Angestellte und " + iarb + " Arbeiter beschäftigt.");
				System.out.println("Also insgesamt " + (iang+iarb) + " Mitarbeiter.");
			}

			}
		} while (cEingabe != 0);
	}

	void getAngestellte() {
		Angestellter ang1 = new Angestellter();
		ang1.setName(readString("Name"));
		ang1.setVorname(readString("Vorname"));
		ang1.setAdresse(readString("Adresse"));
		ang1.setTelefonnr(readString("Telefon"));
		ang1.setMonatsgehalt(Integer.parseInt(readString("Monatsgehalt")));
		
		if (iang < ANZPERSONEN) {
			ang[iang++] = ang1;
		} else 
			System.err.println("Array für Angestellte ist voll!");

	}

	void getArbeiter() {
		Arbeiter arb1 = new Arbeiter();
		if (iarb < ANZPERSONEN) {
			arb[iarb++] = arb1;
		} else 
			System.err.println("Array für Angestellte ist voll!");
		
		arb1.setName(readString("Name"));
		arb1.setVorname(readString("Vorname"));
		arb1.setAdresse(readString("Adresse"));
		arb1.setTelefonnr(readString("Telefon"));
		arb1.setStundenlohn(Integer.parseInt(readString("Stundenlohn")));
		arb1.setAnzahlstd(Integer.parseInt(readString("Anzahl Stunden")));
		

	}

	void angAuflisten() {
		for (int i = 0; i < iang; i++) {
			System.out.println(ang[i].zeigePerson());
		}

	}

	void arbAuflisten() {
		for (int i = 0; i < iarb; i++) {
			System.out.println(arb[i].zeigePerson());
		}
	}

	public static String readString(String text) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(text + ": ");
		try {
			return in.readLine();
		} catch (IOException e) {
			System.out.println("IO error!");
			return "1";

		} catch (NumberFormatException e) {
			System.out.println("NumberFormatError error!");
			return "1";
		}
	}

	public static int readInt(int value) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(value + ": ");
		try {
			return in.read();
		} catch (IOException e) {
			System.out.println("IO error!");
			return 1;

		} catch (NumberFormatException e) {
			System.out.println("NumberFormatError error!");
			return 1;

		}
	}

}
