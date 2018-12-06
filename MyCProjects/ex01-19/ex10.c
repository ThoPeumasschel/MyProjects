#include <stdio.h>
#include<ctype.h>

int main(int argc, char *argv[])
{
    if (argc != 2) {
        printf("ERROR: You need one argument.\n");
        // this is how you abort a program
        return 1;
    }

    int i = 0;
    for (i = 0; argv[1][i] != '\0'; i++) {
        char letter = tolower(argv[1][i]);
	//	printf("That's what I got: %d", letter);
        switch (letter) {
            case 'a':
//            case 'A':
                printf("%d: 'a'\n", i);
                break;

            case 'e':
//            case 'E':
                printf("%d: 'e'\n", i);
                break;

            case 'i':
//            case 'I':
                printf("%d: 'i'\n", i);
                break;

            case 'o':
//            case 'O':
                printf("%d: 'o'\n", i);
          		break; 

            case 'u':
//            case 'U':
                printf("%d: 'u'\n", i);
                break;

            case 'y':
//            case 'Y':
                if (i > 2) {
                    // it's only sometimes Y
                    printf("%d: 'y'\n", i);
                }
                break;

            default:
                printf("%d: %c is not a vowel\n", i, letter);
        }
    }

    return 0;
}
