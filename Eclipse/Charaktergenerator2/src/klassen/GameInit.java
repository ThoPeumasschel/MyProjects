package klassen;

import java.util.Random;

public class GameInit
{

    Stadt s = new Stadt();

    public void zeigeSpielerAufsteigend()
    {

	for (int i = 0; i < 99; i++)
	{
	    if (s.getPlanquadrat()[i].getC() != null)
		System.out.println("PlanquadratID: " + s.planquadrat[i].getC().getSpielerPosition()
			+ "\nSpielerposition: " + s.planquadrat[i].getC().getSpielerPosition() + "\nSpielerID: "
			+ s.planquadrat[i].getC().getSpielerID() + "\nName: \t" + s.planquadrat[i].getC().getName()
			+ "\nSex: \t" + s.planquadrat[i].getC().getGeschlecht() + "\nGabe: \t"
			+ s.planquadrat[i].getC().getSpezielleGabe() + "\nWaffe: \t"
			+ s.planquadrat[i].getC().getWaffe() + "\n");

	}

    }

    public void zeigeSpielerAbsteigend()
    {

	for (int i = 99; i > 0; i--)
	{
	    if (s.getPlanquadrat()[i].getC() != null)
		System.out.println("PlanquadratID: " + s.planquadrat[i].getC().getSpielerPosition()
			+ "\nSpielerposition: " + s.planquadrat[i].getC().getSpielerPosition() + "\nSpielerID: "
			+ s.planquadrat[i].getC().getSpielerID() + "\nName: \t" + s.planquadrat[i].getC().getName()
			+ "\nSex: \t" + s.planquadrat[i].getC().getGeschlecht() + "\nGabe: \t"
			+ s.planquadrat[i].getC().getSpezielleGabe() + "\nWaffe: \t"
			+ s.planquadrat[i].getC().getWaffe() + "\n");

	}

    }

    public void searchByID(int id)
    {

	for (int i = 0; i < 99; i++)
	{
	    if (s.getPlanquadrat()[i].getC() != null && s.planquadrat[i].getC().getSpielerID() == id)
		System.out.println("PlanquadratID: " + s.planquadrat[i].getC().getSpielerPosition()
			+ "\nSpielerposition: " + s.planquadrat[i].getC().getSpielerPosition() + "\nSpielerID: "
			+ s.planquadrat[i].getC().getSpielerID() + "\nName: \t" + s.planquadrat[i].getC().getName()
			+ "\nSex: \t" + s.planquadrat[i].getC().getGeschlecht() + "\nGabe: \t"
			+ s.planquadrat[i].getC().getSpezielleGabe() + "\nWaffe: \t"
			+ s.planquadrat[i].getC().getWaffe() + "\n");

	}

    }

    // public void bewegeSpieler(String richtung) {
    //
    // System.out.println("Alte Spielerposition: " + s.getPlanquadrat());
    // int[] badpositions = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 19, 20, 29, 30, 39,
    // 40, 49, 50, 59, 60, 69, 70, 79, 80,
    // 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 };
    //
    // if (false) {
    // System.out.println("Spielfeldrand erreicht!");
    //
    // }
    //
    // else {
    // switch (richtung) {
    // case "rechts":
    // spielerPosition += 1;
    // break;
    // case "links":
    // spielerPosition -= 1;
    // break;
    // case "hoch":
    // spielerPosition -= 10;
    // break;
    // case "tief":
    // spielerPosition += 10;
    // break;
    // default:
    // break;
    //
    // }
    // }
    //
    // System.out.println("Neue Spielerposition: " + spielerPosition);
    // }

    public void planquadrateErzeugen()
    {

	for (int i = 0; i < 100; i++)
	{
	    s.planquadrat[i] = new Planquadrat();
	}

    }

    public void charakterAufPlanquadratZuweisen()
    {

	for (int i = 0; i < 12; i++)
	{
	    int planquadratID = new Random().nextInt(99);
	    s.planquadrat[planquadratID].setC(new Charakter(planquadratID));
	    s.getPlanquadrat()[i].getPlanquadratID();

	}

    }

    // public void starten(Stadt stadt) {
    //
    // this.planquadrateErzeugen();
    // this.charakterAufPlanquadratZuweisen();
    //
    // }

}
