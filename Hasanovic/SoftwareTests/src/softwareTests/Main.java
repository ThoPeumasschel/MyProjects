package softwareTests;
/*
 * 		SOFTWARETESTS:
 * 
 * 
 * 			-> Was ist ein Fehler(bezogen auf Software)?
 * 
 * 
 * 				-> Jede Abweichung von der Spezifikation der Software ist ein Fehler
 * 
 * 
 * 			-> Was ist das Ziel von Tests?
 * 
 * 
 * 				-> Das Auffinden von Fehlern
 * 
 * 				-> Das Testen von Software ist IMMER ein Stichprobenverfahren!
 * 
 * 				-> Softwaretesten zeigt immer nur die Anwesenheit von Fehlern, kann jedoch niemals ihre Abwesenheit beweisen/aufzeigen
 * 
 * 
 * 				-> Wann gilt eine Software als sehr stabil(wieviele Fehler pro 1000 Zeilen Code)?
 * 
 * 						0,5/1000 -> stabile Software
 * 
 * 
 * 				
 * 			-> Was sind das für Fehler?
 * 
 * 				-> Syntaxfehler, Laufzeitfehler, Logische Fehler -> Designschwächen/Designfehler/Spezifikationsfehler ...
 * 
 * 
 * 			-> Wichtige Begriffe:
 * 
 * 
 * 				-> Testfall -> test case
 * 
 * 					-> Jeder Testfall bezieht sich immer auf ein konkretes, definiertes Testobjekt
 * 
 * 					-> Abhängig davon, wie und unter welchen Aspekten das Testobjekt getestet werden soll, formuliert ein Testfall
 * 					  eine Reihe von Vor- und Nachbedingungen(inklusive Eingabe- u. Ausgabewerte)
 * 				
 * 
 * 				-> Testobjekt:
 * 
 * 					-> Etwas, auf was sich Testfälle konkret beziehen können(Modul, Methode, Klasse, Paket, DB-Verbindung, Dokument....)
 * 
 * 
 * 
 * 			-> Unterschiedliche Formen von Testfällen:
 * 
 * 
 * 				-> Spezifizierte Testfälle:
 * 
 * 
 * 					-> Wie agiert mein Testobjekt bei ERWARTETEN Werten?
 * 
 * 
 * 
 * 				-> Nicht-spezifiziert:
 * 
 * 					-> Nicht erwartet Werte
 * 			
 * 
 * 
 * 		-> Debugging
 * 
 * 			-> Debugging ist weder Testen von Software, noch das Beheben von Fehlern!!!
 * 
 * 				-> Debugging kann dabei helfen, die in Softwaretests gefundenen Fehler zu lokalisieren
 * 
 * 
 * 
 * 		-> Ein gefundener Fehler sollte immer nach strengen Kriterien verschriftlicht werden!
 * 
 * 		
 * 			- Was ist passiert?
 * 
 * 			- Wer hat wann unter welchen Umständen getestet?
 * 
 * 			- Wo ist der Fehler aufgetreten(Komponente? Testobjekt?)
 * 
 * 			- Fehler-ID
 * 
 * 			- Priorisierung
 * 
 * 			- Status? 
 * 
 * 			
 * 				
 * 		-> Wichtige Dokumente im Rahmen des Softwaretestens:
 * 
 * 
 * 			1. Testpläne 
 * 
 * 			2. Testspezifikation
 * 
 * 			3. Testberichte
 * 
 * 
 * 		
 * 		-> Was sind die Prinzipien des Softwaretestens?
 * 
 * 			1. Jeder Test muß systematisch geplant sein
 * 			2. Müssen reproduzierbar sein
 * 			3. Müssen nachvollziehbar sein
 * 			4. Tests müssen kontrolliert und systematisch durchgeführt werden
 * 			5. Dokumentiert
 * 			6. Wenn möglich, dann automatisiert
 * 
 * 
 * *--------------------------------------------------------------------------------------
 * 
 * 		-> Wie testet man Software?
 * 
 * 			-> Es gibt unterschiedliche Testverfahren
 * 
 * 
 * 				-> Fragestellung: Wie sind meine Testfälle aufgebaut?
 * 
 * 
 * 					-> Grobe Einteilung:
 * 
 * 
 * 						1. Statische Tests("vor" der Laufzeit)
 * 						2. Dynamische Tests(zur Laufzeit)
 * 
 * 
 * 
 * 
 * 
 * 				1. Statische Testverfahren:
 * 
 * 
 * 					- Code Review -> Statische, systematische Codeanalyse
 * 
 * 						-> Was wird hier statische betrachtet?
 * 
 *  						a) Ablaufwege
 * 							b) Schnittstellen
 * 							c) Variablenoperationen(Berechnungen, Zuweisungen, Typkonvertierungen....)
 * 							d) Kommentare
 * 							e) Ausnahmebehandlung
 * 							f) Kontrollstrukturen im Allgemeinen(Schleifenköfpe, switch-cases....)
 * 
 * 
 * 
 * 					- Einen Teil davon können Compiler und/oder bestimmte Frameworks übernehmen
 * 
 * 							-> In Java: Checkstyle, FindBugs
 * 					
 * 				
 * 
 * 				2. Dynamische Testverfahren:
 * 
 * 
 * 					-> Zwei große Gruppen:
 * 
 * 
 * 						1. Funktionsorientierte, dynamische Tests
 * 						2. Strukturorientierte, dynamische Tests
 * 
 * 
 * 				
 * 
 * 
 * 				
 * 					1. Funktionsorientierte, dynamische Tests(Black Box):
 * 
 * 						-> Prüfen, ob eine Gruppe von Eingabewerten Ausgabewerte produziert im Testobjekt, welche den im Testfall festegelegten
 * 						   Erwartungen entsprechen
 * 						
 * 
 * 						-> Diese Werte-Gruppen nennt man auch Äquivalenzgruppen/Äquivalenzklassen
 * 			
 * 
 * 						Äquivalenzklasse paramA { 0, 1, 100, 101, -1, -101  } 
 * 
 * 							-> Ganz oft Grenzwerte(Grenzwertanalyse)
 * 
 * 
 * 
 * 							-> Beispiel: Anforderung -> "Ein User muss sein Alter eingeben, allerdings nur zwischen 16 und 120"
 * 
 * 
 * 								-> Testfall für diese Anforderung:
 * 
 * 									a) Äquivalenzklasse spezifiziert
 * 											
 * 										alter { 16, 17, 18, ...., 120 }
 * 
 * 
 * 									b) Äquivalenzklasse non-spezifiziert
 * 
 * 										alter { 15, 14, ..., 121, 122, .... }
 * 
 * 
 * 
 * 					2. Strukturorientierte, dynamische Tests(White Box)
 * 
 * 						-> Hier wird die innere Code-Struktur des jeweiligen Testobjekts zur Laufzeit geprüft
 * 
 * 
 * 						-> Überdeckung ist hier das Testmittel:
 * 
 * 							-> Überdeckung bedeutet, dass bestimmte Codestrukturen mindestens einmal zur Laufzeit betreten werden unter 
 * 						       Berücksichtigung der entsprechenden Erwartungen
 * 
 * 
 * 							-> Zweigüberdeckung
 * 							-> Anweisungsüberdeckung
 * 							-> Bedingungsüberdeckung
 * 							-> Pfadüberdeckung
 * 
 * 
 * 					-> C0-Test -> Anweisungsüberdeckung
 * 						-> Testfall so definieren, dass jede Anweisung im Testobjekt mindestens einmal ausgeführt wird
 * 
 * 
 * 					-> C1-Test -> Zweigüberdeckung(Verzweigungen, if-else if-Konstrukte)
 * 
 * 						-> Jeder Zweig mindestens einmal betreten
 * 
 * 
 * 					-> C2-Test -> Pfadüberdeckung
 * 
 * 
 * 					-> C3-Test -> Bedingungsüberdeckung
 * 
 * 						-> ATOMARE Bedingungen alle mind. einmal erfüllen
 * 
 * 
 * 							if(a>=5 && c<10)
 * 
 * 					
 * 	
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Main 
{
	static int wert=2;
	public static void main(String[] args) 
	{
		
		//Asserts
		//-> Eine Annahme des Entwicklers zu einem spezifischen Aspekt des Programms
		assert wert>2 : "Wert ist nicht groesser 2";
		//assert args.length == 2 : "Start mit weniger oder mehr als 2 Argumente";
		
		

	}

}
