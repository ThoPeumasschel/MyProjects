package composite;

/*
 * 	Das Entwurfsmuster Compositum:
 * 
 * 		-> Problem:
 * 
 * 			- Ineinander verschachtelte Objektstrukturen
 * 	
 * 			- Wie setzt man objektorientiert solche Strukturen wie Menüs, GUI-Oberflächen, Verzeichnissstrukturen usw. um?
 * 
 * 
 * 		-> Der Ansatz:
 * 
 * 			1. Es gibt mindestens eine abstrakte Superklasse, welche für alle Elemente der Struktur steht
 * 
 * 			2. Es gibt mindestens eine Containerklasse(kann entweder alle Container und alle Leafs aufnehmen)
 * 
 * 			3. Es gibt konkrete Elementklassen(Leafs)
 * 
 * 			4. In aller Regel wird die abstrakte Superklasse ein Interface implementieren, welches abstrakte Methode vorgibt, die in allen
 * 			   Klassen der Compositum-Struktur vorhanden sein sollen
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Main
{

	public static void main(String[] args)
	{
		// verzeichnisstruktur aufbauen
		Verzeichnis root = new Verzeichnis("root", 100);
		Verzeichnis home = new Verzeichnis("home", 100);
		Datei bewerbung = new Datei("bewerbung.pdf");

		home.addKomponente(bewerbung);
		root.addKomponente(home);

		// mit der einheitlichen schnittstelle eine ebene des verzeichnisses root
		// durchlaufen:
		IKomponente[] komponentenInRoot = root.getInhalt();
		for (int i = 0; i < komponentenInRoot.length; i++)
		{

			if (komponentenInRoot[i] != null)
				System.out.println(komponentenInRoot[i].getName() + " -> in " + komponentenInRoot[i].getParent());
		}

	}

}
