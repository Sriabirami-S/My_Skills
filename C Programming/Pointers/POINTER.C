#include<stdio.h>
#include<conio.h>
void main()
{
int a;
int *x;
clrscr();
a=10;
*x=&a;
printf("*x=%d",*x);
getch();
}
