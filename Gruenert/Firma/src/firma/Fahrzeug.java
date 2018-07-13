package firma;

public class Fahrzeug {
	private String model;
	private double verbrauchskosten;
	private double versicherungskosten;
	
	
	public Fahrzeug (String model, double verbrauchskosten, double versicherungskosten) {
		
		this.model = model;
		this.verbrauchskosten = verbrauchskosten;
		this.versicherungskosten = versicherungskosten;
		
	}
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getVerbrauch() {
		return verbrauchskosten;
	}

	public void setVerbrauch(double verbrauch) {
		this.verbrauchskosten = verbrauch;
	}

	public double getVersicherungskosten() {
		return versicherungskosten;
	}

	public void setVersicherungskosten(double versicherungskosten) {
		this.versicherungskosten = versicherungskosten;
	}
}
