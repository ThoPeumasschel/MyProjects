import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// Mitarbeiterverwaltung zur Datenerfassung von Mitarbeitern: personalnr, nachname, vorname, urlaubstage
		
		/*
		Mitarbeiter ma1 = new Mitarbeiter();
		Mitarbeiter ma2 = new Mitarbeiter(2, "Musterfrau", "Maxi");
		
		ma1.setPersonalNr(1);;
		ma1.setNachname("Mustermann");
		ma1.setVorname("Max");
		
		
		System.out.println( ma1.getPersonalNr() + ": " + ma1.getNachname() + " hat " + ma1.getUrlaubstage() + " Urlaubstage.");
		
		if( ma1.macheUrlaub((byte)33) ){
			System.out.println("Mitarbeiter " + ma1.getNachname() + " ist im Urlaub");
		}else{
			System.out.println("Mitarbeiter " + ma1.getNachname() + " nicht ausreichend Resturlaubstage");
		}
		
		System.out.println( ma1.getPersonalNr() + ": " + ma1.getNachname() + " hat " + ma1.getUrlaubstage() + " Urlaubstage.");
		
		System.out.println( ma1.getDaten() );
		
		
		
		// Aufruf der überschriebenen toString() Methode
		System.out.println( ma1 );		
		System.out.println( ma2 );
		*/
		
		Angestellte ang1 = new Angestellte();
		ang1.setPersonalNr(3);
		ang1.setNachname("Muster");
		ang1.setVorname("Maximilian");
		ang1.setGehalt(3000.99);
		ang1.macheUrlaub((byte)20);
		System.out.println( ang1 );
		
		Angestellte ang2 = new Angestellte(4, "Musterschüler", "Tom", 4000.50);
		System.out.println( ang2 );
		
		Arbeiter arb1 = new Arbeiter(5, "Musterhausen", "Manni", 20.20);
		System.out.println( arb1 );
		
		Angestellte ang3 = new Angestellte(6, "Maler", "Horst", 2000, 30);
		System.out.println( ang3 );
		
		Freiberufler fb1 = new Freiberufler(7, "Feuerstein", "Fred", 200);
		System.out.println( fb1 );
		
		Mitarbeiter m = new Angestellte();
		//m = new Arbeiter();
		
		if(m instanceof Angestellte)
			System.out.println("Ja, ist ein Angestellter");
		else
			System.out.println("Nein ist kein Angestellter");
		
		ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
		mitarbeiterListe.add(ang1);
		mitarbeiterListe.add(arb1);
		mitarbeiterListe.add(fb1);
		
		for(Mitarbeiter mitarbeiter : mitarbeiterListe){
			if(mitarbeiter instanceof Angestellte)
				System.out.println( mitarbeiter.getNachname() + " " + ((Angestellte)mitarbeiter).getGehalt());
			else if(mitarbeiter instanceof Arbeiter)
				System.out.println( mitarbeiter.getNachname() + " " + ((Arbeiter)mitarbeiter).getStundenLohn());
			else if(mitarbeiter instanceof Freiberufler)
				System.out.println( mitarbeiter.getNachname() + " " + ((Freiberufler)mitarbeiter).getProvision());
			
			// Polymorphie / polymorphes Verhalten
			System.out.println( mitarbeiter.toString() );
		}
		
	}

}
