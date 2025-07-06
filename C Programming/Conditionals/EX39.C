#include<stdio.h>
#include<conio.h>
#include<ctype.h>
void main()
{
char ch;
clrscr();
printf("Enter a character:");
ch=getchar();
if(isupper(ch))
{
printf("Entered character is in upper case");
}
else if(islower(ch))
{
printf("Entered character is in lower case");
}
else
{
printf("Entered character is not an alphabet");
}
getch();
}