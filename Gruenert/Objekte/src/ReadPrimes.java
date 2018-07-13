

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadPrimes {

	public static void main(String[] args) {
		
		try {
			FileInputStream file = new FileInputStream("600primes.dat");
			BufferedInputStream buff = new BufferedInputStream(file);
			DataInputStream data = new DataInputStream(buff);
			int in;
	//		int[] arr = new int[600];
	//		int zaehler = 0;
			
			try {
				while(true) {
					in = data.readInt();
		//			arr[zaehler++] = data.readInt();
					System.out.print(in + " ");
			//		System.out.print(arr[zaehler-1] + " ");
				}
				} catch (EOFException eof) {	
						buff.close();
					}
			
			
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}			
			
/*				int[] primesArr = new int[400];
				
				for(int i = 0; i < primesArr.length; i++)
				{
					primesArr[i] = data.readInt();
	*/					
				
			}
		
	}

