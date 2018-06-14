package aufzaehlungen;
/*
 * 	Aufz�hlungen/Enums/Enumerationen
 * 
 * 		-> Sammlung von konstanten Wertauspr�gungen
 * 
 * 			-> Beispiel: MONTAG, DIENSTAG.....
 * 
 * 			-> Alle Wertauspr�gungen werden implizit als Singletons verwaltet
 * 		
 * 			-> Ein jedes Enum wird in Java wie ein Attribut der Klasse behandelt
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Main 
{

	//attribute
	private String name;
	enum Woche{MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG}
	
	
	
	
	public static void main(String[] args) 
	{
		Woche freitag=Woche.FREITAG;
		Farbe rot=Farbe.ROT;
		rot.setRGB(233, 0, 0);
		Woche freitagDerdreizehnte=Woche.FREITAG;
		
		//alle wertauspr�gungen existieren einmalig im speicher!
		if(freitag==freitagDerdreizehnte)
		{
			System.out.println("gleich");
		}
		
		
	}

}
