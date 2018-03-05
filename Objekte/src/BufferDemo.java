import java.io.*;

public class BufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int st = 200, fin = 255;
		System.out.println("\nWriting: ");
		boolean sucess = writeStream(st, fin);
		if (!sucess)
			System.out.println("Fehler beim Schreiben");
		System.out.println("\nReading: ");
		sucess = readStream();
		if (!sucess)
			System.out.println("Fehler beim Lesen");
	}

	static boolean writeStream(int start, int stop)
	{
		try
		{
			FileOutputStream file = new FileOutputStream("numbers.dat");
			BufferedOutputStream buff = new BufferedOutputStream(file);
			for (int out = start; out <= stop; out++)
			{
				buff.write(out);
				System.out.print(" " + out);
			}
			buff.close();
			return true;
		} catch (IOException e)
		{
			System.out.println("Error -- " + e.toString());
			return false;
		}
	}
	
	static boolean readStream()
	{
	try
	{
		FileInputStream file = new FileInputStream("numbers.dat");
		BufferedInputStream buff = new BufferedInputStream(file);
		int in = 0;
		do {
			in = buff.read();
			if (in != -1)
				System.out.print(" " + in);
		} while (in != -1);
		buff.close();
		return true;
	} catch (IOException e)
	{
		System.out.println("Error -- " + e.toString());
		return false;
	}
 }
}
