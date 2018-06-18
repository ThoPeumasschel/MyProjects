package basics;

public class Tiger extends Saeugetier
{

	@Override
	public void fressen()
	{
		System.out.println("Ich fresse Fleisch.");
		super.checkTier();
		
	}
	
	
	
	@Override
	public Tiger checkTier()
	{
		return null;
	}
	
	
	//�berladen
	public void laufen(int speed, String richtung, int distanz)
	{
		
	}
	
	
}



/*
	�berschreiben und �berladen von Methoden:
	
	
	-> �berschreiben:
	
		-> Die Sichtbarkeit der Supermethode darf nicht eingeengt werden(darf sich erweitern)
		-> Identischer Name
		-> Argumentliste muss identisch sein
		-> Nur Methoden, welche in Unterklassen sichtbar sind, k�nnen �berschrieben werden
		-> static-Methoden k�nnen nicht �berschrieben werden!
		-> final-Methoden k�nnen nicht �berschrieben werden
		-> mit super.Methode kann immer noch die Variante aus der Superklasse aufgerufen werden
		
		
	-> �berladen:
	
		-> R�ckgabetyp kann anders sein, muss aber nicht
		-> Sichtbarkeit kann sich unterscheiden, muss aber nicht
		-> Argumentliste muss sich in Typ und/oder Anzahl bzw. Abfolge unterscheiden
		-> Name muss gleich sein!






	-> Kovarianz, Kontravarianz, Invarianz:
	
		-> Kovarianz: Der Typ bewegt sich unterhalb des Supertypen bez�glich der Vererbungshierarchie
			-> Es kann also der selbe Typ sein, oder ein Untertyp


		-> Kontravarianz: Der Typ bewegt sich oberhalb des Supertypen
			-> Es kann also der selbe Typ sein, oder ein Supertyp
			
		-> Invarianz: Der Typ muss immer gleich sein, also immer auf der selben Ebene der Vererbungshierarchie bleiben!
			
			


*/