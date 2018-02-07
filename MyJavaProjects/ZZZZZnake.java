/*
 *
 *
 * Spieler, Schlange, Gold und Tür sollen auf Zufallskoordinaten gesetzt werden.
 * Erledigt!
 * Statt nur eines Stücks Gold soll es zwei Stücke geben.
 * Erledigt!
 * Statt einer Schlange soll es zwei Schlangen geben.
 * Erledigt!
 * Mit zwei Schlangen und zwei Stücken Gold kann es etwas eng für den Spieler werden. 
 * Er soll daher 5 Züge machen können, ohne dass die Schlangen sich bewegen.
 *
 * Für Vorarbeiter: Das Programm, das bisher nur eine Methode ist, 
 * soll in verschiedene Untermethoden aufgespalten werden.
 *
 *
 */

import java.awt.Point;
import java.util.Arrays;


public class ZZZZZnake {


	public static void main( String[] args ) {
		Point playerPosition = new Point( (int)(Math.random() * 40), (int)(Math.random() * 10) );
		Point snake1Position = new Point( (int)(Math.random() * 40), (int)(Math.random() * 10) );
//		Point snake2Position = new Point( (int)(Math.random() * 40), (int)(Math.random() * 10) );
		Point gold1Position = new Point(  (int)(Math.random() * 40), (int)(Math.random() * 10) );
		Point gold2Position = new Point(  (int)(Math.random() * 40), (int)(Math.random() * 10) );
		Point doorPosition = new Point(  (int)(Math.random() * 40), (int)(Math.random() * 10) );
		int rich = 0;

		while ( true ) {

		// Raster mit Figuren zeichnen

			for ( int y = 0; y < 10; y++ ) {
				for ( int x = 0; x < 40; x++ ) {
					Point p = new Point( x, y );
				if ( playerPosition.equals( p ) )
					System.out.print( '&' );
				else if ( snake1Position.equals( p ) )
					System.out.print( 'S' );
//				else if ( snake2Position.equals( p ) )
//					System.out.print( 'S' );
				else if ( gold1Position.equals( p ) )
					System.out.print( '$' );
				else if ( gold2Position.equals( p ) )
					System.out.print( '$' );
				else if ( doorPosition.equals( p ) )
					System.out.print( '#' );
				else System.out.print( '.' );
			}
			System.out.println();
		}

		// Status feststellen
		if ( rich == 2 && playerPosition.equals( doorPosition ) ) {
			System.out.println( "Gewonnen!" );
			return;
		}
		if ( playerPosition.equals( snake1Position ) ) {
			System.out.println( "ZZZZZZZ. Die Schlange hat dich!" );
			return;
		}
//		if ( playerPosition.equals( snake2Position ) ) {
//			System.out.println( "ZZZZZZZ. Die Schlange hat dich!" );
//			return;
//		}
		if ( playerPosition.equals( gold1Position ) ) {
			rich += 1;
			gold1Position.setLocation( -1, -1 );
		}
		if ( playerPosition.equals( gold2Position ) ) {
			rich += 1;
			gold2Position.setLocation( -1, -1 ); 
		}
		if ( playermoves = 5 ) {
			snakeStart = true;

		// Konsoleneingabe und Spielerposition veraendern			

//		Point up = Math.max( 0, playerPosition.y - 1 );
//		Point down = Math.min( 9, playerPosition.y + 1 );
//		Point left = Math.max( 0, playerPosition.x - 1 );
//		Point right = Math.min( 39, playerPosition.x + 1 );
//		Point ul = up + left;  
//		Point dl = down + left;
//		Point ur = up + right;
//		Point dr = down + right;

		switch ( new java.util.Scanner( System.in ).next() ) {
			// Spielfeld ist im Bereich 0/0 .. 39/9
			// Steuerung geändert: hoch=i, runter=k, links=j, rechts=l
			case "8" : playerPosition.y = Math.max( 0, playerPosition.y - 1 ); break;
			case "2" : playerPosition.y = Math.min( 9, playerPosition.y + 1 ); break;
			case "4" : playerPosition.x = Math.max( 0, playerPosition.x - 1 ); break;
			case "6" : playerPosition.x = Math.min( 39, playerPosition.x + 1 ); break;
			case "7" : playerPosition.x = Math.max( 0, playerPosition.x - 1 ); 
					   playerPosition.y = Math.max( 0, playerPosition.y - 1 ); break;
			case "1" : playerPosition.x = Math.max( 0, playerPosition.x - 1 ); 
					   playerPosition.y = Math.min( 9, playerPosition.y + 1 ); break;
			case "9" : playerPosition.x = Math.min( 39, playerPosition.x + 1 ); 
					   playerPosition.y = Math.max( 0, playerPosition.y - 1 ); break;
			case "3" : playerPosition.x = Math.min( 39, playerPosition.x + 1 ); 
					   playerPosition.y = Math.min( 9, playerPosition.y + 1 ); break;
		}

		// Schlange1 bewegt sich in Richtung Spieler

		if ( playerPosition.x < snake1Position.x )
			snake1Position.x--;
		if ( playerPosition.x > snake1Position.x )
			snake1Position.x++;
		if ( playerPosition.y < snake1Position.y )
			snake1Position.y--;
		if ( playerPosition.y > snake1Position.y )
			snake1Position.y++;
		// Schlange2 bewegt sich in Richtung Spieler
/*		if ( playerPosition.x < snake2Position.x )
			snake2Position.x--;
		else if ( playerPosition.x > snake2Position.x )
			snake2Position.x++;
		if ( playerPosition.y < snake2Position.y )
			snake2Position.y--;
		else if ( playerPosition.y > snake2Position.y )
			snake2Position.y++;								*/
		} // end while
	}
}

