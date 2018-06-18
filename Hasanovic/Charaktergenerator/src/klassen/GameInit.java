package klassen;

import java.util.Random;

import javax.swing.JOptionPane;

public class GameInit
{

    Stadt s = new Stadt();

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
	    Charakter ch = new Charakter()
	    {
		public void erzeugeCharakter(int planquadratID)
		{
		    this.setSpielerPosition(planquadratID);
		    this.setName(Name.values()[new Random().nextInt(Name.values().length)]);
		    this.setGeschlecht(Geschlecht.values()[new Random().nextInt(Geschlecht.values().length)]);
		    this.setSpezielleGabe(SpezielleGabe.values()[new Random().nextInt(SpezielleGabe.values().length)]);
		    this.setWaffe(Waffe.values()[new Random().nextInt(Waffe.values().length)]);
		    this.setSpielerPosition(getSpielerPosition());
		    this.setSpielerID(index);

		    System.out.println(index + ". Charakter " + this.getName() + " erzeugt auf Planquadrat "
			    + this.getSpielerPosition());
		    index++;
		}
	    };

	    ch.erzeugeCharakter(planquadratID);

	    s.planquadrat[ch.getSpielerPosition()].setC(ch);
	    s.getPlanquadrat()[i].getPlanquadratID();

	}

    }

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

    public void searchByID()
    {

	int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Welche CharakterID möchten Sie suchen?"));

	for (int i = 0; i < 99; i++)
	{
	    if (s.getPlanquadrat()[i].getC() != null && s.planquadrat[i].getC().getSpielerID() == id)
		JOptionPane.showMessageDialog(null, "PlanquadratID: " + s.planquadrat[i].getC().getSpielerPosition()
			+ "\nSpielerposition: " + s.planquadrat[i].getC().getSpielerPosition() + "\nSpielerID: "
			+ s.planquadrat[i].getC().getSpielerID() + "\nName: \t" + s.planquadrat[i].getC().getName()
			+ "\nSex: \t" + s.planquadrat[i].getC().getGeschlecht() + "\nGabe: \t"
			+ s.planquadrat[i].getC().getSpezielleGabe() + "\nWaffe: \t"
			+ s.planquadrat[i].getC().getWaffe() + "\n");

	}

    }

    public int searchByID(int id)
    {

	int planqu = 0;
	for (int i = 0; i < 99; i++)
	{
	    if (s.getPlanquadrat()[i].getC() != null && s.planquadrat[i].getC().getSpielerID() == id)
		planqu = i;

	}
	return planqu;
    }

    public void bewegeSpieler()
    {

	String richtung = JOptionPane.showInputDialog("Welche Richtung? \nnord, ost, west oder süd?");
	int id = Integer.parseInt(JOptionPane.showInputDialog(null,
		"Welchen Charakter möchten Sie bewegen?\nBitte Nummer zwischen 1 und 12 eingeben"));

	for (int i = 0; i < 99; i++)
	{
	    if (s.getPlanquadrat()[i].getC() != null && s.planquadrat[i].getC().getSpielerID() == id)
	    {

		int planquadrat = s.planquadrat[i].getPlanquadratID();
		int spielerPosition = s.planquadrat[i].getC().getSpielerPosition();
		System.out.println("Spieler Nr. " + id + " gefunden, Richtung: " + richtung + "en");
		System.out.println("Spieler " + id + " befand sich auf Planquadrat " + planquadrat);

		int[] notOst = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int[] notWest = { 1, 11, 21, 31, 41, 51, 61, 71, 81, 91 };
		int[] notNord = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] notSued = { 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };

		switch (richtung)
		{
		case "ost":
		    for (int not : notOst)
		    {
			if (planquadrat != not)
			    s.planquadrat[i].getC().setSpielerPosition(spielerPosition += 1);
		    }
		    break;
		case "west":
		    for (int not : notWest)
		    {
			if (planquadrat != not)
			    s.planquadrat[i].getC().setSpielerPosition(spielerPosition -= 1);
		    }
		    break;
		case "nord":
		    for (int not : notNord)
		    {
			if (planquadrat != not)
			    s.planquadrat[i].getC().setSpielerPosition(spielerPosition -= 10);
		    }
		    break;
		case "süd":
		    for (int not : notSued)
		    {
			if (planquadrat != not)
			    s.planquadrat[i].getC().setSpielerPosition(spielerPosition += 10);
		    }
		    break;
		default:
		    System.out.println("Hier geht's nicht weiter, der Spieler befindet sich am Spielfeldrand!");

		    break;

		}

		System.out.println("Neue Spielerposition: " + s.planquadrat[i].getC().getSpielerPosition()
			+ "\nPlanquadratID: " + this.searchByID(id));
	    }

	}
    }

}
