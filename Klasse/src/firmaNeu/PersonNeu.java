package firmaNeu;

public class PersonNeu extends FirmaNeu {

	void getData() {
		super.getData();

	}

	void zeigePerson() {

		System.out.println(
				"Name: \t\t" + vorname + " " + name + "\nAdresse: \t" + adresse + "\nTelefon: \t" + telefonnummer);

	}

	// Standardkonstruktor
	PersonNeu() {
		name = null;
		vorname = null;
		adresse = null;
		telefonnummer = null;

	}

	// Parametrisierter Konstruktor
	PersonNeu(String n, String v, String a, String t) {
		name = n;
		vorname = v;
		adresse = a;
		telefonnummer = t;

	}

	// Noch ein Konstruktor...
	PersonNeu(String x, String y) {
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

	// neue Mitarbeiter einstellen, Mitarbeiter auflisten,
	// soll mit Menue beendet werden können

}
