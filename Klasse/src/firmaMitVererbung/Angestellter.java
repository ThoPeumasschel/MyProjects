package firmaMitVererbung;

import java.util.ArrayList;

public class Angestellter extends Person {
	int iangarr = 0;
	
	void zeigePerson() {
		super.zeigePerson();
		System.out.println("Monatsgehalt: \t" + monatsgehalt + " €");
		System.out.println("##################################");
	}

	void getData() {
		super.getData();
		monatsgehalt = readInt("Monatsgehalt");

	}

	// Standardkonstruktor
	public Angestellter() {
		super();
		monatsgehalt = 0;

	}

	// Parametrisierter Konstruktor
	public Angestellter(String n, String v, String a, String t, int monatsgehalt2) {
		super(n, v, a, t);
		monatsgehalt = monatsgehalt2;

	}

	public int getMonatsgehalt() {
		return monatsgehalt;
	}

	public void setMonatsgehalt(int monatsgehalt) {
		this.monatsgehalt = monatsgehalt;
	}

}
