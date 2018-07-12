package planeten;

public abstract class GeoComponent implements IGeoComponent

{
	private String name;
	private GeoComponent parent;

	public abstract void accept(PlanetVisitor pv);

	public GeoComponent(String name)
	{
		this.name = name;

	}

	public GeoComponent()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public GeoComponent getParent()
	{
		return parent;
	}

	@Override
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setParent(GeoComponent parent)
	{
		this.parent = parent;
	}

}
