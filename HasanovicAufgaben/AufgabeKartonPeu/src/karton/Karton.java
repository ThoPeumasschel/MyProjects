package karton;

public abstract class Karton implements IKarton
{

	private int index;
	private String name;
	private Karton parent; // in welchem Karton stecke ich gerade drin?
	private int anzElemente;

	abstract public int count();

	abstract public boolean isEmpty();

	public int getIndex()
	{
		return index;
	}

	public void setIndex(int index)
	{
		this.index = index;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Karton getParent()
	{
		return parent;
	}

	public void setParent(Karton parent)
	{
		this.parent = parent;
	}

	public int getAnzElemente()
	{
		return anzElemente;
	}

	public void setAnzElemente(int anzElemente)
	{
		this.anzElemente = anzElemente;
	}

	public String toString()
	{

		return "Diese Box heiﬂt: " + getName() + " und kann " + getAnzElemente() + " Elemente halten, davon sind "
				+ count() + " Pl‰tze belegt.";
	}

}
