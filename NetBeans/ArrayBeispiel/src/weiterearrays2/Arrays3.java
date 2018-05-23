package weiterearrays2;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays3 {

    static ArrayList<String[]> kundenListe = new ArrayList<String[]>();

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
        
        String[] kunde = new String[3];
        kunde[0] = nr;
        kunde[1] = nachname;
        kunde[2] = vorname;
        kundenListe.add(kunde);
        /*
        kundenListe.add(new String[3]);
        kundenListe.get(0)[0] = "Test";*/
    }

    private static void kundenAusgeben() {

        for (String[] s : kundenListe) 
            System.out.println(s[0] + " - " + s[1] + " - " + s[2]);
            
            
            
            
            /*
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(kundenArray[i][j]);
            }
            System.out.println();

        }
         */ //   String[] strings = kundenArray[i];
        {
            
        }
    }

}
