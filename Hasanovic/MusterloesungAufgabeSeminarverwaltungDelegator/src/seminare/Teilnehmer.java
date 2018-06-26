package seminare;

public class Teilnehmer implements IKursInfo
{
	//referenz auf den delegator
	private KursInfo delegator;
	private String name;
	private String id;
	
	public Teilnehmer(String name)
	{
		this.name=name;
		delegator=new KursInfo(this);
	}
	
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getId() {
		return id;
	}
	
	public void addSeminarverwaltung()
	{
		delegator.addSeminarverwaltung(Seminarverwaltung.getSV());
	}
	
	
		
}
