package javaapplication6;

import java.awt.Color;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Fenster extends JFrame{
	
	JPanel pl;
	
	JLabel lblAnrede;
	JLabel lblName;
	JTextField tfName;
	JComboBox cbAnrede;
	JRadioButton rb1;
	JRadioButton rb2;
	JRadioButton rb3;
	JButton btnSpeichern;
	
	JCheckBox cbxBankdaten;
	JLabel lblIban;
	JLabel lblBic;
	JTextField tfIban;
	JTextField tfBic;
	JPanel plBankdaten;
	
	public Fenster(){
		setSize(1000, 600);
		setTitle("Kundenverwaltung");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pl = new JPanel();
		setContentPane(pl);
		Color c = new Color(255, 255, 255);
		pl.setBackground(c);
		pl.setLayout(null);
		
		// Formular Elemente initialisieren
		lblAnrede = new JLabel("Anrede");
		lblName = new JLabel("Name");
		tfName = new JTextField();
		cbAnrede = new JComboBox();
		rb1 = new JRadioButton("Berufstätig");
		rb2 = new JRadioButton("Selbstständig");
		rb3 = new JRadioButton("Arbeitslos");
		btnSpeichern = new JButton("speichern");
		
		cbxBankdaten = new JCheckBox("Bankdaten eingeben");
		lblIban = new JLabel("IBAN");
		lblBic = new JLabel("BIC");
		tfIban = new JTextField();
		tfBic = new JTextField();
		plBankdaten = new JPanel();
		
		// Combobox befüllen
		cbAnrede.addItem("Herr");
		cbAnrede.addItem("Frau");
		cbAnrede.addItem("divers");
		
		// Formular Elemente positionieren
		lblAnrede.setBounds(20, 20, 100, 25);
		lblName.setBounds(20, 50, 100, 25);
		cbAnrede.setBounds(130, 20, 100, 25);
		tfName.setBounds(130, 50, 100, 25);
		rb1.setBounds(130, 80, 100, 25);
		rb2.setBounds(130, 110, 100, 25);
		rb3.setBounds(130, 140, 100, 25);
		btnSpeichern.setBounds(130, 170, 100, 25);
		
		cbxBankdaten.setBounds(250, 20, 150, 25);
		lblIban.setBounds(0, 0, 100, 25);
		lblBic.setBounds(0, 30, 100, 25);
		tfIban.setBounds(110, 0, 100, 25);
		tfBic.setBounds(110, 30, 100, 25);
		plBankdaten.setBounds(250, 50, 210, 60);
		
		// dem Formular hinzufügen
		pl.add(lblAnrede);
		pl.add(lblName);
		pl.add(tfName);
		pl.add(cbAnrede);
		pl.add(rb1);
		pl.add(rb2);
		pl.add(rb3);
		pl.add(btnSpeichern);
		pl.add(cbxBankdaten);
		pl.add(plBankdaten);
		
		plBankdaten.setLayout(null);
		plBankdaten.add(lblIban);
		plBankdaten.add(lblBic);
		plBankdaten.add(tfIban);
		plBankdaten.add(tfBic);
		
		plBankdaten.setBackground(c);
		cbxBankdaten.setBackground(c);
		rb1.setBackground(c);
		rb2.setBackground(c);
		rb3.setBackground(c);
		
		// alle RadioButton gruppieren
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		rb1.setSelected(true);
		
		plBankdaten.setVisible(false);
		
		Listener l = new Listener(this);
		cbxBankdaten.addActionListener(l);
		btnSpeichern.addActionListener(l);
		
		// Bild auf Panel
		try{
			BufferedImage image = ImageIO.read( new File("monkey.png") );
			ImageIcon ic = new ImageIcon(image);
			JLabel lbl = new JLabel(ic);
			lbl.setBounds(0, 0, 1000, 600);
			pl.add(lbl);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		new Fenster().setVisible(true);;

	}

}
