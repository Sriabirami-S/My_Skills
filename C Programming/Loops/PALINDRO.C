#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
int c;
char s1[30],s2[40];
clrscr();
printf("Enter a word:");
scanf("%s",&s1);
strcpy(s2,s1);
strrev(s2);
printf("Reversed word:%s",s2);
c=strcmp(s1,s2);
if(c==0)
 printf("\npalindrome");
else
 printf("\nnot");
getch();
}