/* Trying out for the first time cpp with compiler and everything. 
*
*
*/

void passByValue(int x) {
x = 99;
}
int main()
{
	int arg = 13;
	passByValue(arg);
	return 0;
}
