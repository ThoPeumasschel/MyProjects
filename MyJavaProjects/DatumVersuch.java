import java.time.*;
import java.time.format.*;

public class DatumVersuch 
	{
	public static void main (String ... args) {
	//	Calender cal = Calender.getInstance();
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		DateTimeFormatter df;
		df = DateTimeFormatter.ofPattern("dd.MM.yyyy kk:mm");
		System.out.println(now.format(df));



	}
}
