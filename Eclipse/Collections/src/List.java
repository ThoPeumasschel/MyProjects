import java.util.*;

public class List {

	public  static void main(String...args) {
		HashSet set = new HashSet();
		Mengen1 a = new Mengen1("Meier", "Heinz", 33);
		Mengen1 b = new Mengen1("Baumann", "Jens", 37);
		set.add(a);
		set.add(b);
		Iterator iter = set.iterator();
		while (iter.hasNext())
			System.out.println(iter.next().hashCode());
		Mengen1 f = new Mengen1("Baumann", "Jens", 37);
		if (set.contains(f))
		System.out.println("f existiert bereits");
		else
		System.out.println("f ist nicht vorhanden");
		
	}
}
