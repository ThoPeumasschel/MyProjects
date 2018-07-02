package autos;

public abstract class Auto implements Comparable
{
	private int baujahr;
	private String modell;

	public Auto(String modell, int baujahr)
	{
		super();
		this.modell = modell;
		this.baujahr = baujahr;

	}

	public Auto()
	{
	}

	public int getBaujahr()
	{
		return baujahr;
	}

	public void setBaujahr(int baujahr)
	{
		this.baujahr = baujahr;
	}

	public String getModell()
	{
		return modell;
	}

	public void setModell(String modell)
	{
		this.modell = modell;
	}

	@Override
	public int hashCode()
	{

		return modell.hashCode() + baujahr;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (baujahr != other.baujahr)
			return false;
		if (modell == null)
		{
			if (other.modell != null)
				return false;
		} else if (!modell.equals(other.modell))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o)
	{
		if (this.modell.compareTo(((Auto) o).getModell()) == 0)

			if (baujahr < ((Auto) o).getBaujahr())
			{
				return -1;
			} else if (baujahr > ((Auto) o).getBaujahr())
			{
				return 1;
			} else
			{
				return 0;
			}
		else
		{
			return this.modell.compareTo(((Auto) o).getModell());
		}
	}
}
