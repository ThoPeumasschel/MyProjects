
public class Angestellter extends Person {

	int monatsgehalt;

	// Standardkonstruktor
	Angestellter() {
		super();
		monatsgehalt = 0;

	}

	// parametisierte Konstruktor
	Angestellter(String n, String v, String a, String t, int m) {
		super(n, v, a, t);
		monatsgehalt = m;
	}

	public int getMonatsgehalt() {
		return monatsgehalt;
	}

	public void setMonatsgehalt(int monatsgehalt) {
		this.monatsgehalt = monatsgehalt;
	}

	void zeigePerson() {
		super.zeigePerson();
		System.out.println("Monatsgehalt: " + monatsgehalt + "€");
		System.out.println("---------");
	}

	/*void zeigeAngarr() {

		int[] angarr = new int[30];
		System.out.println("Angestellten Array: ");
		{

			for (int i = 0; i < angarr.length; i++) {
				angarr[i] = i + 1;

				System.out.print(angarr[i] + " ");

			}

		}
	} */
}
