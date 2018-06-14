package innereKlassen;
/*
 * 	STATISCHE, INNERE KLASSEN
 * 
 * 	-> Können auch von aussen benutzt werden
 * 	-> Sind unabhängig von einer existierenden Instanz der äusseren Klasse
 * 	-> Man kann nicht auf Attribute der äusseren (direkt)Klasse zugreifen
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
