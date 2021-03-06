package firmaMitarbeiter;

import java.io.Serializable;
import java.util.*;

@SuppressWarnings("serial")
public class Angestellter extends Person implements Serializable {
	int an = 0;
	void zeigePerson() {
		super.zeigePerson();
		System.out.println("Monatsgehalt: \t" + monatsgehalt + " �");
		System.out.println("##################################");
	}

	public void getData() {
		super.getData();

		System.out.println("Monatsgehalt");
		try {
			Scanner gd = new Scanner(System.in);
			monatsgehalt = gd.next();

			// gd.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public String toString() {
		
		
		return "\nAngestellter:\t" + vorname + " " + name + "\nAdresse:\t" + adresse + "\nTelefon:\t" + telefonnummer
				+ "\nMonatsgehalt:\t" + monatsgehalt;
		
	}

	// Standardkonstruktor
	public Angestellter() {

		monatsgehalt = null;

	}

	// Parametrisierter Konstruktor
	public Angestellter(String n, String v, String a, String t, String m) {
		super(n, v, a, t);
		monatsgehalt = m;

	}

	public String getMonatsgehalt() {
		return monatsgehalt;
	}

	public void setMonatsgehalt(String monatsgehalt) {
		this.monatsgehalt = monatsgehalt;
	}

	public String setMonatsgehalt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
