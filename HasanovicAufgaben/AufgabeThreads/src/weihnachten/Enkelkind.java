package weihnachten;

import static java.lang.System.out;

public class Enkelkind implements Runnable
{
	private String name;
	private java.util.Random rand;
	private int gegessen;

	public Enkelkind(String name)
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
				if (KeksDose.getKekse() > 20 && KeksDose.getGierschlund() != name)
				{
					gegessen = (rand.nextInt(16)) + 5;
					out.println(name + " hat " + gegessen + " Kekse gegessen.");
					KeksDose.setKekse(KeksDose.getKekse() - gegessen);
					out.println("In der Keksdose sind noch " + KeksDose.getKekse() + " Kekse.");
					try
					{
						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					if (gegessen >= 18)
					{
						KeksDose.setGierschlund(name);
						;
						out.println(name + " war zu gierig und muss jetzt warten!");
						out.println("-------------");
						KeksDose.class.notifyAll();

						try
						{
							KeksDose.class.wait();
						} catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				} else
				{
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
