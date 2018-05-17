

public class Freiberufler extends Mitarbeiter {
	private double provision;

	public Freiberufler(){
		
	}
	
	public Freiberufler(int personalNr, String nachname, String vorname, double provision){
		super(personalNr, nachname, vorname);
		this.provision = provision;
	}
	
	public double getProvision() {
		return provision;
	}

	public void setProvision(double provision) {
		this.provision = provision;
	}
	
	@Override
	public String toString() {
		return "Freiberufler " + getNachname() + ", " + getVorname() + " mit der PersonalNr. " + 
				getPersonalNr() + " hat " + getUrlaubstage() + " Urlaubstage und ein Provision von " + this.provision + " Euro/Auftrag.";
	}
	
}
