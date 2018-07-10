package mengen;

import java.util.ArrayList;
import java.util.*;

public class ArrayListMenge<E>
{
	ArrayList<Menge<E>> alMenge;
	Set asd = new HashSet();

	@Override
	public int hashCode()
	{
		asd.s
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

}
