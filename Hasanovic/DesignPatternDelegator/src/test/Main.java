package test;
import delegator.*;
/*
 * 	Das Entwurfsmuster Delegator:
 * 
 * 		-> Problem:
 * 
 * 			- Man für möchte Klassen unterschiedlicher Vererbungsstruktur trotzdem gemeinsame Diente anbieten
 * 
 * 
 * 		-> Lösung:
 * 		
 * 			- Diese Dienste werden externalisiert in eine Klasse(Delegator)
 * 
 * 			-> Die Clients halten nun eine Referenz(Attribut) auf diesen Delegator
 * 
 * 			-> WENN der Delegator selbst in den Clienst Methoden benötigt, dann werden diese über eine Schnittstelle bereitgestellt(welche
 * 			   von den Clients implementiert wird)
 * 
 * 
 */



public class Main {

	public static void main(String[] args) 
	{
		Jeep j=new Jeep();
		Stanze z=new Stanze();
		
		z.getWirkungsgrad();
		j.checkMotor();
		

	}

}
