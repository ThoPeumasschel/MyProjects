import java.util.*;
import java.util.Iterator;

public class Tree {

	public static void main(String... args) {
		TreeSet set = new TreeSet();
		Mengen2 a = new Mengen2("Meier", "Heinz", 33);
		Mengen2 b = new Mengen2("Baumann", "Jens", 37);
		set.add(a);
		set.add(b);
		Iterator iter = set.iterator();
		Mengen2 x;
		while (iter.hasNext()) {
			x = (Mengen2) iter.next();
			System.out.println("Name: " + x.name + " " + x.vorname + 
					" " + x.personalnr);
		}
		Mengen2 f = new Mengen2("Baumann", "Jens", 37);
		if ( set.contains(f))
			System.out.println("f existiert bereits");
		else
			System.out.println("f ist nicht vorhanden");
	}
}
