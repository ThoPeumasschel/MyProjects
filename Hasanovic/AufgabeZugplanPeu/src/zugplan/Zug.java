package zugplan;

public class Zug
{
	private String typ;
	private int anzWaggons;
	private String id;

	public Zug()
	{
	}

	public Zug(String typ, int anzWaggons, String id)
	{
		this.typ = typ;
		this.anzWaggons = anzWaggons;
		this.id = id;

	}

	private String getTyp()
	{
		return typ;
	}

	public void setTyp(String typ)
	{
		this.typ = typ;
	}

	public int getAnzWaggons()
	{
		return anzWaggons;
	}

	public void setAnzWaggons(int anzWaggons)
	{
		this.anzWaggons = anzWaggons;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + anzWaggons;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((typ == null) ? 0 : typ.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Zug))
			return false;
		Zug other = (Zug) obj;
		if (anzWaggons != other.anzWaggons)
			return false;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (typ == null)
		{
			if (other.typ != null)
				return false;
		} else if (!typ.equals(other.typ))
			return false;
		return true;
	}

}
