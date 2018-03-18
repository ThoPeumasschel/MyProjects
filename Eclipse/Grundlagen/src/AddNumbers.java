
public class AddNumbers {

	public static void main(String[] args) {
		// Zählschleife
		int summe = 0;
		for (int i = 1; i <= 20; i++) {
			summe += i;
		/*	System.out.println(i + 
					". Schleifendurchlauf ergibt als Zwischensumme: " +
					summe); */
		}
		System.out.println("Summe: " + summe);
		System.out.println();
		
		// kopfgesteuerte Schleife
		int number = 1;
		while (number < 100)
		{
			number *= 2;
			System.out.println(number);			
		}
		System.out.println("Ergebnis: " + number);
		System.out.println();
		
		number = 1;
		do
		{
			number *= 2;
			System.out.println(number);		
		} while (number < 100);
		System.out.println("Ergebnis: " + number);
	}

}
