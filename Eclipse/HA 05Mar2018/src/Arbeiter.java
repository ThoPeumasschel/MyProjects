
public class Arbeiter extends Person {

	int stundenlohn;
	int anzahlstunden;

	// Standardkonstruktor
	Arbeiter() {
		super();
		stundenlohn = 0;
		anzahlstunden = 0;
	}

	// parametisierte Konstruktor
	Arbeiter(String n, String v, String a, String t, int s, int as) {
		super(n, v, a, t);
		stundenlohn = s;
		anzahlstunden = as;
	}

	public int getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(int stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	public int getAnzahlstunden() {
		return anzahlstunden;
	}

	public void setAnzahlstunden(int anzahlstunden) {
		this.anzahlstunden = anzahlstunden;
	}

	void zeigePerson() {
		super.zeigePerson();
		System.out.println("Stundenlohn: " + stundenlohn + "€");
		System.out.println("Anzahl Stunden: " + anzahlstunden + "h");
		System.out.println("---------");
	}

	
	
	
	/*
	 * void zeigeArbarr() {
	 * 
	 * int[] arbarr = new int[30]; System.out.println("Arbeiter Array: "); {
	 * 
	 * for (int i = 0; i < arbarr.length; i++) { arbarr[i] = i + 1;
	 * 
	 * System.out.print(arbarr[i] + " ");
	 * 
	 * }
	 * 
	 * } }
	 */
}