
public class Person2 {
	private String name;
	private String vorname;
	private String adresse;
	private String telefonnummer;

	Person2() {
		name = null;
		vorname = null;
		adresse = null;
		telefonnummer = null;

	}

	Person2(String n, String v, String a, String t) {
		name = n;
		vorname = v;
		adresse = a;
		telefonnummer = t;
		
	}

	Person2(String x, String y) {
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

		System.out.println("Der Name der Person lautet \n" + vorname + " " 
		+ name + "\nAdresse: " + adresse + "\nTelefon: " + telefonnummer);
		System.out.println("##################################");

	}

}
