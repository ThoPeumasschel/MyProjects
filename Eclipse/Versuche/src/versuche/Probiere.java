package versuche;

import java.util.*;

public class Probiere extends Prob
{

	
	public static void main(String[] args)
	{
		
		int i = 0;
		int j = 7;
		System.out.println(7<7+1);
		for(i = 0; i < j - 1 ; i = i + 2)
		{
			System.out.println(i);
		}
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(null);
		
		list.remove(null);
		for (int x : list)
			System.out.println(x);
	}

}
