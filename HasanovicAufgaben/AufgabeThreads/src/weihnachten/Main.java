package weihnachten;

public class Main
{

	public static void main(String[] args)
	{
		Thread oma = new Thread(new Oma("Erna"));
		oma.start();
		new Thread(new Enkelkind("Hugo")).start();
		new Thread(new Enkelkind("Paul")).start();
		new Thread(new Enkelkind("Lisa")).start();
		new Thread(new Enkelkind("Maia")).start();
		
		
		
	}

}
