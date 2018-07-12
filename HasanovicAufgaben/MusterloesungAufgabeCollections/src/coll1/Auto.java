package coll1;

public abstract class Auto implements Comparable
{
	protected int baujahr;
	protected String modell;
	public Auto(String m, int b)
	{
		baujahr=b;modell=m;
	}
	
	public String getModell()
	{
		return modell;
	}
	
	public int getBaujahr()
	{
		return baujahr;
	}
	
	public int compareTo(Object o)
	{
		int erg=0;
		
		if(this.modell.compareTo(((Auto)o).getModell())==0)
		{
			if(baujahr<((Auto)o).getBaujahr())
			{
				erg=-1;
			}
			else if(baujahr>((Auto)o).getBaujahr())
			{
				erg=1;
			}
			else
			{
				erg=0;
			}
		}
		else
		{
			erg=this.modell.compareTo(((Auto)o).getModell());
		}
		return erg;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(this==o)
		{
			return true;
		}
		if(this!=null)
		{
			if(this.modell.equals(((Auto)o).getModell()) && baujahr==((Auto)o).getBaujahr())
			{
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return modell.hashCode() + baujahr;
	}
	
}
