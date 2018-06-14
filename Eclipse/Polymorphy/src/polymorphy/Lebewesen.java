package polymorphy;

public class Lebewesen 
{
	private String ordnung;
	private String gattung;
	private double lebenserwartung;
	int alter;
	
	//wenn der entwickler in einer klasse keinen expliziten konstruktor definiert, wird vom compiler 
		//der default-konstruktor implizit gestellt!
		
		
		//wenn der entwickler auch nur einen einzigen konstruktor explizit definiert, dann wird vom compiler kein default-konstruktor
		//mehr gestellt!
		
		//so sieht der implizite default-konstruktor aus:
		/*
		 * public Lebewesen()
		 * {
		 * 		super();
		 * }
		 * 
		 * 
		 * 
		 */
		
	
	
	
	public Lebewesen(String gattung)
	{
		this.gattung=gattung;
	}
	
	//lebewesen-methoden:
	public void wachsen()
	{
		System.out.println("Ich wachse wie ein Lebewesen.....");
	}
	
	public void sex()
	{
		System.out.println("Ich habe Sex wie ein Lebewesen....");
	}
	
	
	public String getOrdnung() {
		return ordnung;
	}
	public void setOrdnung(String ordnung) {
		this.ordnung = ordnung;
	}
	public String getGattung() {
		return gattung;
	}
	public void setGattung(String gattung) {
		this.gattung = gattung;
	}
	public double getLebeserwartung() {
		return lebenserwartung;
	}
	public void setLebeserwartung(double lebeserwartung) 
	{
		
		
		this.lebenserwartung = lebeserwartung;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	
	
	
	
	
	
	
	
	
	
}
