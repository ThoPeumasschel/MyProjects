import  java.util.Scanner;

public class GreatestCommonDivisor 
	{

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
	 Scanner input = new Scanner(System.in);
	 System.out.println("Bitte eintragen nummer 1 ");
	 int num = input.nextInt();
     System.out.println("Nummer eins ist : " + num);
     System.out.println();
     
     System.out.println("Bitte eintragen nummer 2 ");
     int num2 = input.nextInt();
     System.out.println("Nummer zwei ist : " + num2);
     System.out.println();
     
     System.out.println("Der kleinste Wert der Differenz " + num + " und "  + num2 + " ist: " );
     System.out.println();
    ////////////////////////////////////////////////////////////////////////////////////////////
	if (num > num2)
    	 System.out.println(num + " - "  + num2 );	
     else
    	 System.out.println(num2 + " - "  + num );
     System.out.println();
    ////////////////////////////////////////////////////////////////////////////////////////////
     while (num != num2) //wenn num & num2 ungleich sind
     {
    	 if (num > num2) // wenn Minuend  Großer als Subtrahend
    		 {
    		 num -= num2;    // aufgehts mit Subtrahieren bis letzte moglischkeit welche != 0
    		 System.out.println(" dann ");
    		 System.out.println( + num2 + " - " + num );
    		 }
    	 else //Rekursion 
    	 {
    	 num2 -= num;
    	 System.out.println(" dann ");
    	 System.out.println(+ num2 + " - " + num );
    	 }
	}
     System.out.println();
     System.out.println(num); // das letzte Wert der Differenz welche != 0    
	}
}
