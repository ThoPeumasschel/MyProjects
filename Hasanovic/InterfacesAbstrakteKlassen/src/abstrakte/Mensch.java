package abstrakte;

/*
 * 	-> Abstrakte Klassen sind dafür da, um erweitert(spezialisiert) zu werden
 * 
 * 	-> Abstrakte Klassen kann man nicht instanziieren!
 * 
 * 	-> Sobald eine Klasse eine abstrakte Methode erhält, muss die Klasse selbst auch abstract sein!
 * 
 * 	-> Abstrakte Klasse müssen keine abstrakten Methoden haben
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public abstract class Mensch 
{
	String name;
	String vorname;
	int alter;
	
	//konstruktoren sind erlaubt(konstruktorverkettung, init von attributen)
	public Mensch(int alter)
	{
		this.alter=alter;
		
		
	}
	
	
	
	//abstrakte methoden
	public abstract String leben();
	public abstract double berechneKoerpertemperatur(double aussentemperatur);
	
	public void atmen()
	{
		System.out.println("Der Mensch atmet...");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
