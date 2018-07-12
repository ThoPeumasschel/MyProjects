package fahrplan;
import java.util.*;
//bietet clients fahrplanbezogene dienste an
public class Fahrplan 
{
	//alle zuglinien:
	//map:
	// key: zuglinie	value: zug
	private HashMap zuglinien;
	
	
	//dienste:
	
	public Fahrplan() {
		zuglinien=new HashMap();
	}

	//neue zuglinie hinzufügen:
	public void addZuglinie(Zuglinie linie, Zug zug)
	{
		zuglinien.put(linie, zug);
	}
	
	//zuglinie entfernen
	public void loescheZuglinie(Zuglinie linie)
	{
		zuglinien.remove(linie);
	}
	
	
	//fahrplan ausgeben:
	public void printFahrplan(Zuglinie linie)
	{
		//prüfen, ob übergebene zuglinie in der map vorhanden ist:
		boolean linieVorhanden=zuglinien.containsKey(linie);
		if(linieVorhanden)
		{
			Iterator it=linie.getHaltepunkte().iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
