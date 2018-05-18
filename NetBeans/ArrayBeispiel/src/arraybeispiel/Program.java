package arraybeispiel;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        String[] wochentage = new String[2];
        wochentage[0] = "Sonntag";

        wochentage[1] = "Montag";

        Arrays.sort(wochentage);
        
        int[] zahlen = {4, 3, 6, 45, 12, 55};
        System.out.println(zahlen.length);

        // zählschleife
        for (int i = 0; i < wochentage.length; i++) {
            System.out.println(wochentage[i]);
        }

        //erweiterte for / foreach
        for (String s : wochentage) {
            System.out.println(s);
        }

        // zweidimensionale Arrays
        String[][] plzOrt = new String[3][2];
        plzOrt[0][0] = "11111";
        plzOrt[0][1] = "Berlin";

        plzOrt[1][0] = "22222";
        plzOrt[1][1] = "München";

        plzOrt[1][0] = "33333";
        plzOrt[1][1] = "Hannover";

        // ist equivalent zu
        String[][] plzOrt2 = {
            {"11111", "Berlin"},
            {"22222", "München"}};

        for (int i = 0; i < plzOrt.length; i++) {
            System.out.println(plzOrt[i][0] + " " + plzOrt[i][1]);
        }

        for (int i = 0; i < plzOrt.length; i++) {
            for (int j = 0; j < plzOrt[0].length; j++) {
                System.out.println(plzOrt[i][j]);
            }
        }

        String[][] test = new String[2][];
        test[0] = wochentage;
        test[1] = new String[3];
        System.out.println(test[0].length);

        // Aufageblösung
        String[][] artikelArr = new String[10][3];
        artikelArr[0][0] = "12345";
        artikelArr[0][1] = "IPhoneX";
        artikelArr[0][2] = "1100,99";

        artikelArr[1][0] = "54231";
        artikelArr[1][1] = "IPhone7";
        artikelArr[1][2] = "987,45";

        artikelArr[2][0] = "374569";
        artikelArr[2][1] = "IPhone8";
        artikelArr[2][2] = "999,99";

        for (int i = 0; i < artikelArr.length && artikelArr[i][0] != null; i++) {
            for (int j = 0; j < artikelArr[0].length; j++) {
                System.out.print(artikelArr[i][j] + " ");

            }
            System.out.println();
        }

        int[][][][][] spassArr = {{{{{12, 23, 34}, {98, 87, 76}, {5, 64, 4}}, {{45, 12, 345, 8}, {2, 3, 4, 5,}}},
        {{{1, 2, 3, 4}, {5, 6, 7}}}}};

        // ArrayList 
        ArrayList liste = new ArrayList();
        liste.add("Montag");
        liste.add(12345);
        liste.add(true);
        
        ArrayList<String> einkaufsListe = new ArrayList<>();
        einkaufsListe.add("Milch");
        einkaufsListe.add("Zucker");
        einkaufsListe.add("Kaffee");
        System.out.println("Größe Einkaufsliste" + einkaufsListe.size());
        for (String s : einkaufsListe)
            System.out.println(s);
        
        einkaufsListe.remove(0);
        System.out.println(einkaufsListe.get(0));
        
        ArrayList<Integer> zahlenListe = new ArrayList<>();
        
        ArrayList<String[]> test2 = new ArrayList<>();
        test2.add(wochentage);
        
        
    }

}

