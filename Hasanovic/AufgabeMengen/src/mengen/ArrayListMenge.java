package mengen;

import java.util.ArrayList;

public class ArrayListMenge<E>
{
	ArrayList<Menge<E>> alMenge;

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alMenge == null) ? 0 : alMenge.hashCode());
		return result;
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
		ArrayListMenge other = (ArrayListMenge) obj;
		if (alMenge == null)
		{
			if (other.alMenge != null)
				return false;
		} else if (!alMenge.equals(other.alMenge))
			return false;
		return true;
	}

	public ArrayList<Menge<E>> getAlMenge()
	{
		return alMenge;
	}

	public void setAlMenge(ArrayList<Menge<E>> alMenge)
	{
		this.alMenge = alMenge;
	}

}
