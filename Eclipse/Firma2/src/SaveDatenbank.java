/*	Created by: Patrick Kleinschmidt
 * 	Date: 14.03.18
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveDatenbank {

	
SaveDatenbank()	{
	try {
		//WRITE TO FILE ANGESTELLTE
		FileOutputStream fs1 = new FileOutputStream("Ang_Data.sav");
		ObjectOutputStream os1 = new ObjectOutputStream(fs1);
		os1.writeObject(Datenbank_Angestellte.oworker);
		os1.close();
		//WRITE TO FILE ARBEITER
		FileOutputStream fs2 = new FileOutputStream("Arb_Data.sav");
		ObjectOutputStream os2 = new ObjectOutputStream(fs2);
		os2.writeObject(Datenbank_Arbeiter.worker);
		os2.close();
		//ERROR CATCH
	} catch (IOException e)	{
		}
	}
}
