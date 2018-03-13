package firmaNeu;

import java.io.*;
import java.util.*;

public class FirmaNeu implements Serializable {
	final int obergrenze = 100;
	int anzahlMitarbeiter; // Addition der Indizes ArbeiterNeu und AngestellterNeu
	static int iIndex;
	String vorname, name, adresse, telefonnummer;
	String anzahlStunden;
	String monatsgehalt;
	String stundenlohn;

	ArrayList<AngestellterNeu> angarrL = new ArrayList<AngestellterNeu>();
	ArrayList<ArbeiterNeu> arbarrL = new ArrayList<ArbeiterNeu>();

	void getData() {
		try {
			Scanner gd = new Scanner(System.in);
			System.out.println("Bitte Daten eingeben: \nVorname");
			vorname = gd.next();
			System.out.println("Name");
			name = gd.next();
			System.out.println("Adresse");
			adresse = gd.next();
			System.out.println("Telefon");
			telefonnummer = gd.next();
	//		gd.close();
			iIndex++;
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}