
public class Person {

	private String name;
	private String vorname;
	private String adresse;
	private String telefonnummer;

	// parametisierter Konstruktor erstellen

	Person(String n, String v, String a, String t) {
		name = n;
		vorname = v;
		adresse = a;
		telefonnummer = t;
	}

	// Standarkonstruktor erstellen

	Person() {
		name = null;
		vorname = null;
		adresse = null;
		telefonnummer = null;
	}

	void setName(String value) {
		name = value;
	}

	void setVorname(String value) {
		vorname = value;
	}

	void setAdresse(String value) {
		adresse = value;
	}

	void setTelefonnummer(String value) {
		telefonnummer = value;
	}

	String getName() {
		return name;
	}

	String getVorname() {
		return vorname;
	}

	String getAdresse() {
		return adresse;
	}

	String getTelefonnummer() {
		return telefonnummer;
	}

	void zeigePerson() {
		System.out.println(" Name:\t\t" + name + "\n Vorname:\t" + vorname + "\n Adresse:\t" + adresse
				+ "\n Telefonnummer:\t" + telefonnummer);
		System.out.println("---------");
	}
}
