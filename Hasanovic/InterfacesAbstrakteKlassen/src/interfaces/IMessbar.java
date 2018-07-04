package interfaces;

import java.io.Serializable;

/*
 * 	Regeln f�r Interfaces in Java:
 * 
 * 	
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public interface IMessbar extends IBerechenbar, Serializable
{
	int wert=5; //implizit sind alle attribute von interfaces public, static und final
	
	
	
	public abstract void macheA();
	
	void macheNochEtwas();  //implizit sind alle methoden public und abstract
	
	//inneres interface
	interface IMessbarTemperatur
	{
		void temperaturMessung();
	}
	
	//interfaces k�nnen innere klassen haben(implizit public)
	class InnereKlasse
	{
		
	}
	
	
	
	
	
	
	
}
