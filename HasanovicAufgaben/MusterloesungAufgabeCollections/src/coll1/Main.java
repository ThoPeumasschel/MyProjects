package coll1;
import java.util.*;
public class Main 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		VW vwgolf=new VW("Golf", 1990);
		BMW bmwz4=new BMW("Z4", 2000);
		
		VW vw1=new VW("Polo", 1995);
		VW vw2=new VW("Jetta", 1992);
		VW vw3=new VW("Passat", 1998);
		
		LinkedList li=new LinkedList();
		li.add(vw1);li.add(vw2);li.add(vw3);
		
		Collections.sort(li);
		ausgabe(li);
		
		BMW bmw1=new BMW("Dreier", 1918);
		BMW bmw2=new BMW("Fünfer", 1939);
		BMW bmw3=new BMW("X6", 2009);
		BMW bmw4=new BMW("X6", 2009); //objekt wird abgelehnt
		
		
		HashSet hashset=new HashSet();
		hashset.add(bmw1);hashset.add(bmw2);hashset.add(bmw3);hashset.add(bmw4);
		
		TreeSet treeset=new TreeSet();
		treeset.add(bmw1);treeset.add(bmw2);treeset.add(bmw3);
		
		
		ausgabe(hashset);
		ausgabe(treeset);
		bmw3.setBaujahr(1939);
		bmw3.setModell("Fünfer");
		
		System.out.println("-------------------------------------");
		ausgabe(hashset);
		
		if(hashset.contains(bmw1))
		{
			System.out.println("Der Dreier ist drin");
		}
		else
		{
			System.out.println("Der Dreier ist nicht drin");
		}
		
		bmw1.setBaujahr(1981);
		
		if(hashset.contains(bmw1))
		{
			System.out.println("Der Dreier ist drin nach der Änderung");
		}
		else
		{
			System.out.println("Der Dreier ist nicht drin nach der Änderung");
		}

	}
	public static void ausgabe(Collection c)
	{
		System.out.println("Anzahl Objekte: " + c.size());	
		System.out.println(c.getClass().getSimpleName());
		for(Object o : c)
		{
			
			System.out.println(o);
		}
	}
	
	

}
