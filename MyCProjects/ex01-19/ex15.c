#include <stdio.h>
#include "dbg.h"

int main(int argc, char *argv[])
{
    // create two arrays we care about
    int ages[] = { 23, 43, 12, 89, 2 };
    char *names[] = {
        "Alan", "Frank",
        "Mary", "John", "Lisa"
    };
    // safely get the size of ages
    int count = sizeof(ages) / sizeof(int);
	printf("sizeof(ages): %lu\n", sizeof(ages));
	printf("sizeof(int): %ld\n\n", sizeof(int));
	debug("count (entries in ages) = %d\n", count);
	int i = 0;

    // first way using indexing
    for (i = 0; i < count; i++) {
        printf("%s has %d years alive.\n", names[i], ages[i]);
    }

    printf("----------\n");

    // setup the pointers to the start of the arrays
    int *cur_age = ages;
    char **cur_name = names;
	debug("print *cur_age with %%d: %d", *cur_age);
	debug("print *cur_age with %%p: %p", *cur_age);
	debug("print **cur_name with %%d: %d", **cur_name);
	debug("print **cur_name with %%d: %p", **cur_name);
	debug("print *cur_name with %%s: %s", *cur_name);

    // second way using pointers
    for (i = 0; i < count; i++) {
        printf("%s is %d years old.\n",
                *(cur_name + i), *(cur_age + i));
    }

    printf("----------\n");

    // third way, pointers are just arrays, but only for reading!!!
    for (i = 0; i < count; i++) {
        printf("%s is %d years old again.\n", cur_name[i], cur_age[i]);
    }

    printf("----------\n");

    // fourth way with pointers in a stupid complex way
    for (cur_name = names, cur_age = ages;
            (cur_age - ages) < count; cur_name++, cur_age++) {
        printf("%s lived %d years so far.\n", *cur_name, *cur_age);
    }

    return 0;
}
