import java.awt.Color;
import java.awt.MenuBar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame {

	JPanel plMain;
	JPanel plAnlegen;
	JPanel plAnzeigen;
	JPanel plSuchen;
	
	JMenuBar menubar;
	JMenu buchMenu;
	JMenu hilfeMenu;
	
	JMenuItem buchAnlegenItem, buchAnzeigenItem, buchSuchenItem, hilfeAbout;
	
	// Formular-Elemente Buch anlegen
	JLabel lblIsbn;
	JLabel lblBuchtitel;
	JLabel lblPreis;
	JTextField tfIsbn;
	JTextField tfBuchtitel;
	JTextField tfPreis;
	JButton btnSpeichern;
	//-----------------------------
	
	public Window(){
		super("Buchverwaltung");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setSize(500, 400);
		
		plMain = new JPanel();
		plAnlegen = new JPanel();
		plAnzeigen = new JPanel();
		plSuchen = new JPanel();
		
		menubar = new JMenuBar();
		buchMenu = new JMenu("Buch");
		hilfeMenu = new JMenu("Hilfe");
		
		buchAnlegenItem = new JMenuItem("Anlegen");
		buchAnzeigenItem = new JMenuItem("Anzeigen");
		buchSuchenItem = new JMenuItem("Suchen");
		hilfeAbout = new JMenuItem("About");
		
		menubar.add(buchMenu);
		menubar.add(hilfeMenu);
		
		buchMenu.add(buchAnlegenItem);
		buchMenu.add(buchAnzeigenItem);
		buchMenu.add(buchSuchenItem);
		
		hilfeMenu.add(hilfeAbout);
		
		setJMenuBar(menubar);
		
		//TEST Untermenüs
		JMenu testMenu = new JMenu("untermenü");
		hilfeMenu.add(testMenu);
		JMenuItem subItem = new JMenuItem("SubItem");
		testMenu.add(subItem);
		//--------------------------------
		
		// Null-Layout für alle JPanel
		plMain.setLayout(null);
		plAnlegen.setLayout(null);
		plAnzeigen.setLayout(null);
		plSuchen.setLayout(null);
		
		// Größe und Position für alle JPanel
		plMain.setBounds(0, 0, this.getWidth(), this.getHeight());
		plAnlegen.setBounds(0, 0, this.getWidth(), this.getHeight());
		plAnzeigen.setBounds(0, 0, this.getWidth(), this.getHeight());
		plSuchen.setBounds(0, 0, this.getWidth(), this.getHeight());
		
		
		add(plMain);
		add(plAnlegen);
		add(plAnzeigen);
		add(plSuchen);
		
		// JPanels nicht sichtbar
		plAnlegen.setVisible(false);
		plAnzeigen.setVisible(false);
		plSuchen.setVisible(false);
		
		ButtonKlick bk = new ButtonKlick(this);
		buchAnlegenItem.addActionListener(bk);
		buchAnzeigenItem.addActionListener(bk);;
		buchSuchenItem.addActionListener(bk);
		hilfeAbout.addActionListener(bk);
		
		
		
		ButtonKlick bk1 = new ButtonKlick(this);
		// Elemente für Buch anlegen
		lblIsbn = new JLabel("ISBN");
		lblBuchtitel = new JLabel("Buchtitel");
		lblPreis = new JLabel("Preis");
		tfIsbn = new JTextField();
		tfBuchtitel = new JTextField();
		tfPreis = new JTextField();
		btnSpeichern = new JButton("speichern");
		
		lblIsbn.setBounds(20, 20, 120, 25);
		lblBuchtitel.setBounds(150, 20, 120, 25);
		lblPreis.setBounds(280, 20, 120, 25);
		tfIsbn.setBounds(20, 50, 120, 25);
		tfBuchtitel.setBounds(150, 50, 120, 25);
		tfPreis.setBounds(280, 50, 120, 25);
		btnSpeichern.setBounds(280, 80, 120, 25);
		
		plAnlegen.add(lblBuchtitel);
		plAnlegen.add(lblIsbn);
		plAnlegen.add(lblPreis);
		plAnlegen.add(tfBuchtitel);
		plAnlegen.add(tfIsbn);
		plAnlegen.add(tfPreis);
		plAnlegen.add(btnSpeichern);
		
		btnSpeichern.addActionListener(bk);
		//--------------------------
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Window();

	}

}
