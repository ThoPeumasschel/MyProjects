package threads;

public class Haushaltskasse 
{
	private static int saldo;
	
	public static void setSaldo(int saldo)
	{
		Haushaltskasse.saldo=saldo;
	}
	
	public static int getSaldo()
	{
		return saldo;
	}
	
	public static void addGeld(int geld)
	{
		saldo+=geld;
	}
	
	
	
	
	
}
