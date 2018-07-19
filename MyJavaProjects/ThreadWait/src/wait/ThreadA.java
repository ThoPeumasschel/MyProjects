package wait;

public class ThreadA
{

	public static void main(String[] args)
	{
		ThreadB tb = new ThreadB();
		tb.start();

		synchronized (tb)
		{
			try
			{
				System.out.println("Waiting for b to complete...");
				tb.wait();
			} catch (InterruptedException e)
			{
				System.out.println("Total is: " + tb.total);
			}
		}
	}

}
