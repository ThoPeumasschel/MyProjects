
public class Jabberwock {
	private String color;
	private String sex;
	private boolean hungry;

	// Konstruktor
	/*
	 * Jabberwock() { color = null; sex = null; hungry = true; }
	 */
	// 2. Konstruktor
	
	Jabberwock(String c, String s) { 
		color = c; sex = s; hungry = true; }
	 
	Jabberwock() // leere Klammer = Standardkonstruktor!
	{
		color = null;
		sex = null;
		hungry = true;
	}

	void setColor(String value) {
		color = value;
	}

	void setSex(String value) {
		sex = value;
	}

	void setHungry(boolean value) {
		hungry = value;
	}

	void feedJabberwock() {
		if (hungry) {
			System.out.println("Yum -- very pleassant!");
			hungry = false;
		} else
			System.out.println("No, thanks -- already ate.");
		System.out.println("############");
	}

	void showAttributes() {
		System.out.println("This is a " + sex + " " + color + " jabberwock.");
		if (hungry)
			System.out.println("The jabberwock is hungry!");
		else
			System.out.println("The jabberwock is full!");
		System.out.println("-------");

	}
}
