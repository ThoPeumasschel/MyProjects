package karton;

public class ContainerKarton extends Karton
{

	private Karton[] inhalt;

	public ContainerKarton(int anzElemente, String name)
	{

		inhalt = new Karton[anzElemente];
		this.setAnzElemente(anzElemente);
		this.setName(name);

	}

	public void addKarton(Karton o)
	{
		if (getIndex() < inhalt.length)
		{

			inhalt[getIndex()] = o;
			setIndex(getIndex() + 1);
		}

	}

	public Object getKarton(int index)
	{
		return inhalt[index];

	}

	public void getAll()
	{
		for (Karton i : inhalt)
		{
			if (i != null)
				System.out.println(i);
		}

	}

	public void deleteKarton(int index)
	{
		if (inhalt[index].isEmpty())
		{
			System.out.println("Karton " + inhalt[index].getName() + " gelöscht");
			inhalt[index] = null;

		} else
			System.out.println("Karton " + inhalt[index].getName() + " erst ausleeren!");

	}

	public void deleteAll()
	{
		if (isEmpty())
			for (int i = 0; i < inhalt.length; i++)
				inhalt[i] = null;

	}

	public boolean isEmpty()
	{
		boolean isempty = true;
		if (getIndex() < inhalt.length)
		{
			for (Karton i : inhalt)
			{
				if (i != null)
					isempty = false;

			}
		}
		return isempty;
	}

	public int count()
	{
		int count = 0;

		for (Karton i : inhalt)
			if (i != null)
				count++;

		return count;
	}

}
