package bruchrechner;

import javax.swing.JOptionPane;

public class Model
{

	// Test ob Eingabe = 0 + Umwandlung von mischBruch in Bruch
	public void gemischtInBruch(Bruch br)
	{
		// Test ob Eingabe = 0
		if (br.getNenner() == 0) // genau hier den RegEx Test einbauen???

			// Methode: Umwandlung von Ganzzahl in Bruch
			try
			{
				if (Math.abs(br.getGanzzahl()) != 0)
				{
					br.setZaehler(Math.abs(br.getGanzzahl()) * Math.abs(br.getNenner())
						+ Math.abs(br.getZaehler()));
					br.setGanzzahl(0);
				}
			} catch (Exception e)
			{
				JOptionPane.showMessageDialog(null,
					"Du hast Mist eingegeben, du Flachpfeife!", "Moment mal...", 0);
				System.out.println("Comming from Vorher");
			}

	}

	public Bruch auswahlOp(String op, Bruch b1, Bruch b2) 
	{
		Bruch b3;
		
		
		switch(op) {
		
		case "+":			
			b3 = addieren(b1, b2);
			return b3;
			
		case "-":
			b3 = subtrahieren(b1, b2);
					return b3;
		case "*":
			b3 = multiplikation(b1, b2);
					return b3;
		case "/":
			b3 = division(b1, b2);
			return b3;
		}
		return null;
	}
	
	// MULTIPLIKATION
	public Bruch multiplikation(Bruch br1, Bruch br2)
	{
		Bruch erg = new Bruch();
		erg = new Bruch();
		erg.setZaehler(br1.getZaehler() * br2.getZaehler());
		erg.setNenner(br1.getNenner() * br2.getNenner());
		// Vorzeichenbehandlung
		if ((br1.getVorzeichen().equals("+") && br2.getVorzeichen().equals("-"))
			|| (br1.getVorzeichen().equals("-") && br2.getVorzeichen().equals("+")))
		{
			erg.setVorzeichen("-");
		} else if (br1.getVorzeichen().equals("-") && br2.getVorzeichen().equals("-"))
		{
			erg.setVorzeichen("+");
		} else
		{
			erg.setVorzeichen("+");
		}
		return erg;
	}

	// DIVISION
	public Bruch division(Bruch br1, Bruch br2)
	{
		Bruch erg = new Bruch();
		erg.setZaehler(br1.getZaehler() * br2.getNenner());
		erg.setNenner(br1.getNenner() * br2.getZaehler());
		// Vorzeichenbehandlung
		if ((br1.getVorzeichen().equals("+") && br2.getVorzeichen().equals("-"))
			|| (br1.getVorzeichen().equals("-") && br2.getVorzeichen().equals("+")))
		{
			erg.setVorzeichen("-");
		} else if (br1.getVorzeichen().equals("-") && br2.getVorzeichen().equals("-"))
		{
			erg.setVorzeichen("+");
		} else
		{
			erg.setVorzeichen("+");
		}
		return erg;
	}

	// ADDITION
	public Bruch addieren(Bruch b1, Bruch b2)
	{
		Bruch erg = new Bruch();
		// Die folgenden Zeilen funktionieren, liefern aber NICHT immer den Kleinsten
		// gemeinsamen Nenner!
		b1.setZaehler((Math.abs(b1.getZaehler()) * (Math.abs(b2.getNenner()))));
		b2.setZaehler((Math.abs(b2.getZaehler()) * (Math.abs(b1.getNenner()))));
		erg.setNenner((b1.getNenner() * b2.getNenner()));

		int zahl1 = b1.getZaehler();
		int zahl2 = b2.getZaehler();

		if (b1.getVorzeichen().equals("-"))
			zahl1 = zahl1 - zahl1 * 2;

		if (b2.getVorzeichen().equals("-"))
			zahl2 = zahl2 - zahl2 * 2;

		erg.setZaehler(zahl1 + zahl2);
		if (erg.getZaehler() < 0)
		{
			erg.setVorzeichen("-");
			erg.setZaehler(Math.abs(erg.getZaehler()));
		}
		return erg;
	}

	// SUBTRAKTION
	public Bruch subtrahieren(Bruch b1, Bruch b2)
	{
		Bruch erg = new Bruch();
		b1.setZaehler(Math.abs(b1.getZaehler() * Math.abs(b2.getNenner())));
		b2.setZaehler(Math.abs(b2.getZaehler() * Math.abs(b1.getNenner())));
		erg.setNenner((b1.getNenner() * b2.getNenner()));

		int zahl1 = b1.getZaehler();
		int zahl2 = b2.getZaehler();

		if (b1.getVorzeichen().equals("-"))
			zahl1 = zahl1 - zahl1 * 2;

		if (b2.getVorzeichen().equals("-"))
			zahl2 = zahl2 - zahl2 * 2;

		erg.setZaehler(zahl1 - zahl2);
		if (erg.getZaehler() < 0)
		{
			erg.setVorzeichen("-");
			erg.setZaehler(Math.abs(erg.getZaehler()));
		}

		return erg;
	}

	public double umrechnungDezimal(Bruch br)
	{
		double erg = 0.0;

		gemischtInBruch(br);

		erg = (double) br.getZaehler() / (double) br.getNenner();

		return erg;
	}

	// Methode: Unwandlung von Bruch in Ganzzahl + kürzen + 0 im Zähler
	public void nachbearbeitung(Bruch br)
	{

		// Umwandlung Bruch in mischBruch
		if (Math.abs(br.getZaehler()) > br.getNenner())
		{
			int tempGanzzahl = 0;
			int tempZaehler = 0;
			int z;
			try
			{
				z = (br.getZaehler() / br.getNenner());

				tempGanzzahl += z;
				br.setGanzzahl(tempGanzzahl);
				tempZaehler = (br.getZaehler() % br.getNenner());
				br.setZaehler(tempZaehler);
			} catch (Exception e)
			{
				br.setGanzzahl(0);
				br.setZaehler(0);
				br.setNenner(0);
				// e.printStackTrace();
			}
		}
		// kürzen
		int limit = Math.min(br.getZaehler(), br.getNenner());
		for (int i = 2; i <= limit; i++)
		{
			if (br.getZaehler() % i == 0 && br.getNenner() % i == 0)
			{
				br.setZaehler(br.getZaehler() / i);
				br.setNenner(br.getNenner() / i);
			}
		}
		// 0 im Zähler
		if (br.getZaehler() == 0)
		{
			br.setZaehler(br.getGanzzahl() * br.getNenner() + br.getZaehler());
			br.setGanzzahl(0);
		}

		// Darstellung bei minus im Zähler und / oder Nenner
		if (br.getZaehler() < 0 && br.getGanzzahl() != 0)
		{
			br.setGanzzahl(br.getGanzzahl() - (2 * br.getGanzzahl()));
			br.setZaehler(br.getZaehler() - (2 * br.getZaehler()));
			br.setNenner(br.getNenner());

		} else if (br.getNenner() < 0 && br.getGanzzahl() != 0)
		{
			br.setGanzzahl(br.getGanzzahl() - (2 * br.getGanzzahl()));
			br.setNenner(br.getNenner() - (2 * br.getNenner()));
			br.setZaehler(br.getZaehler());
		} else
			br.setGanzzahl(br.getGanzzahl());
		br.setZaehler(br.getZaehler());
		br.setNenner(br.getNenner());

	}

}
