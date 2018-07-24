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
 * 				- Repository: Speicherort f�r die Versionen eines Dokuments
 * 
 * 				- Master: Hauptentwicklungszweig
 * 
 * 				- Branch: Nebenentwicklungsast
 * 
 * 				- Jeder Branch hat immer eine aktuelle Version des Entwicklungsstandes: Head
 * 
 * 				- Merge: Das Verschmelzen/Zusammenf�hren verschiedener Entwicklungszweige zu einem
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
 * 			- Es existieren unz�hlige Git-Clients
 * 
 * 			- GitHub, Bitbucket... -> Dienste im Internet, welche das Verwalten von Remote-Repositories erlauben
 * 
 * 			- Git ist DEZENTRAL
 * 
 * 			-> Git arbeitet f�r die ordentliche Versionkontrolle aller Dateien mit Hash-Werten
 * 			
 * 				-> Zu jeder �nderung wird aus dem Inhalt der ge�nderten Datei und deren Meta-Daten(Schreibrechte, Autoren...)
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
 * 					-> �blicherweise wird vom master ein Branch abgezweigt und in diesem lokal entwickelt
 * 
 * 					-> Nach einer Reihe von �nderungen vollzieht man immer wieder einen COMMIT in das lokale Repo
 * 
 * 				-> Der aktuelle Head des master steht dann idealerweise f�r
 * 			   f�r die aktuellste lokale Variante ihres Programmes!
 * 
 * 			-> Wenn das der Fall ist, kann man einen Push durchf�hren, um
 * 			   seinen lokalen master in das remote repo zu laden(PUSH)
 * 
 * 				-> Etwaige Konflikte m�ssen dann aufgel�st werden(Staging)
 * 
 * 			-> Wenn ein Entwickler die aktuelle remote-Variante des master
 * 			   bei sich lokal so haben m�chte, dass sein lokaler master
 * 			   �berschrieben wird, dann wird ein PULL durchf�hrt
 * 
 * 			-> Wenn ein Entwickler sich die aktuelle Variante des master lokal
 * 			   so anschauen m�chte, dass seine lokale Variante des master
 * 			   NICHT �BERSCHRIEBEN wird, dann wird ein FETCH durchgef�hrt
 * 				-> History anschauen, Unterschiede anschauen.....
 * 				
 * 			-> Wenn sie sich gerade in einem branch befinden und sich aber
 * 			   einen anderen anschauen wollen, m�ssen diesen anderen dazu erst
 * 			   auschecken(CHECKOUT)
 * 
 * 			-> Wenn ein branch B mit einem anderen branch A verschmolzen
 * 			   werden soll(MERGE), dann muss der branch A dazu per CHECKOUT
 * 			   ausgecheckt werden
 * 
 * 			-> Der branch, in welchem Sie sich gerade per CHECKOUT befinden,
 * 			   kann nicht gel�scht werden(sodern nur alle anderen nicht aus-
 * 			   gecheckten)
 * 
 *  			-> Working Directory: Der Ort, an welchem die Dateien ver�ndert werden.....
 *  
 *  				-> Git beobachtet NICHT AUTOMATISCH alles in einem Working Directory
 *  
 *  				-> Wenn Dateien von Git beobachtet werden:
 *  					- Sobald sich etwas �ndert, befindet sich die jeweilige Datei
 *  					  im Zustand "staged"
 *  					- Diese �nderungen liegen NOCH NICHT im Repository....erst nach 
 *  					  einem COMMIT werden diese �bernommen
 *  
 *  
 *  			-> Ein branch ist nichts anderes als ein Zeiger auf einen bestimmten COMMIT
 *  
 *  			-> Jeder COMMIT ist ein Zeiger auf seinen "Vater"-COMMIT(HEAD)
 
 
			EGit:
				Symbole in Eclipse:

				-> Eine Projektdatei hat folgendes Symbol: (Window -> Preferences -> Team -> Egit -> Label Decorations
					- ein gr�nes + bedeutet: Neue Datei hinzugef�gt, welche noch nicht von Git �berwacht wird
					- ein > bedeutet: Die �berwachte Datei wurde ver�ndert
					- ein Datenbanksymbol bedeutet: die Datei wird �berwacht
					- ein blaues Fragezeichen bedeutet: Die Datei wird noch nicht von Git �berwacht
 
 *  
 *  			Arbeiten mit COMMIT:
 *  
 *  				1. Szenario: Ich habe committed und etwas vergessen....
 *  					COMMIT nachbessern: Ammend
 *  
 *  				2. Szenario: Einen �lteren COMMIT durch einen Gegen-COMMIT ersetzen:
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
