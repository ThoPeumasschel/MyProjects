
public class Arbeiter extends Mitarbeiter{
	private double stundenLohn;
	
	public Arbeiter(){
		
	}
	
	public Arbeiter(int personalNr, String nachname, String vorname, double stundenlohn){
		super(personalNr, nachname, vorname);
		this.stundenLohn = stundenlohn;
	}

	public double getStundenLohn() {
		return stundenLohn;
	}

	public void setStundenLohn(double stundenLohn) {
		this.stundenLohn = stundenLohn;
	}
	
	@Override
	public String toString() {
		return "Arbeiter " + getNachname() + ", " + getVorname() + " mit der PersonalNr. " + 
				getPersonalNr() + " hat " + getUrlaubstage() + " Urlaubstage und ein Gehalt von " + this.stundenLohn + " Euro/Std.";
	}
}
