package softwareTests;

public class Konto 
{
	private int saldo;
	
	public void einzahlung(int summe)
	{
		if(summe>0)
		{
			saldo+=summe;
		}
		else
		{
			throw new IllegalArgumentException("Unzulässige Summe");
		}
	}
	
	public void abhebung(int summe)
	{
		if(summe<=saldo && summe>0)
		{
			saldo-=summe;
		}
		else
		{
			throw new IllegalArgumentException("Unzulässiger Betrag!");
		}
	}
	
	public int getSaldo()
	{
		return saldo;
	}
	
	
	
	
}
