package folge;

public class Main
{

	public static void main(String[] args)
	{
		Aufzaehlung auf = new Aufzaehlung(345, 80);
		auf.legLos();
		IFolge folge = auf.aufzaehlen();

		while (folge.hasNext())
			System.out.println(folge.next());

	}

}
