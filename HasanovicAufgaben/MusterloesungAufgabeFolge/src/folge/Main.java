package folge;

public class Main {

	public static void main(String[] args) {
		
		
		
		Aufzaehlung auf=new Aufzaehlung(20, 50);
		auf.initElemente();
		
		IReihenfolge iter=auf.iterator();
		while(iter.elementVorhanden())
		{
			System.out.println(iter.nextElement());
		}
		
		
		

	}

}
