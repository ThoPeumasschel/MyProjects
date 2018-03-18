

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadSort2 {

	static int al = readInt("Bitte die Größe des Arrays bestimmen");
	static int[] arr = new int[al];

	public static int readInt(String text) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(text + ": ");
		try { // Überwachungsblock
			return Integer.parseInt(in.readLine());
		} catch (IOException e) { // Fehlerbehandlungsblock
			System.out.println("IO error");
			return 1;
		} catch (NumberFormatException e) { // Fehlerbehandlungsblock
			System.out.println("NumberFormat error");
			return 1;
		}
	}

	static void shellSort(int[] arr) {
		int temp = 0, h = 1, j = 0;
		do
			h = 3 * h + 1;
		while (h < arr.length);
		do {
			h = h / 3;
			for (int i = h; i < arr.length; i++) {
				temp = arr[i];
				j = i;
				while ((j >= h) && (arr[j - h] > temp)) {
					arr[j] = arr[j - h];
					j = j - h;
				}
				arr[j] = temp;
			}
		} while (h != 1);
	}

	static int findMax(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[max])
				max = i;
		}
		return max;
	}

	static int findMin(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[max])
				max = i;
		}
		return max;
	}

	static float sumAverage(int arr[]) {
		float Summe = 0, Mittelwert = 0;
		for (int i = 0; i < arr.length; i++)
			Summe += arr[i];
		System.out.println("Die Summe des Arrays ist: " + Summe);
		System.out.println("Der Länge des Arrays ist: " + arr.length);
		Mittelwert = (Summe / arr.length);
		return Mittelwert;
	}

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			int number = readInt("Bitte die " + (i + 1) + ". von " + al + " Zahlen eingeben");
			arr[i] = number;
		}
		System.out.print("Die Werte des Arrays sind: [ ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("]");
		shellSort(arr);
		System.out.print("Die Werte nach der Sortierung sind: [ ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("]");
		int erg = findMax(arr);
		System.out.println("Das Maximum des Arrays ist: " + arr[erg]);
		int erg2 = findMin(arr);
		System.out.println("Das Minimum des Arrays ist: " + arr[erg2]);
		float Mittelwert = sumAverage(arr);
		System.out.println("Der Mittelwert des Arrays ist: " + Mittelwert);
	}

}
