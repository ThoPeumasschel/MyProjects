package mengen;

import java.util.HashSet;
import java.util.Iterator;

public class Menge<T> implements Iterable<Comparable<T>>
{

	private HashSet<Comparable<T>> menge;

	public Menge()
	{
		menge = new HashSet<Comparable<T>>();
	}

	public boolean addElement(Comparable<T> t)
	{
		return menge.add(t);
	}

	public <E extends Comparable<T>> boolean removeElement(T t)
	{
		return menge.remove(t);
	}

	public <E extends Comparable<T>> boolean containsElement(T elem)
	{
		return menge.contains(elem);

	}

	// Schnittmenge
	public Menge<T> schnittElemente(Menge<T> m)
	{
		// temporäre Schnittmenge
		Comparable<T> ctemp;
		Menge<T> tempM = new Menge<T>();
		Iterator<Comparable<T>> it = menge.iterator();
		while (it.hasNext())
		{
			ctemp = it.next();
			if (menge.contains(ctemp))
			{
				tempM.addElement(ctemp);
			}

		}

		return tempM;
	}

	// Vereinigung

	public Menge<T> joinSets(Menge<T> m)

	{
		Menge<T> mTemp = new Menge<T>();
		Iterator<Comparable<T>> it = m.iterator();
		while (it.hasNext())
		{
			mTemp.addElement(it.next());
		}
		it = menge.iterator();
		while (it.hasNext())
		{
			mTemp.addElement(it.next());
		}

		return mTemp;

	}

	// Differenzbildung
	public Menge<T> diffElemente(Menge<T> m)
	{
		// temporäre Schnittmenge
		Comparable<T> ctemp;
		Menge<T> tempM = new Menge<T>();
		Iterator<Comparable<T>> it = menge.iterator();
		while (it.hasNext())
		{
			ctemp = it.next();
			if (!menge.contains(ctemp))
			{
				tempM.addElement(ctemp);
			}

		}

		return tempM;
	}

	@Override
	public Iterator<Comparable<T>> iterator()
	{

		return menge.iterator();
	}

	// @Override
	// public Iterator<T> iterator()
	// {
	// return new Iterator<T>()
	// {
	// private int pos;
	//
	// @Override
	// public boolean hasNext()
	// {
	// return pos < menge.size();
	// }
	//
	// @Override
	// public T next()
	// {
	// return null;
	// }
	//
	// @Override
	// public void remove()
	// {
	// throw new IllegalArgumentException("Löschen beim Iterieren von MyList
	// verboten!");
	// }
	// };
	// }

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menge == null) ? 0 : menge.hashCode());
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
		Menge<T> other = (Menge) obj;
		if (menge == null)
		{
			if (other.menge != null)
				return false;
		} else if (!menge.equals(other.menge))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Menge [menge=" + menge + "]";
	}

	// public HashSet<Comparable<T>> getMenge()
	// {
	// return menge;
	// }
	//
	// public void setMenge(HashSet<Comparable<T>> menge)
	// {
	// this.menge = menge;
	// }

}
