#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x,y;
    for(x=1;x<=10;x++) {
        printf("\n");
        for(y=1;y<=10;y++)
            printf("%4i",x*y);
    }
    printf("\n\n");
    return 0;
}
