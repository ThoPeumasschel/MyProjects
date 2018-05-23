/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weiterearrays;

/**
 *
 * @author tpeuschel
 */
public class Arrays2 {

    public static void main(String[] args) {
//Array mit beliebigen Ganzzahlen füllen
        int[] zahlenArr = {23, 12, 45, 90, 4, 56, 371, 2, 12, 67, 89, 55, 11, 60, 100, 28, 45};
        Arrays2 m = new Arrays2();
        System.out.println("Gesuchte Zahl 45 gefunden an Stelle : " + m.serchArraySlot(zahlenArr, 45));
        System.out.println("Die 45 kommt " + m.countZahl(zahlenArr, 45) + " mal vor");
        System.out.println("Der Durchschnitt aller Werte ist: " + m.avg(zahlenArr));
        System.out.println("Die größte Zahl im Array ist: " + m.getMax(zahlenArr));
        System.out.println("Die kleinste Zahl im Array ist: " + m.getMin(zahlenArr));
    }

    public int serchArraySlot(int[] a, int suchwert) {
        boolean gefunden = false;
        int slot = -1;
        int index = 0;
        while (!gefunden && index < a.length) {
            if (a[index] == suchwert) {
                gefunden = true;
                slot = index;
            } else {
                index++;
            }
        }
        return slot;
    }

    public int countZahl(int[] a, int suchwert) {
        int anzahl = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == suchwert) {
                anzahl++;
            }
        }
        return anzahl;
    }

    public int avg(int[] a) {
        int avg = 0;
        for (int i = 0; i < a.length; i++) {
            avg += a[i];
        }
        avg /= a.length;
        return avg;
    }

    public int getMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public int getMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
