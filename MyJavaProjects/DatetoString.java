import java.util.*; 

class DatetoString {

		public static void main(String...args) {

			String s1 = "Das aktuelle Datum ist: ";
			String s2 = new Date().toString();
			String s3 = s1.concat(s2); 

			System.out.println("\n\t" + s3 + "\n");

		}
 }
