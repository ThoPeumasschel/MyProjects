package klassen;

public class Planquadrat
{

	// Die Planquadrate sind intern auch durchnummeriert: Beginnend mit dem oberen
	// links(Nr. 1) und
	// endend mit dem untersten rechts(Nr. 100), wobei von links nach rechts
	// nummeriert wird.

	// Die Planquadrate dienen also intern zur Verwaltung des Stadtgebietes und des
	// Aufenthaltortes
	// eines jeden Charakters.

	private int planquadratID; // von 1 - 100

	public Charakter c;

	public int getPlanquadratID()
	{
		return planquadratID;
	}

	public void setPlanquadratID(int planquadratID)
	{
		this.planquadratID = planquadratID;
	}

	public Charakter getC()
	{
		return c;
	}

	public void setC(Charakter c)
	{
		this.c = c;
	}

}
