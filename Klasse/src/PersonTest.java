
public class PersonTest {

	public static void main(String[] args) {
		// Objekt instaziieren.
		// Klassenname Variable = new Methode
		// benutzerdefinierter Datentyp Objektvariable = new Standardkonstruktor
		Person p = new Person();
//		p.name = "Thomas";
// 		p.age = 37;
		p.setName("Luke");
		p.setAge(50);
		p.printPerson();

		Person p2 = new Person("Laura", 35);
		p2.printPerson();

		Person p3 = new Person();
		p3.printPerson();

		System.out.println("Hallo, mein Name ist " + p2.getName() + " . Mein Alter ist " + p2.getAge() + "! ");

		p3.setName("Peuschel");
		p3.setAge(71);
		p3.printPerson();

		Person p4 = new Person("Glaser");
		p4.printPerson();
		p4.setAge(50);
		p4.printPerson();

	}
}
