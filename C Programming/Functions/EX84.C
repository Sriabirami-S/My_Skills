#include<stdio.h>
#include<conio.h>
int sq();
void main()
{
int c;
clrscr();
c=sq();
printf("The area of square=%d",c);
getch();
}
int sq()
{
int a,b;
a=5;
b=a*a;
return b;
}
