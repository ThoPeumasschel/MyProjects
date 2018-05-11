/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_oop;

import javax.swing.JOptionPane;

/**
 *
 * @author tpeuschel
 */
public class Eingabe {

    String name;
    String geschlecht;
    double groesse;
    double gewicht;
    int alter;

    void eingeben() {
        name = JOptionPane.showInputDialog("Name");
        geschlecht = JOptionPane.showInputDialog("Geschlecht");
        groesse = Double.parseDouble(JOptionPane.showInputDialog("Größe in cm"));
        gewicht = Double.parseDouble(JOptionPane.showInputDialog("Gewicht"));
        
    }
}
