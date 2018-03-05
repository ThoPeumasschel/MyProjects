package objectsneu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CKopieren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int zeichen;
			boolean ende = false;
			FileReader ein = new FileReader("CKopieren.java");
			FileWriter aus = new FileWriter("CKopieren.bak");
			while (!ende)
				if ((zeichen = ein.read()) == -1)
					ende = true;
				else
					aus.write(zeichen);
			ein.close();
			aus.close();
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());

		}
	}

}
