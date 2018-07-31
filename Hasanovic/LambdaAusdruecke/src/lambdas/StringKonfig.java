package lambdas;

import java.util.function.UnaryOperator;
import java.util.*;
//angelehnt an das design pattern Builder
public class StringKonfig implements StringConfigurable
{
	
	
	private ArrayList<UnaryOperator<String>> operatoren=new ArrayList<>();
	private String init;
	

	@Override
	public StringConfigurable config(UnaryOperator<String> op) {
		operatoren.add(op);
		return this;
	}

	
	public static StringKonfig of(String s)
	{
		StringKonfig konf=new StringKonfig();
		konf.init=s;
		return konf;
	}
	
	@Override
	public String toString()
	{
		String ergebnis=init;
		for(UnaryOperator<String> op : operatoren)
		{
			ergebnis=op.apply(ergebnis);
		}
		return ergebnis;
	}
	
	
	
}
