package Hausis;

import java.util.*;

public class Messwert extends Cell {

	int[] messwerte = new int[100];
	int iIndex = 0;

	void display() {
		for (int i = 0; i < messwerte.length; i++) {
			System.out.println("Messwert Nr. " + (i+1) + ": " + messwerte[i]);
			
		}
	}

	void append() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Messwerte eingeben");
		for (; iIndex < messwerte.length; iIndex++) {
			messwerte[iIndex] = sc.nextInt();
			
		}
		sc.close();
	}
	
	

}
