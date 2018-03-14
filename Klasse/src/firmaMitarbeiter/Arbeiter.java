package firmaMitarbeiter;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.*;

public class Arbeiter extends Person implements Serializable {

	void zeigePerson() {
		super.zeigePerson();
		// double wochenlohn = stundenlohn * anzahlStunden;
		// double monatslohn = wochenlohn * 4;
		System.out.println("Stundenlohn: \t" + new DecimalFormat("0.00").format(stundenlohn) + "\t€"
				+ "\nAnzahl Stunden: " + anzahlStunden + "\tstd");
		System.out.println("##################################");
	}

	void getData() {
		super.getData();
		try {
			Scanner gd = new Scanner(System.in);
			System.out.println("Stundenlohn");
			stundenlohn = gd.next();
			System.out.println("Stunden Anzahl");
			anzahlStunden = gd.next();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// gd.close();

	}
	
	public String toString() {
		return "\nAngestellter:\t" + vorname + " " + name + "\nAdresse:\t" + adresse + "\nTelefon:\t" + telefonnummer
				+ "\nStundenlohn:\t" + stundenlohn + "\nStunden Anzahl:\t" + anzahlStunden;
	}
	// Default constructor
	public Arbeiter() {
		super();
		stundenlohn = null; // Double wäre schöner
		anzahlStunden = null;

	}

	// parametrisized constructor
	public Arbeiter(String n, String v, String a, String t, String d, String anz) {
		super(n, v, a, t);
		stundenlohn = d;
		anzahlStunden = anz;

	}

	public String getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(String d) {
		this.stundenlohn = d;
	}

	public String getAnzahlStunden() {
		return anzahlStunden;
	}

	public void setAnzahlStunden(String i) {
		this.anzahlStunden = i;
	}
}
