package klassen;

public class Stadt {

	// Die Stadt, in welcher die Charktere verteilt werden sollen, ist intern in Planquadrate aufgeteilt. 
	// Es ist im Grunde ein Spielfeld von 10x10 Planquadraten. Jedes Planquadrat kann maximal einen Charakter aufnehmen.
	
	//Charakter[] planquadrate = new Charakter[100];
	//int[][] spielerPosition = new int[10][10];
	
	Planquadrat[] planquadrat = new Planquadrat[100];

	public Planquadrat[] getPlanquadrat() {
		return planquadrat;
	}



	public void setPlanquadrat(Planquadrat[] planquadrat) {
		this.planquadrat = planquadrat;
	}



	public int getSpielerPosition() {
		return spielerPosition;
	}



	public void setSpielerPosition(int spielerPosition) {
		this.spielerPosition = spielerPosition;
	}



	int spielerPosition;
	
	
	
	
	
	
	
	public void bewegen(String richtung) {

		
		System.out.println("Alte Spielerposition: " + spielerPosition);
		int[] badpositions = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 19, 20, 29, 30, 39, 40, 49, 50, 59, 60, 69, 70, 79, 80,
				89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 };

		

			if (false) {
				System.out.println("Spielfeldrand erreicht!");

			}

			else {
				switch (richtung) {
				case "rechts":
					spielerPosition += 1;
					break;
				case "links":
					spielerPosition -= 1;
					break;
				case "unten":
					spielerPosition += 10;
					break;
				case "oben":
					spielerPosition -= 10;
					break;
				default : 
					break;

				}
			}

			System.out.println("Neue Spielerposition: " + spielerPosition);
		}

	
	
	public Stadt(int spielerPosition) {
		this.spielerPosition=spielerPosition;
	}

	
	
	public Stadt() {
		// TODO Auto-generated constructor stub
	}

	
	
	
}
