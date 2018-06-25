package seminare;

public class Teilnehmer implements IKursInfo
{
	private KursInfo delegator;
	private String name, id;

	public Teilnehmer()
	{
		delegator = new KursInfo(this);
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public String getID()
	{
		return id;
	}
}
