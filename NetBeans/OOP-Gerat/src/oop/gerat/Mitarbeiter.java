package oop.gerat;

public class Mitarbeiter {
    private String vorname;
    private String nachname;
    private int arbeitsstunden;
    static double kaffeekasse;
    
    @Override
    public String toString() {
        
        return "Mitarbeiter: " + this.vorname + " " + this.nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getArbeitsstunden() {
        return arbeitsstunden;
    }

    public void setArbeitsstunden(int arbeitsstunden) {
        this.arbeitsstunden = arbeitsstunden;
    }

    public static double getKaffeekasse() {
        return kaffeekasse;
    }

    public static void setKaffeekasse(double kaffeekasse) {
        Mitarbeiter.kaffeekasse = kaffeekasse;
    }

}
