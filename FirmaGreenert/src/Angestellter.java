
public class Angestellter extends Person {
	private int monatsgehalt;
	
	
	
	Angestellter() {
		super();
		monatsgehalt = 0;
	}

	Angestellter(String n, String v, String a, String t, int m) {
		super(n, v, a, t);
		monatsgehalt = m;
	}
	
	void getAngestellte() {
		super.getAngestellte();
		
	}
	
	String zeigePerson() {
		return super.zeigePerson() + "Monatsgehalt:\t" + monatsgehalt + "\n";
	}

	public int getMonatsgehalt() {
		return monatsgehalt;
	}

	public void setMonatsgehalt(int monatsgehalt) {
		this.monatsgehalt = monatsgehalt;
	}
	
}
