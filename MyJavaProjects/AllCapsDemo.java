import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AllCapsDemo {

	public static void main(String[] args) {
		
		convert();
		
		

	}

	static void convert() {
		try {
			String sourceName = ("Beispielcode.java");
			// create file objects
			File source = new File("Beispielcode");
			File temp = new File("cap" + sourceName + ".tmp");

			// create input stream
			FileReader fr = new FileReader(source);
			BufferedReader in = new BufferedReader(fr);

			// create output Stream
			FileWriter fw = new FileWriter(temp);
			BufferedWriter out = new BufferedWriter(fw);

			boolean eof = false;
			int inChar = 0;
			char outChar;
			do {
				inChar = in.read();
				if (inChar != -1) {
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

		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		} catch (SecurityException e) {
			System.out.println("Error -- " + e.toString());

		}
	}

}
