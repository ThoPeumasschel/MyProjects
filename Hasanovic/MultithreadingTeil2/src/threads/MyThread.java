package threads;

//diese klasse ist threadfähig, weil sie von Thread erbt(und, da Thread selbst Runnable implementiert, ist diese Klasse auch Runnable!)
public class MyThread extends Thread
{
	private int zahl;
	
	
	public MyThread(String name)
	{
		super(name);
	}
	
	
	

	@Override
	public void run() 
	{
		
		//hier steht der code, welcher in einem separaten thread laufen soll
		while(zahl<8)
		{
			System.out.println("Priorität : " + Thread.currentThread().getPriority() + " aktueller Wert von zahl: " + zahl 
					+ " im Thread: " + Thread.currentThread().getName());
			zahl++;
			
			try {
				Thread.sleep(1800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
	}

}
