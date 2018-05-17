import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Window extends JFrame{
	// Formular-Elemente deklarieren
	JComboBox cbAnrede;
	JTextField tfNachname;
	JTextField tfVorname;
	JTextField tfStrasse;
	JTextField tfPlz;
	JTextField tfOrt;
	JTextField tfTelefon;
	JTextField tfIban;
	JTextField tfBic;
	JTextArea taAusgabe;
	
	JLabel lblDaten;
	JLabel lblAnrede;
	JLabel lblNachname;
	JLabel lblVorname;
	JLabel lblStrasse;
	JLabel lblPlz;
	JLabel lblOrt;
	JLabel lblTelefon;
	JLabel lblBankdaten;
	JLabel lblIban;
	JLabel lblBic;
	JLabel lblAusgabe;
	
	JButton btnSpeichern;
	JButton btnAnzeigen;
	
	// weitere Formular-Elemente
	JLabel lblStammkunde;
	JCheckBox chkbStammkunde;
	
	JLabel lblKundenTyp;
	JRadioButton rbGewerbe;
	JRadioButton rbPrivat;
	ButtonGroup bg;
	
	JButton btnIbanCheck;
	
	public Window(){
		super("Kundenverwaltung");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000, 500);
		this.setLayout( null );
		
		// Formular-Elemente initialisieren
		cbAnrede = new JComboBox();
		tfNachname = new JTextField();
		tfVorname = new JTextField();
		tfStrasse = new JTextField();
		tfPlz = new JTextField();
		tfOrt = new JTextField();
		tfTelefon = new JTextField();
		tfIban = new JTextField();
		tfBic = new JTextField();
		taAusgabe = new JTextArea();
		
		lblDaten = new JLabel("Persönliche Daten");
		lblAnrede = new JLabel("Anrede");
		lblNachname = new JLabel("Nachname");
		lblVorname = new JLabel("Vorname");
		lblStrasse = new JLabel("Strasse");
		lblPlz = new JLabel("PLZ");
		lblOrt = new JLabel("Ort");
		lblTelefon = new JLabel("Telefon");
		lblBankdaten = new JLabel("Bankdaten");
		lblIban = new JLabel("IBAN");
		lblBic = new JLabel("BIC");
		lblAusgabe = new JLabel("Ausgabe");
		
		btnSpeichern = new JButton("<html><body><p style=\"color: red;\">speichern</p></body></html>");
		btnAnzeigen = new JButton("anzeigen");
		
		// weitere Formular-Elemente
		lblStammkunde = new JLabel("Stammkunde");
		chkbStammkunde = new JCheckBox("J/N");
		
		lblKundenTyp = new JLabel("Kundentyp");
		rbGewerbe = new JRadioButton("Gewerbe");
		rbPrivat = new JRadioButton("Privat");
		bg = new ButtonGroup();
		
		btnIbanCheck = new JButton("IBAN prüfen");
		
		// Formular-Elemente dem Fenster hinzufügen
		this.add(cbAnrede);
		this.add(tfNachname);
		this.add(tfVorname);
		this.add(tfStrasse);
		this.add(tfPlz);
		this.add(tfOrt);
		this.add(tfTelefon);
		this.add(tfIban);
		this.add(tfBic);
		this.add(taAusgabe);
		
		this.add(lblDaten);
		this.add(lblAnrede);
		this.add(lblNachname);
		this.add(lblVorname);
		this.add(lblStrasse);
		this.add(lblPlz);
		this.add(lblOrt);
		this.add(lblTelefon);
		this.add(lblBankdaten);
		this.add(lblIban);
		this.add(lblBic);
		this.add(lblAusgabe);
		
		this.add(btnSpeichern);
		this.add(btnAnzeigen);
		
		this.add(lblStammkunde);
		this.add(chkbStammkunde);
		this.add(lblKundenTyp);
		this.add(rbGewerbe);
		this.add(rbPrivat);
		this.add(btnIbanCheck);
		
		// Formular-Elemente positionieren und Größe festlegen
		lblDaten.setBounds(20, 20, 150, 25);
		lblAnrede.setBounds(20, 50, 120, 25);
		lblNachname.setBounds(20, 80, 120, 25);
		lblVorname.setBounds(20, 110, 120, 25);
		lblStrasse.setBounds(20, 140, 120, 25);
		lblPlz.setBounds(20, 170, 120, 25);
		lblOrt.setBounds(20, 200, 120, 25);
		lblTelefon.setBounds(20, 230, 120, 25);
		lblBankdaten.setBounds(300, 20, 150, 25);
		lblIban.setBounds(300, 50, 150, 25);
		lblBic.setBounds(300, 80, 150, 25);
		lblAusgabe.setBounds(600, 20, 150, 25);
		
		cbAnrede.setBounds(140, 50, 120, 25);
		tfNachname.setBounds(140, 80, 120, 25);
		tfVorname.setBounds(140, 110, 120, 25);
		tfStrasse.setBounds(140, 140, 120, 25);
		tfPlz.setBounds(140, 170, 120, 25);
		tfOrt.setBounds(140, 200, 120, 25);
		tfTelefon.setBounds(140, 230, 120, 25);
		tfIban.setBounds(420, 50, 150, 25);
		tfBic.setBounds(420, 80, 150, 25);
		taAusgabe.setBounds(600, 50, 300, 300);
		
		btnSpeichern.setBounds(20, 320, 100, 25);
		btnAnzeigen.setBounds(600, 370, 100, 25);
		
		lblStammkunde.setBounds(20, 260, 120, 25);
		chkbStammkunde.setBounds(140, 260, 120, 25);
		
		lblKundenTyp.setBounds(20, 290, 120, 25);
		rbGewerbe.setBounds(140, 290, 80, 25);
		rbPrivat.setBounds(220, 290, 80, 25);
		
		btnIbanCheck.setBounds(420, 110, 150, 25);
		
		// ComboBox mit Anreden befüllen
		
		cbAnrede.addItem("Herr");
		cbAnrede.addItem("Frau");
		cbAnrede.addItem("neutral");
		
		cbAnrede.setSelectedIndex(1);
		
		ButtonKlick bk = new ButtonKlick(this);
		btnSpeichern.addActionListener( bk );
		btnAnzeigen.addActionListener(bk);
		btnIbanCheck.addActionListener(bk);
		
		
		// RadioButton zu einer Gruppe zusammenfassen
		bg.add(rbGewerbe);
		bg.add(rbPrivat);

		rbGewerbe.setSelected(true);
	}
	
}
