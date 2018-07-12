package planeten;

public class Planet extends GeoComponent
{
	private Kontinent[] kontinente;

	public void addKontinent(Kontinent k)
	{

	}

	public Kontinent[] getKontinente()
	{
		return kontinente;
	}

	public void setKontinente(Kontinent[] kontinente)
	{
		this.kontinente = kontinente;
	}

	@Override
	public void accept(PlanetVisitor pv)
	{
		// TODO Auto-generated method stub

	}
}
