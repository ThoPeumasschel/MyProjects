package dualmal;

public class DezimalDual

{

	// Anfang Singleton
	private static DezimalDual instanz;

	private DezimalDual()
	{
	}

	public static DezimalDual getDezimalDual()
	{
		if (instanz == null)
		{
			instanz = new DezimalDual();
		}
		return instanz;
	}
	// Ende Singleton

	// statische Methoden zur Umrechnung
	public static String DezimalNachDual(int i)
	{
		String erg = "";
		try
		{
			erg = Integer.toBinaryString(i);
		} catch (NumberFormatException e)
		{
			System.out.println("Bitte nur Dualzahlen Eingeben! \"" + i + "\" ist keine Dualzahl.");
		}
		return erg;
	}

	public static String DezimalNachDual(String s)
	{
		String erg = "";
		try
		{
			erg = Integer.toBinaryString(Integer.parseInt(s));
		} catch (NumberFormatException e)
		{
			System.out.println("Bitte nur Zahlen Eingeben! \"" + s + "\" ist keine Zahl.");

		}
		return erg;
	}

	public static int DualNachDezimal(String s)
	{
		int i = 0;
		try
		{
			i = Integer.parseInt(s, 2);
		} catch (NumberFormatException e)
		{
			System.out.println("Bitte nur Dualzahlen Eingeben! \"" + s + "\" ist keine Dualzahl.");
		}
		return i;
	}

	public static int DualNachDezimal(int s)
	{
		int i = 0;

		try
		{
			i = Integer.parseInt(Integer.toString(s), 2);
		} catch (NumberFormatException e)
		{
			System.out.println("Bitte nur Dualzahlen Eingeben! \"" + s + "\" ist keine Dualzahl.");
		}
		return i;
	}

}
