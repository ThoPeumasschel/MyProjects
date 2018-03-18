
import java.io.*;

public class TimeIn2 {

	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("test.dat");
			BufferedInputStream os = new BufferedInputStream(fs);
			DataInputStream data = new DataInputStream(os); // Einlesen von serialisierten Objekten erfordert Deserialisation. 
			Time1 time = new Time1();
			time.setHour(data.readInt());
			time.setMinute(data.readInt());
			time.setSecond(data.readInt());
			data.close();
			
			System.out.println(time.toString());
			os.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		} 

	}

}
