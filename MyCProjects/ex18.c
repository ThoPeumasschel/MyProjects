#include <stdio.h>
#include <stdlib.h>
#include <errno.h>
#include <string.h>

/** Our old friend from ex17. */
void die(const char *message)
{
	if(errno) {
		perror(message);
	} else {
		printf("ERROR: %s\n", message);
	}
	exit(1);
}

typedef int (*vergleich_cb)(int a, int b);

int *bubble_sort(int *numbers, int count, vergleich_cb vergl)
{
	int temp=0;
	int i=0;
	int j=0;
	int *ziel=malloc(count * sizeof(int));
	
	if(!ziel)
		die("Memory error.");
		
	memcpy(ziel, numbers, count * sizeof(int));
	
	for(i=0; i<count; i++) {
		for(j=0;j<count-1; j++) {
			if (vergl(ziel[j], ziel[j+1])>0) {
				temp=ziel[j+1];
				ziel[j+1]=ziel[j];
				ziel[j]=temp;
			}
		}
	}
	return ziel;
}

int sorted_order(int a, int b)
{
	return a - b;
}

int reverse_order(int a, int b)
{
	return b - a;
}

int strange_order(int a, int b)
{
	if (a == 0 || b== 0) {
		return 0;
	} else {
		return a % b;
	}
}

void test_sorting(int *numbers, int count, vergleich_cb vergl)
{
	int i = 0;
	int *sorted = bubble_sort(numbers, count, vergl);

	if (!sorted)
		die("Failed to sort as requested.");

	for (i = 0; i < count; i++) {
		printf("%d ", sorted[i]);
	}
	printf("\n");

	free(sorted);
}

int main(int argc, char *argv[])
{
	if (argc < 2) die("USAGE: ex18 4 3 1 5 6");

	int count = argc - 1;
	int i = 0;
	char **inputs = argv +1;

	int *numbers = malloc(count * sizeof(int));
	if (!numbers) die("Memory error.");

	for (i = 0; i < count; i++) {
			numbers[i] = atoi(inputs[i]);
	}

	test_sorting(numbers, count, sorted_order);
	test_sorting(numbers, count, reverse_order);
	test_sorting(numbers, count, strange_order);

	free(numbers);

	return 0;
}




