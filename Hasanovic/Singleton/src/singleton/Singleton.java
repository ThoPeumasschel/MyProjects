package singleton;

/*
 * 	Das Problem, welches hier auf eine elegante Art gel�st werden soll:
 * 
 * 		-> Wie sieht eine Klasse aus, von der es nur eine einzige Instanz auf dem Heap geben kann?
 * 
 * 		-> Bedingung: Auch wenn es jemand versucht, soll es nicht m�glich sein, dass von dieser Klasse mehrere Objekte existieren!
 * 
 * 
 * 
 * 		-> Realisierung:
 * 
 * 
 * 			1. Es gibt nur einen, privaten, parameterlosen Konstruktor
 * 
 * 			2. Es gibt ein statisches Attribut vom Typ der Klasse selbst, welches private ist
 * 
 * 			3. Eine statische, �ffentliche Methode bietet den einzigen Zugriff auf die dann instanziierte Instanz
 * 
 */

public class Singleton
{

	private static Singleton instanz;

	// privater kontruktor
	private Singleton()
	{

	}

	public static Singleton getSingleton()
	{
		if (instanz == null)
		{
			instanz = new Singleton();
		}
		return instanz;
	}

}
