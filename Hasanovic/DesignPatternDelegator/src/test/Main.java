package test;

import delegator.*;
/*
 * 	Das Entwurfsmuster Delegator:
 * 
 * 		-> Problem:
 * 
 * 			- Man m�chte f�r Klassen unterschiedlicher Vererbungsstrukturen trotzdem gemeinsame Diente anbieten
 * 
 * 
 * 		-> L�sung:
 * 		
 * 			- Diese Dienste werden externalisiert in eine Klasse(Delegator)
 * 
 * 			-> Die Clients halten nun eine Referenz(Attribut) auf diesen Delegator
 * 
 * 			-> WENN der Delegator selbst in den Clients Methoden ben�tigt, dann werden diese �ber eine Schnittstelle bereitgestellt(welche
 * 			   von den Clients implementiert wird)
 * 
 * 
 */

public class Main
{

	public static void main(String[] args)
	{
		Jeep j = new Jeep();
		Stanze z = new Stanze();

		z.getWirkungsgrad();
		j.checkMotor();
		
		Delegator d = new Delegator();
		d.

	}

}
