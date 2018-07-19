import java.util.*;

public class Vect {

	public static void main(String[] args) {
		Vector ord = new Vector();
		ord.addElement("1");
		ord.addElement("2");
		ord.insertElementAt("3", 1);
		//ord.removeElement("2");
		//ord.insertElementAt(1);
		//ord.removeAllElements(); Vector leeren
		String o1 = (String) ord.firstElement();
		String o2 = (String) ord.elementAt(1);
		String o3 = (String) ord.lastElement();
		int cap = ord.capacity();
		int size = ord.size();
		int index = ord.indexOf("3");
		System.out.println(o1 + " " + o2 + " " + o3);
		System.out.println("Kapazität: " + cap); // wieso ist das Ergebnis hier 10???
		System.out.println("Laenge: " + size);
		System.out.println("Index von Eintrag '3': " + index);
		System.out.println();
		
		Enumeration e = ord.elements();
		String s;
		while (e.hasMoreElements()) {
			s = (String) e.nextElement();
			System.out.println("s = " + s);
		}
		
	}

}
