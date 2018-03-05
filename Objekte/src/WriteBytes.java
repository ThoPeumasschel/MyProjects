import java.io.*;

public class WriteBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 71, 73, 70, 56, 57, 97, 15, 0, 15, 0, 128 };
		try
		{
			FileOutputStream file = new FileOutputStream("pic.dat");
			for (int i=0; i < data.length; i++)
				file.write(data[i]);
			file.close();
			System.out.println("Fertig!");
		} catch (IOException e)
		{
			System.out.println("Error -- " + e.toString());
		}				
	}
}
