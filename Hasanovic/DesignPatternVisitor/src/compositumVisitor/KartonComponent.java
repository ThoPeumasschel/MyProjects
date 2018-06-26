package compositumVisitor;

public abstract class KartonComponent implements IKarton
{
	private String bezeichnung;
	private KartonComponent parent;

	public KartonComponent(String bezeichnung)
	{
		super();
		this.bezeichnung = bezeichnung;
	}

	public String getBezeichnung()
	{
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung)
	{
		this.bezeichnung = bezeichnung;
	}

	public KartonComponent getParent()
	{
		return parent;
	}

	public void setParent(KartonComponent parent)
	{
		this.parent = parent;
	}

	// abstrakte methode für die annahme eines visitor-objekts:
	abstract void accept(KartonVisitor v);

}
