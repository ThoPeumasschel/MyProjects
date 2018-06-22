package tests;

import delegator.Dozent;
import delegator.Kurs;
import delegator.Schulungsunternehmen;
import delegator.Seminarteilnehmer;

public class Main
{

	public static void main(String[] args)
	{

		Kurs kurs1 = new Kurs("Montag", "Freitag", "2.33", "Philosophie 101", "Rüll");
		Dozent lehrer1 = new Dozent("Herbert", "Amberg", "09813/5346", kurs1);

		Seminarteilnehmer student1 = new Seminarteilnehmer("Christian", "Köln", "666444", kurs1);

		System.out.println(student1.getName() + "s Kurs:\n" + student1.getKurs());

		System.out.println(student1.getKurs().getDozent());

		lehrer1.getPrivatTelefon()
		
		
		
		

	}

}
