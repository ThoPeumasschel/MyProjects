package firmaNeu;

import java.util.ArrayList;
import java.util.Scanner;

public class AngestellterNeu extends PersonNeu {

	Scanner gd = new Scanner(System.in);
	
	public int iangarr = 0;
	

	public void zeigePerson() {
		super.zeigePerson();
		System.out.println("Monatsgehalt: \t" + monatsgehalt + " €");
		System.out.println("##################################");
	}

	public void getData() {
		super.getData();

		System.out.println("Monatsgehalt");
		monatsgehalt = gd.next();

	//	gd.close();

	}

	public void writeToFile() {
		super.writeToFile();

	}

	// Standardkonstruktor
	public AngestellterNeu() {

		monatsgehalt = null;

	}

	// Parametrisierter Konstruktor
	public AngestellterNeu(String n, String v, String a, String t, String m) {
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
