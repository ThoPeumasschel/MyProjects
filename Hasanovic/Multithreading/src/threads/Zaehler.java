package threads;

public class Zaehler implements Runnable
{

	private int zaehler; //hier wird konkurrierend zugegriffen 

	@Override
	public void run() 
	{
		while(true)
		{
			
			synchronized(this) //-> Das Zaehler-Objekt hält die Sperre, den Lock auf diesen Code-Bereich
			{
				//schreibende operation(non-atomar)
				zaehler++;
				//lesende operation
				System.out.println(Thread.currentThread().getName() + " -> Zahler -> " + zaehler);
				//ausgabe();
			}
			
			
			try 
			{
				Thread.sleep(900);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	//man kann ganze methoden synchronisieren....am besten nur dann, wenn sich in der methode NUR kritischer code befindet!
	private synchronized void ausgabe()
	{
		System.out.println(Thread.currentThread().getName() + " -> Zahler -> " + zaehler);
	}
	
	//hier bezieht sich das synchronized auf das zugehörige klassenobjekt
	private synchronized static void test()
	{
		
	}
	
}
