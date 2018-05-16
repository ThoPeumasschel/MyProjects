package bmi_oop;

public class Berechnung {

    double berechne(double gewicht, double groesse) {
        double BMI = gewicht / Math.pow(groesse/100, 2);
        //System.out.println("BMI " + BMI + groesse + gewicht );
        
        return BMI;
    }

}
