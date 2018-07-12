package test;

import charakter.GameInit;
import charakter.Stadt;

public class Main
{

	public static void main(String[] args)
	{
		charakter.Stadt s = new Stadt(12);
		s.initPlanquadrate();

		GameInit.initStadt(s);
		s.getAnzCharaktere();

	}

}
