package firmaNeu;

import java.io.*;
import java.util.*;

public class FirmaNeu {
	final int obergrenze = 100;
	int anzahlMitarbeiter; // Addition der Indizes ArbeiterNeu und AngestellterNeu
	int iIndex;
	String name, vorname, adresse, telefonnummer;
	String anzahlStunden;
	String monatsgehalt;
	String stundenlohn;
	
	
	
	
	
	ArrayList<AngestellterNeu> angarrL = new ArrayList<AngestellterNeu>();
	ArrayList<ArbeiterNeu> arbarrL = new ArrayList<ArbeiterNeu>();

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
//			Formatter f = new Formatter("C:\\Users\\thoma\\MyProjects\\Klasse\\Angestellte.txt");
			Formatter f = new Formatter("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Angestellte.txt");
			f.format("\r\n%s\r\n%s\r\n%s\r\n%s\r\n", name, vorname, adresse, telefonnummer);
			
			f.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Error!");
		}
	}
	
	void readFromFile() {
		try {
//			File x = new File("C:\\Users\\thoma\\MyProjects\\Klasse\\Angestellte.txt");
			File x = new File("C:\\Users\\tpeuschel\\My_Projects\\Klasse\\Angestellte.txt");
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