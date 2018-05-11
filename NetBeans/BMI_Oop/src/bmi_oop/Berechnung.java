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
public class Berechnung {

    double berechne(double gewicht, double groesse) {
        double BMI = gewicht / Math.pow(groesse/100, 2);
        System.out.println("BMI " + BMI + groesse + gewicht );
        
        return BMI;
    }

}
