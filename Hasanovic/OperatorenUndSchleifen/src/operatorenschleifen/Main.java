package operatorenschleifen;

import java.time.format.TextStyle;

public class Main 
{

	public static void main(String[] args) 
	{
		//compound-operatoren
		// -> +=, -=, *=, /=
		
		int x=10;
		int y=15;
		x*=2+5;  //alles, was rechts vom = steht, wird zuerst berechnet!
		
		System.out.println(x);
		
		//------------------------------------------------------------------
		//wahrheitswerte:
		boolean wahrheit=false;
	
		if(wahrheit=true)
		{
			System.out.println("Wahrheit ist false");
		}
		else
		{
			System.out.println("Wahrheit ist true");
		}
		
		if(wahrheit==true)
		{
			System.out.println("Wahrheit ist existent");
		}
		else if(wahrheit=false)
		{
			System.out.println("Wahrheit ist non-existent");
		}
		
		//----------------------------------------------------------
		// increment/decrement
		System.out.println("Ergebnis des Methodenaufrufes: " + testeIncrement(5));
		int z=3;
		System.out.println("Zahl ist: " + z++);
		
		int wert=2;
		int wertB=3;
		if((wertB==++wert) | (wert<wertB++))
		{
			System.out.println("wert: " + ++wert + " wertB " + wertB++);
		}
		
		//-------------------------------------------------------------------
		//schleifen:
		
		//-> break und continue
		
		for(int i=0;i<8;i++)
		{
			if(i==6)
				continue;
			//code.....
		}
		
		//-> label
		
		System.out.println("------------------------------------------------------------------------");
		
		aussen:
			for(int b=0;b<5;b++)
			{
				innen:
					for(int j=1;j<10;j++)
					{
						System.out.println("Ente");
						if(j>3)
							break aussen;
						continue aussen;
					}
					System.out.println("aussen....");
			}
		System.out.println("nach dem schleifenkram...");
		
		
		
		
		

	}
	
	private static int testeIncrement(int x)
	{
		return x++; //postincrement -> variable x wird ERST benutzt, und danach erst erhöht!
	}
	
	
	

}
