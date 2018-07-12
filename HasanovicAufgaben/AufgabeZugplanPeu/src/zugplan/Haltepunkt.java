package zugplan;

public class Haltepunkt implements Comparable
{

	private Bahnhof bahnhof;
	private String gleis;
	private String zeit;

	public Haltepunkt(Bahnhof bahnhof, String gleis, String zeit)
	{
		super();
		this.bahnhof = bahnhof;
		this.gleis = gleis;
		this.zeit = zeit;
	}

	public Haltepunkt(String gleis, String zeit)
	{
		super();
		this.gleis = gleis;
		this.zeit = zeit;
	}

	public Haltepunkt()
	{
		super();
	}

	@Override
	public int compareTo(Object o)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public Bahnhof getBahnhof()
	{
		return bahnhof;
	}

	public void setBahnhof(Bahnhof bahnhof)
	{
		this.bahnhof = bahnhof;
	}

	public String getGleis()
	{
		return gleis;
	}

	public void setGleis(String gleis)
	{
		this.gleis = gleis;
	}

	public String getZeit()
	{
		return zeit;
	}

	public void setZeit(String zeit)
	{
		this.zeit = zeit;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bahnhof == null) ? 0 : bahnhof.hashCode());
		result = prime * result + ((gleis == null) ? 0 : gleis.hashCode());
		result = prime * result + ((zeit == null) ? 0 : zeit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Haltepunkt))
			return false;
		Haltepunkt other = (Haltepunkt) obj;
		if (bahnhof == null)
		{
			if (other.bahnhof != null)
				return false;
		} else if (!bahnhof.equals(other.bahnhof))
			return false;
		if (gleis == null)
		{
			if (other.gleis != null)
				return false;
		} else if (!gleis.equals(other.gleis))
			return false;
		if (zeit == null)
		{
			if (other.zeit != null)
				return false;
		} else if (!zeit.equals(other.zeit))
			return false;
		return true;
	}

}
