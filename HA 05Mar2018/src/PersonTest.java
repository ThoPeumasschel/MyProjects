import java.io.*;

public class PersonTest {

	int iIndex;
	String name, vorname, adresse, telefonnummer, stundenlohn, anzahlstunden, monatsgehalt;

	Angestellter[] angarr = new Angestellter[30];
	Arbeiter[] arbarr = new Arbeiter[30];

	int iangarr = 0;
	int iarbarr = 0;

	public String readString(String text) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(text + ": ");
		try { // �berwachungsblock
			return in.readLine();
		} catch (IOException e) { // Fehlerbehandlungsblock
			System.out.println("IO error");
			return "1";
		} catch (NumberFormatException e) { // Fehlerbehandlungsblock
			System.out.println("NumberFormat error");
			return "1";
		}
	}

	void getDaten() {

		System.out.println("Bitte die Daten eingeben.");
		name = readString("Name");
		vorname = readString("Vorname");
		adresse = readString("Adresse");
		telefonnummer = readString("Telefonnummer");
		stundenlohn = readString("Stundenlohn");
		anzahlstunden = readString("Stundenanzahl");
		monatsgehalt = readString("Monatsgehalt");
		iIndex++;
	}

	void showDaten() {

		System.out.println();
		System.out.println("Die eingegebenen Daten sind: ");
		System.out.println("Name: " + name);
		System.out.println("Vorname: " + vorname);
		System.out.println("Adresse: " + adresse);
		System.out.println("Telefonnummer: " + telefonnummer);
		System.out.println("Stundenlohn: " + stundenlohn);
		System.out.println("Stundenanzahl: " + anzahlstunden);
		System.out.println("Monatsgehalt: " + monatsgehalt);
	}

	public static void main(String[] args) {

		int cEingabe;
		int iIndex = 0;

		PersonTest pt = new PersonTest();

		do {
			System.out.println("------------------------------------");
			System.out.println("Daten eingeben.....................1");
			System.out.println("Daten anzeigen.....................2");
			System.out.println("Angestellte anzeigen...............3");
			System.out.println("Arbeiter anzeigen..................4");
			System.out.println("Programmende.......................0");
			System.out.println("------------------------------------");

			cEingabe = Integer.parseInt(pt.readString("Auswahl "));
			System.out.println("Eingabe: " + cEingabe);
			switch (cEingabe) {

			case 1: {

				System.out.println("Dateneingabe-Funktion"); // Dateneingabe-Funktion
				pt.getDaten();
				break;
			}

			case 2: {

				System.out.println("Daten zeigen-Funktion"); // Daten zeigen-Funktion
				pt.showDaten();
				break;
			}

			case 3: {

				System.out.println("Angestellte anzeigen"); // Angestellte anzeigen-Funktion

				pt.angarr[pt.iangarr++] = new Angestellter("Capone", "Al", "Gangsters Paradise 1", "01/123345213",
						5000000);
				pt.angarr[pt.iangarr++] = new Angestellter("Guzm�n", "Joaqu�n", "Jiquilpan Boulevard 1002",
						"052/777777", 75000000);
				pt.angarr[pt.iangarr++] = new Angestellter("Escobar", "Pablo", "Hacienda N�poles 1", "057/666666",
						100000000);

				if (pt.iangarr > 29) {
					System.out.println("Array f�r Angestellte voll!");
				}

				for (int i = 0; i < pt.iangarr; i++) {

					System.out.println("Angestellter " + (i + 1) + " : " + pt.angarr[i].getName() + ", "
							+ pt.angarr[i].getVorname() + " Adresse: " + pt.angarr[i].getAdresse() + " Tel.: "
							+ pt.angarr[i].getTelefonnummer() + " Monatsgehalt: " + pt.angarr[i].getMonatsgehalt()
							+ "$");
				}
				break;
			}

			case 4: {

				System.out.println("Arbeiter anzeigen-Funktion"); // Arbeiter anzeigen-Funktion

				pt.arbarr[pt.iarbarr++] = new Arbeiter("Schmidt", "Hans", "Kohlewerk 1", "0213/123345", 20, 160);
				pt.arbarr[pt.iarbarr++] = new Arbeiter("Kemper", "Peter", "Stahlwerk 2", "0455/32456", 30, 160);
				pt.arbarr[pt.iarbarr++] = new Arbeiter("Sack", "Uli", "Goldwerk 3", "0567/9753624", 40, 160);

				if (pt.iarbarr > 29) {
					System.out.println("Array f�r Arbeiter voll!");
				}

				for (int i = 0; i < pt.iarbarr; i++) {

					System.out.println("Arbeiter " + (i + 1) + " : " + pt.arbarr[i].getName() + ", "
							+ pt.arbarr[i].getVorname() + " Adresse: " + pt.arbarr[i].getAdresse() + " Tel.: "
							+ pt.arbarr[i].getTelefonnummer() + " Stundenlohn: " + pt.arbarr[i].getStundenlohn()
							+ " Anzahl Std.: " + pt.arbarr[i].getAnzahlstunden());
				}
				System.out.println();

				break;
			}

			}

		} while (cEingabe != 0);

	}

}