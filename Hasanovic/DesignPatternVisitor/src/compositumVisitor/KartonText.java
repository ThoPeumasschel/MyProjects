package compositumVisitor;

public class KartonText extends KartonComponent
{
	private String inhalt;

	public KartonText(String inhalt, String bezeichnung)
	{
		super(bezeichnung);
		this.inhalt = inhalt;
	}

	public String getInhalt()
	{
		return inhalt;
	}

	public void setInhalt(String inhalt)
	{
		this.inhalt = inhalt;
	}

	// in leafs wird in der accept-methode MINDESTENS die korrespondierende methode
	// des visitors aufgerufen!
	@Override
	public void accept(KartonVisitor v)
	{
		v.visitTextKarton(this);

	}

}
