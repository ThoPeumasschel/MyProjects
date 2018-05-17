import java.util.ArrayList;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		// eindimensionales Array
		String[] wochentage = new String[3];
		wochentage[0] = "Monstag";
		wochentage[1] = "Dienstag";
		wochentage[2] = "Mittwoch";
		
		
		Arrays.sort(wochentage);
		for(int i = 0; i < wochentage.length; i++){
			System.out.println( wochentage[i] );
		}
		
		// erweitertes for / foreach
		for(String daten : wochentage )
			System.out.println( daten );
		
		int[] zahlen = {123, 3423, 33432, 232};
		System.out.println( zahlen.length );
		
		// zweidimensionales Array
		String[][] plzOrt = new String[4][2];
		
		plzOrt[0][0] = "01234";
		plzOrt[0][1] = "Berlin";
		
		plzOrt[1][0] = "22222";
		plzOrt[1][1] = "München";
		
		plzOrt[2][0] = "33333";
		plzOrt[2][1] = "Wiesbaden";
		
		plzOrt[3][0] = "44444";
		plzOrt[3][1] = "Bonn";
		
		
		// 0 - PLZ
		// 1 - Ort
		
		String[][] plzOrt2 = {
				{"01234", "Berlin"}, 
				{"22222", "München"}, 
				{"33333", "Wiesbaden"}, 
				{"44444", "Wiesbaden"}
		};
		
		for (int i = 0; i < plzOrt.length; i++) {
			System.out.println( plzOrt[i][0] + " : " + plzOrt[i][1] );
		}
		
		// 5-dimensionales Array
		int[][][][][][] spassArray = {
				{{{{{1, 2, 3 }, {4, 5, 6}}, {{7, 8, 9}}, {{10, 11, 12}, {13, 14, 15}}, {{16, 17, 18}, {19, 20}, {21}}}, {{{22, 23}, {24, 25}}, {{26, 27, 28, 29}}}}}
		};
		
		// ----------------------------------------------------
		
		// ArrayList , dynamischer Container, nimmt werte auf unterschiedlichen Datentyps
		ArrayList liste = new ArrayList();
		liste.add(123);
		liste.add("Java");
		liste.add(true);
		
		System.out.println( liste.get(0) );
		System.out.println("Größe der liste: " + liste.size());
		
		for(Object daten : liste ){
			System.out.println(daten);
		}
		
		// typisierte Liste
		ArrayList<String> einkaufsliste = new ArrayList<String>();
		einkaufsliste.add("Butter");
		einkaufsliste.add("Milch");
		einkaufsliste.add("Waschmittel");
		
		einkaufsliste.remove("Butter");
		//einkaufsliste.clear();
		
		for(String daten : einkaufsliste ){
			System.out.println(daten);
		}
		
		// typisierte ArrayList nicht mit primitiven Datentypen möglich, aber alternativ mit den WrapperKlassen
		ArrayList<Integer> zahlenListe = new ArrayList<Integer>();
		zahlenListe.add(123);
		
		// Datencontainer für Artikel bestehend aus Artikelnummer, Bezeichnung, Preis
		ArrayList<String[]> artikelListe = new ArrayList<>();
		String[] artikel1 = {"123", "IPHone X", "1000.99"};
		artikelListe.add(artikel1);
		
		for(String[] daten : artikelListe ){
			for(String artikelDaten : daten ){
				System.out.println(artikelDaten);
			}
		}
		
		
		
	}

}
