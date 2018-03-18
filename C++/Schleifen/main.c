#include <stdio.h>

int main()
{
    int x, anzahl;
    double zahl, summe=0.0, mittelw;
    printf("\n\tS T A T I S T I K\n");
    printf("\nWieviele Werte moechten Sie eingeben: ");
    scanf("%i", &anzahl);
    printf("\n");
    for(x=1; x<=anzahl; x++) {
        printf("Bitte %i. Zahl eingeben: ", x);
        scanf("%lf", &zahl);
        summe=summe+zahl;
    }
    mittelw=summe/anzahl;
    printf("\n\nSumme der Zahlen = %f", summe);
    printf("\nMittelwert der Zahlen = %f", mittelw);

    return 0;
}
