package delegator;

public abstract class Fahrzeug implements IDelegator
{
	private String typ;
	private int anzahlTueren;
	private int kw;
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public int getAnzahlTueren() {
		return anzahlTueren;
	}
	public void setAnzahlTueren(int anzahlTueren) {
		this.anzahlTueren = anzahlTueren;
	}
	public int getKw() {
		return kw;
	}
	public void setKw(int kw) {
		this.kw = kw;
	}
	
	
	
	
}
