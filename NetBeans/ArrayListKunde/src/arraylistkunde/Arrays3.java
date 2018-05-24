package arraylistkunde;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays3 {

    static ArrayList<Kunde> kundenListe = new ArrayList<Kunde>();
    

    public static void main(String[] args) {
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
        
        
    }

    private static void kundenAusgeben() {

        for (Kunde s : kundenListe) {
            System.out.println(s.getNr() + " - " + s.getNachname() + " - " + s.getVorname());
        }

        
        {

        }
    }

}
