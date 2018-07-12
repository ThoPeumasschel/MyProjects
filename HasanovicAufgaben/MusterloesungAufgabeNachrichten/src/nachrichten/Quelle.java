package nachrichten;

public abstract class Quelle 
{

	private String name;
	private Vermittler vermittler;
	
	public Quelle(String name, Vermittler v)
	{
		this.name=name;
		vermittler=v;
	}
	
	
	//registrierungsmethode für einen vermittler
	public void registerVermittler(Vermittler v)
	{
		this.vermittler=v;
	}
	
	public void neueNachricht(String nachricht)
	{
		vermittler.fireUpdate(new Nachricht(nachricht, this));
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vermittler getVermittler() {
		return vermittler;
	}

	public void setVermittler(Vermittler vermittler) {
		this.vermittler = vermittler;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
	
	
	
	
	
	
	
	
}
