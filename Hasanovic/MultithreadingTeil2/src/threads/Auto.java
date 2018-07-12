package threads;

public class Auto extends Fahrzeug implements Runnable
{

	public void fahre()
	{
		//...code zum fahren...
	}
	
	public void fahrenAsync()
	{
		//hier soll der code zum fahren in einem separaten thread ablaufen....
		Thread t=new Thread(this);
		t.start();
		
	}

	@Override
	public void run() 
	{
		int i=1;
		
		fahre();
	}
	
	
	
}
