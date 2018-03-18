#include <stdio.h>
#include <stdlib.h>

int main()
{
    int zeile, spalte;
    for(zeile=39;zeile>=0;zeile-=2) {
        for(spalte=1;spalte<=zeile;spalte++)
            printf("*");
        printf("\n");
    }
    return 0;
}
