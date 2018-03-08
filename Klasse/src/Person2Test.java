import java.io.ObjectInputStream.GetField;
import java.util.*;

public class Person2Test {
	int iIndex;
	String name, vorname, adresse, telefonnummer, stundenlohn, anzahlStunden, monatsgehalt;
	
	Angestellter[] angarr = new Angestellter[30];
	Arbeiter[] arbarr = new Arbeiter[30];
	
	int iangarr = 0;
	int iarbarr = 0;
	
	Scanner sc = new Scanner(System.in);
	
	
	
	
	
	
	void getData() {
		
		System.out.println("Bitte Daten eingeben: ");
		name = sc.next();
		vorname = sc.next();
		adresse = sc.next();
		telefonnummer = sc.next();
		stundenlohn = sc.next();
		anzahlStunden = sc.next();
		monatsgehalt = sc.next();
		iIndex++;
		
	}
	
	public static void main(String[] args) {
/*		Person2 pers1 = new Person2();
		System.out.println("Standardkonstruktoraufruf, noch sind keine Werte gesetzt.\n");
		pers1.zeigePerson();
		System.out.println("##################################");
		pers1.setName("Huber");
		pers1.setVorname("Heinrich");
		pers1.setAdresse("Hohe Str. 8, 78345 Im tiefen Tal");
		pers1.setTelefonnummer("0478/25 45 86");
		System.out.println("\nMit Getter- und Setter-Methoden wurden Werte gesetzt.");
		System.out.println("Nochmal \"pers1\" zeigen: \n");
		pers1.zeigePerson();
		System.out.println("##################################");

		Person2 pers2 = new Person2("Ramming", "Egon", "Wiesenstr. 43, " + "65748 Am Wald", "09123/249 54 82");
		System.out.println("\nWeiteres Objekt wurde erzeugt und Werte direkt an Konstruktor übergeben:\n");
		pers2.zeigePerson();
		System.out.println("##################################");
		
		Person2 pers3 = new Person2("Schmidt", "Armin");
		System.out.println("\nHier werden nur Hamburger ohne Telefon erzeugt.\n");
		pers3.zeigePerson();
		System.out.println("##################################");
		Person2 pers4 = new Person2("Meier", "Fritz");
		pers4.zeigePerson();
		System.out.println("##################################");
*/		
		
/*		Angestellter ang = new Angestellter("Meier", "Thorsten", "München", "09123/543", 3500);		
//		ang.setMonatsgehalt(3800);
		System.out.println("Angestellter 1");
		ang.zeigePerson();
		ang.menue();
		
		Angestellter ang2 = new Angestellter();		
		ang2.setMonatsgehalt(2700);
		ang2.setVorname("Martina");
		ang2.setName("Hild");
		ang2.setAdresse("Mühlheim");
		ang2.setTelefonnummer("0190/567 678");
		System.out.println("Angestellte 2");
		ang2.zeigePerson();
*/		
		
		
		
		
		
		
		angarr[iangarr++] = new Angestellter("Meier", "Al", "Köln", "934875", iangarr);
		angarr[iangarr++] = new Angestellter();
		angarr[iangarr++] = new Angestellter();
		
		if(iangarr > 29) {
			System.out.println("Array Angestellte voll!");
		}
		
		for (int i = 0; i < iangarr; i++) {
			
			System.out.println("Angestellter 1: " );
			
			
		}
		
		Arbeiter arb = new Arbeiter("Rüll", "Hugo", "Limbach", "0534/1357", 34.56, 14);
//		arb.setStundenlohn(64.56);
//		arb.setAnzahlStunden(3);
//		System.out.println("Arbeiter 1");
//		arb.zeigePerson();
		arb.arb_daten[0] = new Arbeiter();
		System.out.println("Test: " + arb.arb_daten[0]);
		arb.menue(arb);
		
		Arbeiter[] arbeiterArray = new Arbeiter[7];
		arbeiterArray[0] = new Arbeiter();
		arbeiterArray[0].stundenlohn = 99;
	    System.out.println(arbeiterArray[0].stundenlohn); // prints 99
	    arb.menue(arbeiterArray[0]);
	    System.out.println(arbeiterArray[0].stundenlohn);
		
		
		
		
		Arbeiter arb2 = new Arbeiter();
		arb2.setStundenlohn(33.89);
		arb2.setAnzahlStunden(23);
		arb2.setVorname("Martin");
		arb2.setName("Huber");
		arb2.setAdresse("Mühlheim");
		arb2.setTelefonnummer("0888/54532");
		System.out.println("Arbeiter 2");
//		arb2.zeigePerson();
		arb2.menue(arb2);
	}

}
