#include<stdio.h>
#include<conio.h>
int sub(int,int);
void main()
{
int a,b,c;
clrscr();
a=10;
b=7;
printf("a=%d\nb=%d",a,b);
c=sub(a,b);
printf("\nThe difference between a and b=%d",c);
getch();
}
int sub(int a,int b)
{
int z;
z=a-b;
return z;
}