
import java.io.*;

public class TimeSerMain {

	public static void main(String[] args) {
		try {
			FileOutputStream fs = new FileOutputStream("test.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			Time1 time = new Time1(10, 20, 50);
			os.writeObject(time);
			os.close();
			System.out.println("Objekt wurde serialisiert");
			System.out.println("Objekt time: " + time.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
