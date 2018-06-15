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
		
//		Main m=new Main();
//
//		for(int i = 0; i <12;i++)
//		{
//			charakterArr[i]=new Charakter();
//		}
//		
//		//Charakter c1 = new Charakter();
//		//c1.erzeugeCharakter();
//		System.out.println("--------------------------------\n");
//		for(Charakter c : charakterArr)
//			System.out.println(c.zeigeCharakter()+"\n");
		
		
		
	}

}
