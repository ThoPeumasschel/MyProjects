package windowSecond.common;

public class Person {
	
	private String vorname, nachname, adresse;
	
	
	public Person (String v, String n, String a) {
		
		vorname = v;
		nachname = n;
		adresse = a;
		
	}
	
	public Person () {
		
		vorname = null;
		nachname = null;
		adresse = null;
		
		
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
}
