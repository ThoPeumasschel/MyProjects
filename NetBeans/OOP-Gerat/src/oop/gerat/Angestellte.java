/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.gerat;

/**
 *
 * @author tpeuschel
 */
public class Angestellte extends Mitarbeiter{
    private double Gehalt;
    
    @Override
    public String toString() {
        
        return "Angestellter: " + this.getVorname() + " " + this.getNachname() + 
            " verdient " + this.Gehalt;
    }

    public double getGehalt() {
        return Gehalt;
    }

    public void setGehalt(double Gehalt) {
        this.Gehalt = Gehalt;
    }
}
