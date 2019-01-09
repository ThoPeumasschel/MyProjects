/* 	Project logfind
*
*	- Takes sequence of words: write a scanf-like function 
*	- takes parameter '-o' wich makes the concatenation from 'and' to 'or'
*	- load list of allowed logfiles from ~/.logfind
*	- read up on man 3 glob 
*	- 
*	- 
*	
*/


#include <stdio.h>
#include "dbg.h"





int main(int argc, char *argv[]) 
{
	debug("Guten Tag!");
	check(argc <= 1, "argc ist >= 1");	

return 0;

error:
	return 1;
}
