package zugplan;

import java.util.TreeSet;

public class Fahrplan
{
	private TreeSet<Zuglinie> linien;

	public Fahrplan(TreeSet<Zuglinie> zl)
	{

	}

	public Fahrplan()
	{
	}

	public boolean addZuglinie(Zuglinie zl)
	{

		return linien.add(zl);

	}

	public boolean removeZuglinie(Zuglinie zl)
	{

		return linien.remove(zl);

	}

	public void printFahrplanZuglinie(Zuglinie zl)
	{

	}

	public void printFahrplan()
	{

	}

	public void sortLinienNachZeit(LinienSortiererNachZeit lsnz)
	{

	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((linien == null) ? 0 : linien.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Fahrplan))
			return false;
		Fahrplan other = (Fahrplan) obj;
		if (linien == null)
		{
			if (other.linien != null)
				return false;
		} else if (!linien.equals(other.linien))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Fahrplan [linien=" + linien + "]";
	}

}
