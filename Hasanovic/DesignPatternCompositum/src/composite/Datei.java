package composite;

//ein Leaf -> eine konkrete Elementklasse
public class Datei extends Komponente
{
	private String dateityp;
	private boolean ausfuehrbar;
	//....
	public Datei(String name)
	{
		this.setName(name);
	}
	
	
	
	@Override
	public String toString()
	{
		return "Datei mit dem Namen: " + getName() + " und dem Dateityp: " + dateityp;
	}
	
	
	
	
	
	
	
	
	
	
}
