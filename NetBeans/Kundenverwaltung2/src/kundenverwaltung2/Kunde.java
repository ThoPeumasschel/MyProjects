package kundenverwaltung2;

import java.io.Serializable;

public class Kunde implements Serializable {
    private String nr, nachname, vorname;
    
    static int anzahl;
    
    public Kunde(String nr, String nachname, String vorname) {
        this.nr = nr;
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Kunde.anzahl = anzahl;
    }
    
    
}
