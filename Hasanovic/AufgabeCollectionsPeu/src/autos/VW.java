package autos;

public class VW extends Auto
{
	public VW(String modell, int baujahr)
	{
		super();
		this.setModell(modell);
		this.setBaujahr(baujahr);
	}

	@Override
	public String toString()
	{
		return "VW.Modell: " + getModell() + ", Baujahr " + getBaujahr();
	}

}
