/* The n-th element of a array has the index (n-1);
 *
 * This is the minimal version of the program. 
 */


public class Searchnumbers {
	public static void main(String... args) {
		int[] numbers = {0, 10, 12, 4, 7, 20, 21, 13};
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 13) {
				System.out.println("I found the number 13 on index " + i + ".");
			}
		}
	}
}




