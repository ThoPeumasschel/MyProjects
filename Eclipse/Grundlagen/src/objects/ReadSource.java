package objects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadSource {

	public static void main(String[] args) {

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
