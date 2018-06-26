package test;

import compositumVisitor.KartonContainer;
import compositumVisitor.KartonGanzzahl;
import compositumVisitor.KartonText;
import compositumVisitor.KartonVisitor;

/*
 * 	Das Entwurfsmuster Visitor:
 * 
 * 		-> Bietet die Möglichkeit, mit OOP-Mitteln Compositum-Strukturen mit einem Visitor-Objekt zu durchlaufen
 * 		-> Dafür wird in eine bestehende Compositum-Struktur das Visitor-Pattern "eingewoben"
 * 
 */
public class Main
{

	public static void main(String[] args)
	{

		// karton-struktur aufbauen
		KartonContainer root = new KartonContainer("root");
		KartonContainer kiste = new KartonContainer("Kiste");

		KartonGanzzahl gz = new KartonGanzzahl(2, "ZweiKarton");
		KartonText txt = new KartonText("Text", "TextKarton");
		KartonText wort = new KartonText("Wort", "WortKarton");

		// in root:
		root.addKarton(gz);
		root.addKarton(kiste);
		// in kiste:
		kiste.addKarton(txt);
		kiste.addKarton(wort);
		;

		KartonVisitor kv = new KartonVisitor();
		root.accept(kv);

	}

}
