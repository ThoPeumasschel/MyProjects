/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_oop;

/**
 *
 * @author tpeuschel
 */
public class Klassifikation {

    String klassifikation;

    String klassifizieren(Eingabe e, double BMI) {

        //double BMI = b.berechne(e.gewicht, e.groesse);
        // if (e.geschlecht.equals("w") || e.geschlecht.equals("W") || e.geschlecht.equals("weiblich")) {
        //    BMI = - 1;
        //  }
        if (e.geschlecht.equals("m") || e.geschlecht.equals("M") || e.geschlecht.equals("männlich")) {
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
        }
            if (BMI < 15) {
                klassifikation = "Starkes Untergewicht";
            } else if (BMI < 16) {
                klassifikation = "Mäßiges Untergewicht";
            } else if (BMI < 17.5) {
                klassifikation = "Leichtes Untergewicht";
            } else if (BMI < 24) {
                klassifikation = "Normalgewicht";
            } else if (BMI < 29) {
                klassifikation = "Übergewicht";
            } else if (BMI < 34) {
                klassifikation = "Adipositas Grad I";
            } else if (BMI < 39) {
                klassifikation = "Adipositas Grad II";
            } else {
                klassifikation = "Adipositas Grad III";
            }
        

        return klassifikation;
    }

}
