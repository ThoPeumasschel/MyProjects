

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytes {

	public static void main(String[] args) {

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

}
