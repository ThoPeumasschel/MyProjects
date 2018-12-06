#include<stdio.h>
#include<assert.h>
#include<stdlib.h>
#include<string.h>

struct Person {
	char *name;
	int age;
	int height;
	int weight;
};

struct Person *Person_create(char *name, int age, int height, int weight)
{
	struct Person *who = malloc(sizeof(struct Person));
	printf("Print sizeof(struct Person): %ld bytes\n", sizeof(struct Person));
	printf("location of who: %p\n", who);
	assert(who != NULL);

	who->name = strdup(name);
	who->age = age;
	who->height = height;
	who->weight = weight;

	return who;
}

void Person_destroy(struct Person *who)
{
	assert(who != NULL);

	free(who->name);
	free(who);
}

void Person_print(struct Person *who)
{
	printf("Name: \t%s\n", who->name);
	printf("\tAge: \t%d\n", who->age);
	printf("\tHeight: %d\n", who->height);
	printf("\tWeight: %d\n", who->weight);
}

int main(int argc, char *argv[])
{
	// Make two people structures
	struct Person *joe = Person_create("Joe Alex", 32, 64, 140);

	struct Person *frank = Person_create("Frank Blank", 20, 72, 180);

	struct Person *thomas = Person_create("Thomas Peuschel", 37, 186, 90);

	// print them out and where they are in memory
	printf("Joe is at memory location: %p \n", joe);
	Person_print(joe);

	printf("Frank is at memory location: %p \n", frank);
	Person_print(frank);

	printf("Thomas is at memory location: %p\n", thomas);
	Person_print(thomas);
	
	// make eryone age 20 years and print the again
	joe->age += 20;
	joe->height -= 2;
	joe->weight += 40;
	Person_print(joe);

	frank->age += 20;
	frank->weight +=20;
	Person_print(frank);

	// destroy them both so we clean up
	Person_destroy(joe);
	Person_destroy(frank);
	Person_destroy(thomas);

	return 0;
}

