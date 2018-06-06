package javaapplication6;

import java.awt.*;
import javax.swing.*;

public class Fenster extends JFrame {

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

    public Fenster() {
        this.setSize(1000, 600); //this. ist nicht notwendig!!!
        setTitle("Kundenverwaltung");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pl = new JPanel();
        setContentPane(pl);
        Color c = new Color(200, 200, 200); // ausprobieren!!!
        pl.setBackground(c);

        lblAnrede = new JLabel("Anrede");
        lblName = new JLabel("Name");
        tfName = new JTextField();
        cbAnrede = new JComboBox();
        rb1 = new JRadioButton("Berufstätig");
        rb2 = new JRadioButton("Selbständig");
        rb3 = new JRadioButton("Arbeitslos");
        btnSpeichern = new JButton("Speichern");

        cbxBankdaten = new JCheckBox("Bankdaten eingeben");
        lblIban = new JLabel("IBAN");
        lblBic = new JLabel("Bic");
        tfIban = new JTextField();
        tfBic = new JTextField();
        plBankdaten = new JPanel();

        // Formular Elemente positionieren
        cbAnrede.addItem("Herr");
        cbAnrede.addItem("Frau");
        cbAnrede.addItem("Sonstige");

        // Formular Elemente positionieren
        lblAnrede.setBounds(20, 20, 100, 25);
        lblName.setBounds(20, 50, 100, 25);
        cbAnrede.setBounds(130, 20, 100, 25);
        tfName.setBounds(150, 50, 100, 25);
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

        // RadioButtons gruppieren
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        rb1.setSelected(true);

    }

    public static void main(String[] args) {

        new Fenster().setVisible(true);

    }

}
