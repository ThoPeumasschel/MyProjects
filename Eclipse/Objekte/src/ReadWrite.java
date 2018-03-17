

// Zusammenstellung: Thomas Peuschel

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadWrite {

	static void readBytes() { //

		try {
			FileInputStream file = new FileInputStream("pic.dat");
			boolean eof = false;
			int count = 0;
			while (!eof) {
				int input = file.read();
				System.out.print(input + " ");
				if (input == -1)
					eof = true;
				else
					count++;
			}
			file.close();
			System.out.println("\nBytes read: " + count);
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
	}

	static void writeBytes() {

		int[] data = { 71, 45, 26, 93, 73, 45, 124, 147, 236, 234, 255, 0 };
		try {
			FileOutputStream file = new FileOutputStream("pic.txt");
			for (int i = 0; i < data.length; i++)
				file.write(data[i]);
			file.close();
			System.out.println("Fertig!");
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
	}

	static void readPrimes() {

		try {
			FileInputStream file = new FileInputStream("400primes.dat");
			BufferedInputStream buff = new BufferedInputStream(file);
			DataInputStream data = new DataInputStream(buff);
			int in;
			// int[] arr = new int[600];
			// int zaehler = 0;

			try {
				while (true) {
					in = data.readInt();
					// arr[zaehler++] = data.readInt();
					System.out.print(in + " ");
					// System.out.print(arr[zaehler-1] + " ");
				}
			} catch (EOFException eof) {
				buff.close();
			}

		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}

		/*
		 * int[] primesArr = new int[400];
		 * 
		 * for(int i = 0; i < primesArr.length; i++) { primesArr[i] = data.readInt();
		 */
	}

	static void writePrimes() {

		int[] primes = new int[600];
		int numPrimes = 0;
		int candidate = 2;

		while (numPrimes < primes.length) {
			if (isPrime(candidate)) {
				primes[numPrimes] = candidate;
				numPrimes++;
			}
			candidate++;
		}

		try {
			FileOutputStream file = new FileOutputStream("600primes.dat");
			BufferedOutputStream buff = new BufferedOutputStream(file);
			DataOutputStream data = new DataOutputStream(buff);
			for (int i = 0; i < primes.length; i++) {
				data.writeInt(primes[i]);
				System.out.print(primes[i] + " ");
			}
			data.close();
			System.out.println("\nFertig!");
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
	}

	static boolean isPrime(int checkNumber) {

		double root = Math.sqrt(checkNumber);
		for (int i = 2; i <= root; i++) {
			if (checkNumber % i == 0)
				return false;
		}

		return true;
	}

	static void readSource() {

		try {
			FileReader file = new FileReader("ReadSource.java");
			BufferedReader buff = new BufferedReader(file);
			boolean eof = false;
			String line = null;
			while (!eof) {
				line = buff.readLine();
				if (line == null)
					eof = true;
				else
					System.out.println(line);
			}
			buff.close();
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
	}
}
