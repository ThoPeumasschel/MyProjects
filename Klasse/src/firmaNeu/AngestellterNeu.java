package firmaNeu;

import java.io.Serializable;
import java.util.*;

public class AngestellterNeu extends PersonNeu implements Serializable {

	
	
	AngestellterNeu[] angarr = new AngestellterNeu[30];
	int iangarr = 0;
	

	public void zeigePerson() {
		super.zeigePerson();
		System.out.println("Monatsgehalt: \t" + monatsgehalt + " €");
		System.out.println("##################################");
	}

	public void getData() {
		super.getData();

		System.out.println("Monatsgehalt");
		try {
			Scanner gd = new Scanner(System.in);
			monatsgehalt = gd.next();
			
//			gd.close();
			iangarr++;
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		

	}
	
	public String toString() {
		return "\nAngestellter:\t" + vorname + " " + name + "\nAdresse:\t" 
				+  adresse + "\nTelefon:\t" + telefonnummer 
				+ "\nMonatsgehalt:\t" + monatsgehalt;
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
