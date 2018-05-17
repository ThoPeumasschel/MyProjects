import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		ArrayList<String[]> artikelListe = new ArrayList<String[]>();
		
		/*
		String[][] artikelListe2 = new String[100][3];
		int anzArtikel = 0;
		*/
		
		do{
			System.out.println("Artikelnr eingeben: ");
			String nr = sca.nextLine();
			System.out.println("Artikelbezeichnung eingeben: ");
			String bezeichnung = sca.nextLine();
			System.out.println("Preis eingeben: ");
			String preis = sca.nextLine();
			
			String[] artikel = {nr, bezeichnung, preis};
			artikelListe.add(artikel);
			
			/*
			// Variante mit mehrdimensionales Array
			artikelListe2[anzArtikel][0] = nr;
			artikelListe2[anzArtikel][1] = bezeichnung;
			artikelListe2[anzArtikel][2] = preis;
			anzArtikel++;
			*/
			
			System.out.println("weiteren Artikel Anlgen J/N");
		}while(sca.nextLine().equals("J"));
		
		for( String[] artikel : artikelListe ){
			for( String wert : artikel){
				System.out.print(wert + " ");
			}
			System.out.println();
		}

	}

}
