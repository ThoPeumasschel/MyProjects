package karton;

public class DoubleKarton extends Karton
{
	private double[] inhalt;

	public DoubleKarton(int anzElemente, String name)
	{

		inhalt = new double[anzElemente];
		this.setAnzElemente(anzElemente);
		this.setName(name);

	}

	public void addDouble(double k)
	{

		// inhalt=k;

		if (getIndex() < inhalt.length)
		{

			inhalt[getIndex()] = (double) k;
			setIndex(getIndex() + 1);
		}

	}

	public double getDouble(int index)
	{

		return inhalt[index];
	}

	public void getAll()
	{
		for (double i : inhalt)
		{
			if (i != 0)
				System.out.println(i);
		}

	}

	public void deleteDouble(int index)
	{
		inhalt[index] = 0.0;

	}

	public void deleteAll()
	{
		for (int i = 0; i < inhalt.length; i++)
			inhalt[i] = 0.0;

	}

	@Override
	public boolean isEmpty()
	{
		boolean isempty = true;
		if (getIndex() < inhalt.length)
		{
			for (double i : inhalt)
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

		for (double i : inhalt)
			if (i != 0.0)
				count++;

		return count;
	}
}
