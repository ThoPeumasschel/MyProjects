package charakter;

import java.util.Random;

import eigenschaften.EName;
import eigenschaften.ERasse;
import eigenschaften.EWaffe;
import listener.CharakterListener;

public class GameInit
{
	private static int anzErzeugt;

	public static void initStadt(Stadt stadt)
	{
		// zufallsgenerator setzen
		final Random zuffi = new Random();

		while (anzErzeugt < stadt.getAnzCharaktere())
			{
				// zuf�lliges planquadrat w�hlen
				int pIndex = zuffi.nextInt(100);
				// dieses zuf�llige quadret aus der stadt holen und zwischenspeichern
				final Planquadrat tempPlanQuadrat = stadt.getPlanquadratAt(pIndex + 1);
				// ist auf diesem planquadrat bereits ein charakter vorhanden?
				if (!tempPlanQuadrat.isBesetzt())
					{
						// anonymen charakter generieren
						stadt.getPlanquadratAt(pIndex + 1).setCharakter(new Charakter()
						{
							// diese anonyme klasse hat eine methode, welche etwas vom typ Charakter
							// liefert:
							Charakter createCharakter()
							{
								Charakter cTemp = new Charakter();
								cTemp.setName(EName.values()[zuffi.nextInt(EName.values().length)]);
								cTemp.setRasse(ERasse.values()[zuffi.nextInt(ERasse.values().length)]);
								cTemp.setWaffe(EWaffe.values()[zuffi.nextInt(EWaffe.values().length)]);
								// restliche, weitere attribute setzen...
								// ....

								cTemp.setId(tempPlanQuadrat);

								cTemp.setListener(new CharakterListener(30));
								anzErzeugt++;
								return cTemp;
							}
						}.createCharakter());
					}

			}

	}

}
