package bruchrechner;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class View
{

	// alle Komponenten der Gui, Textfelder, Knöpfe und Labels für die Bruchstriche
	private JButton btnVorz1;
	private JTextField tfOperator;
	private JTextField tfGanzzahl1;
	private JTextField tfZaehler1;
	private JLabel lblStrich1;
	private JTextField tfNenner1;

	private JButton btnVorz2;
	private JTextField tfGanzzahl2;
	private JTextField tfZaehler2;
	private JLabel lblStrich2;
	private JTextField tfNenner2;
	private JButton btnErgebnis;

	private JButton btnVorz3;
	private JTextField tfGanzzahl3;
	private JTextField tfZaehler3;
	private JLabel lblStrich3;
	private JTextField tfNenner3;

	private JTextField tfDezimal;
	private JButton btnDezimal;
	private JButton btnClear;

	private ActionListener[] action;

	// hier wird der JFrame instanziiert.

	public View()
	{
		// Fenster erstellen und Eigenschaften festlegen.
		JFrame j = new JFrame("Bruchrechner by LHP");
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setLocationRelativeTo(null);
		j.setResizable(false);
		j.setLayout(null);

		// Das ContentPane von j wird addStuffToPane() übergeben, wo dann die
		// Komponenten
		// hinzugefügt werden.
		addStuffToPane(j.getContentPane());

		// Fenstergröße festlegen und auf sichtbar stellen.
		Insets i = j.getInsets();
		j.setSize(620 + i.left + i.right, 250 + i.top + i.bottom);
		j.setVisible(true);
	}

	//
	public void addStuffToPane(Container p)
	{
		p.setLayout(null);

		// Komponenten erstellen
		btnVorz1 = new JButton("+");
		tfGanzzahl1 = new JTextField("0");
		tfZaehler1 = new JTextField("0");
		lblStrich1 = new JLabel("______");
		tfNenner1 = new JTextField("0");
		tfOperator = new JTextField("+,-,*,/");
		btnVorz2 = new JButton("+");
		tfGanzzahl2 = new JTextField("0");
		tfZaehler2 = new JTextField("0");
		lblStrich2 = new JLabel("______");
		tfNenner2 = new JTextField("0");
		btnVorz3 = new JButton("+");
		tfGanzzahl3 = new JTextField("0");
		tfZaehler3 = new JTextField("0");
		lblStrich3 = new JLabel("______");
		tfNenner3 = new JTextField("0");
		tfDezimal = new JTextField("0.0");
		btnErgebnis = new JButton("=");
		btnDezimal = new JButton("Dezimalzahl");
		btnClear = new JButton("Clear");

		// Komponenten hinzufügen
		p.add(btnVorz1);
		p.add(tfGanzzahl1);
		p.add(tfZaehler1);
		p.add(lblStrich1);
		p.add(tfNenner1);
		p.add(tfOperator);
		p.add(btnVorz2);
		p.add(tfGanzzahl2);
		p.add(tfZaehler2);
		p.add(lblStrich2);
		p.add(tfNenner2);
		p.add(btnVorz3);
		p.add(tfGanzzahl3);
		p.add(tfZaehler3);
		p.add(lblStrich3);
		p.add(tfNenner3);
		p.add(tfDezimal);
		p.add(btnErgebnis);
		p.add(btnDezimal);
		p.add(btnClear);

		// hier kommt das manuelle Layout, auch als Absolut-Layout bekannt
		// dafür benötigt man die Insets
		Insets i = p.getInsets();
		// und die Dimension
		Dimension size;

		// Größe und Lage der Komponenten manuell festlegen

		// Erster Bruch, bestehend aus Vorzeichen, Ganzzahl, Zähler, und Nenner
		size = btnVorz1.getPreferredSize();
		btnVorz1.setBounds(15 + i.left, 50 + i.top, size.width, size.height + 5);
		btnVorz1.addActionListener(new ActionListener()
		{ // Hier kann per "Knopfdruck" das Vorzeichen verändert werden
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (btnVorz1.getText().equals("+"))
				{
					btnVorz1.setText("-");

				} else
				{
					btnVorz1.setText("+");
				}
			}
		});
		size = tfGanzzahl1.getPreferredSize();
		tfGanzzahl1.setBounds(65 + i.left, 50 + i.top, size.width + 33, size.height + 12);
		tfGanzzahl1.addMouseListener(new MouseAdapter()
		{ // Zeigt bei Programmstart eine 0. Durch klicken ins Feld verschwindet die 0.
			@Override
			public void mouseClicked(MouseEvent e)
			{
				tfGanzzahl1.setText("");
			}
		});
		size = tfZaehler1.getPreferredSize();
		tfZaehler1.setBounds(115 + i.left, 20 + i.top, size.width + 33, size.height + 12);
		tfZaehler1.addMouseListener(new MouseAdapter()
		{ // Zeigt bei Programmstart eine 0. Durch klicken ins Feld verschwindet die 0.
			@Override
			public void mouseClicked(MouseEvent e)
			{
				tfZaehler1.setText("");
			}
		});
		size = lblStrich1.getPreferredSize();
		lblStrich1.setBounds(115 + i.left, 45 + i.top, size.width + 40, size.height + 12);
		size = tfNenner1.getPreferredSize();
		tfNenner1.setBounds(115 + i.left, 80 + i.top, size.width + 33, size.height + 12);
		tfNenner1.addMouseListener(new MouseAdapter()
		{ // Zeigt bei Programmstart eine 0. Durch klicken ins Feld verschwindet die 0.
			@Override
			public void mouseClicked(MouseEvent e)
			{
				tfNenner1.setText("");
			}
		});

		// Das Operator-Feld zeigt zu Beginn die möglichen eingaben
		size = tfOperator.getPreferredSize();
		tfOperator.setBounds(180 + i.left, 50 + i.top, size.width + 5, size.height + 12);
		tfOperator.addMouseListener(new MouseAdapter()
		{ // Durch klicken ins Feld wird dieses leer und bereit für die Eingabe
			@Override
			public void mouseClicked(MouseEvent e)
			{
				tfOperator.setText("");
			}
		});

		// Zweiter Bruch, bestehend aus Vorzeichen, Ganzzahl, Zähler, und Nenner
		size = btnVorz2.getPreferredSize();
		btnVorz2.setBounds(230 + i.left, 50 + i.top, size.width, size.height + 5);
		btnVorz2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (btnVorz2.getText().equals("+"))
				{
					btnVorz2.setText("-");
				} else
				{
					btnVorz2.setText("+");
				}
			}
		});
		size = tfGanzzahl2.getPreferredSize();
		tfGanzzahl2.setBounds(280 + i.left, 50 + i.top, size.width + 33,
			size.height + 12);
		tfGanzzahl2.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				tfGanzzahl2.setText("");
			}
		});
		size = tfZaehler2.getPreferredSize();
		tfZaehler2.setBounds(330 + i.left, 20 + i.top, size.width + 33, size.height + 12);
		tfZaehler2.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				tfZaehler2.setText("");
			}
		});
		size = lblStrich2.getPreferredSize();
		lblStrich2.setBounds(330 + i.left, 45 + i.top, size.width + 40, size.height + 12);

		size = tfNenner2.getPreferredSize();
		tfNenner2.setBounds(330 + i.left, 80 + i.top, size.width + 33, size.height + 12);
		tfNenner2.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				tfNenner2.setText("");
			}
		});

		// Der Ergebnis Button löst die eigentliche Programmlogik aus
		size = btnErgebnis.getPreferredSize();
		btnErgebnis.setBounds(390 + i.left, 50 + i.top, size.width + 0, size.height + 5);

		// Dritter Bruch, bestehend aus Vorzeichen, Ganzzahl, Zähler, und Nenner
		size = btnVorz3.getPreferredSize();
		btnVorz3.setBounds(440 + i.left, 50 + i.top, size.width, size.height + 5);
		size = tfGanzzahl3.getPreferredSize();
		tfGanzzahl3.setBounds(490 + i.left, 50 + i.top, size.width + 33,
			size.height + 12);
		tfGanzzahl3.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				tfGanzzahl3.setText("");
			}
		});
		size = tfZaehler3.getPreferredSize();
		tfZaehler3.setBounds(540 + i.left, 20 + i.top, size.width + 33, size.height + 12);
		tfZaehler3.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				tfZaehler3.setText("");
			}
		});
		size = lblStrich3.getPreferredSize();
		lblStrich3.setBounds(540 + i.left, 45 + i.top, size.width + 40, size.height + 12);
		size = tfNenner3.getPreferredSize();
		tfNenner3.setBounds(540 + i.left, 80 + i.top, size.width + 33, size.height + 12);
		tfNenner3.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				tfNenner3.setText("");
			}
		});
		// Der Bruch kann hier in einen Dezimalbruch umgewandelt werden
		size = btnDezimal.getPreferredSize();
		btnDezimal.setBounds(25 + i.left, 150 + i.top, size.width + 10, size.height + 5);

		size = tfDezimal.getPreferredSize();
		tfDezimal.setBounds(150 + i.left, 150 + i.top, size.width + 230,
			size.height + 12);

		// Setzt die komplette Anzeige zurück
		size = btnClear.getPreferredSize();
		btnClear.setBounds(405 + i.left, 150 + i.top, size.width, size.height + 5);
		
	}
	// Ende Layout

	// Hier kommen die Listener
	public void setzeActionlistener(ActionListener[] listener)
	{
		action = listener;
		btnErgebnis.addActionListener(listener[0]);
		btnDezimal.addActionListener(listener[1]);
		btnClear.addActionListener(listener[2]);
		
	}

	// Getter und Setter
	public JButton getBtnVorz1()
	{
		return btnVorz1;
	}

	public void setBtnVorz1(JButton btnVorz1)
	{
		this.btnVorz1 = btnVorz1;
	}

	public JButton getBtnVorz2()
	{
		return btnVorz2;
	}

	public void setBtnVorz2(JButton btnVorz2)
	{
		this.btnVorz2 = btnVorz2;
	}

	public JTextField getTfGanzzahl1()
	{
		return tfGanzzahl1;
	}

	public void setTfGanzzahl1(JTextField tfGanzzahl1)
	{
		this.tfGanzzahl1 = tfGanzzahl1;
	}

	public JTextField getTfZaehler1()
	{
		return tfZaehler1;
	}

	public void setTfZaehler1(JTextField tfZaehler1)
	{
		this.tfZaehler1 = tfZaehler1;
	}

	public JTextField getTfNenner1()
	{
		return tfNenner1;
	}

	public void setTfNenner1(JTextField tfNenner1)
	{
		this.tfNenner1 = tfNenner1;
	}

	public JTextField getTfGanzzahl2()
	{
		return tfGanzzahl2;
	}

	public void setTfGanzzahl2(JTextField tfGanzzahl2)
	{
		this.tfGanzzahl2 = tfGanzzahl2;
	}

	public JTextField getTfZaehler2()
	{
		return tfZaehler2;
	}

	public void setTfZaehler2(JTextField tfZaehler2)
	{
		this.tfZaehler2 = tfZaehler2;
	}

	public JTextField getTfNenner2()
	{
		return tfNenner2;
	}

	public void setTfNenner2(JTextField tfNenner2)
	{
		this.tfNenner2 = tfNenner2;
	}

	public String getOperator()
	{
		return tfOperator.getText();
	}

	public JTextField getTfOperator()
	{
		return tfOperator;
	}

	public void setTfOperator(JTextField tfOperator)
	{
		this.tfOperator = tfOperator;
	}

	public JButton getBtnVorz3()
	{
		return btnVorz3;
	}

	public void setBtnVorz3(JButton btnVorz3)
	{
		this.btnVorz3 = btnVorz3;
	}

	public JTextField getTfGanzzahl3()
	{
		return tfGanzzahl3;
	}

	public void setTfGanzzahl3(JTextField tfGanzzahl3)
	{
		this.tfGanzzahl3 = tfGanzzahl3;
	}

	public JTextField getTfZaehler3()
	{
		return tfZaehler3;
	}

	public void setTfZaehler3(JTextField tfZaehler3)
	{
		this.tfZaehler3 = tfZaehler3;
	}

	public JTextField getTfNenner3()
	{
		return tfNenner3;
	}

	public void setTfNenner3(JTextField tfNenner3)
	{
		this.tfNenner3 = tfNenner3;
	}

	public JTextField getTfDezimal()
	{
		return tfDezimal;
	}

	public void setTfDezimal(JTextField tfDezimal)
	{
		this.tfDezimal = tfDezimal;
	}

}
