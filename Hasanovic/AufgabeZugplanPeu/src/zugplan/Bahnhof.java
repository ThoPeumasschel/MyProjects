package zugplan;

public class Bahnhof
{
	private String kuerzel;
	private String name;
	private int anzGleise;
	private String ort;

	public Bahnhof(String kuerzel, String name, int anzGleise, String ort)
	{
		this.kuerzel = kuerzel;
		this.name = name;
		this.anzGleise = anzGleise;
		this.ort = ort;
	}

	public Bahnhof()
	{
	}

	private String getKuerzel()
	{
		return kuerzel;
	}

	public void setKuerzel(String kuerzel)
	{
		this.kuerzel = kuerzel;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAnzGleise()
	{
		return anzGleise;
	}

	public void setAnzGleise(int anzGleise)
	{
		this.anzGleise = anzGleise;
	}

	public String getOrt()
	{
		return ort;
	}

	public void setOrt(String ort)
	{
		this.ort = ort;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + anzGleise;
		result = prime * result + ((kuerzel == null) ? 0 : kuerzel.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ort == null) ? 0 : ort.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Bahnhof))
			return false;
		Bahnhof other = (Bahnhof) obj;
		if (anzGleise != other.anzGleise)
			return false;
		if (kuerzel == null)
		{
			if (other.kuerzel != null)
				return false;
		} else if (!kuerzel.equals(other.kuerzel))
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ort == null)
		{
			if (other.ort != null)
				return false;
		} else if (!ort.equals(other.ort))
			return false;
		return true;
	}

}
