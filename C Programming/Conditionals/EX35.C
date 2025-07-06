//using getchar and putchar
#include<stdio.h>
#include<conio.h>
void main()
{
char character;
clrscr();
printf("Enter the character:");
character=getchar();
printf("The entered character is ");
putchar(character);
getch();
}