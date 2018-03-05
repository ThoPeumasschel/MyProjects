import java.io.*;

public class WritePrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primes = new int[600];
		int numPrimes = 0;
		int candidate = 2;
		while (numPrimes < primes.length)
		{
			if (isPrime(candidate))
			{
				primes[numPrimes] = candidate;
				numPrimes++;
			}
			candidate++;
		}
		
		try {
			FileOutputStream file = new 
					FileOutputStream("600primes.dat");
			BufferedOutputStream buff = new 
					BufferedOutputStream(file);
			DataOutputStream data = new DataOutputStream(buff);
			for (int i=0; i<primes.length; i++)
			{
				data.writeInt(primes[i]);
				System.out.print(primes[i] + " ");
			}
			data.close();
			System.out.println("Fertig!");
		} catch (IOException e)
		{
			System.out.println("Error -- " + e.toString());
		}				
	}

	private static boolean isPrime(int checkNumber) {
		// TODO Auto-generated method stub
		double root = Math.sqrt(checkNumber);
		for (int i = 2; i <= root; i++)
		{
			if (checkNumber % i == 0)
				return false;
		}		
		return true;
	}
}
