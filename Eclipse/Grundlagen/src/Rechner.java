
public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arg1 = 7, arg2 = 2;
		float erg = 0;
		boolean fehler = false;
		char oper = '/';
		if (oper == '+')
			erg = arg1 + arg2;
		else if (oper == '-')
			erg = arg1 - arg2;
		else if (oper == '*')
			erg = arg1 * arg2;
		else if (oper == '/')
			erg = (float)arg1 / arg2;
		else {
			//erg = -1;
			fehler = true;
			System.out.println("Operator nicht definiert");
		}
		if (fehler == false)
		{
			System.out.println("Ergebnis: " + erg);
			fehler = false;
		}
				
		switch (oper)
		{
		case '+': erg = arg1 + arg2; break;
		case '-': erg = arg1 - arg2; break;
		case '*': erg = arg1 * arg2; break;
		case '/': erg = (float)arg1 / arg2; break;
		default: 
		{
			//erg = -1;
			fehler = true;
			System.out.println("Operator nicht definiert");
		}
		}
		if (fehler == false)
		{
			System.out.println("Ergebnis: " + erg);
			fehler = false;
		}
	}

}
