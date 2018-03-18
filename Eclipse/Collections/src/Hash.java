import java.util.*;

public class Hash {

	public static void main(String[] args) {
		// hashtable verwaltet key - value Paare
		Hashtable<String, String> births = new Hashtable<String, String>();
		births.put("Katie", "040585");
		births.put("Bob", "310183");
		births.put("Bill", "051179");
		String s1 = (String) births.get("Katie");
		if (births.containsKey("Bob"))
			System.out.println("Bob");
		births.remove("Bill");
		int size = births.size();
		System.out.println("Katie: " + s1);
		System.out.println("Groesse: " + size);

	}

}
