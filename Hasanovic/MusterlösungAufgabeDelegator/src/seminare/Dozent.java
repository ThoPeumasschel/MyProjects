package seminare;

public class Dozent implements IKursInfo
{

	private KursInfo delegator;
	private String name, id;

	public Dozent()
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
