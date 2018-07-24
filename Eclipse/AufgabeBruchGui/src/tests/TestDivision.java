package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bruchrechner.Bruch;
import bruchrechner.Model;



public class TestDivision
{
	Model m = new Model();
	@Test
	public void testDivisionVerschNenner()
	{
		// Testbrüche mit zu erwartendem Ergebnis instanziieren
		// 1. Test: Vorzeichen + und +
		Bruch b1 = new Bruch(1, 1, 2, "+");
		Bruch b2 = new Bruch(0, 1, 3, "+");
		Bruch b3 = new Bruch();
		Bruch erg1 = new Bruch(4, 1, 2, "+");
		m.gemischtInBruch(b1);
		m.gemischtInBruch(b2);
		b3 = m.auswahlOp("/", b1, b2);
		m.nachbearbeitung(b3);
		System.out.println(erg1);
		// der eigentliche Test
		assertTrue(b3.equals(erg1));

		// 2. Test: Vorzeichen + und -
		Bruch b4 = new Bruch(1, 1, 2, "+");
		Bruch b5 = new Bruch(0, 1, 3, "-");
		Bruch b6 = new Bruch();
		Bruch erg2 = new Bruch(4, 1, 2, "-");
		m.gemischtInBruch(b4);
		m.gemischtInBruch(b5);
		b6 = m.auswahlOp("/", b4, b5);
		m.nachbearbeitung(b6);
		assertTrue(b6.equals(erg2));
		// auch umgedreht
		Bruch b5a = new Bruch(1, 1, 2, "+");
		Bruch b4a = new Bruch(0, 1, 3, "-");
		Bruch b6a = new Bruch();
		Bruch erg2a = new Bruch(4, 1, 2, "-");
		m.gemischtInBruch(b4a);
		m.gemischtInBruch(b5a);
		b6a = m.auswahlOp("/", b5a, b4a);
		m.nachbearbeitung(b6a);
		assertTrue(b6a.equals(erg2a));

		// 3. Test: Vorzeichen - und +
		Bruch br1 = new Bruch(1, 1, 2, "-");
		Bruch br2 = new Bruch(0, 1, 3, "+");
		Bruch br3 = new Bruch();
		Bruch erg3 = new Bruch(4, 1, 2, "-");
		m.gemischtInBruch(br1);
		m.gemischtInBruch(br2);
		br3 = m.auswahlOp("/", br1, br2);
		m.nachbearbeitung(br3);
		assertTrue(br3.equals(erg3));
		// auch umgedreht
		Bruch br2a = new Bruch(1, 1, 2, "-");
		Bruch br1a = new Bruch(0, 1, 3, "+");
		Bruch br3a = new Bruch();
		Bruch erg3a = new Bruch(4, 1, 2, "-");
		m.gemischtInBruch(br1a);
		m.gemischtInBruch(br2a);
		br3a = m.auswahlOp("/", br2a, br1a);
		m.nachbearbeitung(br3a);
		assertTrue(br3a.equals(erg3a));

		// 4. Test: Vorzeichen - und -
		Bruch br4 = new Bruch(1, 1, 2, "-");
		Bruch br5 = new Bruch(0, 1, 3, "-");
		Bruch br6 = new Bruch();
		Bruch erg4 = new Bruch(4, 1, 2, "+");
		m.gemischtInBruch(br4);
		m.gemischtInBruch(br5);
		br6 = m.auswahlOp("/", br4, br5);
		m.nachbearbeitung(br6);
		assertTrue(br6.equals(erg4));

	}
}
