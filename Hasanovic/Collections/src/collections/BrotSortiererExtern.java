package collections;

import java.util.Comparator;

public class BrotSortiererExtern implements Comparator 
{

	
	//Sortierlogik ist dieselbe wir bei compareTo()!
	
	
	//brote nach gewicht absteigend sortieren:
	@Override
	public int compare(Object o1, Object o2) 
	{
		if(((Brot)o1).getGewichtInGramm()<((Brot)o2).getGewichtInGramm())
		{
			return 1;
		}
		else if(((Brot)o1).getGewichtInGramm()>((Brot)o2).getGewichtInGramm())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	
	
	
}
