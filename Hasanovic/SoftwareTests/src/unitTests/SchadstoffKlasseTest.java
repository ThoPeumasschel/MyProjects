package unitTests;
import softwareTests.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SchadstoffKlasseTest 
{

	@Test
	public void testSchadstoffKlasseGruen() 
	{
		Auto a=new Auto(75);
		assertTrue(a.getSchadstoffKlasse().equals("Grün"));

	}
	
	@Test
	public void testSchadstoffKlasseOrange()
	{
		Auto a=new Auto(76);
		assertTrue(a.getSchadstoffKlasse().equals("Orange"));
		
		
	}
	
	
	
	

}
