package folge;

import java.util.Random;

public class Aufzaehlung
{
	private Zahl[] elemente;

	private int obergrenze;

	public Aufzaehlung(int maxAnzahlZahlen, int obergrenze)
	{
		elemente = new Zahl[maxAnzahlZahlen];
		this.obergrenze = obergrenze;
	}

	public void initElemente()
	{

		Random zuffi = new Random();
		for (int i = 0; i < elemente.length; i++)
		{
			elemente[i] = new Zahl(zuffi.nextInt(obergrenze) + 1);
		}
	}

	// Innere Klasse
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

	public IFolge iterator()
	{

		return new Reihenfolge();
	}

	// Innere Klasse als Iterator:
	private class Reihenfolge implements IFolge
	{

		// merker für die aktuelle iterations-Position in der Elementsammlung
		private int aktPos;

		@Override
		public boolean elementVorhanden()
		{
			boolean vorhanden = false;
			if (aktPos < elemente.length)
			{
				vorhanden = elemente[aktPos] != null;
			}

			return vorhanden;
		}

		@Override
		public Object nextElement()
		{

			return elemente[aktPos++].getZahl();
		}

	}

}
