package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import bmi.Bmi_Verbessert;

public class Bmi_VerbessertTest
{

	@Test
	public void testBerechneBmi()
	{
		Bmi_Verbessert bverb = new Bmi_Verbessert();
		
		// Teste 41
		assertTrue(bverb.berechneBmi(111.4321, 1.65, "w").equals("With a bmi of 41 you have massive adiposity"));
		// Teste 40
		assertTrue(bverb.berechneBmi(110, 1.65, "w").equals("With a bmi of 40 you have adiposity"));
		
		assertTrue(bverb.berechneBmi(95, 1.78, "w").equals("With a bmi of 30 you have adiposity"));
		
		assertTrue(bverb.berechneBmi(110, 1.65, "m").equals("With a bmi of 40 you have adiposity"));
		
		assertTrue(bverb.berechneBmi(95, 1.78, "m").equals("With a bmi of 30 you have adiposity"));
		
		
		
		assertTrue(bverb.berechneBmi(48, 1.65, "w").equals("With a bmi of 18 you have underweight"));
		
		assertTrue(bverb.berechneBmi(78, 1.8, "w").equals("With a bmi of 24 you have normal weight"));
		
		assertTrue(bverb.berechneBmi(80, 1.8, "w").equals("With a bmi of 25 you have overweight"));
		
		
		assertTrue(bverb.berechneBmi(35, 1.35, "m").equals("With a bmi of 19 you have underweight"));
		
		assertTrue(bverb.berechneBmi(80, 1.8, "m").equals("With a bmi of 25 you have normal weight"));
		
		assertTrue(bverb.berechneBmi(85, 1.8, "m").equals("With a bmi of 26 you have overweight"));
		
		
	}

}
