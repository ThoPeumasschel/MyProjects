package firmaNeu;

import java.util.*;

public class TestArrayList {

	void testing() {
		
		AngestellterNeu ang = new AngestellterNeu();

		ArrayList<String> stuff = new ArrayList<String>();
		stuff.add("Casimir");
		stuff.add("Adam");
		stuff.add("Dolores");
		stuff.add("Bertram");

		System.out.println(stuff);
		Collections.sort(stuff);
		System.out.println(stuff);
		
		ArrayList<AngestellterNeu> angarr = new ArrayList<AngestellterNeu>();
		
//		AngestellterNeu angarr = new AngestellterNeu("Ehrlich", "Paul", "Augsburg", "0175/534231", "4300");

//		AngestellterNeu ang = new AngestellterNeu(ang.setName("Chavez"), ang.setVorname("Hugo"), ang.setAdresse("Venezuela"), ang.setTelefonnummer("666/66666"),
//		ang.setMonatsgehalt(345));
		
	//	ang = new AngestellterNeu("Ehrlich", "Paul", "Augsburg", "0175/534231", 4300);
//		f.angarr[f.iangarr++] = new AngestellterNeu("Ehrlich", "Rudolf", "Augsburg", "0175/511111", 2300);
//		f.angarr[f.iangarr++] = new AngestellterNeu("Ehrlich", "Dieter", "Augsburg", "0175/522222", 4700);

	}

}
