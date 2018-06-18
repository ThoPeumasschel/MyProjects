package folge;

import java.util.Random;

//Die Klasse Aufzählung erzeugt n positive Zufallszahlen vom Typ int(im Wertebereich von 1 bis 
//Obergrenze, welche jeweils in einem Objekt vom Typ Zahl gekapselt werden) 
//und es lassen sich alle erzeugten Zahlen(Hauptprogramm) 
//und auch eine Zahl an einer beliebigen Stelle ausgeben(Array).
//
//Das Zahlen-Array soll dabei Zahlen-Objekte enthalten! Das Zahlen-Array ist nach aussen nicht 
//direkt erreichbar, auch nicht durch getter-Methoden!
//
//Die innere Klasse dient dazu, die Zufallszahlen aus der Klasse Aufzählung als Objekt des Typs 
//Reihenfolge(Folge) zurückzugeben. Die Erzeugten Zahlen auf dem Array sollen also nur über 
//dieses Objekt bzw. dessen Methoden erreichbar sein!

public class Aufzaehlung
{
	private int zufallszahl;
	private Random rand = new Random();
	private int obergrenze;

	public Aufzaehlung(int obergrenze)
	{
		super();
		this.obergrenze = obergrenze;
	}

	public Zahl erzeugeZahl()
	{
		Zahl zahl = new Zahl();
		zufallszahl = rand.nextInt(obergrenze) + 1;
		zahl.setGeheimeZahl(zufallszahl);

		return zahl;
	}

	class Reihenfolge implements IFolge
	{
		Reihenfolge r = new Reihenfolge();
		Aufzaehlung aufz = new Aufzaehlung(100);
		Reihenfolge[] folge = new Reihenfolge[10];

		Reihenfolge erzeugen()
		{
			for (int i = 0; i < folge.length; i++)
				{
					this.folge[i] = r.zufallszahl;
				}

			return null;

		}

		Reihenfolge zurueckgeben()
		{

			return null;
		}

		@Override
		public boolean elementVorhanden()
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object nextElement()
		{
			// TODO Auto-generated method stub
			return null;
		}

	}

	public String toString()
	{
		return "Aufzählung enthält Zufallszahl: " + zufallszahl + " und Obergrenze " + obergrenze;
	}

}
