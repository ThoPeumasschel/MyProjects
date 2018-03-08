
public class Person extends Firma {
	private String name;
	private String vorname;
	private String adresse;
	private String telefonnummer;

	// Standardkonstruktor
	Person() {
		name = null;
		vorname = null;
		adresse = null;
		telefonnummer = null;

	}

	// Parametrisierter Konstruktor
	Person(String n, String v, String a, String t) {
		name = n;
		vorname = v;
		adresse = a;
		telefonnummer = t;

	}

	// Noch ein Konstruktor...
	Person(String x, String y) {
		name = x;
		vorname = y;
		adresse = "Hamburg";
		telefonnummer = "n/v";
	}

	void setName(String value) {
		name = value;
	}

	String getName() {
		return name;
	}

	void setVorname(String value) {
		vorname = value;
	}

	String getVorname() {
		return vorname;
	}

	void setAdresse(String value) {
		adresse = value;
	}

	String getAdresse() {
		return adresse;
	}

	void setTelefonnummer(String value) {
		telefonnummer = value;
	}

	String getTelefonnummer() {
		return telefonnummer;
	}

	void zeigePerson() {

		System.out.println(
				"Name: \t\t" + vorname + " " + name + "\nAdresse: \t" + adresse + "\nTelefon: \t" + telefonnummer);

	}
	// neue Mitarbeiter einstellen, Mitarbeiter auflisten, 
	// soll mit Menue beendet werden können
	void menue() { 
		
		
		
	}
	
	
	
	
}
