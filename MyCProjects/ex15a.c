#include<stdio.h>
#include<string.h>

int main(/*int argc, char *argv[]*/) {
	int i = 0;
	char *names[]  = {"joe", "john", "Jack"};

	for(i = 0; i < strlen(names); i++)
	printf("printing names[%d]: %s\n", i, names[i]);

	int *address;
	address = &names;

	printf("print address of names: %p\n", address); 
	
	char *string1 = {"String mit Leerstellen"};
	char string2[] = {"String mit 1234"};
	printf("Print String1 and String2: %s, %s\n", string1, string2);
	
	int x = 25;
	int *xPtr;
	xPtr = &x;
	printf("x = %d\nxPtr = %p\naddress of xPtr = %p\n", x, xPtr, *&xPtr);


	return 0;
}
