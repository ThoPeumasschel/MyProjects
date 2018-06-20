package karton;

public class KartonString extends Karton
{
	private String[] stringKarton;
	private int index;
	private int obergrenze;

	@Override
	void putElement(Object s)
	{
		stringKarton[index] = (String) s;
		index++;

	}

	@Override
	void deleteElement(int index)
	{
		// TODO Auto-generated method stub

	}

	@Override
	void getElements()
	{
		// TODO Auto-generated method stub

	}

	@Override
	Object getElement(Object index)
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

}
