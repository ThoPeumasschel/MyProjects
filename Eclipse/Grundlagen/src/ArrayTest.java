
public class ArrayTest {
	
	static String[] firstNames = {"Dennis", "Grace", "Bjarne", "James"};
	static String[] lastNames = new String[firstNames.length];
	
	static void printNames() {
		for (int i = 0; i < firstNames.length; i++)
			System.out.println(firstNames[i] + " " + lastNames[i]);
		System.out.println("-----");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNames();
		lastNames[0] = "Ritchie";
		lastNames[1] = "Hopper";
		lastNames[2] = "Stroustrup";
		lastNames[3] = "Gosling";
		printNames();
	}

}
