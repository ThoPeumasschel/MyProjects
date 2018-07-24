package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.*;
import softwareTests.*;
public class KontoTest 
{

	private Konto konto;
	
	//wird vor jeder testmethode neu ausgeführt -> hier kann man also testrahmenbedingungen aufbauen
	@Before
	public void setUp()
	{
		konto=new Konto();
	}
	
	
	@Test
	public void testEinzahlungSpezifiziert() 
	{
		konto.einzahlung(2);
		assertTrue(konto.getSaldo()==2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testEinzahlungNichtSpezifiziert()
	{
		konto.einzahlung(-1);
		
	}
	

}
