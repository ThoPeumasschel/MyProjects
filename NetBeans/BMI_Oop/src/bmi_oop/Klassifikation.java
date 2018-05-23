package bmi_oop;

import javax.swing.JOptionPane;

public class Klassifikation {

    String klassifikation;

    String klassifizieren(Eingabe e, double BMIein) {
        double BMI = BMIein;
        if (e.getGeschlecht().equals("w") || e.getGeschlecht().equals("W") || e.getGeschlecht().equals("weiblich")) {
            BMI++;
        }

        if (BMI < 16) {
            klassifikation = "Starkes Untergewicht";
        } else if (BMI < 17) {
            klassifikation = "Mäßiges Untergewicht";
        } else if (BMI < 18.5) {
            klassifikation = "Leichtes Untergewicht";
        } else if (BMI < 25) {
            klassifikation = "Normalgewicht";
        } else if (BMI < 30) {
            klassifikation = "Übergewicht";
        } else if (BMI < 35) {
            klassifikation = "Adipositas Grad I";
        } else if (BMI < 40) {
            klassifikation = "Adipositas Grad II";
        } else {
            klassifikation = "Adipositas Grad III";
        }

        return klassifikation;
    }

}
