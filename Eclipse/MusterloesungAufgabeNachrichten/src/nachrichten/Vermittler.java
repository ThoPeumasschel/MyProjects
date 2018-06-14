package nachrichten;

public class Vermittler 
{
	private IEmpfaenger[] alleEmpfaenger;
	private int aktAnzEmpfaenger;
	
	public Vermittler(int maxAnzEmpfaenger)
	{
		alleEmpfaenger=new IEmpfaenger[maxAnzEmpfaenger];
	}
	
	//hier�ber registrieren sich interessierte empf�nger:
	public void register(IEmpfaenger empfaenger)
	{
		if(aktAnzEmpfaenger<alleEmpfaenger.length)
		{
			alleEmpfaenger[aktAnzEmpfaenger++]=empfaenger;
		}
	}
	
	//hier werden alle empf�nger benachrichtigt, sobald eine nachricht aufkommt:
	public void fireUpdate(Nachricht n)
	{
		for(IEmpfaenger e : alleEmpfaenger)
		{
			if(e!=null)
			{
				e.update(n);
			}
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
