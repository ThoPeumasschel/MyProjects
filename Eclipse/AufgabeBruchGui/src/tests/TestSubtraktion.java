package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bruchrechner.Bruch;
import bruchrechner.Model;

public class TestSubtraktion
{
	Model m = new Model(); 

	@Test
	public void test()
	{
		Bruch b1 = new Bruch(1, 1, 2, "+");
		Bruch b2 = new Bruch(0, 1, 3, "+");
		Bruch b3 = new Bruch();
		Bruch erg1 = new Bruch(1, 1, 6, "+");
		m.gemischtInBruch(b1);
		m.gemischtInBruch(b2);
		b3 = m.subtrahieren(b1, b2);
		System.out.println(b3);
		m.nachbearbeitung(b3);
		// der eigentliche Test
		System.out.println(b3);
		assertTrue(b3.equals(erg1));
		// und umgedreht
		Bruch br1 = new Bruch(1, 1, 2, "+");
		Bruch br2 = new Bruch(0, 1, 3, "+");
		Bruch br3 = new Bruch();
		Bruch erga1 = new Bruch(1, 1, 6, "-");
		m.gemischtInBruch(br1);
		m.gemischtInBruch(br2);
		br3 = m.subtrahieren(br2, br1);
		System.out.println(br3);
		m.nachbearbeitung(br3);
		// der eigentliche Test
		System.out.println(br3);
		assertTrue(br3.equals(erga1));

		Bruch b1a = new Bruch(1, 1, 2, "-");
		Bruch b2a = new Bruch(0, 1, 3, "-");
		Bruch b3a = new Bruch();
		Bruch erg1a = new Bruch(1, 1, 6, "-");
		m.gemischtInBruch(b1a);
		m.gemischtInBruch(b2a);
		b3a = m.subtrahieren(b1a, b2a);
		System.out.println(b3a);
		m.nachbearbeitung(b3a);
		// der eigentliche Test
		System.out.println(b3a);
		assertTrue(b3a.equals(erg1a));
		// und umgedreht
		Bruch br1a = new Bruch(1, 1, 2, "-");
		Bruch br2a = new Bruch(0, 1, 3, "-");
		Bruch br3a = new Bruch();
		Bruch erga1a = new Bruch(1, 1, 6, "+");
		m.gemischtInBruch(br1a);
		m.gemischtInBruch(br2a);
		br3a = m.subtrahieren(br2a, br1a);
		System.out.println(br3a);
		m.nachbearbeitung(br3a);
		// der eigentliche Test
		System.out.println(br3a);
		assertTrue(br3a.equals(erga1a));

		Bruch b1b = new Bruch(1, 1, 2, "-");
		Bruch b2b = new Bruch(0, 1, 3, "+");
		Bruch b3b = new Bruch();
		Bruch erg1b = new Bruch(1, 5, 6, "-");
		m.gemischtInBruch(b1b);
		m.gemischtInBruch(b2b);
		b3b = m.subtrahieren(b1b, b2b);
		System.out.println(b3b);
		m.nachbearbeitung(b3b);
		// der eigentliche Test
		System.out.println(b3b);
		assertTrue(b3b.equals(erg1b));
		// und umgedreht
		Bruch br1b = new Bruch(1, 1, 2, "-");
		Bruch br2b = new Bruch(0, 1, 3, "+");
		Bruch br3b = new Bruch();
		Bruch erga1b = new Bruch(1, 5, 6, "+");
		m.gemischtInBruch(br1b);
		m.gemischtInBruch(br2b);
		br3b = m.subtrahieren(br2b, br1b);
		System.out.println(br3b);
		m.nachbearbeitung(br3b);
		// der eigentliche Test
		System.out.println(br3b);
		assertTrue(br3b.equals(erga1b));

		Bruch b1c = new Bruch(1, 1, 2, "+");
		Bruch b2c = new Bruch(0, 1, 3, "-");
		Bruch b3c = new Bruch();
		Bruch erg1c = new Bruch(1, 5, 6, "+");
		m.gemischtInBruch(b1c);
		m.gemischtInBruch(b2c);
		b3c = m.subtrahieren(b1c, b2c);
		System.out.println(b3c);
		m.nachbearbeitung(b3c);
		// der eigentliche Test
		System.out.println(b3c);
		assertTrue(b3c.equals(erg1c));
		// und umgedreht
		Bruch br1c = new Bruch(1, 1, 2, "+");
		Bruch br2c = new Bruch(0, 1, 3, "-");
		Bruch br3c = new Bruch();
		Bruch erga1c = new Bruch(1, 5, 6, "-");
		m.gemischtInBruch(br1c);
		m.gemischtInBruch(br2c);
		br3c = m.subtrahieren(br2c, br1c);
		System.out.println(br3c);
		m.nachbearbeitung(br3c);
		// der eigentliche Test
		System.out.println(br3c);
		assertTrue(br3c.equals(erga1c));
	}

}
