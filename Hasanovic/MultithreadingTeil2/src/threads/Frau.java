package threads;
//consumer
public class Frau implements Runnable
{
	private String name;
	private java.util.Random zuffi;
	
	
	public Frau(String name)
	{
		this.name=name;
		zuffi=new java.util.Random();
	}
	
	
	
	@Override
	public void run() 
	{
		while(true)
		{
			synchronized(Haushaltskasse.class)
			{
				if(Haushaltskasse.getSaldo()<50)
				{
					//mann soll aufwachen und weiter geld vedienen:
					Haushaltskasse.class.notify();
					
					//frau wartet jetzt wieder, bis mindestens 300 euro vom mann in die kasse gespült wurden
					try {
						Haushaltskasse.class.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				//frau konsumiert
				//zufällige summe wird ausgegeben:
				int kosten=zuffi.nextInt(50);
				System.out.println(name + " hat für " + kosten + " Euro eingekauft.");
				Haushaltskasse.setSaldo(Haushaltskasse.getSaldo()-kosten);
				System.out.println("In der Kasse sind nun: " + Haushaltskasse.getSaldo());
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
		
		
	}

	
	
	
	
	
	
}
