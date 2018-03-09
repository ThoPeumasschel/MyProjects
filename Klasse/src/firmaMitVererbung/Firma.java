package firmaMitVererbung;

import java.io.*;

public class Firma {
	final int obergrenze = 100;
	int anzahlMitarbeiter; // Addition der Indizes Arbeiter und Angestellter
	int iIndex;
	String name, vorname, adresse, telefonnummer;
	int anzahlStunden, monatsgehalt;
	double stundenlohn;

	Angestellter[] angarr = new Angestellter[30];
	Arbeiter[] arbarr = new Arbeiter[30];
	

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

}