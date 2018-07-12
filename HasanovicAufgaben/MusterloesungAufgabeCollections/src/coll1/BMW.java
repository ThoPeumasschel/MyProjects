package coll1;

public class BMW extends Auto
{
	public BMW(String modell, int baujahr)
	{
		super(modell, baujahr);
	}
	public void setBaujahr(int b)
	{
		baujahr=b;
	}
	
	public void setModell(String m)
	{
		modell=m;
	}
	
	public String toString()
	{
		return "BMW.Modell: " + modell + ", Baujahr " + baujahr; 
	}
}
