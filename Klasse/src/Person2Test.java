
public class Person2Test {

	public static void main(String[] args) {
		System.out.println("Say Hello!");
		Person2 pers1 = new Person2();
		System.out.println("\nStandardkonstruktoraufruf, noch sind keine Werte gesetzt.\n");
		pers1.zeigePerson();
		pers1.setName("Huber");
		pers1.setVorname("Heinrich");
		pers1.setAdresse("Hohe Str. 8, 78345 Im tiefen Tal");
		pers1.setTelefonnummer("0478/25 45 86");
		System.out.println("\nMit Getter- und Setter-Methoden wurden Werte gesetzt.");
		System.out.println("Nochmal \"pers1\" zeigen: \n");
		pers1.zeigePerson();

		Person2 pers2 = new Person2("Ramming", "Egon", "Wiesenstr. 43, " + "65748 Am Wald", "09123/249 54 82");
		System.out.println("\nWeiteres Objekt wurde erzeugt und Werte direkt an Konstruktor übergeben\n");
		pers2.zeigePerson();
		
		Person2 pers3 = new Person2("Schmidt", "Armin");
		System.out.println("\nHier werden nur Hamburger ohne Telefon erzeugt.\n");
		pers3.zeigePerson();
		Person2 pers4 = new Person2("Meier", "Fritz");
		pers4.zeigePerson();
	}

}
