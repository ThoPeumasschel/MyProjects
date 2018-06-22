package delegator;

public class Schulungsunternehmen
{
	private Kurs kurs;
	ISchulungsunternehmen client;

	public Schulungsunternehmen(ISchulungsunternehmen client)
	{
		this.client = client;
	}

	public String getPersonenInfo()
	{

		return "Der Name lautet: " + client.getName() + "\nDer Kurs lautet: " + client.getKurs();

	}

}
