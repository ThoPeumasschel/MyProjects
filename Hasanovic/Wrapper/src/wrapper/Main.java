package wrapper;
import java.util.*;
/* 
 * 	WRAPPERKLASSEN
 * 
 * 		-> Klassen, welche primitive Werte in sich Kapseln und Operationen darauf anbieten
 * 
 * 			-> In Java:
 * 
 * 				int -> Integer
 * 				boolean -> Boolean
 * 				char -> Charakter
 * 				double -> Double
 * 
 * 				//...
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

	public static void main(String[] args) 
	{
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(3);
		ArrayList<Boolean> liboo=new ArrayList<Boolean>();
		liboo.add(true);
		
		//Hier wird zum Beispiel das true implizit in einem neuen Boolean-Objekt gekapselt, desser Referenz im Array auf Slot 0 gespeichert wird
		//-> AUTOBOXING -> Das "Verpacken" von primitiven Werten in Objekte
		Object[] oArr=new Object[20];
		oArr[0]=true;
		oArr[1]=5;
		
		//Wrapperklassen bieten Utitlity-Methoden an:
		
		//1. Gruppe: xxxValue-Methoden
		//-> Liefern den im Wrapper verpackten primitiven Typ wider als primitven Wert zurück
		int prim=1;
		Integer i2=new Integer(prim);
		int p2=i2.intValue();
		
		//2. Gruppe: parse-Methoden -> sind alle static
		//-> Konvertieren Zeichenketten in ihren entsprechenden Typ
		String userEingabe="18";
		int alter=Integer.parseInt(userEingabe);
		
		//3. Gruppe: valueOf-Methoden
		//-> Liefern das Objekt zum primitven Wert
		int wert=15;
		String zahl="1500";
		oArr[2]=Integer.valueOf(zahl);
		
		
		Integer testIncrement=new Integer(20);
		Integer testIncrement2=new Integer(20);
		
		//vergleich von in wrappern gekapselten werten:
		if(testIncrement.equals(testIncrement2))
		{
			
		}
		
		testIncrement=inkrementiere(testIncrement);
		
		//hier wird für das Inkrementieren der primitive Wert ausgepackt, hochgezählt und danach EINEM NEUEN Integer-Objekt zugewiesen!!!
		//			-> WRAPPERKLASSEN SIND IMMUTABLE
		testIncrement++;
		
		ArrayList<Number> nummernListe=new ArrayList<Number>();
		
		
		long lo=123;
		short s=12;
		int x=30;
		
		WrapperTester wt=new WrapperTester();
		wt.acceptInt(lo);
		wt.acceptInt(s); //-> WIDENING GEHT VOR AUTOBOXING !!!
		
		//-> AUTOBOXING GEHT VOR SHORTENING!!!
	}
	
	
	private static Integer inkrementiere(int b)
	{
		return ++b;
	}
	
	
	public static Integer addiere(Number a, Number b)
	{
		Integer wertA=null;
		Integer wertB=null;
		if(a instanceof Integer)
		{
			wertA=(Integer)a;
		}
		if(b instanceof Integer)
		{
			wertB=(Integer)b;
		}
		
		return wertA+wertB;
	}
	
	
	
	
	
	
	

}
