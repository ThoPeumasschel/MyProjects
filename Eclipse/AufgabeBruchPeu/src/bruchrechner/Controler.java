package bruchrechner;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Controler
{
	private View v;
	private Model m;
	private Bruch b1;
	private Bruch b2;
	private Bruch b3;
	private ActionListener[] listener;

	public Controler()
	{
		v = new View();
		m = new Model();
		listener = new ActionListener[] {new ErgebnisListener(), new DezimalListener(), new ClearListener()};  
		vermittleListenerAnView();
	}

	// innere klasse(n) für das eventhandling
	
	private class ErgebnisListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0)
		{

			boolean pruefung = false;

			while (pruefung == false) // Schleife läuft, bis alle Eingaben korrekt sind.
			{
				v.getTfNenner1().setBackground(Color.WHITE);
				v.getTfNenner2().setBackground(Color.WHITE);
				v.getTfOperator().setBackground(Color.WHITE);
				// Test ob String-Text sich in int parsen lässt
				try
				{
					b1 = new Bruch(Integer.parseInt(v.getTfGanzzahl1().getText()),
						Integer.parseInt(v.getTfZaehler1().getText()),
						Integer.parseInt(v.getTfNenner1().getText()),
						v.getBtnVorz1().getText());
					b2 = new Bruch(Integer.parseInt(v.getTfGanzzahl2().getText()),
						Integer.parseInt(v.getTfZaehler2().getText()),
						Integer.parseInt(v.getTfNenner2().getText()),
						v.getBtnVorz2().getText());
				} catch (NumberFormatException nfe)
				{
					JOptionPane.showMessageDialog(null, "Bitte nur Zahlen eintragen",
						"FEHLER", 0);
					return;
				}

				// Test ob Nenner-Eingabe = 0
				if (b1.getNenner() == 0)
				{
					v.getTfNenner1().setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "\"0\" im Nenner ist ungültig",
						"ACHTUNG", 0);
					return;
				} else if (b2.getNenner() == 0)
				{
					v.getTfNenner2().setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "\"0\" im Nenner ist ungültig",
						"ACHTUNG", 0);
					return;
				}
				Pattern muster = Pattern.compile("[+-/*]");
				Matcher match = muster.matcher(v.getTfOperator().getText());
				if (!match.matches())
				{
					v.getTfOperator().setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "Nur +, -, *, / erlaubt",
						"Ungültiger Operator", 0);
					return;
				}

				pruefung = true;
			}
			// Aus Mischbruch gewöhnlichen Bruch machen
			m.gemischtInBruch(b1);
			m.gemischtInBruch(b2);
			// gewählte Rechenoperation ausführen

			b3 = m.auswahlOp(v.getTfOperator().getText(), b1, b2);
			// falls möglich kürzen und in Mischbruch umwandeln
			m.nachbearbeitung(b3);
			// Ergebnis wird angezeigt
			v.getBtnVorz3().setText(b3.getVorzeichen());
			v.getTfGanzzahl3().setText(String.valueOf(Math.abs(b3.getGanzzahl())));
			v.getTfZaehler3().setText(String.valueOf(Math.abs(b3.getZaehler())));
			v.getTfNenner3().setText(String.valueOf(Math.abs(b3.getNenner())));

		}
	}

	private class DezimalListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{

			Bruch b3 = new Bruch(Integer.parseInt(v.getTfGanzzahl3().getText()),
				Integer.parseInt(v.getTfZaehler3().getText()),
				Integer.parseInt(v.getTfNenner3().getText()), v.getBtnVorz3().getText());
			if (b3.getVorzeichen().equals("-"))
				v.getTfDezimal().setText("-" + String.valueOf(m.umrechnungDezimal(b3)));
			else
				v.getTfDezimal().setText(String.valueOf(m.umrechnungDezimal(b3)));
		}
	}

	private class ClearListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			v.getTfGanzzahl1().setText("0");
			v.getTfZaehler1().setText("0");
			v.getTfNenner1().setText("0");
			v.getTfGanzzahl2().setText("0");
			v.getTfZaehler2().setText("0");
			v.getTfNenner2().setText("0");
			v.getTfGanzzahl3().setText("0");
			v.getTfZaehler3().setText("0");
			v.getTfNenner3().setText("0");
			v.getTfDezimal().setText("0.0");
			v.getTfOperator().setText("+,-,*,/");
			v.getBtnVorz1().setText("+");
			v.getBtnVorz2().setText("+");
			v.getBtnVorz3().setText("+");

		}

	}

	private void vermittleListenerAnView()
	{
		v.setzeActionlistener(listener);
	}

}
