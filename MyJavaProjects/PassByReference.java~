
public class PassByReference {

	static int onetoZero(int arg[]) {

		int count = 0;
		for(int i = 0; i < arg.length; i++) {
			if (arg[i] == 1) {
				count++;
				arg[i] = 0;
			}

		}
		return count;
	}


	public static void main(String... args) {

		int arr[] = {1, 3, 4, 5, 1, 1, 7};
		int numOnes;
		System.out.print("Values of the array: [ ");
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println("]");
		// Unterprogramm aufrufen.
		// Call by Value: Unterprogramm arbeitet mit einer Kopie des Originalwertes, 
		// der Originalwert kann nicht verändert werden.  
		// Von Java werden automatich alle primitiven Datentypen by value übergeben, 
		// damit kann das UP die Variable ändern. 
		// Von Java werden automatisch alle Arrays, Strings und Objekte
		// by reference übergeben. 
		numOnes = onetoZero(arr);
		System.out.println("Number of ones = " + numOnes);
		System.out.print("Values of the new array: [ ");
		for(int i = 0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("]");

	}

}
