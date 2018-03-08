import java.text.DecimalFormat;

public class Arbeiter extends Person2 {
	private int stundenlohn;
	private int anzahlStunden;

	void zeigePerson() {
		super.zeigePerson();
		double wochenlohn = stundenlohn * anzahlStunden;
		double monatslohn = wochenlohn * 4;
		System.out.println(
				"Stundenlohn: \t" + new DecimalFormat("0.00").format(stundenlohn) + "\t€" + "\nAnzahl Stunden: "
						+ anzahlStunden + "\tstd" + "\nwöchentlich: \t" + new DecimalFormat("0.00").format(wochenlohn)
						+ "\t€" + "\nmonatlich ca.:\t" + new DecimalFormat("0.00").format(monatslohn) + "\t€");
		System.out.println("##################################");
	}

	// Default constructor
	public Arbeiter() {
		super();
		stundenlohn = 0; // Double wäre schöner
		anzahlStunden = 0;

	}

	// parametrisized constructor
	public Arbeiter(String n, String v, String a, String t, int std, int anz) {
		super(n, v, a, t);
		stundenlohn = std;
		anzahlStunden = anz;

	}

	public double getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(double d) {
		this.stundenlohn = d;
	}

	public int getAnzahlStunden() {
		return anzahlStunden;
	}

	public void setAnzahlStunden(int i) {
		this.anzahlStunden = i;
	}
}
