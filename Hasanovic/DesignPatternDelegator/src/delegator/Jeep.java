package delegator;

public class Jeep extends Fahrzeug
{

	//h�lt eine referenz auf den delegator
	private Delegator delegator;
	//....
	
	
	public Jeep()
	{
		delegator=new Delegator(this);
	}
	
	
	
	public void checkMotor()
	{
		//...
		int wg=delegator.berechneWirkungsgrad();
		
		
	}
	
	
	
	
}
