
public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1, str2;
		str1 = "Free the bound periodicals.";
		str2 = str1;
		
		System.out.println("String1: " + str1);
		System.out.println("String2: " + str2);
		System.out.println("Same object? " + (str1 == str2));
		System.out.println();
		
		str2 = new String(str1);
		System.out.println("String1: " + str1);
		System.out.println("String2: " + str2);
		// == macht einen Objektvergleich
		System.out.println("Same object? " + (str1 == str2));
		// equals macht einen Inhaltsvergleich
		System.out.println("Same value? " + str1.equals(str2));
		
	}

}
