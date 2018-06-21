package composite;

//-> Containerklasse

public class Verzeichnis extends Komponente
{
	private Komponente[] inhalt;
	private int anzahlKomponenten;
	
	public Verzeichnis(String name, int maxAnzKomponenten)
	{
		inhalt=new Komponente[maxAnzKomponenten];
		this.anzahlKomponenten=anzahlKomponenten;
		this.setName(name);
	}

	//hinzufügen von komponenten in das verzeichnis
	public void addKomponente(Komponente k)
	{
		if(anzahlKomponenten<inhalt.length)
		{
			inhalt[anzahlKomponenten++]=k;
			k.setParent(this);
		}
	}
	
	
	
	
	public Komponente[] getInhalt() {
		return inhalt;
	}

	public void setInhalt(Komponente[] inhalt) {
		this.inhalt = inhalt;
	}

	public int getAnzahlKomponenten() {
		return anzahlKomponenten;
	}

	public void setAnzahlKomponenten(int anzahlKomponenten) {
		this.anzahlKomponenten = anzahlKomponenten;
	}
	
	
	
	@Override
	public String toString()
	{
		return "Verzeichnis mit dem Namen: " + getName() + " und " + anzahlKomponenten + " Komponenten.";
	}
	
	
	
	
	
	
	
	
	
	
}
