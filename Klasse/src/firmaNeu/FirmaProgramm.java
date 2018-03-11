package firmaNeu;

import java.util.*;
// Folgende Probleme: 

public class FirmaProgramm {

	int iIndex;

	public static void main(String[] args) {
		
		MenuClass menu = new MenuClass();
		menu.menu();
		
		Angestellter ang = new Angestellter();
		Arbeiter arb = new Arbeiter();
		Firma firma = new Firma();
		firma.writeToFile();
		firma.readFromFile();
		
		
		
		
		
		
	}

}
