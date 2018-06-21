package delegator;

public class Stanze extends Maschine implements IDelegator
{

	private Delegator delegator;

	public Stanze() {
		
		this.delegator = new Delegator(this);
	}
	
	
	public int getWirkungsgrad()
	{
		return delegator.berechneWirkungsgrad();
	}
	
	
	
	
}
