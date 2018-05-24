package oop.gerat;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter();
        Mitarbeiter m2 = new Mitarbeiter();

        m1.setNachname("Mustermann");
        m1.setVorname("Max");
        m1.setArbeitsstunden(40);
        Mitarbeiter.kaffeekasse += 100;

        m2.setNachname("Musterfrau");
        m2.setVorname("Maxi");
        m2.setArbeitsstunden(35);
        Mitarbeiter.kaffeekasse -= 50;

        System.out.println("Name: " + m1.getVorname() + " " + m1.getNachname() + ", "
            + m1.getArbeitsstunden() + " Arbeitsstunden");

        System.out.println("Name: " + m2.getVorname() + " " + m2.getNachname() + ", "
            + m2.getArbeitsstunden() + " Arbeitsstunden");

        System.out.println(Mitarbeiter.kaffeekasse);

        Angestellte ang = new Angestellte();
        ang.setNachname("MusterAngestellter");
        ang.setGehalt(2000);

        Arbeiter arb = new Arbeiter();
        arb.setNachname("MusterArbeiter");
        arb.setStundenlohn(20);
        arb.setArbeitsstunden(40);

        ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<Mitarbeiter>();
        mitarbeiterListe.add(ang);
        mitarbeiterListe.add(arb);

        for (Mitarbeiter m : mitarbeiterListe) {
            // Angestellte ang1 = (Angestellte)m;
            if (m instanceof Angestellte) {
                System.out.println(m.getNachname() + " : " + ((Angestellte) m).getGehalt());
            } else if (m instanceof Arbeiter) {
                System.out.println(m.getNachname() + " : " + ((Arbeiter) m).getStundenlohn()
                    * m.getArbeitsstunden() * 4);
            }

        }
        // Polymorphie 
        System.out.println("Ausgabe der toString-Methode");
        for (Mitarbeiter m : mitarbeiterListe) {
            System.out.println(m.toString());
        }
    }

}
// Objectoutputstream