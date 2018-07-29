package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import bruchrechner.Bruch;
import bruchrechner.Model;

public class WildesTesten
{
	Model m = new Model();
	@Test
	public void test()
	{
		Bruch b1 = new Bruch(1, 2, 13, "+");
		Bruch b2 = new Bruch(2, 1, 7, "+");
		Bruch b3 = new Bruch();
		Bruch erg1 = new Bruch(0, 90, 91, "-");
		m.gemischtInBruch(b1);
		m.gemischtInBruch(b2);
		b3 = m.subtrahieren(b1, b2);
		System.out.println(b3);
		m.nachbearbeitung(b3);
		// der eigentliche Test
		System.out.println(b3);
		assertTrue(b3.equals(erg1));
		
		Bruch b1a = new Bruch(1, 800, 25000, "+");
		Bruch b2a = new Bruch(0, 2, 3, "+");
		Bruch b3a = new Bruch();
		Bruch erg1a = new Bruch(0, 86, 125, "+");
		m.gemischtInBruch(b1a);
		m.gemischtInBruch(b2a);
		b3a = m.multiplikation(b1a, b2a);
		System.out.println(b3a);
		m.nachbearbeitung(b3a);
		// der eigentliche Test
		System.out.println(b3a);
		assertTrue(b3a.equals(erg1a));
		
		Bruch br1 = new Bruch(0, 0, 1, "+");
		Bruch br2 = new Bruch(0, 0, 1, "+");
		Bruch br3 = new Bruch();
		Bruch erga1 = new Bruch(0, 0, 1, "+"); // Hier liegt unser Programm falsch
		m.gemischtInBruch(br1);
		m.gemischtInBruch(br2);
		br3 = m.addieren(br1, br2);
		System.out.println(br3);
		m.nachbearbeitung(br3);
		// der eigentliche Test
		System.out.println(br3);
		assertTrue(br3.equals(erga1));
		
		Bruch b1b = new Bruch(1, 2, 3, "+");
		Bruch b2b = new Bruch(1, 2, 3, "+");
		Bruch b3b = new Bruch();
		Bruch erg1b = new Bruch(0, 0, 1, "+"); // Hier auch
		m.gemischtInBruch(b1b);
		m.gemischtInBruch(b2b);
		b3b = m.subtrahieren(b1b, b2b);
		System.out.println(b3b);
		m.nachbearbeitung(b3b);
		// der eigentliche Test
		System.out.println(b3b);
		assertTrue(b3b.equals(erg1b));
	}

}
