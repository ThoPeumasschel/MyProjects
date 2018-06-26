package seminare;

public class Dozent implements IKursInfo
{

	//referenz auf den delegator
	private KursInfo delegator;
	private String name;
	private String id;
	
	public Dozent(String name)
	{
		this.name=name;
		delegator=new KursInfo(this);
		//delegator.addSeminarverwaltung(Seminarverwaltung.getSV());  implizites hinzufügen der seminarverwaltung
	}
	
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getId() {
		return id;
	}
	
	public void addVerwaltung()
	{
		delegator.addSeminarverwaltung(Seminarverwaltung.getSV());
	}
	
	public void addVerwaltung(ISeminarverwaltung sv)
	{
		delegator.addSeminarverwaltung(sv);
	}
	
	
	
	
}
