#include <stdio.h>
#include <stdlib.h>
#include<string.h>

main()
{
    printf("Hello world!\n\n");
    char satz[80];
    printf("\nBitte einen Satz eingeben\n>");
    gets(satz);
    printf("\n%s", satz);
    printf("\nDer Satz besteht aus %i Zeichen.", strlen(satz));
    printf("\n\nsatz[5] enthaelt eine binaere Null.\n");
    satz[5]='\0';
    printf("\n%s", satz);
    printf("\nDer Satz besteht aus %i Zeichen.", strlen(satz));


    return 0;
}
