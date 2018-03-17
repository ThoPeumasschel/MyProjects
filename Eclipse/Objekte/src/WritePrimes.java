

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePrimes {

	public static void main(String[] args) {

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
			} data.close();
			System.out.println("\nFertig!");
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
	}

	private static boolean isPrime(int checkNumber) {

		double root = Math.sqrt(checkNumber);
		for (int i = 2; i <= root; i++) {
			if (checkNumber % i == 0)
				return false;
		}

		return true;
	}

}
