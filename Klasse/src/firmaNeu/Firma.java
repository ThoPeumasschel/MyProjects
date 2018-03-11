package firmaNeu;

import java.io.*;
import java.util.*;

public class Firma {
	final int obergrenze = 100;
	int anzahlMitarbeiter; // Addition der Indizes Arbeiter und Angestellter
	int iIndex;
	String name, vorname, adresse, telefonnummer;
	String anzahlStunden;
	String monatsgehalt;
	String stundenlohn;
	
	int iangarr = 0;
	int iarbarr = 0;
	
	ArrayList<Angestellter> angarrL = new ArrayList<Angestellter>();
	ArrayList<Arbeiter> arbarrL = new ArrayList<Arbeiter>();

	void getData() {
		Scanner gd = new Scanner(System.in);
		System.out.println("Bitte Daten eingeben: \nName");
		name = gd.next();
		System.out.println("Vorname");
		vorname = gd.next();
		System.out.println("Adresse");
		adresse = gd.next();
		System.out.println("Telefon");
		telefonnummer = gd.next();
		iIndex++;
//		gd.close();
	}
	void writeToFile() {
		
		try {
			Formatter f = new Formatter("C:\\Users\\thoma\\MyProjects\\Klasse\\Angestellte.txt");
			f.format("\r\n%s\r\n%s\r\n%s\r\n%s\r\n", name, vorname, adresse, telefonnummer);
			
			f.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Error!");
		}
	}
	
	void readFromFile() {
		try {
			File x = new File("C:\\Users\\thoma\\MyProjects\\Klasse\\Angestellte.txt");
			Scanner rff = new Scanner(x);
			while (rff.hasNext()) {
				System.out.println(rff.next());
			}
			rff.close();
		} catch (FileNotFoundException e) {
			
			System.out.println("Error!");
		}
		
	}
	
}