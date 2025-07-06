#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
char str[6]="world ";
char *p=str;
clrscr();
while(*p!='\0')
{
printf("%c",*p);
p++;
}
getch();
}