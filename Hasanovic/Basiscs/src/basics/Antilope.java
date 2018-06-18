package basics;

public class Antilope extends Saeugetier
{
	
	@Override
	public void fressen()
	{
		System.out.println("Ich fresse Gras.");
	}
	
	
	
	@Override
	public Saeugetier checkTier()
	{
		return this;
	}
	
	
}
