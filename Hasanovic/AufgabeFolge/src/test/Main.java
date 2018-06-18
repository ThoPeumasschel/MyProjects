package test;

import folge.Aufzaehlung;
import folge.Zahl;

public class Main
{

	public static void main(String[] args)
	{
		Aufzaehlung auf = new Aufzaehlung(100);
		Zahl z = auf.erzeugeZahl();
		System.out.println("Zahl: " + z.getGeheimeZahl());
	}

}
