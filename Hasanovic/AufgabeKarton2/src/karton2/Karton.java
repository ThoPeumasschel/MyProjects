package karton2;

public class Karton<T>
{

	private int index;
	private String name;
	private Karton parent; // in welchem Karton stecke ich gerade drin?
	private int anzElemente;
	private int[] inhalt;

	public Karton(int anzElemente, String name)
	{
		inhalt = new int[anzElemente];
		this.setAnzElemente(anzElemente);
		this.setName(name);

	}

	public void addInt(int k)
	{

		if (getIndex() < inhalt.length)
		{

			inhalt[getIndex()] = k;
			setIndex(getIndex() + 1);
		}

	}

	public int getInt(int index)
	{

		return inhalt[index];
	}

	public void getAll()
	{
		for (int i : inhalt)
		{
			if (i != 0)
				System.out.println(i);
		}

	}

	public void deleteInt(int index)
	{
		inhalt[index] = 0;
	}

	public void deleteAll()
	{
		for (int i = 0; i < inhalt.length; i++)
			inhalt[i] = 0;
	}

	@Override
	public boolean isEmpty()
	{
		boolean isempty = true;
		if (getIndex() < inhalt.length)
		{
			for (int i : inhalt)
			{
				if (i != 0)
					isempty = false;

			}
		}
		return isempty;

	}

	public int count()
	{
		int count = 0;

		for (int i : inhalt)
			if (i != 0)
				count++;

		return count;
	}

}
