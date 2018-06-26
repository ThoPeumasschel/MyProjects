package compositumVisitor;

// -> WAS SOLL BEIM BESUCH DES VISITORS PASSIEREN? 
//hier stehen methoden, welche beim besuch einer jeden komponente der struktur aufgerufen werden sollen
public class KartonVisitor implements IKartonVisitor
{

	// konkrete besucher-methoden, haben üblicherweise das präfix "visit"
	@Override
	public void visitTextKarton(KartonText k)
	{
		System.out.println("Textkarton mit dem Inhalt: " + k.getInhalt() + ", der Bezeichnung: " + k.getBezeichnung()
				+ " und dem Parent: " + k.getParent().getBezeichnung());

	}

	@Override
	public void visitGanzzahlKarton(KartonGanzzahl k)
	{
		System.out.println("Zahlenkarton mit dem Inhalt: " + k.getInhalt() + ", der Bezeichnung: " + k.getBezeichnung()
				+ " und dem Parent: " + k.getParent().getBezeichnung());

	}

}
