package tests;

import static org.junit.Assert.*;
import bmi.*;
import org.junit.Test;

public class BmiTest1
{

	@Test
	public void testBerechneBmi()
	{
		Bmi bmi1 = new Bmi(45.7, 1.65);
		assertTrue(bmi1.berechneBmi() == 17);
		Bmi bmi2 = new Bmi(35, 1.35);
		assertTrue(bmi2.berechneBmi() == 19);
		Bmi bmi3 = new Bmi(83.567, 1.98);
		assertTrue(bmi3.berechneBmi() == 21);
		Bmi bmi4 = new Bmi(111.4321, 1.78);
		assertTrue(bmi4.berechneBmi() == 35);
		Bmi bmi5 = new Bmi(111.4321, 1.65);
		assertTrue(bmi5.berechneBmi() == 41);

	}

	@Test
	public void testGetDiagnosis()
	{
		// BMI 41 abfragen, beide Geschlechter
		Bmi bmi1 = new Bmi(111.4321, 1.65, "w");
		assertTrue(bmi1.getDiagnosis().equals("massive adiposity"));
		Bmi bmi1a = new Bmi(111.4321, 1.65, "m");
		assertTrue(bmi1a.getDiagnosis().equals("massive adiposity"));

		// BMI 40 und 30 abfragen, beide Geschlechter
		Bmi bmi2 = new Bmi(110, 1.65, "w");
		assertTrue(bmi2.getDiagnosis().equals("adiposity"));
		Bmi bmi3 = new Bmi(95, 1.78, "w");
		assertTrue(bmi3.getDiagnosis().equals("adiposity"));
		Bmi bmi2a = new Bmi(110, 1.65, "m");
		assertTrue(bmi2a.getDiagnosis().equals("adiposity"));
		Bmi bmi3a = new Bmi(95, 1.78, "m");
		assertTrue(bmi3a.getDiagnosis().equals("adiposity"));

		// WEIBLICH BMI 18 "underweight"
		Bmi bmi4 = new Bmi(48, 1.65, "w");
		assertTrue(bmi4.getDiagnosis().equals("underweight"));

		// WEIBLICH BMI 24 "normal weight"
		Bmi bmi5 = new Bmi(78, 1.8, "w");
		assertTrue(bmi5.getDiagnosis().equals("normal weight"));

		// WEIBLICH BMI 25 "overweight"
		Bmi bmi6 = new Bmi(80, 1.8, "w");
		assertTrue(bmi6.getDiagnosis().equals("overweight"));

		// MÄNNLICH BMI 19 "underweight"
		Bmi bmi7 = new Bmi(35, 1.35, "m");
		assertTrue(bmi7.getDiagnosis().equals("underweight"));

		// MÄNNLICH BMI 25 "normal weight"
		Bmi bmi8 = new Bmi(80, 1.8, "m");
		assertTrue(bmi8.getDiagnosis().equals("normal weight"));

		// MÄNNLICH BMI 26 "overweight"
		Bmi bmi9 = new Bmi(85, 1.8, "m");
		assertTrue(bmi9.getDiagnosis().equals("overweight"));
	}

}
