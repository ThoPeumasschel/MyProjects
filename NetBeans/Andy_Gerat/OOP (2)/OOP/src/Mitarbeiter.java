// von abstrakten Klassen können keine Instanzen gebildet werden
public abstract class Mitarbeiter {
//public class Mitarbeiter {
	private int personalNr;
	private String nachname;
	private String vorname;
	private byte urlaubstage;
	private int anzArbeitsStunden;
	private boolean gewerkschaft;
	
	// Wert der Konstante muss bei Deklaration zugewiesen werden und ist nicht mehr änderbar
	final int KONSTANTE_X = 100;
	
	public boolean isGewerkschaft() {
		return gewerkschaft;
	}

	public void setGewerkschaft(boolean gewerkschaft) {
		this.gewerkschaft = gewerkschaft;
	}

	public Mitarbeiter(){
		this.urlaubstage = 30;
		this.anzArbeitsStunden = 40;
	}
	
	public Mitarbeiter(int personalNr, String nachname, String vorname, int stunden) {
		//this.personalNr = personalNr;
		this.setPersonalNr(personalNr);
		this.setNachname(nachname);
		this.setVorname(vorname);
		this.urlaubstage = 30;
		this.anzArbeitsStunden = stunden;
	}
	
	public Mitarbeiter(int personalNr, String nachname, String vorname) {
		//this.personalNr = personalNr;
		this.setPersonalNr(personalNr);
		this.setNachname(nachname);
		this.setVorname(vorname);
		this.urlaubstage = 30;
		this.anzArbeitsStunden = 40;
	}
	

	public boolean macheUrlaub(byte tage){
		if(tage <= urlaubstage){
			urlaubstage -= tage;
			return true;
		}else{
			return false;
		}
	}
	
	public String getDaten(){
		return "Mitarbeiter " + getNachname() + ", " + getVorname() + " mit der PersonalNr. " + getPersonalNr() + " hat " + getUrlaubstage() + " Urlaubstage.";
	}
	
	@Override
	public String toString() {
		return "Mitarbeiter " + getNachname() + ", " + getVorname() + " mit der PersonalNr. " + getPersonalNr() + " hat " + 
				getUrlaubstage() + " Urlaubstage und arbeitet " + this.anzArbeitsStunden + " Stunden pro Woche.";
	}
	
	
	
	public void setPersonalNr(int personalNr){
		if(personalNr > 0)
			this.personalNr = personalNr;
		else
			this.personalNr = 0;
	}	
	
	public int getPersonalNr(){
		return this.personalNr;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public byte getUrlaubstage() {
		return urlaubstage;
	}
	
	public int getAnzArbeitsStunden() {
		return anzArbeitsStunden;
	}

	public void setAnzArbeitsStunden(int anzArbeitsStunden) {
		this.anzArbeitsStunden = anzArbeitsStunden;
	}
	
}
