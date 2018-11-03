#include<stdio.h>
#include<string.h>

int main () {
	char geheim[11], passwort[80];
	int versuch=3;
	geheim[3]='p';
	geheim[2]=109;
	geheim[7]=114;
	geheim[5]=116;
	geheim[0]=67;
	geheim[9]='x';
	geheim[1]=111;
	geheim[8]=' ';
	geheim[4]=geheim[1]+6;
	geheim[6]=101;
	printf("Das geheime pw lautet: ");
		for(int i = 0; i<strlen(geheim); i++) {
		printf("%c", geheim[i]);
		}
	printf("\n");
	do {
		printf("\nBitte passwort eingeben.\n");
		gets(passwort);
		if(strcmp(geheim, passwort) == 0) {
			printf("\nPasswort ok!\n");
			break;	
		}
		else
			printf("\nFehlerhaftes Passwort.\n\a");
			versuch--;
	}
	while (versuch > 0);
}

















