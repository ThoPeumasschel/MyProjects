package firmaNeu;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ArbeiterNeu extends PersonNeu {

	Scanner gd = new Scanner(System.in);
	
	public int iarbarr = 0;

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

		System.out.println("Stundenlohn");
		stundenlohn = gd.next();
		System.out.println("Stunden Anzahl");
		anzahlStunden = gd.next();

		gd.close();

	}

	// Default constructor
	public ArbeiterNeu() {
		super();
		stundenlohn = null; // Double wäre schöner
		anzahlStunden = null;

	}

	// parametrisized constructor
	public ArbeiterNeu(String n, String v, String a, String t, String d, String anz) {
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
