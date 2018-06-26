package planeten;

public class Gemeinde extends GeoComponent
{
	public int anzEinwohner;

	public int getAnzEinwohner()
	{
		return anzEinwohner;
	}

	public void setAnzEinwohner(int anzEinwohner)
	{
		this.anzEinwohner = anzEinwohner;
	}

	@Override
	public void accept(PlanetVisitor pv)
	{
		pv.visitGemeinde(this);

	}

}
