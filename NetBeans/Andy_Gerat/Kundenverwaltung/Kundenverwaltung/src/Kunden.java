
public class Kunden {
	private String anrede;
	private String nachname;
	private String vorname;
	private String strasse;
	private String plz;
	private String ort;
	private String telefon;
	private String iban;
	private String bic;
	
	public Kunden(String anrede, String nachname, String vorname, String strasse, String plz, String ort, String telefon, String iban, String bic){
		this.anrede = anrede;
		this.nachname = nachname;
		this.vorname = vorname;
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
		this.telefon = telefon;
		this.iban = iban;
		this.bic = bic;
	}

	public String getAnrede() {
		return anrede;
	}

	public String getNachname() {
		return nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public String getStrasse() {
		return strasse;
	}

	public String getPlz() {
		return plz;
	}

	public String getOrt() {
		return ort;
	}

	public String getTelefon() {
		return telefon;
	}

	public String getIban() {
		return iban;
	}

	public String getBic() {
		return bic;
	}
	
	
}
