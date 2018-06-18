package polymorphy;

public class Fisch extends Lebewesen 
{
	private int anzFlossen;
	private double sauerstoffDurchsatz;
	
	//paramterloser konstruktor
	public Fisch()
	{
		super(null);
		//super();  <-- diese anweisung schreibt der compiler IMPLIZIT an den anfang des konstruktors!
		anzFlossen=3;
		sauerstoffDurchsatz=2;
	}
	
	
	//parametrisierter konstruktor
	public Fisch(int anzFlossen)
	{
		super(null);
		//super(); <-- diese anweisung schreibt der compiler IMPLIZIT an den anfang des konstruktors!
		this.anzFlossen=anzFlossen;
	}

	//fisch-methoden:
	public void schwimmen()
	{
		System.out.println("Ich bin ein Fisch und ich schwimme...");
		
	}
	
	public void blubbern()
	{
		System.out.println("Ich blubbere vor mich hin....");
	}
	
	@Override
	public void wachsen()
	{
		System.out.println("Ich wachse wie ein Fisch...");
	}
	
	
	
	
	public int getAnzFlossen() {
		return anzFlossen;
	}


	public void setAnzFlossen(int anzFlossen) {
		this.anzFlossen = anzFlossen;
	}


	public double getSauerstoffDurchsatz() {
		return sauerstoffDurchsatz;
	}


	public void setSauerstoffDurchsatz(double sauerstoffDurchsatz) {
		this.sauerstoffDurchsatz = sauerstoffDurchsatz;
	}
	
	
	
	
	
	
	
}
