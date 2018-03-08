import java.io.*;

public class Adressverwaltung {

	static int iIndex;
	static String name, vorname, strasse, plz, ort;

	public static String readString(String text) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(text + ": ");
		try { // Überwachungsblock
			return in.readLine();
		} catch (IOException e) { // Fehlerbehandlungsblock
			System.out.println("IO error");
			return "1";
		} catch (NumberFormatException e) { // Fehlerbehandlungsblock
			System.out.println("NumberFormat error");
			return "1";
		}
	}

	static void getAdresse() {

		System.out.println("Bitte die Adresse eingeben.");
		name = readString("Name");
		vorname = readString("Vorname");
		strasse = readString("Strasse");
		plz = readString("Postleitzahl");
		ort = readString("Ort");
		iIndex++;
	}

	static void showAdresse() {

		System.out.println();
		System.out.println("Die eingegebene Adresse ist: ");
		System.out.println("Name: " + name);
		System.out.println("Vorname: " + vorname);
		System.out.println("Strasse: " + strasse);
		System.out.println("Postleitzahl: " + plz);
		System.out.println("Ort: " + ort);
	}

	static void handoutFile() {

		try {
			FileWriter aus = new FileWriter("Adressverwaltung.dat");
			BufferedWriter buff = new BufferedWriter(aus);
			buff.write(name + "\n" + vorname + "\n" + strasse + "\n" + plz + "\n" + ort);
			buff.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error -- " + e.toString());
		}

	}

	static void readinFile() {

		try {
			FileReader ein = new FileReader("Adressverwaltung.dat");
			BufferedReader buff = new BufferedReader(ein);
			name = buff.readLine();
			vorname = buff.readLine();
			strasse = buff.readLine();
			plz = buff.readLine();
			ort = buff.readLine();
			buff.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error -- " + e.toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cEingabe;
		int iIndex = 0;
		readinFile();

		do {
			System.out.println("||||||||||||||||||||||||||||||||||||");
			System.out.println("Satz eingeben......................1");
			System.out.println("Satz anzeigen......................2");
			System.out.println("Satz aendern.......................3");
			System.out.println("Liste zeigen.......................4");
			System.out.println("Datensatz speichern................5");
			System.out.println("Programmende.......................0");
			System.out.println("||||||||||||||||||||||||||||||||||||");

			cEingabe = Integer.parseInt(readString("Auswahl "));
			System.out.println("Eingabe: " + cEingabe);
			switch (cEingabe) {

			case 1: {

				System.out.println("Satzeingabe-Funktion"); // Satzeingabe-Funktion
				getAdresse();
				break;
			}

			case 2: {

				System.out.println("Satzzeigen-Funktion"); // Satzzeigen-Funktion
				showAdresse();
				break;
			}

			case 3: {

				System.out.println("Satzaendern-Funktion"); // Satzaendern-Funktion
				break;
			}

			case 4: {

				System.out.println("Liste zeigen-Funktion"); // Liste zeigen-Funktion
				break;
			}

			case 5: {

				handoutFile(); // Datensatz speichern-Funktion
				break;

			}
			}

		} while (cEingabe != 0);
	}
}
