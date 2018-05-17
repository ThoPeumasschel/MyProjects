import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		ArrayList<Artikel> artikelListe = new ArrayList<Artikel>();
		
		
		do{
			System.out.println("Artikelnr eingeben: ");
			String nr = sca.nextLine();
			System.out.println("Artikelbezeichnung eingeben: ");
			String bezeichnung = sca.nextLine();
			System.out.println("Preis eingeben: ");
			double preis = Double.parseDouble( sca.nextLine() );
			
			/*Artikel artikel = new Artikel();
						
			artikel.nr = nr;
			artikel.bezeichnung = bezeichnung;
			artikel.preis = preis;
			*/
			
			artikelListe.add( new Artikel(nr, bezeichnung, preis) );
			
			
			System.out.println("weiteren Artikel Anlgen J/N");
		}while(sca.nextLine().equals("J"));
		
		for(Artikel a : artikelListe){
			System.out.println( a.nr + " " + a.bezeichnung + " " + a.preis );
		}

	}

}
