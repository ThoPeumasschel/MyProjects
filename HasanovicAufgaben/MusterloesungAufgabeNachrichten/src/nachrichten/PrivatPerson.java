package nachrichten;

public class PrivatPerson extends Person
{

	private String steuerNummer;

	public PrivatPerson(String steuerNummer) {
		super();
		this.steuerNummer = steuerNummer;
	}

	public String getSteuerNummer() {
		return steuerNummer;
	}

	public void setSteuerNummer(String steuerNummer) {
		this.steuerNummer = steuerNummer;
	}

	@Override
	public void update(Nachricht n) {
		System.out.println("Nachricht von " + n.getQuelle() + " erhalten mit dem Inhalt: " + n.getNachricht());
	}
	
	
	
	
	
	
	
	
	
}
