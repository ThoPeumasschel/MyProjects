package firmaNeu;

import java.util.ArrayList;
import java.util.Scanner;

public class Angestellter extends Person {

	Scanner gd = new Scanner(System.in);

	void zeigePerson() {
		super.zeigePerson();
		System.out.println("Monatsgehalt: \t" + monatsgehalt + " €");
		System.out.println("##################################");
	}

	void getData() {
		super.getData();

		System.out.println("Monatsgehalt");
		monatsgehalt = gd.next();

	//	gd.close();

	}

	void writeToFile() {
		super.writeToFile();

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
