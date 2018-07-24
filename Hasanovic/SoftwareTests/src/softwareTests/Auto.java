package softwareTests;

/*
 * 	Anforderungen für die Berechnung der Schadstoffklasse:
 * 
 * 		Grün -> bis 75PS
 * 		Orange -> ab 76PS bis 100PS
 * 		Blau -> ab 101PS bis 140PS
 * 		Rot -> ab 141
 * 
 * 
 * 
 * 
 * 
 */


public class Auto 
{
	private int ps;
	
	public Auto(int ps)
	{
		this.ps=ps;
	}

	
	
	
	
	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}
	
	
	//liefert die schadstoffklasse basierend auf der anzahl ps:
	public String getSchadstoffKlasse()
	{
		String sKlasse="";
		if(ps<=75)
		{
			sKlasse="Grün";
		}
		else if(ps>75 && ps<=100)
		{
			sKlasse="Orange";
		}
		
		
		
		
		return sKlasse;
	}
	
	
	
	
}
