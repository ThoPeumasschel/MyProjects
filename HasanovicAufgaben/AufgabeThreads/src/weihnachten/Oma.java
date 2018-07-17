package weihnachten;

import static java.lang.System.out;

public class Oma implements Runnable
{
	private String name;
	private java.util.Random rand;
	private int gebacken;

	public Oma(String name)
	{
		this.name = name;
		rand = new java.util.Random();

	}

	@Override
	public void run()
	{
		while (true)
		{
			synchronized (KeksDose.class)
			{
				if (KeksDose.getKekse() <= 20)
				{
					while (KeksDose.getKekse() < 100)
					{
						gebacken = rand.nextInt(25) + 10;
						KeksDose.addKekse(gebacken);
						out.println(
								"Oma " + name + " hat " + gebacken + " Plätzchen gebacken.");
						out.println("In der Keksdose sind " + KeksDose.getKekse() + " Kekse.");
						out.println();
						try
						{
							Thread.sleep(1000);
						} catch (InterruptedException e)
						{
							e.printStackTrace();

						}
					}
					KeksDose.setGierschlund(null);
					KeksDose.class.notifyAll();
					try
					{

						KeksDose.class.wait();
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	}
}
