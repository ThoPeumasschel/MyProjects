import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String menu;
		String[] berechnungen = new String[100];
		int anzBerechnungen = 0;
		
		do{
			double zahl1 = 0, zahl2 = 0;
			String ausgabeString = "";
			
			System.out.println("A - Addition");
			System.out.println("S - Subtraktion");
			System.out.println("M - Multiplikation");
			System.out.println("D - Division");
			System.out.println("P - Print / Auflistung aller bisherigen Berechnungen");
			System.out.println("E - Ende / Programm verlassen");
			
			menu = new Scanner(System.in).next();
			
			switch(menu){
			case "A":
			case "S":
			case "M":
			case "D":
				System.out.println("Zahl 1 eingeben:");
				zahl1 = new Scanner(System.in).nextDouble();
				System.out.println("Zahl 2 eingeben:");
				zahl2 = new Scanner(System.in).nextDouble();
				
				anzBerechnungen++;
			}
			
			switch(menu){
			case "A":
				ausgabeString = zahl1 + " + " + zahl2 + " = " + (zahl1 + zahl2);
				System.out.println( ausgabeString );
				berechnungen[anzBerechnungen-1] = ausgabeString;
				break;
			case "S":
				ausgabeString = zahl1 + " - " + zahl2 + " = " + (zahl1 - zahl2);
				System.out.println( ausgabeString );
				berechnungen[anzBerechnungen-1] = ausgabeString;
				break;
			case "M":
				ausgabeString = zahl1 + " * " + zahl2 + " = " + (zahl1 * zahl2);
				System.out.println( ausgabeString );
				berechnungen[anzBerechnungen-1] = ausgabeString;
				break;
			case "D":
				ausgabeString = zahl1 + " / " + zahl2 + " = " + (zahl1 / zahl2);
				System.out.println( ausgabeString );
				berechnungen[anzBerechnungen-1] = ausgabeString;
				break;
			case "P":
				System.out.println("Alle bisherigen Berechnungen:");
				for(int i = 0; i < anzBerechnungen; i++ )
					System.out.println(berechnungen[i]);
				break;
			case "E":
				System.out.println("Programm wurde beendet");
				break;
			default:
				System.out.println("falsche Eingabe");
				break;
			}
			
		}while(!menu.equals("E"));

	}

}
