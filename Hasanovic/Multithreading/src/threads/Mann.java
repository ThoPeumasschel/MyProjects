package threads;
import java.util.*;
//producer
public class Mann implements Runnable
{
	private String name;
	private Random zuffi;
	
	public Mann(String name)
	{
		this.name=name;
		zuffi=new Random();
	}
		
	@Override
	public void run() 
	{
		while(true)
		{			
			synchronized(Haushaltskasse.class)
			{
				//mann verdient zufällige summe geld:
				int lohn=zuffi.nextInt(100);
				System.out.println(name + " hat " + lohn + " Euro verdient.");
				//mann zahlt in die kasse ein
				Haushaltskasse.addGeld(lohn);
				System.out.println("In der Kasse sind nun: " + Haushaltskasse.getSaldo() + " Euro.");
				
				//sobald der mann soviel verdient hat, dass in der kasse mindestens 300 euro sind, soll die frau einkaufen gehen dürfen
				if(Haushaltskasse.getSaldo()>=300)
				{
					Haushaltskasse.class.notify(); //signal an die wartende frau, dass sie loslegen darf
					//danach muss der mann nun warten:
					try 
					{
						Haushaltskasse.class.wait();
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
			
			
		}
		
	}
	
	
	
	
	
	
}
