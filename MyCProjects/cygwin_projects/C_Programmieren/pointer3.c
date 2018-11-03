#include<stdio.h>

void swap(int *a, int *b);

int main() {
	int x = 25;
	int y = 100;

	printf("x is %d, y is %d\n", x, y);
	printf("address of x is %p, address of y %p\n", &x, &y);
	swap(&x, &y);
	printf("x is %d, y is %d\n", x, y);
	printf("address of x is %p, address of y %p\n", &x, &y);

	//	return 0;
}

void swap(int *a, int *b) {
	int temp;

	temp = *a;
	*a = *b;
	*b = temp;
}
