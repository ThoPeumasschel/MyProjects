
public class Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int region = 2, art = 1;
		double price = 0.0;
		if ((region ==1) || (region == 2))
		{
			if (region == 1)
				price = 2.0;
			else
				price = 2.8;
			switch (art)
			{
			case 1: System.out.println("Preis: " + price); break;
			case 2: System.out.println("Preis: " + price * 7); break;
			case 3: System.out.println("Preis: " + price * 30); break;
			default: System.out.println("Falsche Fahrkartenart!");
			}
		}
		else
			System.out.println("Falsche Tarifzone!");
	}

}
