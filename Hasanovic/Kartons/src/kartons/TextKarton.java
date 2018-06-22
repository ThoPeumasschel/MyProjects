package kartons;

public class TextKarton extends BasicKarton
{

	private String inhalt;

	public TextKarton(String aufschrift, String inhalt)
	{
		super(aufschrift);
		this.inhalt = inhalt;
	}

	@Override
	public boolean isEmpty()
	{

		if (inhalt == null || inhalt.equals(""))
		{
			return true;
		} else
		{
			return false;
		}
	}

	@Override
	public void deleteInhalt()
	{
		if (this.isEmpty())
		{
			new IllegalStateException(this.getAufschrift() + " ist bereits leer");
		} else
		{
			inhalt = null;
			System.out.println(getAufschrift() + ": Inhalt gelöscht!");
		}
	}

	public String getInhalt()
	{
		return inhalt;
	}

}
