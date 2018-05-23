package bmi_oop;

import javax.swing.JOptionPane;

public class Eingabe {

    private String name;
    private String geschlecht;
    private double groesse;
    private double gewicht;
    

    void eingeben() {
        name = JOptionPane.showInputDialog("Name");
        geschlecht = JOptionPane.showInputDialog("Geschlecht");
        groesse = Double.parseDouble(JOptionPane.showInputDialog("Größe in cm"));
        gewicht = Double.parseDouble(JOptionPane.showInputDialog("Gewicht"));
        
    }
    
    public String getName() {
        return name;
    }
    public String getGeschlecht() {
        return geschlecht;
    }
    public double getGroesse() {
        return groesse;
    }
    public double getGewicht() {
        return gewicht;
    }
}
