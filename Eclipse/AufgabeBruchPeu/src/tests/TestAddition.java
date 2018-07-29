package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import bruchrechner.Bruch;
import bruchrechner.Model;


public class TestAddition
{
	Model m = new Model();
	@Test
	public void test()
	{
		Bruch b1 = new Bruch(1, 1, 2, "+");
		Bruch b2 = new Bruch(0, 1, 3, "+");
		Bruch b3 = new Bruch();
		Bruch erg1 = new Bruch(1, 5, 6, "+");
		m.gemischtInBruch(b1);
		m.gemischtInBruch(b2);
		b3 = m.addieren(b1, b2);
		System.out.println(b3);
		m.nachbearbeitung(b3);
		// der eigentliche Test
		System.out.println(b3);
		assertTrue(b3.equals(erg1));

		Bruch b1a = new Bruch(1, 1, 2, "-");
		Bruch b2a = new Bruch(0, 1, 3, "-");
		Bruch b3a = new Bruch();
		Bruch erg1a = new Bruch(1, 5, 6, "-");
		m.gemischtInBruch(b1a);
		m.gemischtInBruch(b2a);
		b3a = m.addieren(b1a, b2a);
		System.out.println(b3a);
		m.nachbearbeitung(b3a);
		// der eigentliche Test
		System.out.println(b3a);
		assertTrue(b3a.equals(erg1a));

		Bruch b1b = new Bruch(1, 1, 2, "-");
		Bruch b2b = new Bruch(0, 1, 3, "+");
		Bruch b3b = new Bruch();
		Bruch erg1b = new Bruch(1, 1, 6, "-");
		m.gemischtInBruch(b1b);
		m.gemischtInBruch(b2b);
		b3b = m.addieren(b1b, b2b);
		System.out.println(b3b);
		m.nachbearbeitung(b3b);
		// der eigentliche Test
		System.out.println(b3b);
		assertTrue(b3b.equals(erg1b));

		Bruch b1c = new Bruch(1, 1, 2, "+");
		Bruch b2c = new Bruch(0, 1, 3, "-");
		Bruch b3c = new Bruch();
		Bruch erg1c = new Bruch(1, 1, 6, "+");
		m.gemischtInBruch(b1c);
		m.gemischtInBruch(b2c);
		b3c = m.addieren(b1c, b2c);
		System.out.println(b3c);
		m.nachbearbeitung(b3c);
		// der eigentliche Test
		System.out.println(b3c);
		assertTrue(b3c.equals(erg1c));
	}

}
