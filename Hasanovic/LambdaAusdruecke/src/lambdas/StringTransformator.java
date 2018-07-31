package lambdas;
import java.util.function.*;

public class StringTransformator 
{

	public static String transform(String s, UnaryOperator<String> trans)
	{
		return trans.apply(s);
	}
	
	
	public static <T> UnaryOperator<T> komposition(UnaryOperator<T>...operators)
	{
		return k -> 
		{
			T ergebnis=k;
			for(UnaryOperator<T> op : operators)
			{
				ergebnis=op.apply(ergebnis);
			}
			
			return ergebnis;
		};
	}
	
	
	
	
	
}
