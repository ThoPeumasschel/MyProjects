#include<stdio.h>

int main() {
	int zahl;
	int *ptr;
	zahl = 88;
	ptr = &zahl;

	printf("Der Wert von zahl ist \t\t%i\n", zahl);
	printf("Die Adresse von Zahl ist \t%p\n", ptr);
	printf("Die Groesse von ptr ist \t%d\n", (int)sizeof(ptr));
	printf("Die Adresse von ptr ist \t%p\n", &ptr);
	printf("Die Groesse von int ist \t%ld\n", sizeof(int));

}
