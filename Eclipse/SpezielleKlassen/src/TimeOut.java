import java.io.*;

public class TimeOut {

	public static void main(String[] args) {
		try {
			String datName = "test.dat";
			FileOutputStream fs = new FileOutputStream(datName);
			BufferedOutputStream buff = new BufferedOutputStream(fs);
			DataOutputStream data = new DataOutputStream(buff);
			
			Time1 time = new Time1(20, 25, 43);
			
			data.writeInt(time.getHour()+time.getMinute()+time.getSecond());
	//		data.writeInt(time.getMinute());
	//		data.writeInt(time.getSecond());
			
			data.close();
			
			System.out.println("Objekt wurde serialisiert");
			System.out.println("Objekt time: " + time.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}

}
