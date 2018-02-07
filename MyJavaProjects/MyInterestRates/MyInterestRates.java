/* Zinsrechner. Hier wäre noch einiges zu tun:
 * Um den Zinseszins berücksichtigen zu können, 
 * muss eine Potenz mit in die Formel gebracht werden. 
 * Die nötige Methode dazu ist Math.pow(a, b), was ab berechnet. 
 * Finanzmathematikern ist das als Übung überlassen.
 */




public class MyInterestRates {



	public static void main( String[] args ) {

		System.out.println( "Kapital?" );

		double capital = new java.util.Scanner( System.in ).nextDouble();



		System.out.println( "Zinssatz?" );

		double interestRate = new java.util.Scanner( System.in ).nextDouble();



		System.out.println( "Anlagedauer in Monaten?" );

		int month = new java.util.Scanner( System.in ).nextInt();



		double totalInterestRate = capital * interestRate * month / (12*100);

		System.out.printf( "Zinsen: %g%n", totalInterestRate );

	}

}


/* Und hier gäbs dann noch eine Aufgabe mit meiner geliebten Swing-Bib.
 *
 * String input = javax.swing.JOptionPane.showInputDialog( "Eingabe" );
 *
 * Das wäre natürlich der Hammer wenn ich das mal kapieren würde..
 *
 */
