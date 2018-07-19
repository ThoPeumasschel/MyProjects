package weihnachten;

public class KeksDose
{
	private static int kekse;
	private static String gierschlund;

	public static int getKekse()
	{
		return kekse;
	}

	public static void setKekse(int kekse)
	{
		KeksDose.kekse = kekse;
	}

	public static void addKekse(int gebacken)
	{
		kekse += gebacken;
	}

	public static String getGierschlund()
	{
		return gierschlund;
	}

	public static void setGierschlund(String gierschlund)
	{
		KeksDose.gierschlund = gierschlund;
	}

}
