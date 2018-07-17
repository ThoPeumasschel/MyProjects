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
		assertTrue(bverb.berechneBmi(111.4321, 1.65, "w")
				.equals("With a bmi of 41 you have massive adiposity"));

		assertTrue(bverb.berechneBmi(110, 1.65, "w").equals("With a bmi of 40 you have adiposity"));
	}

}
