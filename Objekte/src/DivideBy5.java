

import java.io.*;

public class DivideBy5 {
	
	public static int readInt(String text) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(text + ": ");
		try {
			return Integer.parseInt(in.readLine());
		}
		catch (IOException e) {
			System.out.println("IO error!");
			return 1;
			
		}
		catch (NumberFormatException e) {
			System.out.println("NumberFormatError error!");
			return 1;
			
		}
	}
	
	public static void main(String[] args) {
		
		int number = readInt("Zahl");
		int counter = 0;
		while (number % 5 == 0) {
			number /= 5;
			counter++;
		}
		System.out.println("Anzahl Schleifendurchläufe: " + counter + "\nErgebnis der Divisionen durch 5: " + number + ".");	
	}

}
