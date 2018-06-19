package folge;

import java.util.Random;

public class Aufzaehlung
{

	private int obergrenze;
	private Zahl[] zufallsArray;

	public Aufzaehlung(int obergrenze, int arrayLength)
	{
		super();
		zufallsArray = new Zahl[arrayLength];
		this.obergrenze = obergrenze;

	}

	public void legLos()
	{
		Random r = new Random();

		for (int i = 0; i < zufallsArray.length; i++)
		{
			zufallsArray[i] = new Zahl(r.nextInt(obergrenze) + 1);
		}

	}

	private class Zahl
	{
		private int zahl;

		public Zahl(int zahl)
		{
			super();
			this.zahl = zahl;
		}

		public int getZahl()
		{
			return zahl;
		}

	}

	public Reihenfolge aufzaehlen()
	{

		return new Reihenfolge();

	}

	private class Reihenfolge implements IFolge
	{
		private int index;

		public String sayHello()
		{
			return "Hello";
		}

		@Override
		public boolean hasNext()
		{
			boolean gehtWeiter = false;
			if (index < zufallsArray.length)
			{
				gehtWeiter = zufallsArray[index] != null;
			}

			return gehtWeiter;
		}

		@Override
		public Object next()
		{
			return (Integer) zufallsArray[index++].getZahl();
		}

	}

}
