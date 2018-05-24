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
public class Arbeiter extends Mitarbeiter {

    private double stundenlohn;

    @Override
    public String toString() {

        return "Arbeiter: " + this.getVorname() + " " + this.getNachname()
            + " verdient " + this.getArbeitsstunden() * this.stundenlohn * 4;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }
}
