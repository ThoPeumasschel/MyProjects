package planeten;

public class Provinz extends GeoComponent
{
	private Gemeinde[] gemeinden;

	public void addGemeinde(Gemeinde g)
	{

	}

	public Gemeinde[] getGemeinden()
	{
		return gemeinden;
	}

	public void setGemeinden(Gemeinde[] gemeinden)
	{
		this.gemeinden = gemeinden;
	}

	@Override
	public void accept(PlanetVisitor pv)
	{
		// TODO Auto-generated method stub

	}
}
