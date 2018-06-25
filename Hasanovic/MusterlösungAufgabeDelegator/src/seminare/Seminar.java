package seminare;

public class Seminar
{
	private Teilnehmer[] teilnehmer;
	private Dozent dozi;
	private String raum;
	private String thema;

	public Seminar(String thema)
	{
		super();
		this.thema = thema;
	}

	public Teilnehmer[] getTeilnehmer()
	{
		return teilnehmer;
	}

	public void setTeilnehmer(Teilnehmer[] teilnehmer)
	{
		this.teilnehmer = teilnehmer;
	}

	public Dozent getDozi()
	{
		return dozi;
	}

	public void setDozi(Dozent dozi)
	{
		this.dozi = dozi;
	}

	public String getRaum()
	{
		return raum;
	}

	public void setRaum(String raum)
	{
		this.raum = raum;
	}

	public String getThema()
	{
		return thema;
	}

	public void setThema(String thema)
	{
		this.thema = thema;
	}

}
