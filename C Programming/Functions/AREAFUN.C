#include<stdio.h>
#include<conio.h>
void main()
{
int a,b;
clrscr();
a=5;b=3;
rec(a,b);
squa(a);
getch();
}
void rec(int x,int y)
{
printf("%d",x*y);
}
void squa(int x)
{
printf("%d",x*x);
}