#include<stdio.h>
#include<conio.h>
void add(int,int);
void main()
{
int a,b;
clrscr();
a=5;
b=10;
add(a,b);
getch();
}
void add(int x,int y)
{
int z;
z=x+y;
printf("The sum of a and b:%d",z);
}
