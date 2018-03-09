import java.io.*;

public class Firma {
	final int obergrenze = 100;
	int anzahlMitarbeiter; // Addition der Indizes Arbeiter und Angestellter
	int iIndex;
	String name, vorname, adresse, telefonnummer;
	int stundenlohn, anzahlStunden, monatsgehalt;

	Angestellter[] angarr = new Angestellter[30];
	Arbeiter[] arbarr = new Arbeiter[30];

	int iangarr = 0;
	int iarbarr = 0;

	public String readString(String text) {
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

	public int readInt(String text) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(text + ": ");
		try { // Überwachungsblock
			return Integer.parseInt(in.readLine());
		} catch (IOException e) { // Fehlerbehandlungsblock
			System.out.println("IO error");
			return 1;
		} catch (NumberFormatException e) { // Fehlerbehandlungsblock
			System.out.println("NumberFormat error");
			return 1;
		}
	}

	void getData() {
	System.out.println("Bitte Daten eingeben: ");
	name = readString("Name");
	vorname = readString("Vorname");
	adresse = readString("Adresse");
	telefonnummer = readString("Telefon");
	iIndex++;
	}	
	
/*	void getDataAng() {

		System.out.println("Bitte Daten eingeben: ");
		name = readString("Name");
		vorname = readString("Vorname");
		adresse = readString("Adresse");
		telefonnummer = readString("Telefon");
		monatsgehalt = readInt("Monatsgehalt");
		iIndex++;

	}

	void getDataArb() {

		System.out.println("Bitte Daten eingeben: ");
		name = readString("Name");
		vorname = readString("Vorname");
		adresse = readString("Adresse");
		telefonnummer = readString("Telefon");
		stundenlohn = readInt("Stundenlohn");
		anzahlStunden = readInt("Stunden Anzahl");
		iIndex++;

	}
*/
	void auflisten() { // iarb und iang hochzählen

		System.out.println();
		System.out.println("Mitarbeiter Daten: ");
		System.out.println("Name: " + name);
		System.out.println("Vorname: " + vorname);
		System.out.println("Adresse: " + adresse);
		System.out.println("Telefon: " + telefonnummer);
		System.out.println("Stundenlohn: " + stundenlohn);
		System.out.println("Anzahl Stunden: " + anzahlStunden);
		System.out.println("Monatsgehalt: " + monatsgehalt);

	}
	 int countMembers() {
		 return iarbarr + iangarr;
	 }

}
