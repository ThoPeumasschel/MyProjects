package firmaMitarbeiter;

import java.io.*;
import java.util.*;

@SuppressWarnings("serial")
public class Firma implements Serializable {
	final int obergrenze = 100;
	
	static int iIndex; //zählt jeden Aufruf der getData() Funktion. Angestellter oder Arbeiter. 
	String vorname, name, adresse, telefonnummer;
	String anzahlStunden;
	String monatsgehalt;
	String stundenlohn;

	ArrayList<Angestellter> angarrL = new ArrayList<Angestellter>();
	ArrayList<Arbeiter> arbarrL = new ArrayList<Arbeiter>();

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