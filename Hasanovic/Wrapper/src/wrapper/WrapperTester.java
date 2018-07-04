package wrapper;

public class WrapperTester
{

	public void acceptInt(int i)
	{
		System.out.println("Ich akzeptiere den primitiven int");
	}

	public void acceptInt(Short i)
	{
		System.out.println("Ich akzeptiere Short");
	}

	public void acceptInt(long l)
	{
		System.out.println("Ich akzeptiere primitive longs");
	}

	public void acceptInt(Long l)
	{
		System.out.println("Ich akzeptiere komplexe Longs");
	}

}
