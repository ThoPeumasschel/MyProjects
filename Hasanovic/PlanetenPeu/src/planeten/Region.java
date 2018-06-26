package planeten;

public class Region extends GeoComponent
{
	private Provinz[] provinzen;

	public void addProvinz(Provinz p)
	{

	}

	public Provinz[] getProvinzen()
	{
		return provinzen;
	}

	public void setProvinzen(Provinz[] provinzen)
	{
		this.provinzen = provinzen;
	}

	@Override
	public void accept(PlanetVisitor pv)
	{
		// TODO Auto-generated method stub

	}
}
