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

    void ausgeben(Eingabe e, String k) {

        Berechnung b = new Berechnung();
        DecimalFormat df = new DecimalFormat("0");
        double BMI = (b.berechne(e.gewicht, e.groesse));
        

        //Eingabe e = new Eingabe();
        JOptionPane.showMessageDialog(null, "BMI Ergebnis für " + e.name + "\nGeschlecht : "
            + e.geschlecht + ", " + e.groesse + " cm, " + e.gewicht + " Kg\nBMI = "
            + df.format(BMI) + " bedeutet " + k);
    }

}
