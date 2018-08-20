package lambdas;

import java.util.function.UnaryOperator;

public interface StringConfigurable 
{

	StringConfigurable config(UnaryOperator<String> op );
	
	
	String toString();
	
	
	
}
