package lambdas;
import java.util.function.*;



public class Tuersteher 
{
	//hier wird als 2. parameter ein lambda-ausdruck erwartet, welcher auf den übergebenen gast angewendet werden wird in der methode test des
	//des interface predicate
	public boolean eintrittOK(Gast g, Predicate<Gast> pred)
	{
		if(pred.test(g))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	
	
	
	
}
