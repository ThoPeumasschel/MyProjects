#ifndef _ex22_h
#define _ex22_h

// makes THE_SIZE in ex22.c available to other .c files
extern int THE_SIZE;

// gets and sets an internal static variable in ex22.c
// also known as getter and setter
int get_age();
void set_age(int age);

// updates a stati variable that's inside update_ratio
double update_ratio(double ratio);

void print_size();

#endif



