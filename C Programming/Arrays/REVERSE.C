#include<stdio.h>
#include<conio.h>
#include<string.h>
 void main()
{
char s1[50];
char s2[50];
clrscr();
printf("Enter a word:");
scanf("%s",&s1);
strrev(s1);
printf("Reversed word:%s",strrev(s1));
if(s1==strrev(s1))
printf("\npalindrome");
else
printf("\nnot");
getch();
}

