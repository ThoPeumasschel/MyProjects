package bmi_oop;

import javax.swing.JOptionPane;

public class Eingabe {

    String name;
    String geschlecht;
    double groesse;
    double gewicht;
    

    void eingeben() {
        name = JOptionPane.showInputDialog("Name");
        geschlecht = JOptionPane.showInputDialog("Geschlecht");
        groesse = Double.parseDouble(JOptionPane.showInputDialog("Größe in cm"));
        gewicht = Double.parseDouble(JOptionPane.showInputDialog("Gewicht"));
        
    }
}
