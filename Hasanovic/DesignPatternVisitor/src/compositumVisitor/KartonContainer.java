package compositumVisitor;

public class KartonContainer extends KartonComponent
{

	// inhalt in array
	private KartonComponent[] inhalt;
	private int anzKomponenten;

	public KartonContainer(String bezeichnung)
	{
		super(bezeichnung);
		inhalt = new KartonComponent[30];
	}

	public void addKarton(KartonComponent karton)
	{
		if (anzKomponenten < inhalt.length)
		{
			karton.setParent(this);
			inhalt[anzKomponenten++] = karton;

		}
	}

	// container-objekte reichen an alle children das visitor objekt weiter, indem
	// von jedem die accept-methode aufgerufen wird
	@Override
	public void accept(KartonVisitor v)
	{
		for (int i = 0; i < inhalt.length; i++)
		{
			if (inhalt[i] != null)
				inhalt[i].accept(v);
		}

	}

}
