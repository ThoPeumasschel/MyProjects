package autos;

public class BMW extends Auto
{
	public BMW(String modell, int baujahr)
	{
		super();
		this.setModell(modell);
		this.setBaujahr(baujahr);
	}

	@Override
	public String toString()
	{
		return "BMW.Modell: " + getModell() + ", Baujahr " + getBaujahr();
	}

}
