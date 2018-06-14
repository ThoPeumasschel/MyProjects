package immutable;

/*
 * 	Problem:
 * 
 * 		-> Wie schreibe ich eine Klasse, deren Instanzvariablen nach der Instanziierung und erstmaligen Initialsierung nicht mehr
 *         verändert werden können?
 * 
 * 			-> Ziel: Schaffung "robuster" Objekte
 * 
 * 			-> Robuste Objekte kann man bedenkenlos "verteilen", ohne sich Sorgen darüber zu machen, dass deren Daten manipuliert werden
 * 
 * 
 * 		-> Realisierung:
 * 
 * 
 * 			1. Keine Setter! (Nur Getter)
 * 
 * 
 * 			1a. Alle Attribute sind private!
 * 
 * 			2. Alle relevanten Attribute werden am Anfang per Konstruktor initialisiert
 * 
 * 			3. Alles, was an den Konstruktor übergeben wurde und selbst komplex und NICHT immutable ist, muss unter einer neuen 
 * 			   Speicheradresse im Objekt hinterlegt werden(Kopie, Clone....)
 * 
 * 			4. Wenn Getter etwas aus aus dem Immutable zurück geben, was selbst komplex und NICHT immutable ist, muss dieses ebenfalls
 * 			   als Kopie unter einer neuen Adresse zurückgegeben werden
 * 
 * 			5. In letzter Konsequenz ist eine immutable-Klasse immer auch final
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



public final class Immutable 
{
	//attribute
	private int zahl;
	private char[] array;
	private String text;
	
	//konstruktoren 
	public Immutable(int zahl, char[] arr, String text)
	{
		this.zahl=zahl;
		
		
		//immer, wenn komplexe objekte(keine primitiven) zugewiesen werden sollen, muss der inhalt kopiert und unter einer neuen
		//speicheradresse neu zugewiesen werden(in diesem beispiel hier per clone() )
		this.array=arr.clone();
		this.text=text;
	}
	
	
	
	public int getZahl() {
		return zahl;
	}
	public char[] getArray() 
	{
		return array.clone();
	}
	
	public String getText() {
		return text;
	}
	
	
	
	
	
	
}
