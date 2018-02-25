
public class Suchen {

	static int findMax(int[] arr) {
		
		int max = 0;
		for(int i=1; i < arr.length; i++) {
			if (arr[i] > arr[max])
				max = i;
		}
		return max;

	}

	static int findElement (int[] arr, int element) {

		int pos = 0;
		boolean isFound = false;
		while (!isFound && (pos < arr.length)) {
			
			if (arr[pos] == element)
				isFound = true;
			else
				pos++;
		}
		
		if (isFound)
			return pos;
		else
			return -1;
	}

	static void bubbleSort(int[] arr) {

		int temp = 0;
		for(int i = arr.length - 1; i >= 0; i--)
			for( int j = 0; j <= i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
	}

	static int findElementbinary (int[] arr, int element) {

		boolean isFound = false;
		int left = 0, right = arr.length - 1, middle = 0;
		int zaehler = 0;
		while (!isFound && (left <= right))	{

			middle = (left + right) / 2;
			zaehler++;
			if (arr[middle] == element)
				isFound = true;
			else {
				if (arr[middle] > element)
					right = middle - 1;
				else
					left = middle + 1;

			}
		}

		System.out.println("Es wurde beim binarySearch " 
					+ zaehler + " mal zugegriffen.\n");

		if (isFound)
			return middle;
		else
			return -1;
	}

	static void insertionSort(int[] arr) {

		int temp = 0, j = 0;
		for(int i = 1; i < arr.length; i++) {

			temp = arr[i];
			j = i;
			while(j > 0 && arr[j-1] > temp) {

				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}


	public static void main(String...args) {
		// Das zu bearbeitende array:
		int arg[] = {3, 6, 2, 12, 1, 15, 13, 9, 36, 56456, 5745, 275, 91746, 464, 373, 75735, 375, 47, 25856};

		System.out.println();

		//findMax
		int erg, find = 6;
		erg = findMax(arg);
		System.out.println("Index mit groesstem Wert: " + erg + "\t Wert im Array: " + arg[erg] + "\n");

		//findElement
		erg = findElement(arg, find);
		if (erg == -1)
			System.out.println("Die Zahl " + find + " wurde nicht im array gefunden.");
		else 
			System.out.println("Index des gesuchten Werts: " + erg + "\t gesuchter Wert im array: " + arg[erg] + "\n");
	
		//insertionSort
		insertionSort(arg);
		System.out.println("Nach insertionSort: ");
		for(int i=0; i < arg.length; i++)
			System.out.print(arg[i] + " ");
		System.out.println("\n");


		//bubbleSort
		bubbleSort(arg);
		System.out.println("Nach bubbleSort: ");
		for(int i=0; i < arg.length; i++)
			System.out.print(arg[i] + " ");
		System.out.println("\n");

		erg = findElementbinary(arg, find);
		if (erg == -1)
			System.out.println("Die Zahl " + find + " wurde nicht im array gefunden.");
		else 
			System.out.println("Index des gesuchten Werts: " + erg + "\t gesuchter Wert im array: " + arg[erg] + "\n");

		


	}
}






