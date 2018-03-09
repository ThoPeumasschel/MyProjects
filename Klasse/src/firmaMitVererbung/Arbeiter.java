package firmaMitVererbung;

import java.text.DecimalFormat;

public class Arbeiter extends Person {

	int iarbarr = 0;

	void zeigePerson() {
		super.zeigePerson();
		double wochenlohn = stundenlohn * anzahlStunden;
		double monatslohn = wochenlohn * 4;
		System.out.println(
				"Stundenlohn: \t" + new DecimalFormat("0.00").format(stundenlohn) + "\t€" + "\nAnzahl Stunden: "
						+ anzahlStunden + "\tstd" + "\nwöchentlich: \t" + new DecimalFormat("0.00").format(wochenlohn)
						+ "\t€" + "\nmonatlich ca.:\t" + new DecimalFormat("0.00").format(monatslohn) + "\t€");
		System.out.println("##################################");
	}

	void getData() {
		super.getData();
		stundenlohn = readInt("Stundenlohn");
		anzahlStunden = readInt("Stunden Anzahl");

	}

	
	

	// Default constructor
	public Arbeiter() {
		super();
		stundenlohn = 0; // Double wäre schöner
		anzahlStunden = 0;

	}

	// parametrisized constructor
	public Arbeiter(String n, String v, String a, String t, double d, int anz) {
		super(n, v, a, t);
		stundenlohn = d;
		anzahlStunden = anz;

	}

	public double getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(int d) {
		this.stundenlohn = d;
	}

	public int getAnzahlStunden() {
		return anzahlStunden;
	}

	public void setAnzahlStunden(int i) {
		this.anzahlStunden = i;
	}
}
