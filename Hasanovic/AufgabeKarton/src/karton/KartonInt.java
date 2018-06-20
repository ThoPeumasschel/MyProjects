package karton;

public class KartonInt extends Karton
{

	private int[] intKarton;
	private int index;
	private int obergrenze;

	public KartonInt(int obergrenze)
	{
		this.obergrenze = obergrenze;
		intKarton = new int[obergrenze];

	}

	@Override
	public void putElement(Object i)
	{
		if (index < intKarton.length)
		{

			intKarton[index] = (int) i;
			index++;
		}
	}

	public int getElement(int index)
	{

		return intKarton[index];
	}

	public void getElements()
	{

		for (int i : intKarton)
		{
			if (i != 0)
				System.out.println(i);
		}
	}

	public void deleteElement(int index)
	{
		intKarton[index] = 0;

	}

	public void deleteElements()
	{
		for (int i : intKarton)
			intKarton[i] = 0;

	}

	public boolean isempty()
	{
		boolean isempty = true;
		if (index < intKarton.length)
		{
			for (int i : intKarton)
			{
				if (i != 0)
					isempty = false;

			}
		}

		return isempty;
	}

	@Override
	Object getElement(Object o)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
