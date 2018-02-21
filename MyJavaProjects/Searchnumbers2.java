/* The n-th element of a array has the index (n-1);
 *
 * This is a extended version of the program, 
 * taking into consideration that the number might not be in the array. 
 */


public class Searchnumbers2 {
   public static boolean search(int[] arr, int item) {
      for (int i : arr) { //enhanced for-loop is equal to (int i=0; i < arr.length; i++)
         if (item == i) {
            return true;
         }
      }
      return false;
   }
   public static void main(String[] args) {
      int[] numbers = {0, 10, 12, 4, 7, 20, 21, 13};
	  int num = 13;
      System.out.print("Is the number " + num + " part of the array?\t");
      System.out.println(search(numbers, num));
   }
}




