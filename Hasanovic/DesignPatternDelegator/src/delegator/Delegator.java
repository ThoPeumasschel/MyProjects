package delegator;

//bietet dienste über vererbungsstrukturen hinweg an
public class Delegator
{

	// referenz auf seine dienste-aufrufer:
	private IDelegator client;

	public Delegator(IDelegator client)
	{
		this.client = client;
	}

	public Delegator()
	{

	}

	// dienste:
	public int berechneWirkungsgrad()
	{
		// delegator holt sich über die schnittstelle die kw-anzahl aus den cleinten,
		// welche den wirkungsgrad haben wollen:
		int kw = client.getKw();

		// ....wirkungsgrad berechnen....

		return 0;

	}

}
