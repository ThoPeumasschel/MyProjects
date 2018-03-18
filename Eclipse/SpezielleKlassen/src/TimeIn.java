
import java.io.*;

public class TimeIn {

	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("test.ser");
			ObjectInputStream os = new ObjectInputStream(fs);
			Time1 time = (Time1) os.readObject(); // Einlesen von serialisierten Objekten erfordert Deserialisation. 
			System.out.println(time.toString());
			os.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}

	}

}
