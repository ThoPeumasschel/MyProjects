/* The n-th element of a array has the index (n-1);
 *
 *  
 */


public class Searchnumbers {
	public static void main(String... args) {
		boolean found = false;
		int[] numbers = {0, 10, 12, 4, 7, 20, 21, 14};
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 13) {
				found = true;
				System.out.println("I found the number 13 on index " + i + ".");
			}
				
	
		}

			if (found == false) {
				System.out.println("There is no number 13 in the array.");

		}	
	}
}




