package klassen;

public class Stadt {

	// Die Stadt, in welcher die Charktere verteilt werden sollen, ist intern in
	// Planquadrate aufgeteilt.
	// Es ist im Grunde ein Spielfeld von 10x10 Planquadraten. Jedes Planquadrat
	// kann maximal einen Charakter aufnehmen.

	// Charakter[] planquadrate = new Charakter[100];
	// int[][] spielerPosition = new int[10][10];

	public Planquadrat[] planquadrat = new Planquadrat[100];

	public Planquadrat[] getPlanquadrat() {
		return planquadrat;
	}

	public void setPlanquadrat(Planquadrat[] planquadrat) {
		this.planquadrat = planquadrat;
	}

}
