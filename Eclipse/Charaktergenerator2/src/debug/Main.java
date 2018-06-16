package debug;


import klassen.*;

public class Main {

	
	
	public static void main(String[] args) {
		
		
		GameInit game = new GameInit();
		game.planquadrateErzeugen();
		game.charakterAufPlanquadratZuweisen();
		System.out.println("---------------------");
		System.out.println("Spieler nach Planquadraten aufsteigend");
		game.zeigeSpielerAufsteigend();
		System.out.println("---------------------");
		System.out.println("Spieler nach Planquadraten absteigend");
		game.zeigeSpielerAbsteigend();
		System.out.println("---------------------");
		game.searchByID(9);
		
		
		
	}

}
