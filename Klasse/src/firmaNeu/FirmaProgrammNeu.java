package firmaNeu;

import java.util.*;
// Folgende Probleme: 

public class FirmaProgrammNeu {

	int iIndex;

	public static void main(String[] args) {
		
		MenuClass menu = new MenuClass();
		menu.menu();
		
		AngestellterNeu ang = new AngestellterNeu();
		ArbeiterNeu arb = new ArbeiterNeu();
		FirmaNeu firmaNeu = new FirmaNeu();
		firmaNeu.writeToFile();
		firmaNeu.readFromFile();
		
		
		
		
		
		
	}

}
