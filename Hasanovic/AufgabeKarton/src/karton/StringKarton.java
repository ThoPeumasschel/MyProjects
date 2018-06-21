package karton;

public class StringKarton extends Karton
{
	String[] inhalt;

	public StringKarton(int anzElemente, String name)
	{

		inhalt = new String[anzElemente];
		this.setAnzElemente(anzElemente);
		this.setName(name);

	}

	public void addString(Object k)
	{
		if (getIndex() < inhalt.length)
		{

			inhalt[getIndex()] = (String) k;
			setIndex(getIndex() + 1);
		}

	}

	public Object getString(int index)
	{
		return inhalt[index];
	}

	public void getAll()
	{
		for (String i : inhalt)
		{
			if (i != null)
				System.out.println(i);
		}

	}

	public void deleteString(int index)
	{
		if (inhalt[index].isEmpty())
			inhalt[index] = null;

	}

	public void deleteAll()
	{
		for (int i = 0; i < inhalt.length; i++)
		{
			if (inhalt[i].isEmpty())
				inhalt[i] = null;
			
		}

	}

	@Override
	public boolean isEmpty()
	{

		boolean isempty = true;
		if (getIndex() < inhalt.length)
		{
			for (String i : inhalt)
			{
				if (i != null)
					isempty = false;

			}
		}
		return isempty;
	}

	@Override
	public int count()
	{
		int count = 0;

		for (String i : inhalt)
			if (i != null)
				count++;

		return count;
	}

}
