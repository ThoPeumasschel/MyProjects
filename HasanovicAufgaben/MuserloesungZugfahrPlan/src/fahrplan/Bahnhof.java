package fahrplan;

public class Bahnhof 
{
	private String ort;
	private String anschrift;
	private int anzahlGleise;
	
	
	
	
	
	public Bahnhof(String ort, int anzahlGleise) {
		super();
		this.ort = ort;
		this.anzahlGleise = anzahlGleise;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getAnschrift() {
		return anschrift;
	}
	public void setAnschrift(String anschrift) {
		this.anschrift = anschrift;
	}
	public int getAnzahlGleise() {
		return anzahlGleise;
	}
	public void setAnzahlGleise(int anzahlGleise) {
		this.anzahlGleise = anzahlGleise;
	}
	@Override
	public String toString() {
		return "Bahnhof [ort=" + ort + ", anzahlGleise=" + anzahlGleise + "]";
	}
	
	
	
	
	
}
