package innereKlassen;
/*
 * 	STATISCHE, INNERE KLASSEN
 * 
 * 	-> K�nnen auch von aussen benutzt werden
 * 	-> Sind unabh�ngig von einer existierenden Instanz der �usseren Klasse
 * 	-> Man kann nicht auf Attribute der �usseren (direkt)Klasse zugreifen
 * 	-> Name der Klasse ist: StatischeInnere.Innen
 * 
 * 
 * 	-> Werden in der Praxis eher gemieden und sind eine Randerscheinung
 * 
 * 
 */
public class StatischeInnere 
{
	private int zahl;
	
	
	static class Innen extends StatischeInnere
	{
		private String text;
		private static int zahl;
		
		
		
		public static void macheEtwas()
		{
			
		}
		
		
		
	}
	
	
	
	
	
	
	
}
