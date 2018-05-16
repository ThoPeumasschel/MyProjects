package bmi_oop;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ausgabe {

    void ausgeben(Eingabe e, String k, double BMI) {

        DecimalFormat df = new DecimalFormat("0");       

        JOptionPane.showMessageDialog(null, "BMI Ergebnis für " + e.name + "\nGeschlecht : "
            + e.geschlecht + ", " + e.groesse + " cm, " + e.gewicht + " Kg\nBMI = "
            + df.format(BMI) + " bedeutet " + k);
    }

}
