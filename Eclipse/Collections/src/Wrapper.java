import java.util.*;

public class Wrapper {

	public static void main(String[] args) {
		Vector grades = new Vector();
		int i = 98; // primitiver Datentyp
		Integer exam = new Integer(i); // exam ist Objekt
		grades.addElement(exam);
		Integer g = (Integer) grades.firstElement(); // Objekt
		int j = g.intValue(); // primitiver Datentyp
		System.out.println("Wert des Objektes: " + g);
		System.out.println("Wert des primitven Datentyps j: " + j);

	}

}
