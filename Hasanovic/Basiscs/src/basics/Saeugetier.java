package basics;

public class Saeugetier 
{

	
	public void fressen()
	{
		System.out.println("...ich bin ein fressendes S�ugetier...");
	}
	
	
	public Saeugetier checkTier() //diese methode kann immer nur etwas zur�ckgeben, was vom typ Saeugetier ist
	{
		Saeugetier viech=new Saeugetier();
		Tiger tiger=new Tiger();
		
		
		laufen(30, "nord");
		laufen(20, 20);
		
		return tiger;
		
		
		
	}
	
	//�berladene methoden
	public void laufen(int speed)
	{
		
	}
	
	public void laufen(int speed, String richtung)
	{
		
	}
	
	public void laufen(String richtung, int speed)
	{
		
	}
	
	public void laufen(int richtung, int speed)
	{
		
	}
}
