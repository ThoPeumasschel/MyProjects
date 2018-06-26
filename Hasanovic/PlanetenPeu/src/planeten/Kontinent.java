package planeten;

public class Kontinent extends GeoComponent
{
	private Staat[] staaten;

	public void addStaat(Staat s)
	{

	}

	public Staat[] getStaaten()
	{
		return staaten;
	}

	public void setStaaten(Staat[] staaten)
	{
		this.staaten = staaten;
	}

	@Override
	public void accept(PlanetVisitor pv)
	{
		// TODO Auto-generated method stub

	}
}
