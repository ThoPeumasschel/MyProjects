package aufzaehlungen;

public enum Farbe 
{
	ROT(255, 0, 0), BLAU(0, 0, 255), GELB(255, 255, 0);
	
	private int r;
	private int g;
	private int b;
	
	
	//konstruktor eines enum muss gesetzt werden, sobald die konstanten wertausprägungen zusätzliche werte verwalten....
	//-> konstruktor muss dann private sein(ist er implizit, wenn kein modifizierer gesetzt)
	private Farbe(int r, int g, int b)
	{
		this.r=r;
		this.g=g;
		this.b=b;
	}
	
	
	//eigene methoden definieren:
	@Override
	public String toString()
	{
		return "Farbe " +  this.name()   + "mit den Werten " + r + g + b;
	}
	
	public void setRGB(int r, int g, int b)
	{
		this.r=r;
		this.g=g;
		this.b=b;
	}
	
	
	
	
	
}
