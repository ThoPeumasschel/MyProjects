import java.io.*;

public class AllCapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convert();
	}
	
	static void convert()
	{
		try
		{
			String sourceName = "ReadSource.java";
			// create file objects
			File source = new File(sourceName);
			File temp = new File("cap" + sourceName + ".tmp");
			
			// create input stream
			FileReader fr = new FileReader(source);
			BufferedReader in = new BufferedReader(fr);
			
			// create output stream
			FileWriter fw = new FileWriter(temp);
			BufferedWriter out = new BufferedWriter(fw);
			
			boolean eof = false;
			int inChar = 0;
			char outChar;
			do {
				inChar = in.read();
				if (inChar != -1) {
					// Wrapper Klassen
					// float = Float, long = Long
					// int = Integer, char = Character
					outChar = Character.toUpperCase((char) inChar);
					out.write(outChar);
				} else
					eof = true;
			} while (!eof);
			in.close();
			out.close();
			
			boolean deleted = source.delete();
			if (deleted)
				temp.renameTo(source);
		} catch (IOException e)
		{
			System.out.println("Error -- " + e.toString());
		} catch (SecurityException e)
		{
			System.out.println("Error -- " + e.toString());
		}								
	}
}
