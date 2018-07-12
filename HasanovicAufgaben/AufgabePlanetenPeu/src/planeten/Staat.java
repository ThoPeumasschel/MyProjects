package planeten;

public class Staat extends GeoComponent
{
	private Region[] regionen;

	public void addRegion(Region r)
	{

	}

	public Region[] getRegionen()
	{
		return regionen;
	}

	public void setRegionen(Region[] regionen)
	{
		this.regionen = regionen;
	}

	@Override
	public void accept(PlanetVisitor pv)
	{
		// TODO Auto-generated method stub

	}
}
