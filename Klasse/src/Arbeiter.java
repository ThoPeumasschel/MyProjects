
public class Arbeiter extends Person2 {
	private int stundenlohn;
	private int anzahlStunden;

	public int getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(int stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	public int getAnzahlStunden() {
		return anzahlStunden;
	}

	public void setAnzahlStunden(int anzahlStunden) {
		this.anzahlStunden = anzahlStunden;
	}

	public Arbeiter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Arbeiter(String n, String v, String a, String t) {
		super(n, v, a, t);
		// TODO Auto-generated constructor stub
	}

	public Arbeiter(String x, String y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

}
