
// von finalen Klassen kann nicht geerbt werden
public final class Angestellte extends Mitarbeiter{
	private double gehalt;

	public Angestellte(){
		
	}
	
	public Angestellte(int personalNr, String nachname, String vorname, double gehalt) {
		super(personalNr, nachname, vorname);
		this.setGehalt(gehalt);
	}

	public Angestellte(int personalNr, String nachname, String vorname, double gehalt, int stunden) {
		super(personalNr, nachname, vorname);
		this.setGehalt(gehalt);
		this.setAnzArbeitsStunden(stunden);
	}
	
	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}
	
	@Override
	public String toString() {
		return "Angestellter " + getNachname() + ", " + getVorname() + " mit der PersonalNr. " + 
				getPersonalNr() + " hat " + getUrlaubstage() + " Urlaubstage und ein Gehalt von " + 
				this.gehalt + " Euro/Monat und arbeitet " + this.getAnzArbeitsStunden() + " Stunden pro Woche.";
	}
	
}
