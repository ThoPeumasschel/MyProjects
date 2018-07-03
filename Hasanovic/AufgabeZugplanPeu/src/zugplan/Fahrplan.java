package zugplan;

import java.util.HashMap;
import java.util.Iterator;

public class Fahrplan
{
	private HashMap<Zuglinie, Zug> linien;

	public Fahrplan()
	{
		linien = new HashMap<Zuglinie, Zug>();
	}

	public void addZuglinie(Zuglinie zl, Zug zug)
	{

		linien.put(zl, zug);

	}

	public void removeZuglinie(Zuglinie zl)
	{

		linien.remove(zl);

	}

	public void printFahrplanZuglinie(Zuglinie zl)
	{

	}

	public void printFahrplan(Zuglinie zl)
	{
		Iterator<Haltepunkt> it = zl.getHaltepunkte().iterator();
		while (it.hasNext())
			System.out.println(it.next());

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
