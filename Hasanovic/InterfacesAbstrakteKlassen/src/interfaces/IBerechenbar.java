package interfaces;
/*
 * 	Wichtige Einsatzfelder f�r Schnittstellen:
 * 
 * 
 * 	1. Schaffung gemeinsamer F�higkeiten(Methoden) �ber unterschiedliche Vererbungsstrukturen hinweg
 * 
 * 	2. Kapselung(Wenn man nach aussen eine Schnittstelle anbietet, kann in der eigenen Struktur nur das an Methoden aufgerufen werden,
 * 	   was die Schnittstelle auch anbietet)
 * 
 * 	3. Als Flag/Signalgeber --> Man signalisiert, dass bestimmte Klassen etwas spezifisches d�rfen oder halt nicht(wenn das Interface nicht
 *     implementiert ist)
 * 
 * 	
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
public interface IBerechenbar {

	double berechneOberFlaeche();
}
