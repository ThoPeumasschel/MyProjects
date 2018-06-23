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

	// wenn aufgerufen, wird das feld von elementen mit zahl-objekten gefüllt,
	// welche jeweils eine zufällige ganzzzahl bis obergrenze erhalten
	public void initElemente()
	{
		Random zuffi = new Random();
		for (int i = 0; i < elemente.length; i++)
			{
				elemente[i] = new Zahl(zuffi.nextInt(obergrenze) + 1);
			}
	}

	// INNERE KLASSEN
	private class Zahl
	{
		private int zahl;

		public Zahl(int zahl)
		{
			this.zahl = zahl;
		}

		public int getZahl()
		{
			return zahl;
		}
	}

	public IReihenfolge iterator()
	{
		return new Reihenfolge();
	}

	// INNERE KLASSE ALS ITERATOR:
	private class Reihenfolge implements IReihenfolge
	{

		// merker für die aktuelle iterations-position in der elementsammlung
		private int aktPos;

		@Override
		public boolean elementVorhanden() // klassischerweise als hasnext()
		{
			boolean vorhanden = false;
			if (aktPos < elemente.length)
				{
					vorhanden = elemente[aktPos] != null;
				}
			return vorhanden;
		}

		@Override
		public Object nextElement() // klassischerweise als next(), zB. nextInt()
		{
			return elemente[aktPos++].getZahl();
		}

		@Override
		public void remove()
		{
			throw new UnsupportedOperationException("Löschen von Elementen beim Iterieren nicht erlaubt!");

		}
	}

}
