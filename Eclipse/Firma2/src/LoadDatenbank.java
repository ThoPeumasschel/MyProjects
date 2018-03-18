/*	Created by: Patrick Kleinschmidt
 * 	Date: 14.03.18
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadDatenbank {

	LoadDatenbank()	{
		try	{
			//READ FROM FILE ANGESTELLTE
			FileInputStream fs1 = new FileInputStream("Ang_Data.sav");
			ObjectInputStream is1 = new ObjectInputStream(fs1);
			//SET READED DATA TO DATABASE ANGESTELLTER
			Datenbank_Angestellte.oworker = (String[][]) is1.readObject();
			is1.close();
			//READ FROM FILE ARBEITER
			FileInputStream fs2 = new FileInputStream("Arb_Data.sav");
			ObjectInputStream is2 = new ObjectInputStream(fs2);
			//SET READED DATA TO DATABASE ARBEITER
			Datenbank_Arbeiter.worker = (String[][]) is2.readObject();
			is2.close();
			//ERROR CATCH
		} catch (IOException e)	{
		} catch (ClassNotFoundException e)	{
		}
	}
}
