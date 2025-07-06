#include<stdio.h>
#include<conio.h>
#include<ctype.h>
void main()
{
char ch;
clrscr();
printf("Enter a character:");
ch=getchar();
if(isalpha(ch))
{
printf("Entered character is an alphabet");
}
else if(isdigit(ch))
{
printf("Entered character is a digit");
}
else
{
printf("Entered character is a symbol");
}
getch();
}