#include <stdio.h> 
#include <math.h>
 
int main(void)
{
    /* Konstante Pi definieren */
    const double Pi = 3.141592653;
	
    /* Variablen definieren */
    double winkel;
    double rad;
    double sinus;
    int i;
	
    printf("Programm zur Berechnung der Sinusfunktion in 10er Schritten\n");
    printf("Winkel   Sinus des Winkel\n");
 
    /* Schleife zur Berechnung der Sinuswerte */
    for (i = 0; i <= 72; i++)
    {
        winkel = 5 * i;         /* 10er Schritte berechnen */
		
        rad = winkel * Pi / 180; /* Berechnen des Bogenmaßwinkels */
        sinus = sin(rad);
 
        printf("%5g  %5.3f\n", winkel, sinus); /* tabellarische Ausgabe */
    }
	
    return 0;
}
