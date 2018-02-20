/* The n-th element of a array has the index (n-1);
 *
 *  Wenn die 13 nicht vorkommt sollte man auch eine Ausgabe haben. 
 *  Aber eben nur, wenn die 13 insgesamt nicht vorkommt. 
 *  Sonst gibt das Programm nämlich gar nichts aus. Das ist ja auch blöd!
 */


class Searchnumbers3 {
	boolean search() {
		int[] numbers = {0, 10, 12, 4, 7, 20, 21, 14};
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 13) {
				System.out.println("I found the number 13 on index " + i);
					return true;
			}
		
			else return false;
		
//		if (numbers[i] != 13) {
//			System.out.println("I couldn't find the number 13.");
//		}
	}
}
class MyClass {
	public static void main(String[] args) {
		Searchnumbers3 trial1 = new Searchnumbers3();
		trial1.search();


	}

}



