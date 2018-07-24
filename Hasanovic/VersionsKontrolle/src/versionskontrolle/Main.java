package versionskontrolle;
/*
 * 	Versionskontrolle:
 * 
 * 		-> Ziele: 
 * 
 * 				- Konfliktfreie, verteilte Entwicklung/Bearbeitung von Dokumenten, Quellcodedateien...
 * 
 * 				- Die Entwicklungsgeschichte ist komplett, jederzeit nachlesbar
 * 
 * 				- Es gibt IMMER eine offizelle, aktuelle Variante eines Dokuments
 * 
 * 
 * 
 * 		-> Grundeigenschaften:
 * 
 * 				- Repository: Speicherort für die Versionen eines Dokuments
 * 
 * 				- Master: Hauptentwicklungszweig
 * 
 * 				- Branch: Nebenentwicklungsast
 * 
 * 				- Jeder Branch hat immer eine aktuelle Version des Entwicklungsstandes: Head
 * 
 * 				- Merge: Das Verschmelzen/Zusammenführen verschiedener Entwicklungszweige zu einem
 * 
 * 
 * 		-> Bekannte VKS:
 * 
 * 			-> SVN 
 * 
 * 			-> Team Foundation Server(Microsoft)
 * 
 * 			-> Git
 * 
 * 
 * 		-> GIT:
 * 
 * 			- Git ist open source
 * 
 * 			- Es existieren unzählige Git-Clients
 * 
 * 			- GitHub, Bitbucket... -> Dienste im Internet, welche das Verwalten von Remote-Repositories erlauben
 * 
 * 			- Git ist DEZENTRAL
 * 
 * 			-> Git arbeitet für die ordentliche Versionkontrolle aller Dateien mit Hash-Werten
 * 			
 * 				-> Zu jeder Änderung wird aus dem Inhalt der geänderten Datei und deren Meta-Daten(Schreibrechte, Autoren...)
 * 				   ein Hashwert generiert
 * 
 * 			
 * 				-> Jedes Git-Repository speichert seine Inhalte in Form von zwei Dateitypen in einer Objekt-DB:
 * 
 * 					- Tree -> Besteht aus einer Commit-Kette, hat Metainfos, Welche Dateien?, Hashes zu den Dateien...
 * 
 * 					- Blob -> Der eigentliche, textuelle Inhalt der Datei
 * 
 * 			
 * 			-> Wie arbeitet man mit Git?
 * 
 * 				- Jeder Entwickler erstellt/klont ein lokales Repository				
 * 
 * 					-> Üblicherweise wird vom master ein Branch abgezweigt und in diesem lokal entwickelt
 * 
 * 					-> Nach einer Reihe von Änderungen vollzieht man immer wieder einen COMMIT in das lokale Repo
 * 
 * 				-> Der aktuelle Head des master steht dann idealerweise für
 * 			   für die aktuellste lokale Variante ihres Programmes!
 * 
 * 			-> Wenn das der Fall ist, kann man einen Push durchführen, um
 * 			   seinen lokalen master in das remote repo zu laden(PUSH)
 * 
 * 				-> Etwaige Konflikte müssen dann aufgelöst werden(Staging)
 * 
 * 			-> Wenn ein Entwickler die aktuelle remote-Variante des master
 * 			   bei sich lokal so haben möchte, dass sein lokaler master
 * 			   überschrieben wird, dann wird ein PULL durchführt
 * 
 * 			-> Wenn ein Entwickler sich die aktuelle Variante des master lokal
 * 			   so anschauen möchte, dass seine lokale Variante des master
 * 			   NICHT ÜBERSCHRIEBEN wird, dann wird ein FETCH durchgeführt
 * 				-> History anschauen, Unterschiede anschauen.....
 * 				
 * 			-> Wenn sie sich gerade in einem branch befinden und sich aber
 * 			   einen anderen anschauen wollen, müssen diesen anderen dazu erst
 * 			   auschecken(CHECKOUT)
 * 
 * 			-> Wenn ein branch B mit einem anderen branch A verschmolzen
 * 			   werden soll(MERGE), dann muss der branch A dazu per CHECKOUT
 * 			   ausgecheckt werden
 * 
 * 			-> Der branch, in welchem Sie sich gerade per CHECKOUT befinden,
 * 			   kann nicht gelöscht werden(sodern nur alle anderen nicht aus-
 * 			   gecheckten)
 * 
 *  			-> Working Directory: Der Ort, an welchem die Dateien verändert werden.....
 *  
 *  				-> Git beobachtet NICHT AUTOMATISCH alles in einem Working Directory
 *  
 *  				-> Wenn Dateien von Git beobachtet werden:
 *  					- Sobald sich etwas ändert, befindet sich die jeweilige Datei
 *  					  im Zustand "staged"
 *  					- Diese Änderungen liegen NOCH NICHT im Repository....erst nach 
 *  					  einem COMMIT werden diese übernommen
 *  
 *  
 *  			-> Ein branch ist nichts anderes als ein Zeiger auf einen bestimmten COMMIT
 *  
 *  			-> Jeder COMMIT ist ein Zeiger auf seinen "Vater"-COMMIT(HEAD)
 
 
			EGit:
				Symbole in Eclipse:

				-> Eine Projektdatei hat folgendes Symbol: (Window -> Preferences -> Team -> Egit -> Label Decorations
					- ein grünes + bedeutet: Neue Datei hinzugefügt, welche noch nicht von Git überwacht wird
					- ein > bedeutet: Die überwachte Datei wurde verändert
					- ein Datenbanksymbol bedeutet: die Datei wird überwacht
					- ein blaues Fragezeichen bedeutet: Die Datei wird noch nicht von Git überwacht
 
 *  
 *  			Arbeiten mit COMMIT:
 *  
 *  				1. Szenario: Ich habe committed und etwas vergessen....
 *  					COMMIT nachbessern: Ammend
 *  
 *  				2. Szenario: Einen älteren COMMIT durch einen Gegen-COMMIT ersetzen:
 *  					Revert
 *  
 *  				3. Szenario: Ein bestimmter alter COMMIT soll ersetzt werden und alle
 *  				   Folge-COMMITS verworfen werden:
 *  					Reset (Vorsicht!)
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
 

public class Main {

	public static void main(String[] args) {
		System.out.println();
		int a=12;
		a++;
		int[] arr=new int[2];
		arr[0]=a;
		
		//wo ist denn die autoklasse?
		boolean auto=false;
		
		

	}

}
