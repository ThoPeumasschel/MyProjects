package zeichenketten;
/*
 * 	String und andere Zeichenkettenklassen
 * 
 * 		-> String ist Unicode-Konform
 * 
 * 		-> Die VM verwaltet alle per Literal erzeugten Strings in einem Konstantenpool! 
 * 				-> Dort wird jede Zeichenkette EINMALIG per Objekt verwaltet....
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Main {

	public static void main(String[] args) 
	{
		char[] wort= {'W', 'o', 'r', 't'};
		
		char a='a';
		int x=a;
		int y=101;
		char yZeichen=(char)y;
		
		
		System.out.println(x);
		
		
		String ausArray=new String(wort); //aus char-array ein string machen
		
		String automarke="Lada"; //erzeugung eines string-objekt direkt per literal
		String automarke2=new String("Audi");
		String automarkeLada=new String("Lada");
		
		String automarkeNeu="Lada";
		
		
		//Referenzvergleich(vergleicht, ob es sich auf dem Heap um das selbe Objekt mit der selben Speicheradresse handelt)
		if(automarke==automarkeLada)
		{
			System.out.println("automarke und automarkeLada selbe Objekte");
		}
		else
		{
			System.out.println("automarke und automarkeLada verschiedene Objekte");
		}
		
		
		if(automarke==automarkeNeu)
		{
			System.out.println("automarke und automarkeNeu selbe Objekte");
		}
		else
		{
			System.out.println("automarke und automarkeNeu verschieden Objekte");
		}
		
		
		System.out.println("Speicher-Hash von automarke: " + automarke.hashCode());
		System.out.println("Speicher-Hash von automarkeNeu: " + automarkeNeu.hashCode());
		System.out.println("Speicher-Hash von automarkeLada: " + automarkeLada.hashCode());
		//-> hinter automarke und automarkeNeu steckt offensichtlich DAS SELBE Objekt!
		Object o=new Object();
		
		System.out.println(new String("String"));
		
		
		//zwei strings INHALTLICH vergleichen:
		if(automarke2.equals(automarkeLada))
		{
			
		}
		
		
		String testA=new String("testA");
		String testB=testA;
		
		if(testA==testB)
		{
			System.out.println("testA und testB gleiche Adressen");
		}
		else
		{
			System.out.println("testA und testB ungleiche Adressen");
		}
		
		
		testA=testA + "x"; //-> da String IMMUTABLE ist, wird hier dem testA implizit ein anderes, neues String-Objekt zugewiesen!!!
		
		
		System.out.println("-------------------------------------------");
		
		if(testA==testB)
		{
			System.out.println("testA und testB gleiche Adressen");
		}
		else
		{
			System.out.println("testA und testB ungleiche Adressen");
		}
		
		
		String leer="";
		int a1=2;int b1=3; int c1=4;int d1=5;
		System.out.println(a1 + b1 + leer + (d1 + c1));
		
		
		
		
		
		
		
		//-------------------------------------------------------------
		// Alternative Zeichenkettenklassen -> besser geeignet als String für massive Zeichenkettenmanipulationen:
		StringBuilder builder=new StringBuilder();
		StringBuffer buff=new StringBuffer();
		
		//--> diese beiden Klassen sind nicht immutable!
		
		
		
		
		
		
		
		

	}
	
	/*@Override
	public String toString()
	{
		return "HashCode des Objekts: " + this.hashCode();
	}*/
	
	

}
