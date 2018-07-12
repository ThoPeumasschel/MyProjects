package innereKlassen;

/*
 * 	ELEMENTKLASSEN:
 * 
 * 		Regeln:
 * 
 * 			-> Ohne eine lebende Instanz der äusseren Klasse kann es kein Objekt der inneren Klasse geben!
 * 
 * 			-> In Elementklassen sind statische Attribute(se sei denn, es handelt sich um Konstanten) und statische Methoden verboten!
 * 
 * 			-> Wenn ein Objekt von Aussen erzeugt wird, dann existiert NICHT automatisch auch ein Objekt der Elementklasse(n) !!
 * 
 * 			-> Elementklassen können andere Klassen erweitern(auch seine eigene äussere) - ABER: Die äussere kann NICHT von ihren inneren
 * 			   erben!!!
 * 
 * 			-> Elementklassen können auch Interfaces implementieren
 * 
 * 			-> Elementklassen können ebenefalls innere Klassen haben
 * 
 * 			-> Elementklassen können default, public, private, protected, abstract/final
 * 
 * 			-> Der Typ einer Elementklasse ist immer: Aussen.Innen
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Aussen
{
	private int zahl;
	private String text;
	private static double wert;

	// *******************************************************************************************************************
	// elementklasse: -> Eine Elementklasse ist implizit nichts anderes, als ein
	// Attribut der äusseren Klasse!
	public class Innen
	{
		// innere elementklassen dürfen auch attribute haben:
		private int zahl;
		private Innen innen;
		private static final String NAME = "Otto";

		// innere lementklassen dürfen natürlich auch konstruktoren haben
		public Innen()
		{
			zahl = 12; // hier wird das attrinut der INNEREN klasse und nicht
						// das der äusseren initialisiert!
			Aussen.this.zahl = 300; // hier wird explizit das gleichnamige
									// attribut der äusseren klasse
									// initialsiert!
			innen = this;
			text = "Text"; // innere elementklassen können ohne weiteres auf
							// alle attribute der äusseren direkt zugreifen!
			macheEtwasAussen();
		}

		public void innereMethode()
		{

		}

	}

	public abstract class InnenAbstrakt
	{

	}

	// ******************************************************************************************************************

	public void macheEtwasAussen()
	{

	}

	public void zugriffAufInnen()
	{
		Innen i = new Innen();

		i.innereMethode();
	}
	// *********************************************************************************************************************
	// LOKALE KLASSEN / METHODENKLASSEN

	/*
	 * Regeln:
	 * 
	 * -> Für Methodenklassen sind Sichtbarkeitsmodifikatoren verboten -> Auch
	 * in static-Methoden darf es Methodenklassen geben! -> Methodenklassen
	 * können andere Klassen erweitern und auch Interfaces implementieren -> Aus
	 * der lokalen Klasse heraus kann man auf alle Elemente der äusseren Klasse
	 * zugreifen -> Zugriff aus der lokalen Klasse heraus auf lokale Variablen
	 * nur erlaubt, wenn diese final sind! -> In einer Methode kann es beliebig
	 * viele lokale Klassen geben, welche auch voneinander(sequentiell) erben
	 * können!
	 * 
	 * 
	 */

	public void ausgabe()
	{
		final int zwischenErgebnis = 0;
		final double kommaZahl = 0;

		class MethodenKlasse extends Innen implements IMessbar
		{
			// attribute
			private int attribut;

			public MethodenKlasse(int i)
			{
				int erg = zwischenErgebnis;
				double zahl = kommaZahl;
				attribut = i;
			}

			public void macheEtwasInDerMethode()
			{

				macheEtwasAussen();
			}

			@Override
			public void messung()
			{
				// TODO Auto-generated method stub

			}

		}
		// erst ab hier kann man von der Methodenklasse Objekte erzeugen!! (erst
		// ab hier ist sie komplett ausgelesen und bekannt!)
		MethodenKlasse m = new MethodenKlasse(23);

		class MethodenKlasseSpezial extends MethodenKlasse
		{

			public MethodenKlasseSpezial(int i)
			{
				super(i);
				// TODO Auto-generated constructor stub
			}

		}

	}

}
