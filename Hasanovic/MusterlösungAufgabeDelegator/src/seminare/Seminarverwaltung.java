package seminare;

public class Seminarverwaltung
{
	// h�lt alle Seminare
	private Seminar[] seminare;
	//
	private KursInfo delgator;

	private static Seminarverwaltung sv;

	private Seminarverwaltung()
	{
	}

	public Seminarverwaltung getSv()
	{

		if (sv == null)
		{
			sv = new Seminarverwaltung();
		}
		return sv;
	}

}
