package delegator;

public abstract class Maschine 
{
	private String bezeichnung;
	private String inventarNummer;
	private int kw;
	
	
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public String getInventarNummer() {
		return inventarNummer;
	}
	public void setInventarNummer(String inventarNummer) {
		this.inventarNummer = inventarNummer;
	}
	public int getKw() {
		return kw;
	}
	public void setKw(int kw) {
		this.kw = kw;
	}
	
	
	
	
}
