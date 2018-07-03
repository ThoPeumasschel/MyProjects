package mengen;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Menge<T> implements Iterable<T>
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

	public boolean removeElement(T t)
	{
		return menge.remove(t);
	}

	public void joinSets(Collection<? extends Comparable<T>> t)
	{
		menge.addAll(t);

	}

	@Override
	public Iterator<T> iterator()
	{
		return new Iterator<T>()
		{
			private int pos;

			@Override
			public boolean hasNext()
			{
				return pos < menge.size();
			}

			@Override
			public T next()
			{
				return menge.;
			}

			@Override
			public void remove()
			{
				throw new IllegalArgumentException("Löschen beim Iterieren von MyList verboten!");
			}
		};
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menge == null) ? 0 : menge.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menge other = (Menge) obj;
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

	public HashSet<Comparable<T>> getMenge()
	{
		return menge;
	}

	public void setMenge(HashSet<Comparable<T>> menge)
	{
		this.menge = menge;
	}

}
