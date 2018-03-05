import java.io.*;

public class ReadPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream file = new 
					FileInputStream("600primes.dat");
			BufferedInputStream buff = new 
					BufferedInputStream(file);
			DataInputStream data = new DataInputStream(buff);
			int in;
			//int[] arr = new int[600];
			//int zaehler = 0;
			
			try
			{
				while(true) 
				{
					in = data.readInt();
					System.out.print(in + " ");
				} 
				
			} catch (EOFException eof)
			{
				buff.close();
			}
		} catch (IOException e)
		{
			System.out.println("Error -- " + e.toString());
		}
	}
}
