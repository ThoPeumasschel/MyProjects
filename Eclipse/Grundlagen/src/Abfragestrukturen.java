
public class Abfragestrukturen {

	public static void main(String[] args) {
		// einfache Verzweigung
		double price = 1000;
		if (price > 500)
			price = price * (1 - 0.03);
		System.out.println(price);
		System.out.println();
		// Verzweigung mit else - Zweig
		price = 1000;
		if (price > 1000)
			price = price * (1 - 0.03);
		else
			price = price * (1 - 0.05);
		System.out.println(price);
		System.out.println();
		
		price = 10000;
		if (price < 1000)
			price = price * (1 - 0.03);
		else if (price < 5000)
			price = price * (1 - 0.05);
		else
			price = price * (1 - 0.08);
		System.out.println((int)price);
		System.out.println();
		
		int grade = 2;		// Note
		String text = "";
		switch (grade)
		{
		case 1:
			text = "sehr gut"; break;
		case 2:
			text = "gut"; break;
		case 3:
			text = "befriedigend"; break;
		case 4:
			text = "ausreichend"; break;
		case 5:
			text = "mangelhaft"; break;
		case 6:
			text = "ungenügend"; break;
		default:
			text = "nur 1 - 6 definiert";
		}
		System.out.println("Die Note " + grade + " entspricht dem Text: " + text);
	}

}
