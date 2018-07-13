
public class Mengen2 extends Mengen1 implements Comparable {

	public Mengen2() {
		super();
	}

	public Mengen2(String a, String b, int i) {
		super(a, b, i);
	}

	@Override
	public int compareTo(Object arg0) {
		Mengen2 bsc = (Mengen2) arg0;
		int i = name.compareTo(bsc.name);
		if (i != 0)
			return i;
		else {
			i = vorname.compareTo(bsc.vorname);
			if (i != 0)
				return i;
			else {
				i = personalnr - bsc.personalnr;
				return i;
			}
		}
		
		
		
		
	}

}
