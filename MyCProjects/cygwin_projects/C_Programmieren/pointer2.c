#include<stdio.h>

int main() {
	int a[5] = {22, 33, 44, 55, 66};
	int *ptr = NULL;

	ptr = a; // points to first array element

	printf("Value %d at %p\n", *ptr, ptr);
	ptr++;
	printf("Value %d at %p\n", *ptr, ptr);
	ptr +=3;
	printf("Value %d at %p\n", *ptr, ptr);
	ptr--;
	printf("Value %d at %p\n", *ptr, ptr);
	ptr -= 2;
	printf("Value %d at %p\n", *ptr, ptr);
}
