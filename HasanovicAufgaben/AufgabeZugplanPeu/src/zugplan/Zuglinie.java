package zugplan;

import java.util.HashSet;
import java.util.TreeSet;

public class Zuglinie
{
	private TreeSet<Haltepunkt> haltepunkte;
	private String bezeichner;
	private HashSet<Zug> zuege;

	public Zuglinie(TreeSet<Haltepunkt> haltepunkte, String bezeichner, HashSet<Zug> zuege)
	{
		this.haltepunkte = haltepunkte;
		this.bezeichner = bezeichner;
		this.zuege = zuege;

	}

	public Zuglinie()
	{
	}

	public boolean addHaltepunkt(Haltepunkt h)
	{
		return haltepunkte.add(h);

	}

	public boolean removeHaltepunkt(Haltepunkt h)
	{

		return haltepunkte.remove(h);

	}

	public boolean addZug(Zug z)
	{
		return zuege.add(z);
	}

	public boolean removeZug(Zug z)
	{
		return zuege.remove(z);

	}

	public void editZuglinie(Zuglinie zl, TreeSet ts, String str, HashSet hs)
	{

	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bezeichner == null) ? 0 : bezeichner.hashCode());
		result = prime * result + ((haltepunkte == null) ? 0 : haltepunkte.hashCode());
		result = prime * result + ((zuege == null) ? 0 : zuege.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Zuglinie))
			return false;
		Zuglinie other = (Zuglinie) obj;
		if (bezeichner == null)
		{
			if (other.bezeichner != null)
				return false;
		} else if (!bezeichner.equals(other.bezeichner))
			return false;
		if (haltepunkte == null)
		{
			if (other.haltepunkte != null)
				return false;
		} else if (!haltepunkte.equals(other.haltepunkte))
			return false;
		if (zuege == null)
		{
			if (other.zuege != null)
				return false;
		} else if (!zuege.equals(other.zuege))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Zuglinie [haltepunkte=" + haltepunkte + ", bezeichner=" + bezeichner + ", zuege=" + zuege + "]";
	}

	public TreeSet<Haltepunkt> getHaltepunkte()
	{
		return haltepunkte;
	}

	public void setHaltepunkte(TreeSet<Haltepunkt> haltepunkte)
	{
		this.haltepunkte = haltepunkte;
	}

	public String getBezeichner()
	{
		return bezeichner;
	}

	public void setBezeichner(String bezeichner)
	{
		this.bezeichner = bezeichner;
	}

	public HashSet<Zug> getZuege()
	{
		return zuege;
	}

	public void setZuege(HashSet<Zug> zuege)
	{
		this.zuege = zuege;
	}

}
