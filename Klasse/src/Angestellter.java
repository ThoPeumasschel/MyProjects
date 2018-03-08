
public class Angestellter extends Person2 {

	private int monatsgehalt;

	void zeigePerson() {
		super.zeigePerson();
		System.out.println("Monatsgehalt: \t" + monatsgehalt + " �");
		System.out.println("##################################");
	}

	// Standardkonstruktor
	public Angestellter() {
		super();
		monatsgehalt = 0;

	}

	// Parametrisierter Konstruktor
	public Angestellter(String n, String v, String a, String t, int monatsgehalt2) {
		super(n, v, a, t);
		monatsgehalt = monatsgehalt2;

	}

	public int getMonatsgehalt() {
		return monatsgehalt;
	}

	public void setMonatsgehalt(int monatsgehalt) {
		this.monatsgehalt = monatsgehalt;
	}

}
