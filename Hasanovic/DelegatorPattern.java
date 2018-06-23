public interface IDelegator {	int getKw();	}

public class Delegator {
	// referenz auf seine dienste-aufrufer:
	private IDelegator client;

	public Delegator(IDelegator client){
		this.client = client;
	}

	public Delegator() {}

	// dienste:
	public int berechneWirkungsgrad() {
		// delegator holt sich über die schnittstelle die kw-anzahl aus den cleinten,
		// welche den wirkungsgrad haben wollen:
		int kw = client.getKw();
		// ....wirkungsgrad berechnen....
		return 0;
	}
}

public abstract class Fahrzeug implements IDelegator {
	private String typ;
	private int anzahlTueren, kw;

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public int getAnzahlTueren() {
		return anzahlTueren;
	}

	public void setAnzahlTueren(int anzahlTueren)	{
		this.anzahlTueren = anzahlTueren;
	}

	public int getKw()	{
		return kw;
	}

	public void setKw(int kw)	{
		this.kw = kw;
	}
}

public class Jeep extends Fahrzeug {
	//hält eine referenz auf den delegator
	private Delegator delegator

	public Jeep()	{
		delegator=new Delegator(this);
	}
		
	public void checkMotor() {
		//...
		int wg=delegator.berechneWirkungsgrad();	
	}
}

public abstract class Maschine {
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

public class Stanze extends Maschine implements IDelegator {
	private Delegator delegator;

	public Stanze() {
		
		this.delegator = new Delegator(this);
	}
		
	public int getWirkungsgrad()	{
		return delegator.berechneWirkungsgrad();
	}	
}