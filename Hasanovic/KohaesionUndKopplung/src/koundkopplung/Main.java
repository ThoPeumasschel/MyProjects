package koundkopplung;

/*
 * 	Kohäsion und Kopplung:
 * 
 * 		-> Paradigmen für den OO-Entwurf
 * 
 * 		-> Kohäsion:
 * 
 * 			-> Qualitatives Maß für den inneren Zusammenhalt eines Software-Elements:
 * 
 * 				-> In eine Klasse, Methode, ein Modul...gehört NUR DAS, was sinngemäss auch in dieses Element passt, und sonst nichts!
 * 
 * 				-> Ziel ist HOHE KOHÄSION!
 * 
 * 					-> Probleme bei geringer Kohäsion:
 * 
 * 						- Code ist schwer lesbar und nachvollziehbar
 * 						- Code ist schwer zu testen
 * 						- Code ist schwer erweiterbar und wiederverwendbar
 * 
 * 
 * 
 * 		-> Kopplung:
 * 
 * 			-> Qualitatives Maß für die Aufrufabhängigkeit unter Methoden, Klassen, Modulen und weiteren Elementen einer Software
 * 
 * 
 * 				-> Je mehr Methode/Klassen usw. aufgerufen werden müssen, um ein Problem zu lösen, umso höher ist die Kopplung
 * 
 * 				-> Ziel ist GERINGE KOPPLUNG!
 * 
 * 					-> Probleme bei hoher Kopplung:
 * 
 * 						- Code ist schwer nachvollziehbar(komplexe Aufrufbeziehungen)
 * 						- Code ist schwer testbar
 * 
 * 
 * 
 * 		-> Es gibt eine widersprüchliche Wechselwirkung zwischen Kohäsion und Kopplung
 * 
 * 				-> Problem: Je höher die Kohäsion, umso höher die Kopplung!!!
 * 
 * 
 * 		-> Lösung: Ein ausgeglichenes Verhältnis zwischen hoher Kohäsion und geringer Kopplung!
 * 		
 * 
 * 
 */



public class Main {

	public static void main(String[] args) 
	{
		new Main();

	}

}
