

import java.io.*;

public class Adressverwaltung2 {
	static int iIndex;
	static String name, vorname, strasse, plz, ort;

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

	static void getAdresse() {

		System.out.println("Bitte die Adresse eingeben.");
		name = readString("Name");
		vorname = readString("Vorname");
		strasse = readString("Strasse");
		plz = readString("PLZ");
		ort = readString("Ort");
		iIndex++;

	}

	static void showAdresse() {
		System.out.println("Die eingegebene Adresse ist : ");
		System.out.println(
				"Name: " + name + " Vorname: " + vorname + " Strasse: " + strasse + " PLZ: " + plz + " Ort: " + ort);

	}

	static void writeToFile() {

		try {
			FileWriter aus = new FileWriter("Adressen_1.txt");
			BufferedWriter buff = new BufferedWriter(aus);
			// buff.write("Name: " + name + ", Vorname: " + vorname + ", Strasse: " +
			// strasse + ", PLZ: " + plz + ", Ort" + ort);
			buff.write(name);
			buff.write("\n" + vorname);
			buff.write("\n" + strasse);
			buff.write("\n" + plz);
			buff.write("\n" + ort);

			// aus.write(vorname);
			// aus.write(strasse);
			// aus.write(plz);
			// aus.write(ort);
			buff.close();
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}

	}

	static void ReadFromFile() {

		try {

			FileReader ein = new FileReader("Adressen_1.txt");
			BufferedReader buff = new BufferedReader(ein);
			name = buff.readLine();
			vorname = buff.readLine();
			strasse = buff.readLine();
			plz = buff.readLine();
			ort = buff.readLine();
			buff.close();

		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
	}

	public static void main(String[] args) {

		ReadFromFile();

		int cEingabe;
		int iIndex = 0;
		do {
			System.out.println("Satz eingeben...................1");
			System.out.println("Satz anzeigen...................2");
			System.out.println("Satz aendern....................3");
			System.out.println("Liste anzeigen..................4");
			System.out.println("Programmende....................0");
			cEingabe = Integer.parseInt(readString("Auswahl"));
			System.out.println("Eingabe " + cEingabe);
			switch (cEingabe) {
			case 1: {
				// Satzeingabe-Funktion
				System.out.println("Satzeingabe-Funktion");
				getAdresse();
				break;

			}
			case 2: {
				// Satzzeigen-Funktion
				System.out.println("Satzzeigen-Funktion");
				showAdresse();
				break;
			}

			case 3: {
				// Satzaendern-Funktion
				System.out.println("Satzaendern-Funktion");
				break;
			}

			case 4: {
				// Liste zeigen-Funktion
				System.out.println("Liste zeigen-Funktion");
				break;
			}
			case 5: {
				// Datensatz speichern-Funktion
				writeToFile();
				break;
			}
			}
		} while (cEingabe != 0);
	}

}
