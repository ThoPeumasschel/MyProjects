
public class Person1 {
	// Eigenschaften, globale Variable
	private String name;
	private int age;

	// Konstruktor
	Person1(String n, int a) {
		name = n;
		age = a;
	}

	Person1(String n) {
		name = n;
		age = 0;
	}

	// Standard-Konstruktor wurde hier programmiert,
	// weil der Compiler nach erzeugen des Konstruktors in Zeile 8
	// keinen Standardkonstruktor mehr erzeugt.
	public Person1() {
		name = null;
		age = 0;
	}

	// get-/set-Methoden zum setzen oder lesen der gekapselten Eigenschaften
	// Getter Methode für Variable age
	int getAge() {
		return age;
	}

	void setAge(int value) {
		age = value;
	}

	// Getter Methode für Variable Name
	String getName() {
		return name;
	}

	void setName(String value) { // Um die Eigenschaft Name read only zu machen, diese Funktion z. B.
									// auskommentieren.
		name = value;
	}

	// Methode, Funktion
	void printPerson() {

		System.out.println("Hi, my name is " + name + ". I am " + age + " years old");
		System.out.println("----");

	}

}
