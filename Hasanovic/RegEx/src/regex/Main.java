package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 	Regular Expressions(Regex), Reguläre Ausdrücke
 * 
 * 
 * 		-> Semantische Muster, welche Regeln für das Filtern von Zeichenketten, 
 * 		   das Suchen in Zeichenketten und so weiter beschreiben
 * 
 * 	   
 * 		Wichtige Symbole:
 * 
 * 		Symbol				Bedeutung
 * 		--------------------------------------------
 * 		*					mehrere beliebige Zeichen, oder kein Zeichen
 * 		.					genau EIN beliebiges Zeichen
 * 		+ 					mindestens ein beliebiges Zeichen
 * 		?					ein beliebiges Zeichen, oder kein Zeichen
 * 		\d					eine Ziffer
 * 		\D					Zeichen, welches KEINE Ziffer ist
 * 		\s					Leerzeichen
 * 		\S					Zeichen, welches KEIN Leerzeichen ist
 * 		\w					Zeichen welches Ziffer, oder Unterstrich, oder Buchstabe ist
 * 		()					Priorisierung mit Klammersetzung
 * 
 * 
 * 		Beispiele:
 * 
 * 
 * 		RegEx-Ausdruck		Bedeutung
 * 		-----------------------------------------------
 * 		Aa					A gefolgt von eine kleinem a
 * 		A*					beliebig viele A
 * 		*A					beliebig viele beliebige Zeichen, gefolgt von einem A
 * 		B?					ein B oder kein B
 * 		C+					midestens ein C
 * 		A | B				A oder B
 * 		^H					nicht H
 * 		[abc]				a oder b oder c
 * 		[a-f]				alle Zeichen zwischen a und f
 * 		[2-8]				alle Ziffern zwischen 2 und 8
 * 		[A-Fa-f]			alle Groß- und Kleinbuchstaben zwischen a und f
 * 		f(7)				7 Mal das f
 * 		\?					Das Fragezeichen
 * 	
 * 
 * 			Zeichenkette: "ratatatata"	Regex: "tat"
 * 
 * 				-> Zwei Treffer! Ein einmalig gefundener Treffer wird nicht mehr für die weiter Suche weiterverwendet!!!!
 * 
 * 
 * 		Was drückt folgender RegEx aus?
 * 
 * 			\d\d\d([-\s])?\d\d\d		-> 3 Ziffern, ein oder kein - / ein oder kein Leerzeichen, 3 Ziffern
 * 
 * 
 * 		Gefragt ist ein Regex, welcher Tags in HTML-Dokumenten erkennt:
 * 			Beispiel: <tr>Tabelle</tr>
 * 
 * 			Lösung:   (<.+>).*(</.+>)
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

		// reguläre ausdrücke in objekten verwalten
		Pattern muster = Pattern.compile("a*?bb"); // der übergebene ausdruck
													// wird compiliert bereit
													// gehalten
		Matcher match = muster.matcher("aaaaabbbbabb");
		// prüfen, ob es einen treffer gibt?
		boolean treffer = match.matches();
		if (treffer)
		{
			// alle möglichen treffer abarbeiten
			while (match.find())
			{
				System.out.println("Gefundene Zeichenkette: " + match.group()
						+ " an Position: " + match.start());
			}
		}

		// *************************************************
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String pattern = "\\d\\d";
		String token;
		do
		{
			token = scan.findInLine(pattern);
			System.out.println("Match: " + token);
		} while (token != null);

		String userEingabe = "Ich heisse bla blav l   'SELECT * FROM '---'";

	}

}
