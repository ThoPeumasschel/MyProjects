package windowBuilder.common;

public class Arbeiter extends Person {
	private int stundenlohn, anzahlstd;
	

	Arbeiter() {
		super();
		stundenlohn = 0;
		anzahlstd = 0;
	}

	Arbeiter(String n, String v, String a, String t, int stl, int anz) {
		super(n, v, a, t);
		stundenlohn = stl;
		anzahlstd = anz;

	}

	String zeigePerson() {
		return super.zeigePerson() + "Stundenlohn:\t" + stundenlohn + "\nAnzahl Stunden:\t" + anzahlstd + "\n";

	}

	int getStundenlohn() {
		return stundenlohn;
	}

	void setStundenlohn(int stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	int getAnzahlstd() {
		return anzahlstd;
	}

	void setAnzahlstd(int anzahlstd) {
		this.anzahlstd = anzahlstd;
	}

}
