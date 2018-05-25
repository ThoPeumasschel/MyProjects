package kundenverwaltung2;

import java.io.*;
import java.util.*;

public class Program {

    static ArrayList<Kunde> kundenListe;

    public static void main(String[] args) {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("kundenListe.save"));
            kundenListe = (ArrayList<Kunde>) ois.readObject();
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
            kundenListe = new ArrayList<Kunde>();
        }

        //kundenListe.size();
        byte menu = 0;
        do {
            System.out.println("1 - Kunde anlegen");
            System.out.println("2 - Kunden ausgeben");
            System.out.println("3 - Anwendung beenden");

            menu = new Scanner(System.in).nextByte();

            switch (menu) {
                case 1:
                    kundenAnlegen();
                    break;

                case 2:
                    kundenAusgeben();
                    break;

                case 3:
                    System.out.println("Anwendung wird beendet");
                    break;
                default:
                    break;
            }

        } while (menu != 3);
    }

    private static void kundenAnlegen() {
        //nr, nachname, vorname
        System.out.println("Kundennummer: ");
        String nr = new Scanner(System.in).next();
        System.out.println("Nachname: ");
        String nachname = new Scanner(System.in).next();
        System.out.println("Vorname: ");
        String vorname = new Scanner(System.in).next();

        kundenListe.add(new Kunde(nr, nachname, vorname));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("kundenListe.save"));
            oos.writeObject(kundenListe);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void kundenAusgeben() {
        System.out.println("es gibt " + kundenListe.size() + " Kunden");
        for (Kunde daten : kundenListe) {
            System.out.println(daten.getNr() + " - " + daten.getNachname() + " - " + daten.getVorname());
        }

    }

}
