package firmaNeu;

import java.util.*;

public class TestArrayList {

	void testing() {
		
		Angestellter ang = new Angestellter();

		ArrayList<String> stuff = new ArrayList<String>();
		stuff.add("Casimir");
		stuff.add("Adam");
		stuff.add("Dolores");
		stuff.add("Bertram");

		System.out.println(stuff);
		Collections.sort(stuff);
		System.out.println(stuff);
		
		ArrayList<Angestellter> angarr = new ArrayList<Angestellter>();
		
		Angestellter angarr = new Angestellter("Ehrlich", "Paul", "Augsburg", "0175/534231", "4300");

		Angestellter ang = new Angestellter(ang.setName("Chavez"), ang.setVorname("Hugo"), ang.setAdresse("Venezuela"), ang.setTelefonnummer("666/66666"),
		ang.setMonatsgehalt(345));
		
	//	ang = new Angestellter("Ehrlich", "Paul", "Augsburg", "0175/534231", 4300);
//		f.angarr[f.iangarr++] = new Angestellter("Ehrlich", "Rudolf", "Augsburg", "0175/511111", 2300);
//		f.angarr[f.iangarr++] = new Angestellter("Ehrlich", "Dieter", "Augsburg", "0175/522222", 4700);

	}

}
