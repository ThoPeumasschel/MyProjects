package karton;

public class KartonContainer extends Karton
{
	private Karton[] karton;
	private int index;
	private int obergrenze;

	public KartonContainer(int obergrenze)
	{
		this.obergrenze = obergrenze;
		karton = new Karton[obergrenze];

	}

	@Override
	void putElement(Object o)
	{
		if (index < karton.length)
		{

			karton[index] = (Karton) o;
			index++;
		}
	}

	Karton getKarton(int index)
	{

		return karton[index];
	}

	@Override
	void getElements()
	{
		// TODO Auto-generated method stub

	}

	@Override
	void deleteElement(int index)
	{
		// TODO Auto-generated method stub

	}

	@Override
	void deleteElements()
	{
		// TODO Auto-generated method stub

	}

	@Override
	boolean isempty()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	Object getElement(Object o)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int getElement(int index)
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
