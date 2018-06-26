package compositumVisitor;

public class KartonGanzzahl extends KartonComponent
{
	private int inhalt;

	public KartonGanzzahl(int inhalt, String bezeichnung)
	{
		super(bezeichnung);
		this.inhalt = inhalt;
	}

	public int getInhalt()
	{
		return inhalt;
	}

	public void setInhalt(int inhalt)
	{
		this.inhalt = inhalt;
	}

	// in leafs wird in der accept-methode MINDESTENS die korrespondierende methode
	// des visitors aufgerufen!
	@Override
	public void accept(KartonVisitor v)
	{
		v.visitGanzzahlKarton(this);

	}

}
