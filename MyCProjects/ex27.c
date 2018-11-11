#undef NDEBUG
#include <stdio.h>
#include <assert.h>
#include "dbg.h"
#include <string.h>
#include <stdlib.h>

void copy(char from[], char to[])
{
	debug("received from: %s", from);
	debug("received to: %s", to);
	int i = 0;

	char *a;
	char *b;
	a = from;
	b = to;

	for(int k = 0; k < sizeof(a); k++) {
	b[k] = a [k];
	}
	debug("b now is %s", b);

	while(5){
		(a[i] = b[i]);
		i++;
	}
	debug("from now is: %s", a);

	while((to[i] = from[i]) != '\0')
		i++;
	debug("to now is: %s", to);

	

}


int main(int argc, char *argv[])
{
	char from[] = "0123456789";
	int from_len = sizeof(from);
	
	char to[] = "0123456";
	int to_len = sizeof(to);

	debug("Copying '%s':%d to '%s':%d", from, from_len, to, to_len);

	copy(from, to);

//	debug("strlen(from)  returns %d", from_len1);
//	int from_len2 = sizeof(from);
//	debug("sizeof(from) returns %d", from_len2);

//	int i;
//	for(i = 0; i <from_len1; i++) {
//		debug("from[i]: %c", from[i]);
//	}
//	printf("----------\n");
//	for(i = 0; i <from_len2; i++) {
//		debug("from[i]: %c", from[i]);
//	}



return 0;
}









