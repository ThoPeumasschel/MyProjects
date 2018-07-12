package firma;

public abstract class Abteilung implements IKostenberechnung
{
	private double budget;
	private String vorgesetzter; 
	private double personalkosten;
	
	
	
	
	
	
	
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getVorgesetzter() {
		return vorgesetzter;
	}
	public void setVorgesetzter(String vorgesetzter) {
		this.vorgesetzter = vorgesetzter;
	}
	public double getPersonalkosten() {
		return personalkosten;
	}
	public void setPersonalkosten(double personalkosten) {
		this.personalkosten = personalkosten;
	}
	
	
	
	
	
	
	
	
	
	
}
