import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("Eingabe einer Zahl zur Quersummen Berechnung: ");
		Scanner sca = new Scanner(System.in);
		String eingabe = sca.nextLine();
		
		int quersumme = 0;
		
		for(int j = 0; j < eingabe.length(); j++){
			quersumme += Integer.parseInt( String.valueOf(eingabe.charAt(j)) );
		}
		System.out.println("Die Quersumme von " + eingabe + " ist " + quersumme);
		
		
	}
}
