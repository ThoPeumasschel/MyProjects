/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_oop;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author tpeuschel
 */
public class Ausgabe {

    void ausgeben(Eingabe e, String k, double BMI) {

        DecimalFormat df = new DecimalFormat("0");       

        JOptionPane.showMessageDialog(null, "BMI Ergebnis für " + e.name + "\nGeschlecht : "
            + e.geschlecht + ", " + e.groesse + " cm, " + e.gewicht + " Kg\nBMI = "
            + df.format(BMI) + " bedeutet " + k);
    }

}
