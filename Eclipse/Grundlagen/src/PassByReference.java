
public class PassByReference {

	static int onetoZero(int a, int arg[]) {
		int count = 0;
		for (int i=0; i<arg.length; i++)
		{
			if (arg[i] == 1) {
				count++;
				arg[i] = 0;
			}
		}
		a = 0;
		return count;
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 1, 1, 7 };
		int numOnes, x = 10;
		System.out.print("Values of the array: [ ");
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("]");
		// Unterprogramm aufrufen
		// Call by value: UP arbeitet mit einer Kopie des Originalwertes,
		// Der Originalwert kann nicht verändert werden.
		// Von Java werden autom. alle unitären Datentypen by value übergeben
		// Call by reference: Es wird die Adresse der Variablen übergeben,
		// damit kann das UP die Variable verändern.
		// Von Java werden autom. alle Arrays, Strings und Objekte 
		// by reference übergeben.
		numOnes = onetoZero(x, arr);
		System.out.println("Number of ones = " + numOnes);
		System.out.print("Values of the new array: [ ");
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("]");
		System.out.println("Wert von x = " + x);
	}
}
