package delegator;

public class Kurs
{
	private String start, ende, raum, thema, dozentName;

	private Dozent
	private
	
	
	

	public Kurs()
	{
		super();
	}

	public Kurs(String start, String ende, String raum, String thema, String dozent)
	{
		this.start = start;
		this.ende = ende;
		this.raum = raum;
		this.thema = thema;
		this.dozentName = dozent;
	}

	public String getStart()
	{
		return start;
	}

	public void setStart(String start)
	{
		this.start = start;
	}

	public String getEnde()
	{
		return ende;
	}

	public void setEnde(String ende)
	{
		this.ende = ende;
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

	public String getDozent()
	{
		return dozent;
	}

	public void setDozent(String dozent)
	{
		this.dozent = dozent;
	}

	public String toString()
	{

		return "Start: " + start + " Ende: " + ende + " Raum: " + raum + " Thema: " + thema + " Dozent: " + dozent;

	}

}
